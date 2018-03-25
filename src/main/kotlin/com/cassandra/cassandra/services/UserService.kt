package com.cassandra.cassandra.services

import com.cassandra.cassandra.entities.User


interface UserService{


    fun addUser(user: User): User
    fun getUsers(): MutableList<User>
    fun deleteUser(firstName: String)
    fun getUserByFirstName(firstName: String): MutableList<User>
    fun deleteAllUsers()
}