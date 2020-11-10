package io.arukas.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * @author ncc0706@gmail.com
 * @date 2020/11/08 22:02
 */
// 继承、实现需要使用 :, 相当于java中的extend，implements, 基类必须是 open 修饰的
open class BaseController {
    val logger: Logger = LoggerFactory.getLogger(javaClass)
}