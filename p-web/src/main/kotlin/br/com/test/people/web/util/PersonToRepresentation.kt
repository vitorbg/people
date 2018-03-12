package br.com.test.people.web.util

import br.com.test.people.api.representation.PersonRepresentation
import br.com.test.people.domain.entity.Person

fun Person.toRepresentation() = PersonRepresentation(idPerson = this.idPerson.value,
        name = this.name,
        cpf = this.cpf)
