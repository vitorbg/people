package br.com.test.people.web

import br.com.test.people.web.config.ApplicationConfig
import org.apache.logging.log4j.LogManager
import org.springframework.boot.SpringApplication
import java.net.InetAddress

private val logger = LogManager.getLogger("br.com.test.people.web.config.Application")

fun main(args: Array<String>) {
    val app = SpringApplication.run(ApplicationConfig::class.java, *args)

//    val applicationName = app.environment.getProperty("spring.application.name")
//    val contextPath = app.environment.getProperty("server.contextPath")
//    val port = app.environment.getProperty("server.port")
//    val hostAddress = InetAddress.getLocalHost().hostAddress
}
