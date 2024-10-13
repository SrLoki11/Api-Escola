package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.model.Aluno;
import com.example.repository.AlunoRepository;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno buscarAlunoPorId(int id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public void deletarAluno(int id) {
        alunoRepository.deleteById(id);
    }
}
