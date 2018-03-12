package br.com.test.people.web.controller

import br.com.test.people.api.request.PersonRequest
import br.com.test.people.api.representation.PersonRepresentation
import br.com.test.people.api.PeopleApi
import br.com.test.people.application.handler.PersonCommandHandler
import br.com.test.people.web.util.toCommand
import br.com.test.people.web.util.toRepresentation
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class PeopleController @Autowired constructor(private val commandHandler: PersonCommandHandler) : PeopleApi {

    private val LOG = LogManager.getLogger(this.javaClass)


    override fun createPerson(@RequestBody @Valid request: PersonRequest): PersonRepresentation {
        LOG.info("Oi")
        LOG.info(request)

        val command = request.toCommand()
        val person = commandHandler.handler(command)



        LOG.info(command)

        return person.toRepresentation()

    }


    @GetMapping("/home")
    fun home(): String {
        return "To na home !!!!"
    }
}