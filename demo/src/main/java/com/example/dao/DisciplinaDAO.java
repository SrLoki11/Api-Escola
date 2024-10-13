package com.example.dao;

import com.example.model.Disciplina;
import com.example.util.HibernateUtil;
import org.hibernate.Session;

public class DisciplinaDAO {

    public void salvarDisciplina(Disciplina disciplina) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(disciplina);
        session.getTransaction().commit();
        session.close();
    }

    public Disciplina buscarDisciplina(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Disciplina disciplina = session.get(Disciplina.class, id);
        session.close();
        return disciplina;
    }

    public void atualizarDisciplina(Disciplina disciplina) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(disciplina);
        session.getTransaction().commit();
        session.close();
    }

    public void deletarDisciplina(Disciplina disciplina) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(disciplina);
        session.getTransaction().commit();
        session.close();
    }
}
