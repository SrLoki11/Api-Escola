package com.example.dao;

import com.example.model.Turma;
import com.example.util.HibernateUtil;
import org.hibernate.Session;

public class TurmaDAO {

    public void salvarTurma(Turma turma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(turma);
        session.getTransaction().commit();
        session.close();
    }

    public Turma buscarTurma(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Turma turma = session.get(Turma.class, id);
        session.close();
        return turma;
    }

    public void atualizarTurma(Turma turma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(turma);
        session.getTransaction().commit();
        session.close();
    }

    public void deletarTurma(Turma turma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(turma);
        session.getTransaction().commit();
        session.close();
    }
}
