package br.com.test.people.web.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@Configuration
@EnableScheduling
@ComponentScan(basePackages = ["br.com.test.people"])
open class ApplicationConfig
