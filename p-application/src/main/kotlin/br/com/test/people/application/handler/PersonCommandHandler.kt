package br.com.test.people.application.handler

import br.com.test.people.application.commands.CreatePersonCommand
import br.com.test.people.domain.entity.Person
import br.com.test.people.domain.repository.PersonRepository
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
//open class PersonCommandHandler() {
open class PersonCommandHandler @Autowired constructor(private val personRepository: PersonRepository) {

    private val LOG = LogManager.getLogger(this.javaClass)


    fun handler(command: CreatePersonCommand): Person {
        LOG.info("Vamos criar esse evento danado.")
        val person = Person(
                idPerson = command.idPerson,
                name = command.name,
                cpf = command.cpf
        )
        person.create(personRepository)

        return person
    }


//    fun handler(command: CreateReusableCoupon): Coupon {
//        LOG.debug("Received command to create a reusable coupon in data base with id: {}", command.couponId.value)
//
//        val coupon = ReusableCoupon(
//                id = command.couponId,
//                code = command.code,
//                description = command.description,
//                lifeCycle = command.lifeCycle,
//                amountAvailable = command.amountAvailable,
//                userLimit = command.userLimit,
//                usageLimitPeriod = command.usageLimitPeriod,
//                channels = command.channels,
//                reward = command.reward,
//                terms = command.terms,
//                rewardType = command.rewardType
//        )
//
//        coupon.create(repository)
//
//        LOG.debug("Coupon created with id: [{}]", command.couponId.value)
//        saveAuditInsert(coupon)
//        return coupon
//    }
}