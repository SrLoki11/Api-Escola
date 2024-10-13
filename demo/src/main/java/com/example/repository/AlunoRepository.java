package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
