package com.example;

import com.example.dao.AlunoDao;
import com.example.dao.DisciplinaDAO;
import com.example.dao.TurmaDAO;
import com.example.model.Aluno;
import com.example.model.Disciplina;
import com.example.model.Turma;

public class Main {
    public static void main(String[] args) {
        AlunoDao alunoDAO = new AlunoDao();
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
        TurmaDAO turmaDAO = new TurmaDAO();

        // Criar e salvar uma nova disciplina
        Disciplina matematica = new Disciplina();
        matematica.setNome("Matemática");
        disciplinaDAO.salvarDisciplina(matematica);

        // Criar e salvar um novo aluno
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        
        alunoDAO.salvarAluno(aluno);

        // Criar e salvar uma nova turma
        Turma turma = new Turma();
        turma.setNome("Turma A");
        turma.getAlunos().add(aluno);
        turma.getDisciplinas().add(matematica);
        turmaDAO.salvarTurma(turma);

        // Buscar e exibir os dados
        Turma turmaBuscada = turmaDAO.buscarTurma(turma.getId());
        System.out.println("Nome da turma: " + turmaBuscada.getNome());
        System.out.println("Alunos na turma: " + turmaBuscada.getAlunos().get(0).getNome());
        System.out.println("Disciplinas na turma: " + turmaBuscada.getDisciplinas().get(0).getNome());
    }
}

