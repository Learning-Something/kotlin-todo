package com.app.todo.service

import com.app.todo.domain.Todo
import com.app.todo.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoService {
    @Autowired
    private lateinit var todoRepository: TodoRepository

    fun all() = todoRepository.findAll()

    fun get(id: Long) = todoRepository.findById(id).get()

    fun create(todo: Todo) = todoRepository.save(todo)

    fun update(todo: Todo) = todoRepository.save(todo)

    fun delete(id: Long) = todoRepository.deleteById(id)
}