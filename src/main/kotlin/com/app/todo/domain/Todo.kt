package com.app.todo.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Todo (
        @Id
        val id: Long? = null,
        val description: String,
        val done: Boolean = false,
        val createdAt: Date = Date()
)