package com.cassandra.cassandra.services

import com.cassandra.cassandra.repositories.UserRepository
import com.cassandra.cassandra.entities.User
import com.cassandra.cassandra.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {


   @Autowired
lateinit var userRepository: UserRepository

   override fun addUser(user: User): User {

     userRepository.save(user)
     return user

}




}