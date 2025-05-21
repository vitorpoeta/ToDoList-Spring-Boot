package com.example.trabalho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trabalho.model.Tarefas;
import com.example.trabalho.repository.TarefasRepository;

@Service
public class TarefasService {
    @Autowired
    private TarefasRepository tarefasRepository;

    public List<Tarefas> listarTodos(){
        return tarefasRepository.findAll();
    }

    public Tarefas salvar(Tarefas tarefas){
        return tarefasRepository.save(tarefas);
    }    

    public Tarefas atualizar(Long id, Tarefas novaTarefa){
        Tarefas tarefas = tarefasRepository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
        tarefas.setDescricao(novaTarefa.getDescricao());
        tarefas.setTitulo(novaTarefa.getTitulo());
        tarefas.setCompleta(novaTarefa.isCompleta());
        return tarefasRepository.save(tarefas);
    }

    public void excluir(Long id){
        tarefasRepository.deleteById(id);
    }
}
