package br.com.test.people.application.commands

import br.com.test.people.domain.PersonId

data class CreatePersonCommand(val idPerson: PersonId, val name: String, val cpf: String)