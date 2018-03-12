package br.com.test.people.web.util

import br.com.test.people.api.request.PersonRequest
import br.com.test.people.application.commands.CreatePersonCommand
import br.com.test.people.domain.PersonId


fun PersonRequest.toCommand() =
        CreatePersonCommand(
                idPerson = PersonId(),
                name = this.name,
                cpf = this.cpf
        )