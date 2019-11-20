package Hibernate

import org.hibernate.Session
import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration
import dominio.ObjetoBanco

import javax.imageio.spi.ServiceRegistry

class Ambiente {

    Configuration con = new Configuration().configure()
    SessionFactory sessionFactory = con.buildSessionFactory()
    Session session = sessionFactory.openSession()

    Ambiente(ObjetoBanco objetoBanco) {
        Configuration con = new Configuration().configure().addAnnotatedClass(objetoBanco.class)
        SessionFactory sessionFactory = con.buildSessionFactory()
        this.session = sessionFactory.openSession()
    }
}
