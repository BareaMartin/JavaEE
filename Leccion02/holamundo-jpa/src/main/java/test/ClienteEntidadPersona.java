package test;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class ClienteEntidadPersona {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        //Inicia la transaccion
        tx.begin();
        //No se debe especificar el ID de la base de datos
        Persona persona1 = new Persona("Maria", "Gutierrez", "mgutierrez@mail.com", "88991199");
        log.debug("Objeto a persistir:" + persona1);
        //Persistimos el objeto
        em.persist(persona1);
        //terminamos la transaccion
        tx.commit();
        log.debug("Objeto persistido" + persona1);
        em.close();
    }
}
