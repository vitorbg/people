package br.com.test.people.repository.config

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement
import javax.sql.DataSource

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = ["br.com.test.people.repository"])
open class RepositoryConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    open fun dataSource() =
            DataSourceBuilder.create().build()!!

    @Bean
    open fun jdbcTemplate(dataSource: DataSource) =
            JdbcTemplate(dataSource)

    @Bean
    open fun txManager(): PlatformTransactionManager {
        return DataSourceTransactionManager(dataSource())
    }

}