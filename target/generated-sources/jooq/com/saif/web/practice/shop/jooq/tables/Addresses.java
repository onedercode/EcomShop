/*
 * This file is generated by jOOQ.
 */
package com.saif.web.practice.shop.jooq.tables;


import com.saif.web.practice.shop.jooq.DefaultSchema;
import com.saif.web.practice.shop.jooq.Indexes;
import com.saif.web.practice.shop.jooq.Keys;
import com.saif.web.practice.shop.jooq.tables.records.AddressesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class Addresses extends TableImpl<AddressesRecord> {

    private static final long serialVersionUID = 1399665152;

    /**
     * The reference instance of <code>Addresses</code>
     */
    public static final Addresses ADDRESSES = new Addresses();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AddressesRecord> getRecordType() {
        return AddressesRecord.class;
    }

    /**
     * The column <code>Addresses.customerID</code>.
     */
    public final TableField<AddressesRecord, String> CUSTOMERID = createField(DSL.name("customerID"), org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>Addresses.addressID</code>.
     */
    public final TableField<AddressesRecord, Integer> ADDRESSID = createField(DSL.name("addressID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Addresses.addressType</code>.
     */
    public final TableField<AddressesRecord, String> ADDRESSTYPE = createField(DSL.name("addressType"), org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.field("'both'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>Addresses.flat</code>.
     */
    public final TableField<AddressesRecord, String> FLAT = createField(DSL.name("flat"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>Addresses.house</code>.
     */
    public final TableField<AddressesRecord, String> HOUSE = createField(DSL.name("house"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>Addresses.road</code>.
     */
    public final TableField<AddressesRecord, String> ROAD = createField(DSL.name("road"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>Addresses.area</code>.
     */
    public final TableField<AddressesRecord, String> AREA = createField(DSL.name("area"), org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>Addresses.thana</code>.
     */
    public final TableField<AddressesRecord, String> THANA = createField(DSL.name("thana"), org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>Addresses.district</code>.
     */
    public final TableField<AddressesRecord, String> DISTRICT = createField(DSL.name("district"), org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * Create a <code>Addresses</code> table reference
     */
    public Addresses() {
        this(DSL.name("Addresses"), null);
    }

    /**
     * Create an aliased <code>Addresses</code> table reference
     */
    public Addresses(String alias) {
        this(DSL.name(alias), ADDRESSES);
    }

    /**
     * Create an aliased <code>Addresses</code> table reference
     */
    public Addresses(Name alias) {
        this(alias, ADDRESSES);
    }

    private Addresses(Name alias, Table<AddressesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Addresses(Name alias, Table<AddressesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Addresses(Table<O> child, ForeignKey<O, AddressesRecord> key) {
        super(child, key, ADDRESSES);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SQLITE_AUTOINDEX_ADDRESSES_1);
    }

    @Override
    public UniqueKey<AddressesRecord> getPrimaryKey() {
        return Keys.PK_ADDRESSES;
    }

    @Override
    public List<UniqueKey<AddressesRecord>> getKeys() {
        return Arrays.<UniqueKey<AddressesRecord>>asList(Keys.PK_ADDRESSES);
    }

    @Override
    public List<ForeignKey<AddressesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AddressesRecord, ?>>asList(Keys.FK_ADDRESSES_CUSTOMERS_1);
    }

    public Customers customers() {
        return new Customers(this, Keys.FK_ADDRESSES_CUSTOMERS_1);
    }

    @Override
    public Addresses as(String alias) {
        return new Addresses(DSL.name(alias), this);
    }

    @Override
    public Addresses as(Name alias) {
        return new Addresses(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Addresses rename(String name) {
        return new Addresses(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Addresses rename(Name name) {
        return new Addresses(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, Integer, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
