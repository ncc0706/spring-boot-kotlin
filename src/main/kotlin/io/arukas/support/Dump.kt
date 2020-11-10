package io.arukas.support

import com.fasterxml.jackson.annotation.JsonInclude

/**
 * 统一响应
 * @author ncc0706@gmail.com
 * @date 2020/11/08 22:12
 */
data class Dump(
        val status: Int,
        val message: String,
        val timestamp: Long,
        @JsonInclude(JsonInclude.Include.NON_EMPTY) val data: Any) {

//    var status = 200
//    var message = ""
//    var timestamp = System.currentTimeMillis()
//
//    @JsonInclude(JsonInclude.Include.NON_EMPTY)
//    var data = Any()

    companion object {

        fun success() = Dump(200, "success", System.currentTimeMillis(), Any())
        fun success(message: String) = Dump(200, message, System.currentTimeMillis(), Any())
        fun success(message: String, data: Any) = Dump(200, message, System.currentTimeMillis(), data)

        fun error() = Dump(500, "server error", System.currentTimeMillis(), Any())

    }
}