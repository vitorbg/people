package br.com.test.people.api

import br.com.test.people.api.representation.PersonRepresentation
import br.com.test.people.api.request.PersonRequest
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RequestMapping
interface PeopleApi {

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @PostMapping("/person", produces = [(MediaType.APPLICATION_JSON_VALUE)])
    fun createPerson(@RequestBody @Valid request: PersonRequest): PersonRepresentation

}