package com.austin.swaggy.repository


import com.austin.swaggy.data.UserDao
import com.austin.swaggy.model.User


class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }
    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}