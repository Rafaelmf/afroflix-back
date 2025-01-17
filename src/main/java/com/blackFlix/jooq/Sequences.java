/*
 * This file is generated by jOOQ.
 */
package com.blackFlix.jooq;


import org.jooq.Sequence;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all sequences in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.movie_genre_id_seq</code>
     */
    public static final Sequence<Integer> MOVIE_GENRE_ID_SEQ = Internal.createSequence("movie_genre_id_seq", Public.PUBLIC, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.movie_id_seq</code>
     */
    public static final Sequence<Integer> MOVIE_ID_SEQ = Internal.createSequence("movie_id_seq", Public.PUBLIC, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.movie_rel_genre_id_seq</code>
     */
    public static final Sequence<Integer> MOVIE_REL_GENRE_ID_SEQ = Internal.createSequence("movie_rel_genre_id_seq", Public.PUBLIC, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.user_profile_id_seq</code>
     */
    public static final Sequence<Integer> USER_PROFILE_ID_SEQ = Internal.createSequence("user_profile_id_seq", Public.PUBLIC, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);
}
