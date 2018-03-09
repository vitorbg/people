package br.com.test.people.api.request

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class PersonRequest(val name: String, val cpf: String) {

}