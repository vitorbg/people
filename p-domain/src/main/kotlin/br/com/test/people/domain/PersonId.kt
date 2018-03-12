package br.com.test.people.domain

import java.util.*

data class PersonId(val value: String = UUID.randomUUID().toString())