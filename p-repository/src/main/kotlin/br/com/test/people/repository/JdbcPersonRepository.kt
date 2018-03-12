package br.com.test.people.repository

import br.com.test.people.domain.entity.Person
import org.springframework.stereotype.Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import br.com.test.people.domain.repository.PersonRepository


@Repository
open class JdbcPersonRepository @Autowired constructor(private val jdbcTemplate: JdbcTemplate) : PersonRepository {
    override fun save(person: Person): Int {

        val sqlPerson = """
              INSERT INTO public.person(
              id_person, name, cpf)
                VALUES (?::uuid, ?, ?);
                """
        return jdbcTemplate.update(sqlPerson, person.idPerson.value, person.name, person.cpf)
    }
}

