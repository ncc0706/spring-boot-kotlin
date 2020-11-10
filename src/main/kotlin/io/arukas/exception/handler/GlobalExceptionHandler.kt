package io.arukas.exception.handler

import io.arukas.support.Dump
import org.slf4j.LoggerFactory
import org.springframework.core.annotation.Order
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

/**
 * @author ncc0706@gmail.com
 * @date 2020/11/08 22:08
 */
@RestControllerAdvice
@Order(Integer.MAX_VALUE)
class GlobalExceptionHandler {

    companion object {
        val logger = LoggerFactory.getLogger(GlobalExceptionHandler::class.java)
    }

    /**
     * 服务器内部错误
     */
    @ExceptionHandler(Exception::class)
    fun handlerServerError(exception: Exception): Dump {
        logger.error(exception.message, exception)
        return Dump.error();
    }

}