/*
 * This file is generated by jOOQ.
 */
package com.saif.web.practice.shop.jooq.tables.records;


import com.saif.web.practice.shop.jooq.tables.Products;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductsRecord extends UpdatableRecordImpl<ProductsRecord> implements Record21<String, String, String, String, String, String, String, String, String, String, String, String, Integer, String, String, Integer, BigDecimal, Integer, Integer, Date, String> {

    private static final long serialVersionUID = -1218028848;

    /**
     * Setter for <code>Products.supplierID</code>.
     */
    public void setSupplierid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Products.supplierID</code>.
     */
    public String getSupplierid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Products.productID</code>.
     */
    public void setProductid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Products.productID</code>.
     */
    public String getProductid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Products.domain</code>.
     */
    public void setDomain(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Products.domain</code>.
     */
    public String getDomain() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Products.kingdom</code>.
     */
    public void setKingdom(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Products.kingdom</code>.
     */
    public String getKingdom() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Products.phylum</code>.
     */
    public void setPhylum(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Products.phylum</code>.
     */
    public String getPhylum() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Products.klass</code>.
     */
    public void setKlass(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Products.klass</code>.
     */
    public String getKlass() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Products.orderr</code>.
     */
    public void setOrderr(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Products.orderr</code>.
     */
    public String getOrderr() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Products.family</code>.
     */
    public void setFamily(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Products.family</code>.
     */
    public String getFamily() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Products.genus</code>.
     */
    public void setGenus(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Products.genus</code>.
     */
    public String getGenus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Products.species</code>.
     */
    public void setSpecies(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Products.species</code>.
     */
    public String getSpecies() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Products.shortDescrip</code>.
     */
    public void setShortdescrip(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Products.shortDescrip</code>.
     */
    public String getShortdescrip() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Products.longDescrip</code>.
     */
    public void setLongdescrip(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Products.longDescrip</code>.
     */
    public String getLongdescrip() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Products.size</code>.
     */
    public void setSize(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>Products.size</code>.
     */
    public Integer getSize() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>Products.color</code>.
     */
    public void setColor(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Products.color</code>.
     */
    public String getColor() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Products.style</code>.
     */
    public void setStyle(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Products.style</code>.
     */
    public String getStyle() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Products.weight</code>.
     */
    public void setWeight(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Products.weight</code>.
     */
    public Integer getWeight() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Products.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>Products.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>Products.stock</code>.
     */
    public void setStock(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>Products.stock</code>.
     */
    public Integer getStock() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>Products.quantity</code>.
     */
    public void setQuantity(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>Products.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>Products.arrived</code>.
     */
    public void setArrived(Date value) {
        set(19, value);
    }

    /**
     * Getter for <code>Products.arrived</code>.
     */
    public Date getArrived() {
        return (Date) get(19);
    }

    /**
     * Setter for <code>Products.path</code>.
     */
    public void setPath(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>Products.path</code>.
     */
    public String getPath() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, String, String, String, String, String, String, String, String, String, Integer, String, String, Integer, BigDecimal, Integer, Integer, Date, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<String, String, String, String, String, String, String, String, String, String, String, String, Integer, String, String, Integer, BigDecimal, Integer, Integer, Date, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Products.PRODUCTS.SUPPLIERID;
    }

    @Override
    public Field<String> field2() {
        return Products.PRODUCTS.PRODUCTID;
    }

    @Override
    public Field<String> field3() {
        return Products.PRODUCTS.DOMAIN;
    }

    @Override
    public Field<String> field4() {
        return Products.PRODUCTS.KINGDOM;
    }

    @Override
    public Field<String> field5() {
        return Products.PRODUCTS.PHYLUM;
    }

    @Override
    public Field<String> field6() {
        return Products.PRODUCTS.KLASS;
    }

    @Override
    public Field<String> field7() {
        return Products.PRODUCTS.ORDERR;
    }

    @Override
    public Field<String> field8() {
        return Products.PRODUCTS.FAMILY;
    }

    @Override
    public Field<String> field9() {
        return Products.PRODUCTS.GENUS;
    }

    @Override
    public Field<String> field10() {
        return Products.PRODUCTS.SPECIES;
    }

    @Override
    public Field<String> field11() {
        return Products.PRODUCTS.SHORTDESCRIP;
    }

    @Override
    public Field<String> field12() {
        return Products.PRODUCTS.LONGDESCRIP;
    }

    @Override
    public Field<Integer> field13() {
        return Products.PRODUCTS.SIZE;
    }

    @Override
    public Field<String> field14() {
        return Products.PRODUCTS.COLOR;
    }

    @Override
    public Field<String> field15() {
        return Products.PRODUCTS.STYLE;
    }

    @Override
    public Field<Integer> field16() {
        return Products.PRODUCTS.WEIGHT;
    }

    @Override
    public Field<BigDecimal> field17() {
        return Products.PRODUCTS.PRICE;
    }

    @Override
    public Field<Integer> field18() {
        return Products.PRODUCTS.STOCK;
    }

    @Override
    public Field<Integer> field19() {
        return Products.PRODUCTS.QUANTITY;
    }

    @Override
    public Field<Date> field20() {
        return Products.PRODUCTS.ARRIVED;
    }

    @Override
    public Field<String> field21() {
        return Products.PRODUCTS.PATH;
    }

    @Override
    public String component1() {
        return getSupplierid();
    }

    @Override
    public String component2() {
        return getProductid();
    }

    @Override
    public String component3() {
        return getDomain();
    }

    @Override
    public String component4() {
        return getKingdom();
    }

    @Override
    public String component5() {
        return getPhylum();
    }

    @Override
    public String component6() {
        return getKlass();
    }

    @Override
    public String component7() {
        return getOrderr();
    }

    @Override
    public String component8() {
        return getFamily();
    }

    @Override
    public String component9() {
        return getGenus();
    }

    @Override
    public String component10() {
        return getSpecies();
    }

    @Override
    public String component11() {
        return getShortdescrip();
    }

    @Override
    public String component12() {
        return getLongdescrip();
    }

    @Override
    public Integer component13() {
        return getSize();
    }

    @Override
    public String component14() {
        return getColor();
    }

    @Override
    public String component15() {
        return getStyle();
    }

    @Override
    public Integer component16() {
        return getWeight();
    }

    @Override
    public BigDecimal component17() {
        return getPrice();
    }

    @Override
    public Integer component18() {
        return getStock();
    }

    @Override
    public Integer component19() {
        return getQuantity();
    }

    @Override
    public Date component20() {
        return getArrived();
    }

    @Override
    public String component21() {
        return getPath();
    }

    @Override
    public String value1() {
        return getSupplierid();
    }

    @Override
    public String value2() {
        return getProductid();
    }

    @Override
    public String value3() {
        return getDomain();
    }

    @Override
    public String value4() {
        return getKingdom();
    }

    @Override
    public String value5() {
        return getPhylum();
    }

    @Override
    public String value6() {
        return getKlass();
    }

    @Override
    public String value7() {
        return getOrderr();
    }

    @Override
    public String value8() {
        return getFamily();
    }

    @Override
    public String value9() {
        return getGenus();
    }

    @Override
    public String value10() {
        return getSpecies();
    }

    @Override
    public String value11() {
        return getShortdescrip();
    }

    @Override
    public String value12() {
        return getLongdescrip();
    }

    @Override
    public Integer value13() {
        return getSize();
    }

    @Override
    public String value14() {
        return getColor();
    }

    @Override
    public String value15() {
        return getStyle();
    }

    @Override
    public Integer value16() {
        return getWeight();
    }

    @Override
    public BigDecimal value17() {
        return getPrice();
    }

    @Override
    public Integer value18() {
        return getStock();
    }

    @Override
    public Integer value19() {
        return getQuantity();
    }

    @Override
    public Date value20() {
        return getArrived();
    }

    @Override
    public String value21() {
        return getPath();
    }

    @Override
    public ProductsRecord value1(String value) {
        setSupplierid(value);
        return this;
    }

    @Override
    public ProductsRecord value2(String value) {
        setProductid(value);
        return this;
    }

    @Override
    public ProductsRecord value3(String value) {
        setDomain(value);
        return this;
    }

    @Override
    public ProductsRecord value4(String value) {
        setKingdom(value);
        return this;
    }

    @Override
    public ProductsRecord value5(String value) {
        setPhylum(value);
        return this;
    }

    @Override
    public ProductsRecord value6(String value) {
        setKlass(value);
        return this;
    }

    @Override
    public ProductsRecord value7(String value) {
        setOrderr(value);
        return this;
    }

    @Override
    public ProductsRecord value8(String value) {
        setFamily(value);
        return this;
    }

    @Override
    public ProductsRecord value9(String value) {
        setGenus(value);
        return this;
    }

    @Override
    public ProductsRecord value10(String value) {
        setSpecies(value);
        return this;
    }

    @Override
    public ProductsRecord value11(String value) {
        setShortdescrip(value);
        return this;
    }

    @Override
    public ProductsRecord value12(String value) {
        setLongdescrip(value);
        return this;
    }

    @Override
    public ProductsRecord value13(Integer value) {
        setSize(value);
        return this;
    }

    @Override
    public ProductsRecord value14(String value) {
        setColor(value);
        return this;
    }

    @Override
    public ProductsRecord value15(String value) {
        setStyle(value);
        return this;
    }

    @Override
    public ProductsRecord value16(Integer value) {
        setWeight(value);
        return this;
    }

    @Override
    public ProductsRecord value17(BigDecimal value) {
        setPrice(value);
        return this;
    }

    @Override
    public ProductsRecord value18(Integer value) {
        setStock(value);
        return this;
    }

    @Override
    public ProductsRecord value19(Integer value) {
        setQuantity(value);
        return this;
    }

    @Override
    public ProductsRecord value20(Date value) {
        setArrived(value);
        return this;
    }

    @Override
    public ProductsRecord value21(String value) {
        setPath(value);
        return this;
    }

    @Override
    public ProductsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Integer value13, String value14, String value15, Integer value16, BigDecimal value17, Integer value18, Integer value19, Date value20, String value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductsRecord
     */
    public ProductsRecord() {
        super(Products.PRODUCTS);
    }

    /**
     * Create a detached, initialised ProductsRecord
     */
    public ProductsRecord(String supplierid, String productid, String domain, String kingdom, String phylum, String klass, String orderr, String family, String genus, String species, String shortdescrip, String longdescrip, Integer size, String color, String style, Integer weight, BigDecimal price, Integer stock, Integer quantity, Date arrived, String path) {
        super(Products.PRODUCTS);

        set(0, supplierid);
        set(1, productid);
        set(2, domain);
        set(3, kingdom);
        set(4, phylum);
        set(5, klass);
        set(6, orderr);
        set(7, family);
        set(8, genus);
        set(9, species);
        set(10, shortdescrip);
        set(11, longdescrip);
        set(12, size);
        set(13, color);
        set(14, style);
        set(15, weight);
        set(16, price);
        set(17, stock);
        set(18, quantity);
        set(19, arrived);
        set(20, path);
    }
}
