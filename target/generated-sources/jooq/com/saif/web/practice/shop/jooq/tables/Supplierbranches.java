/*
 * This file is generated by jOOQ.
 */
package com.saif.web.practice.shop.jooq.tables;


import com.saif.web.practice.shop.jooq.DefaultSchema;
import com.saif.web.practice.shop.jooq.Indexes;
import com.saif.web.practice.shop.jooq.Keys;
import com.saif.web.practice.shop.jooq.tables.records.SupplierbranchesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class Supplierbranches extends TableImpl<SupplierbranchesRecord> {

    private static final long serialVersionUID = 379113062;

    /**
     * The reference instance of <code>SupplierBranches</code>
     */
    public static final Supplierbranches SUPPLIERBRANCHES = new Supplierbranches();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SupplierbranchesRecord> getRecordType() {
        return SupplierbranchesRecord.class;
    }

    /**
     * The column <code>SupplierBranches.supplierID</code>.
     */
    public final TableField<SupplierbranchesRecord, String> SUPPLIERID = createField(DSL.name("supplierID"), org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>SupplierBranches.branchID</code>.
     */
    public final TableField<SupplierbranchesRecord, Integer> BRANCHID = createField(DSL.name("branchID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>SupplierBranches.house</code>.
     */
    public final TableField<SupplierbranchesRecord, String> HOUSE = createField(DSL.name("house"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>SupplierBranches.road</code>.
     */
    public final TableField<SupplierbranchesRecord, String> ROAD = createField(DSL.name("road"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>SupplierBranches.area</code>.
     */
    public final TableField<SupplierbranchesRecord, String> AREA = createField(DSL.name("area"), org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>SupplierBranches.thana</code>.
     */
    public final TableField<SupplierbranchesRecord, String> THANA = createField(DSL.name("thana"), org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>SupplierBranches.district</code>.
     */
    public final TableField<SupplierbranchesRecord, String> DISTRICT = createField(DSL.name("district"), org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * Create a <code>SupplierBranches</code> table reference
     */
    public Supplierbranches() {
        this(DSL.name("SupplierBranches"), null);
    }

    /**
     * Create an aliased <code>SupplierBranches</code> table reference
     */
    public Supplierbranches(String alias) {
        this(DSL.name(alias), SUPPLIERBRANCHES);
    }

    /**
     * Create an aliased <code>SupplierBranches</code> table reference
     */
    public Supplierbranches(Name alias) {
        this(alias, SUPPLIERBRANCHES);
    }

    private Supplierbranches(Name alias, Table<SupplierbranchesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Supplierbranches(Name alias, Table<SupplierbranchesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Supplierbranches(Table<O> child, ForeignKey<O, SupplierbranchesRecord> key) {
        super(child, key, SUPPLIERBRANCHES);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SQLITE_AUTOINDEX_SUPPLIERBRANCHES_1);
    }

    @Override
    public UniqueKey<SupplierbranchesRecord> getPrimaryKey() {
        return Keys.PK_SUPPLIERBRANCHES;
    }

    @Override
    public List<UniqueKey<SupplierbranchesRecord>> getKeys() {
        return Arrays.<UniqueKey<SupplierbranchesRecord>>asList(Keys.PK_SUPPLIERBRANCHES);
    }

    @Override
    public List<ForeignKey<SupplierbranchesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SupplierbranchesRecord, ?>>asList(Keys.FK_SUPPLIERBRANCHES_SUPPLIERS_1);
    }

    public Suppliers suppliers() {
        return new Suppliers(this, Keys.FK_SUPPLIERBRANCHES_SUPPLIERS_1);
    }

    @Override
    public Supplierbranches as(String alias) {
        return new Supplierbranches(DSL.name(alias), this);
    }

    @Override
    public Supplierbranches as(Name alias) {
        return new Supplierbranches(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Supplierbranches rename(String name) {
        return new Supplierbranches(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Supplierbranches rename(Name name) {
        return new Supplierbranches(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Integer, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
