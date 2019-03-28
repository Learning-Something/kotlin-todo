package com.app.todo.repository

import com.app.todo.domain.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo, Long>