package model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import model.Post
import model.PostDao

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}