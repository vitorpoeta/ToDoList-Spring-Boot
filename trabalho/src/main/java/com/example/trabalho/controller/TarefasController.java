package com.example.trabalho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.trabalho.model.Tarefas;
import com.example.trabalho.service.TarefasService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/tarefas")
public class TarefasController {
     @Autowired
    private TarefasService tarefasService;

    @GetMapping("/listar")
    public List<Tarefas> listar(@RequestBody Tarefas tarefas) {
        return tarefasService.listarTodos();
    }
    
    @PostMapping
    public Tarefas criarTarefas(@RequestBody Tarefas tarefas) {
        return tarefasService.salvar(tarefas);
    }

    @PutMapping("/{id}")
    public Tarefas atualizar(@PathVariable Long id, @RequestBody Tarefas Tarefas) {
        return tarefasService.atualizar(id, Tarefas);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        tarefasService.excluir(id);
    }
}
