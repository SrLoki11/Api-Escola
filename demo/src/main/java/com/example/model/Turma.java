package com.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany
    @JoinColumn(name = "turma_id")
    private List<Aluno> alunos;

    @ManyToMany
    @JoinTable(name = "turma_disciplina", 
              joinColumns = @JoinColumn(name = "turma_id"), 
              inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    private List<Disciplina> disciplinas;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
