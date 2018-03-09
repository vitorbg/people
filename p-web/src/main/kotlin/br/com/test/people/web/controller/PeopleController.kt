package br.com.test.people.web.controller

import br.com.test.people.api.request.PersonRequest
import br.com.test.people.api.representation.PersonRepresentation
import br.com.test.people.api.PeopleApi
import org.apache.logging.log4j.LogManager
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class PeopleController : PeopleApi {

    private val LOG = LogManager.getLogger(this.javaClass)


    override fun createPerson(@RequestBody @Valid request: PersonRequest): PersonRepresentation {
        LOG.info("Oi")
        LOG.info(request)
        val personRepresentation = PersonRepresentation("id_safadao", request.name, request.cpf)
        return personRepresentation
    }


    @GetMapping("/home")
    fun home(): String {
        return "To na home !!!!"
    }
}