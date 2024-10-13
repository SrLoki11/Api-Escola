package com.example.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.model.Aluno;
import com.example.service.AlunoService;

@RestController
@RequestMapping("/api/alunos")
public class AlunoControler {
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    @PostMapping
    public Aluno salvarAluno(@RequestBody Aluno aluno) {
        return alunoService.salvarAluno(aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscarAlunoPorId(@PathVariable int id) {
        return alunoService.buscarAlunoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable int id) {
        alunoService.deletarAluno(id);
    }
}
