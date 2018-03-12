package br.com.test.people.domain.repository

import br.com.test.people.domain.entity.Person

interface PersonRepository {

    fun save(person: Person): Int

}