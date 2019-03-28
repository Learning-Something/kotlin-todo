package com.app.todo.rest

import com.app.todo.domain.Todo
import com.app.todo.service.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todos")
class TodoRest {
    @Autowired
    private lateinit var todoService: TodoService

    @GetMapping
    fun getAll() = ResponseEntity.ok().body(todoService.all())

    @GetMapping("/{id}")
    fun get(
            @PathVariable id: Long
    ) = ResponseEntity.ok().body(todoService.get(id))

    @PostMapping
    fun create(
            @RequestBody todo: Todo
    ) = ResponseEntity.ok().body(todoService.create(todo))

    @PutMapping
    fun update(
            @RequestBody todo: Todo
    ) = ResponseEntity.ok().body(todoService.update(todo))

    @DeleteMapping("/{id}")
    fun delete(
            @PathVariable id: Long
    ) = ResponseEntity.ok().body(todoService.delete(id))
}