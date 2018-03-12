package br.com.test.people.domain.entity

import br.com.test.people.domain.repository.PersonRepository
import br.com.test.people.domain.PersonId

class Person(val idPerson: PersonId, val name: String, val cpf: String){



     fun create(personRepository: PersonRepository) {
//        verifyIfExistsCode(repository)

        personRepository.save(this)
    }

}
