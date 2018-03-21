package com.cassandra.cassandra.controllers

import com.cassandra.cassandra.services.UserService
import com.cassandra.cassandra.entities.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping
class UserController{


    @Autowired
    lateinit var userService: UserService

    @PostMapping("/customers")
fun addCustomer(@RequestBody user: User)=userService.addUser(user)
}