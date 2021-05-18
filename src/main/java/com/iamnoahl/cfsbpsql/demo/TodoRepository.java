package com.iamnoahl.cfsbpsql.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TodoRepository extends JpaRepository<TodoModel, UUID> {
}
