package io.arukas.controller

import io.arukas.support.Dump
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author ncc0706@gmail.com
 * @date 2020/11/08 22:06
 */
@RestController
class UserController : BaseController() {


    @GetMapping("users")
    fun user(): Dump {
        return Dump.success("xx", listOf("java", "kotlin"))
    }

    @GetMapping("errors")
    fun error() {

        logger.warn("这里有错误...")

//        100 / (20 - 20)

    }

}