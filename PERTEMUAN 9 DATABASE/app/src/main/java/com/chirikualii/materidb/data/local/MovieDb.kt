package com.chirikualii.materidb.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.chirikualii.materidb.data.local.dao.MovieDao
import com.chirikualii.materidb.data.local.entity.MovieEntity
import com.chirikualii.materidb.data.model.Movie

@Database(entities = [MovieEntity::class], version = 1)
abstract class MovieDb : RoomDatabase() {

    abstract fun movieDao() : MovieDao
}