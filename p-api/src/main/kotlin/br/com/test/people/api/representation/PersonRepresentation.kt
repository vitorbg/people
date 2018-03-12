package br.com.test.people.api.representation

import br.com.test.people.application.handler.PersonCommandHandler
import br.com.test.people.domain.entity.Person
import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class PersonRepresentation(val idPerson: String, val name: String, val cpf: String) {

}