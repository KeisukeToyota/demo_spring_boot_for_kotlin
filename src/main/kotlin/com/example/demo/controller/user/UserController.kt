package com.example.demo.controller.user

import com.example.demo.model.user.UserModel
import com.example.demo.model.response.user.UserResponse
import com.example.demo.model.response.user.UsersResponse
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by toyotakeisuke on 2017/05/29.
 */

@RestController
class UserController {

    @RequestMapping("/users")
    fun users() = UsersResponse(UserModel.findAll())

    @RequestMapping("users/{id}")
    fun show_user(@PathVariable id: Int) = UserResponse(UserModel.findById(id))
}