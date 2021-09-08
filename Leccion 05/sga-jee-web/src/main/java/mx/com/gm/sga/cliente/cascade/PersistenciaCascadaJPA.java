package mx.com.gm.sga.cliente.cascade;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

public class PersistenciaCascadaJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        Persona persona1 = new Persona("Hugo", "Hernandez", "hhernandez@mail.com","5544332211");
        
        Usuario usuario1 = new Usuario("hhernandez","123", persona1);
        
        em.persist(usuario1);
        
        tx.commit();
    }
}
