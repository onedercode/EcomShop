/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saif.web.practice.shop.bean;

import com.saif.web.practice.shop.util.ParseJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Saif
 */
public class Order {
    private final Logger LOGGER = LogManager.getLogger(Order.class);
    
    private Customer customer;
    private int orderId;
    ArrayList<Product> products;

    
    public Order(Customer customer, String cartJson){
        LOGGER.debug("Order()");
        this.customer = customer;
        products = new ArrayList<Product>();
        
        JSONArray ja = null;
        try {
            Object obj = new JSONParser().parse(cartJson);
            ja = (JSONArray) obj; 
        }
        catch(ParseException ex) {}
        
        Iterator itr = ja.iterator();
        while(itr.hasNext()){
            Map productMap = (Map) itr.next();
            Product product = new Product();
            
            product.setProductId((String) productMap.get("productId"));
            product.setMfrId((String) productMap.get("mfrId"));
            product.setDescription((String) productMap.get("description"));
            product.setPrice((String) productMap.get("price"));
            product.setQuantity((String) productMap.get("quantity"));
            products.add(product);
        }
    }
    
    
    public void setOrderId(int orderId) {
        this.orderId = orderId+1;
    }

    public int getOrderId() {
        return orderId;
    }
    
    
    public ArrayList<StringBuffer> getInsertSql(){
        StringBuffer columns = new StringBuffer("INSERT INTO OrdersTemp (uName, orderId, productId, mfrId, quantity) VALUES (");
        StringBuffer values;
        ArrayList<StringBuffer> buffs = new ArrayList<>();
        Iterator itr = products.iterator();
        while(itr.hasNext()){
            Product p = (Product) itr.next();
            values = new StringBuffer(columns);
            
            values.append("\"" +customer.getUserName() +"\"");
            values.append(",");
            
            values.append(orderId);
            values.append(",");
            
            values.append(p.getProductId());
            values.append(",");
            
            values.append("\"" +p.getMfrId() +"\"");
            values.append(",");
            
            values.append(p.getQuantity());
            values.append(");");
            
            buffs.add(values);
            LOGGER.debug(values.toString());
        }
        return buffs;
    }
    
    public String getHighestOrderIdSql(){
        return "select max(orderId) from Orders;";
    }
    
    public String getFeedbackOrderSql(){
        StringBuffer feedbackOrder = new StringBuffer("select orderId, productId, mfrId, quantity from OrdersTemp where uName = ");
        feedbackOrder.append("\"" +customer.getUserName() +"\"");
        feedbackOrder.append("and orderId = ");
        feedbackOrder.append(orderId);
        feedbackOrder.append(";");
        return feedbackOrder.toString();
    }
    
}
