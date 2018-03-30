package com.cassandra.cassandra.services

import com.cassandra.cassandra.repositories.UserRepository
import com.cassandra.cassandra.entities.User
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.cassandra.repository.AllowFiltering
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {


   @Autowired
lateinit var userRepository: UserRepository
    private val logger = LoggerFactory.getLogger(UserService::class.java)

   override fun addUser(user: User): User {

     userRepository.save(user)
     return user

}
   override fun getUsers()=userRepository.findAll()

    @AllowFiltering
    override fun getUserByFirstName(firstName: String) =
            userRepository.findByfirstName(firstName)




    override fun deleteUser(firstName: String) {
        val users=userRepository.findByfirstName(firstName)
        userRepository.deleteAll(users)
        logger.info("user deleted!!")
    }

    override fun deleteAllUsers() {
        userRepository.deleteAll()
       logger.info("All users deleted!!")
    }

}