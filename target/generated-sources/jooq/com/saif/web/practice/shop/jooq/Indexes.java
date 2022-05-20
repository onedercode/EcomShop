/*
 * This file is generated by jOOQ.
 */
package com.saif.web.practice.shop.jooq;


import com.saif.web.practice.shop.jooq.tables.Addresses;
import com.saif.web.practice.shop.jooq.tables.Carts;
import com.saif.web.practice.shop.jooq.tables.Customers;
import com.saif.web.practice.shop.jooq.tables.Orders;
import com.saif.web.practice.shop.jooq.tables.Payments;
import com.saif.web.practice.shop.jooq.tables.Products;
import com.saif.web.practice.shop.jooq.tables.Supplierbranches;
import com.saif.web.practice.shop.jooq.tables.Suppliers;
import com.saif.web.practice.shop.jooq.tables.Wishes;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SQLITE_AUTOINDEX_ADDRESSES_1 = Indexes0.SQLITE_AUTOINDEX_ADDRESSES_1;
    public static final Index SQLITE_AUTOINDEX_CARTS_1 = Indexes0.SQLITE_AUTOINDEX_CARTS_1;
    public static final Index SQLITE_AUTOINDEX_CUSTOMERS_1 = Indexes0.SQLITE_AUTOINDEX_CUSTOMERS_1;
    public static final Index SQLITE_AUTOINDEX_ORDERS_1 = Indexes0.SQLITE_AUTOINDEX_ORDERS_1;
    public static final Index SQLITE_AUTOINDEX_PAYMENTS_1 = Indexes0.SQLITE_AUTOINDEX_PAYMENTS_1;
    public static final Index SQLITE_AUTOINDEX_PAYMENTS_2 = Indexes0.SQLITE_AUTOINDEX_PAYMENTS_2;
    public static final Index SQLITE_AUTOINDEX_PRODUCTS_1 = Indexes0.SQLITE_AUTOINDEX_PRODUCTS_1;
    public static final Index SQLITE_AUTOINDEX_SUPPLIERBRANCHES_1 = Indexes0.SQLITE_AUTOINDEX_SUPPLIERBRANCHES_1;
    public static final Index SQLITE_AUTOINDEX_SUPPLIERS_1 = Indexes0.SQLITE_AUTOINDEX_SUPPLIERS_1;
    public static final Index SQLITE_AUTOINDEX_SUPPLIERS_2 = Indexes0.SQLITE_AUTOINDEX_SUPPLIERS_2;
    public static final Index SQLITE_AUTOINDEX_SUPPLIERS_3 = Indexes0.SQLITE_AUTOINDEX_SUPPLIERS_3;
    public static final Index SQLITE_AUTOINDEX_WISHES_1 = Indexes0.SQLITE_AUTOINDEX_WISHES_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index SQLITE_AUTOINDEX_ADDRESSES_1 = Internal.createIndex("sqlite_autoindex_Addresses_1", Addresses.ADDRESSES, new OrderField[] { Addresses.ADDRESSES.CUSTOMERID, Addresses.ADDRESSES.ADDRESSID }, true);
        public static Index SQLITE_AUTOINDEX_CARTS_1 = Internal.createIndex("sqlite_autoindex_Carts_1", Carts.CARTS, new OrderField[] { Carts.CARTS.CUSTOMERID, Carts.CARTS.SUPPLIERID, Carts.CARTS.PRODUCTID }, true);
        public static Index SQLITE_AUTOINDEX_CUSTOMERS_1 = Internal.createIndex("sqlite_autoindex_Customers_1", Customers.CUSTOMERS, new OrderField[] { Customers.CUSTOMERS.CUSTOMERID }, true);
        public static Index SQLITE_AUTOINDEX_ORDERS_1 = Internal.createIndex("sqlite_autoindex_Orders_1", Orders.ORDERS, new OrderField[] { Orders.ORDERS.ORDERID, Orders.ORDERS.SUPPLIERID, Orders.ORDERS.PRODUCTID }, true);
        public static Index SQLITE_AUTOINDEX_PAYMENTS_1 = Internal.createIndex("sqlite_autoindex_Payments_1", Payments.PAYMENTS, new OrderField[] { Payments.PAYMENTS.PAYMENTID }, true);
        public static Index SQLITE_AUTOINDEX_PAYMENTS_2 = Internal.createIndex("sqlite_autoindex_Payments_2", Payments.PAYMENTS, new OrderField[] { Payments.PAYMENTS.TRANSACTIONID }, true);
        public static Index SQLITE_AUTOINDEX_PRODUCTS_1 = Internal.createIndex("sqlite_autoindex_Products_1", Products.PRODUCTS, new OrderField[] { Products.PRODUCTS.SUPPLIERID, Products.PRODUCTS.PRODUCTID }, true);
        public static Index SQLITE_AUTOINDEX_SUPPLIERBRANCHES_1 = Internal.createIndex("sqlite_autoindex_SupplierBranches_1", Supplierbranches.SUPPLIERBRANCHES, new OrderField[] { Supplierbranches.SUPPLIERBRANCHES.SUPPLIERID, Supplierbranches.SUPPLIERBRANCHES.BRANCHID }, true);
        public static Index SQLITE_AUTOINDEX_SUPPLIERS_1 = Internal.createIndex("sqlite_autoindex_Suppliers_1", Suppliers.SUPPLIERS, new OrderField[] { Suppliers.SUPPLIERS.SUPPLIERID }, true);
        public static Index SQLITE_AUTOINDEX_SUPPLIERS_2 = Internal.createIndex("sqlite_autoindex_Suppliers_2", Suppliers.SUPPLIERS, new OrderField[] { Suppliers.SUPPLIERS.SHORTNAME }, true);
        public static Index SQLITE_AUTOINDEX_SUPPLIERS_3 = Internal.createIndex("sqlite_autoindex_Suppliers_3", Suppliers.SUPPLIERS, new OrderField[] { Suppliers.SUPPLIERS.FULLNAME }, true);
        public static Index SQLITE_AUTOINDEX_WISHES_1 = Internal.createIndex("sqlite_autoindex_Wishes_1", Wishes.WISHES, new OrderField[] { Wishes.WISHES.CUSTOMERID, Wishes.WISHES.SUPPLIERID, Wishes.WISHES.PRODUCTID }, true);
    }
}
