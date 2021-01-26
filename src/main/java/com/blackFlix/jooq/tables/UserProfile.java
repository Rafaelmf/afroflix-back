/*
 * This file is generated by jOOQ.
 */
package com.blackFlix.jooq.tables;


import com.blackFlix.jooq.Keys;
import com.blackFlix.jooq.Public;
import com.blackFlix.jooq.enums.Payment;
import com.blackFlix.jooq.enums.ProfileStatus;
import com.blackFlix.jooq.tables.records.UserProfileRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserProfile extends TableImpl<UserProfileRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.user_profile</code>
     */
    public static final UserProfile USER_PROFILE = new UserProfile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserProfileRecord> getRecordType() {
        return UserProfileRecord.class;
    }

    /**
     * The column <code>public.user_profile.id</code>.
     */
    public final TableField<UserProfileRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.user_profile.status</code>.
     */
    public final TableField<UserProfileRecord, ProfileStatus> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR.asEnumDataType(com.blackFlix.jooq.enums.ProfileStatus.class), this, "");

    /**
     * The column <code>public.user_profile.name</code>.
     */
    public final TableField<UserProfileRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.user_profile.email</code>.
     */
    public final TableField<UserProfileRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.user_profile.telephone</code>.
     */
    public final TableField<UserProfileRecord, String> TELEPHONE = createField(DSL.name("telephone"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.user_profile.birthday</code>.
     */
    public final TableField<UserProfileRecord, LocalDate> BIRTHDAY = createField(DSL.name("birthday"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>public.user_profile.payment_method</code>.
     */
    public final TableField<UserProfileRecord, Payment> PAYMENT_METHOD = createField(DSL.name("payment_method"), SQLDataType.VARCHAR.asEnumDataType(com.blackFlix.jooq.enums.Payment.class), this, "");

    /**
     * The column <code>public.user_profile.registry_date</code>.
     */
    public final TableField<UserProfileRecord, LocalDate> REGISTRY_DATE = createField(DSL.name("registry_date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>public.user_profile.unsubscribe_date</code>.
     */
    public final TableField<UserProfileRecord, LocalDate> UNSUBSCRIBE_DATE = createField(DSL.name("unsubscribe_date"), SQLDataType.LOCALDATE, this, "");

    private UserProfile(Name alias, Table<UserProfileRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserProfile(Name alias, Table<UserProfileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.user_profile</code> table reference
     */
    public UserProfile(String alias) {
        this(DSL.name(alias), USER_PROFILE);
    }

    /**
     * Create an aliased <code>public.user_profile</code> table reference
     */
    public UserProfile(Name alias) {
        this(alias, USER_PROFILE);
    }

    /**
     * Create a <code>public.user_profile</code> table reference
     */
    public UserProfile() {
        this(DSL.name("user_profile"), null);
    }

    public <O extends Record> UserProfile(Table<O> child, ForeignKey<O, UserProfileRecord> key) {
        super(child, key, USER_PROFILE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<UserProfileRecord, Integer> getIdentity() {
        return (Identity<UserProfileRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<UserProfileRecord> getPrimaryKey() {
        return Keys.USER_PROFILE_PKEY;
    }

    @Override
    public List<UniqueKey<UserProfileRecord>> getKeys() {
        return Arrays.<UniqueKey<UserProfileRecord>>asList(Keys.USER_PROFILE_PKEY);
    }

    @Override
    public UserProfile as(String alias) {
        return new UserProfile(DSL.name(alias), this);
    }

    @Override
    public UserProfile as(Name alias) {
        return new UserProfile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserProfile rename(String name) {
        return new UserProfile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserProfile rename(Name name) {
        return new UserProfile(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, ProfileStatus, String, String, String, LocalDate, Payment, LocalDate, LocalDate> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
