package com.cassandra.cassandra.controllers

import com.cassandra.cassandra.services.UserService
import com.cassandra.cassandra.entities.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.cassandra.repository.AllowFiltering
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping
class UserController{


    @Autowired
    lateinit var userService: UserService

    @PostMapping("/users")
    fun addCustomer(@RequestBody user: User)=userService.addUser(user)

    @GetMapping("/users")
    fun getUsers()=userService.getUsers()

    @AllowFiltering
    @GetMapping(value = "/users/{firstName}")
    fun getUserByFirstname(@PathVariable("firstName") firstName: String) =
            userService.getUserByFirstName(firstName)

    @DeleteMapping("/users")
    fun deleteUsers() =
            userService.deleteAllUsers()


}