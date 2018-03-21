package com.cassandra.cassandra.services

import com.cassandra.cassandra.entities.User


interface UserService{


    fun addUser(user: User): User
}