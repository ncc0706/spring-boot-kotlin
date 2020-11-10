package io.arukas.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * @author ncc0706@gmail.com
 * @date 2020/11/08 21:41
 */
@Controller
class WelcomeController : BaseController() {

    @GetMapping(value = arrayOf("/", "welcome"))
    fun welcome() = "welcome"

}