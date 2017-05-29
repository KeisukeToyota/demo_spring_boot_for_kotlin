package com.example.demo.app.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class DemoController {

    @RequestMapping("")
    fun index() = "Hello Spring Boot!!"

    @RequestMapping("/hello/{name}")
    fun hello(@PathVariable name: String): String = "Hello $name"

}