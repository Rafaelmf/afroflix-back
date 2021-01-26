/*
 * This file is generated by jOOQ.
 */
package com.blackFlix.jooq.tables;


import com.blackFlix.jooq.Keys;
import com.blackFlix.jooq.Public;
import com.blackFlix.jooq.tables.records.MovieRelGenreRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class MovieRelGenre extends TableImpl<MovieRelGenreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.movie_rel_genre</code>
     */
    public static final MovieRelGenre MOVIE_REL_GENRE = new MovieRelGenre();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MovieRelGenreRecord> getRecordType() {
        return MovieRelGenreRecord.class;
    }

    /**
     * The column <code>public.movie_rel_genre.id</code>.
     */
    public final TableField<MovieRelGenreRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.movie_rel_genre.movie_id</code>.
     */
    public final TableField<MovieRelGenreRecord, Integer> MOVIE_ID = createField(DSL.name("movie_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.movie_rel_genre.movie_genre_id</code>.
     */
    public final TableField<MovieRelGenreRecord, Integer> MOVIE_GENRE_ID = createField(DSL.name("movie_genre_id"), SQLDataType.INTEGER, this, "");

    private MovieRelGenre(Name alias, Table<MovieRelGenreRecord> aliased) {
        this(alias, aliased, null);
    }

    private MovieRelGenre(Name alias, Table<MovieRelGenreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.movie_rel_genre</code> table reference
     */
    public MovieRelGenre(String alias) {
        this(DSL.name(alias), MOVIE_REL_GENRE);
    }

    /**
     * Create an aliased <code>public.movie_rel_genre</code> table reference
     */
    public MovieRelGenre(Name alias) {
        this(alias, MOVIE_REL_GENRE);
    }

    /**
     * Create a <code>public.movie_rel_genre</code> table reference
     */
    public MovieRelGenre() {
        this(DSL.name("movie_rel_genre"), null);
    }

    public <O extends Record> MovieRelGenre(Table<O> child, ForeignKey<O, MovieRelGenreRecord> key) {
        super(child, key, MOVIE_REL_GENRE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<MovieRelGenreRecord, Integer> getIdentity() {
        return (Identity<MovieRelGenreRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MovieRelGenreRecord> getPrimaryKey() {
        return Keys.MOVIE_REL_GENRE_PKEY;
    }

    @Override
    public List<UniqueKey<MovieRelGenreRecord>> getKeys() {
        return Arrays.<UniqueKey<MovieRelGenreRecord>>asList(Keys.MOVIE_REL_GENRE_PKEY);
    }

    @Override
    public List<ForeignKey<MovieRelGenreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MovieRelGenreRecord, ?>>asList(Keys.MOVIE_REL_GENRE__MOVIE_REL_GENRE_MOVIE_ID_FKEY, Keys.MOVIE_REL_GENRE__MOVIE_REL_GENRE_MOVIE_GENRE_ID_FKEY);
    }

    public Movie movie() {
        return new Movie(this, Keys.MOVIE_REL_GENRE__MOVIE_REL_GENRE_MOVIE_ID_FKEY);
    }

    public MovieGenre movieGenre() {
        return new MovieGenre(this, Keys.MOVIE_REL_GENRE__MOVIE_REL_GENRE_MOVIE_GENRE_ID_FKEY);
    }

    @Override
    public MovieRelGenre as(String alias) {
        return new MovieRelGenre(DSL.name(alias), this);
    }

    @Override
    public MovieRelGenre as(Name alias) {
        return new MovieRelGenre(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieRelGenre rename(String name) {
        return new MovieRelGenre(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieRelGenre rename(Name name) {
        return new MovieRelGenre(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
