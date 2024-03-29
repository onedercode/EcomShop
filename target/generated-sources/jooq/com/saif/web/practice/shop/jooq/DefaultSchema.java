/*
 * This file is generated by jOOQ.
 */
package com.saif.web.practice.shop.jooq;


import com.saif.web.practice.shop.jooq.tables.Addresses;
import com.saif.web.practice.shop.jooq.tables.Carts;
import com.saif.web.practice.shop.jooq.tables.Customerproducts;
import com.saif.web.practice.shop.jooq.tables.Customers;
import com.saif.web.practice.shop.jooq.tables.Orders;
import com.saif.web.practice.shop.jooq.tables.Payments;
import com.saif.web.practice.shop.jooq.tables.Products;
import com.saif.web.practice.shop.jooq.tables.Supplierbranches;
import com.saif.web.practice.shop.jooq.tables.Suppliers;
import com.saif.web.practice.shop.jooq.tables.Wishes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 515317537;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>Addresses</code>.
     */
    public final Addresses ADDRESSES = com.saif.web.practice.shop.jooq.tables.Addresses.ADDRESSES;

    /**
     * The table <code>Carts</code>.
     */
    public final Carts CARTS = com.saif.web.practice.shop.jooq.tables.Carts.CARTS;

    /**
     * The table <code>CustomerProducts</code>.
     */
    public final Customerproducts CUSTOMERPRODUCTS = com.saif.web.practice.shop.jooq.tables.Customerproducts.CUSTOMERPRODUCTS;

    /**
     * The table <code>Customers</code>.
     */
    public final Customers CUSTOMERS = com.saif.web.practice.shop.jooq.tables.Customers.CUSTOMERS;

    /**
     * The table <code>Orders</code>.
     */
    public final Orders ORDERS = com.saif.web.practice.shop.jooq.tables.Orders.ORDERS;

    /**
     * The table <code>Payments</code>.
     */
    public final Payments PAYMENTS = com.saif.web.practice.shop.jooq.tables.Payments.PAYMENTS;

    /**
     * The table <code>Products</code>.
     */
    public final Products PRODUCTS = com.saif.web.practice.shop.jooq.tables.Products.PRODUCTS;

    /**
     * The table <code>SupplierBranches</code>.
     */
    public final Supplierbranches SUPPLIERBRANCHES = com.saif.web.practice.shop.jooq.tables.Supplierbranches.SUPPLIERBRANCHES;

    /**
     * The table <code>Suppliers</code>.
     */
    public final Suppliers SUPPLIERS = com.saif.web.practice.shop.jooq.tables.Suppliers.SUPPLIERS;

    /**
     * The table <code>Wishes</code>.
     */
    public final Wishes WISHES = com.saif.web.practice.shop.jooq.tables.Wishes.WISHES;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Addresses.ADDRESSES,
            Carts.CARTS,
            Customerproducts.CUSTOMERPRODUCTS,
            Customers.CUSTOMERS,
            Orders.ORDERS,
            Payments.PAYMENTS,
            Products.PRODUCTS,
            Supplierbranches.SUPPLIERBRANCHES,
            Suppliers.SUPPLIERS,
            Wishes.WISHES);
    }
}
