package br.com.test.people.web.config

import br.com.test.people.repository.config.RepositoryConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@Configuration
@EnableScheduling
@Import(
        RepositoryConfig::class
)
@ComponentScan(basePackages = ["br.com.test.people"])
open class ApplicationConfig
