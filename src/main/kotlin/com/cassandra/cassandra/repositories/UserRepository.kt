package com.cassandra.cassandra.repositories


import com.cassandra.cassandra.entities.User
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepository:   CassandraRepository<User,String> {
    fun findByfirstName(firstName: String): MutableList<User>

}