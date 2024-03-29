/*
 * This file is generated by jOOQ.
 */
package com.saif.web.practice.shop.jooq.tables;


import com.saif.web.practice.shop.jooq.DefaultSchema;
import com.saif.web.practice.shop.jooq.Indexes;
import com.saif.web.practice.shop.jooq.Keys;
import com.saif.web.practice.shop.jooq.tables.records.PaymentsRecord;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Payments extends TableImpl<PaymentsRecord> {

    private static final long serialVersionUID = 1528987550;

    /**
     * The reference instance of <code>Payments</code>
     */
    public static final Payments PAYMENTS = new Payments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentsRecord> getRecordType() {
        return PaymentsRecord.class;
    }

    /**
     * The column <code>Payments.paymentID</code>.
     */
    public final TableField<PaymentsRecord, Integer> PAYMENTID = createField(DSL.name("paymentID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Payments.orderID</code>.
     */
    public final TableField<PaymentsRecord, Integer> ORDERID = createField(DSL.name("orderID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Payments.paymentMethod</code>.
     */
    public final TableField<PaymentsRecord, Integer> PAYMENTMETHOD = createField(DSL.name("paymentMethod"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Payments.amount</code>.
     */
    public final TableField<PaymentsRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.NUMERIC(9, 2).nullable(false), this, "");

    /**
     * The column <code>Payments.transactionID</code>.
     */
    public final TableField<PaymentsRecord, String> TRANSACTIONID = createField(DSL.name("transactionID"), org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>Payments.date</code>.
     */
    public final TableField<PaymentsRecord, Date> DATE = createField(DSL.name("date"), org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * Create a <code>Payments</code> table reference
     */
    public Payments() {
        this(DSL.name("Payments"), null);
    }

    /**
     * Create an aliased <code>Payments</code> table reference
     */
    public Payments(String alias) {
        this(DSL.name(alias), PAYMENTS);
    }

    /**
     * Create an aliased <code>Payments</code> table reference
     */
    public Payments(Name alias) {
        this(alias, PAYMENTS);
    }

    private Payments(Name alias, Table<PaymentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Payments(Name alias, Table<PaymentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Payments(Table<O> child, ForeignKey<O, PaymentsRecord> key) {
        super(child, key, PAYMENTS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SQLITE_AUTOINDEX_PAYMENTS_1, Indexes.SQLITE_AUTOINDEX_PAYMENTS_2);
    }

    @Override
    public UniqueKey<PaymentsRecord> getPrimaryKey() {
        return Keys.PK_PAYMENTS;
    }

    @Override
    public List<UniqueKey<PaymentsRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentsRecord>>asList(Keys.PK_PAYMENTS, Keys.SQLITE_AUTOINDEX_PAYMENTS_1, Keys.SQLITE_AUTOINDEX_PAYMENTS_2);
    }

    @Override
    public Payments as(String alias) {
        return new Payments(DSL.name(alias), this);
    }

    @Override
    public Payments as(Name alias) {
        return new Payments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Payments rename(String name) {
        return new Payments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Payments rename(Name name) {
        return new Payments(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, BigDecimal, String, Date> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
