package com.irfan.core.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "moviesentity")
class MoviesEntity(

        @PrimaryKey
        @NonNull
        @ColumnInfo(name = "id")
        var id: Int,

        @ColumnInfo(name = "title")
        var title: String,

        @ColumnInfo(name = "originalTitle")
        var originalTitle: String,

        @ColumnInfo(name = "overview")
        var overview: String,

        @ColumnInfo(name = "popularity")
        var popularity: Float,

        @ColumnInfo(name = "posterPath")
        var posterPath: String,

        @ColumnInfo(name = "voteCount")
        var voteCount: Int,

        @ColumnInfo(name = "voteAverage")
        var voteAverage: Float,

        @ColumnInfo(name = "releaseDate")
        var releaseDate: String,

        @ColumnInfo(name = "isFavorite")
        var isFavorite: Boolean = false,
    )
