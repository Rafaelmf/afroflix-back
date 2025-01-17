/*
 * This file is generated by jOOQ.
 */
package com.blackFlix.jooq.tables;


import com.blackFlix.jooq.Keys;
import com.blackFlix.jooq.Public;
import com.blackFlix.jooq.enums.Genre;
import com.blackFlix.jooq.tables.records.MovieGenreRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class MovieGenre extends TableImpl<MovieGenreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.movie_genre</code>
     */
    public static final MovieGenre MOVIE_GENRE = new MovieGenre();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MovieGenreRecord> getRecordType() {
        return MovieGenreRecord.class;
    }

    /**
     * The column <code>public.movie_genre.id</code>.
     */
    public final TableField<MovieGenreRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.movie_genre.movie_genre</code>.
     */
    public final TableField<MovieGenreRecord, Genre> MOVIE_GENRE_ = createField(DSL.name("movie_genre"), SQLDataType.VARCHAR.asEnumDataType(com.blackFlix.jooq.enums.Genre.class), this, "");

    private MovieGenre(Name alias, Table<MovieGenreRecord> aliased) {
        this(alias, aliased, null);
    }

    private MovieGenre(Name alias, Table<MovieGenreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.movie_genre</code> table reference
     */
    public MovieGenre(String alias) {
        this(DSL.name(alias), MOVIE_GENRE);
    }

    /**
     * Create an aliased <code>public.movie_genre</code> table reference
     */
    public MovieGenre(Name alias) {
        this(alias, MOVIE_GENRE);
    }

    /**
     * Create a <code>public.movie_genre</code> table reference
     */
    public MovieGenre() {
        this(DSL.name("movie_genre"), null);
    }

    public <O extends Record> MovieGenre(Table<O> child, ForeignKey<O, MovieGenreRecord> key) {
        super(child, key, MOVIE_GENRE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<MovieGenreRecord, Integer> getIdentity() {
        return (Identity<MovieGenreRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MovieGenreRecord> getPrimaryKey() {
        return Keys.MOVIE_GENRE_PKEY;
    }

    @Override
    public List<UniqueKey<MovieGenreRecord>> getKeys() {
        return Arrays.<UniqueKey<MovieGenreRecord>>asList(Keys.MOVIE_GENRE_PKEY);
    }

    @Override
    public MovieGenre as(String alias) {
        return new MovieGenre(DSL.name(alias), this);
    }

    @Override
    public MovieGenre as(Name alias) {
        return new MovieGenre(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieGenre rename(String name) {
        return new MovieGenre(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieGenre rename(Name name) {
        return new MovieGenre(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Genre> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
