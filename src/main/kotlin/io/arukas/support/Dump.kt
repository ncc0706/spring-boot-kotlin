package io.arukas.support

import com.fasterxml.jackson.annotation.JsonInclude

/**
 * 统一响应
 * @author ncc0706@gmail.com
 * @date 2020/11/08 22:12
 */
data class Dump(

        /**
         * 状态码
         */
        val status: Int,

        /**
         * 报文描述
         */
        val message: String,

        /**
         * 当前时间戳
         */
        val timestamp: Long,

        /**
         * 报文数据
         */
        @JsonInclude(JsonInclude.Include.NON_EMPTY) val data: Any) {

    /**
     * 伴生对象
     */
    companion object {

        /**
         * 默认成功响应
         */
        fun success() = Dump(200, "success", System.currentTimeMillis(), Any())

        /**
         * @param message 报文描述
         */
        fun success(message: String) = Dump(200, message, System.currentTimeMillis(), Any())

        /**
         * @param message 报文描述
         * @param data    报文数据
         */
        fun success(message: String, data: Any) = Dump(200, message, System.currentTimeMillis(), data)

        /**
         * 默认失败响应
         */
        fun error() = Dump(500, "server error", System.currentTimeMillis(), Any())

    }
}