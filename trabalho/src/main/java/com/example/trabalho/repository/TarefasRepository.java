package com.example.trabalho.repository;

import org.springframework.stereotype.Repository;

import com.example.trabalho.model.Tarefas;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas,Long>{
    
}
