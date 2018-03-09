package br.com.test.people.api.representation

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class PersonRepresentation(val id_person: String, val name: String, val cpf: String) {

}