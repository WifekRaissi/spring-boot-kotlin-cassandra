package com.cassandra.cassandra.services

import com.cassandra.cassandra.repositories.UserRepository
import com.cassandra.cassandra.entities.User
import com.cassandra.cassandra.services.UserService
import jdk.nashorn.internal.runtime.regexp.joni.Config.log
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.cassandra.repository.AllowFiltering
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {


   @Autowired
lateinit var userRepository: UserRepository

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
       // log.info("user deleted!!")
    }

    override fun deleteAllUsers() {
        userRepository.deleteAll()
       // log.info("All users deleted!!")
    }
    /*override fun getUserById(firstName: String) =
            userRepository.findByfirstname(firstName)
    override fun updateUser(firstName: String, user: User):User {
        val currentUser =  userRepository.findByfirstname(firstName)
        if (currentUser != null)  userRepository.save(currentUser.copy(id,user.firstName,user.lastName, user.birthDay))
        log.info("${user.firstName},updated!!!")
        return currentUser

    }*/
}