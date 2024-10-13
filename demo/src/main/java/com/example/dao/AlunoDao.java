package com.example.dao;

import com.example.model.Aluno;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlunoDao {

    // Create (Salvar um novo Aluno)
    public void salvarAluno(Aluno aluno) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(aluno); // Persistindo o aluno
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    
    // Alterar de int para Long
public Aluno buscarAluno(Long id) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Aluno aluno = null;

    try {
        aluno = session.get(Aluno.class, id); // Buscando o aluno pelo ID
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        session.close();
    }

    return aluno;
}


    // Update (Atualizar um Aluno)
    public void atualizarAluno(Aluno aluno) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(aluno); // Atualizando o aluno
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    // Delete (Deletar um Aluno)
    public void deletarAluno(Aluno aluno) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(aluno); // Deletando o aluno
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

