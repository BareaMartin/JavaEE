package mx.com.gm.sga.cliente;

import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.*;
import org.apache.logging.log4j.*;

public class PruebaManejoTransacciones {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");

            log.debug("Iniciando prueba manejo transaccional PersonaService");

            //BBuscar un objeto de tipo Persona
            Persona persona1 = personaService.encontrarPersonaPorId(new Persona(1));
            log.debug("Persona recuperada: " + persona1);

            //Cambiar apellido para probar transaccion fallida
//            persona1.setApellido("123456789101112131415161718192021222324252627282930");
//            personaService.modificarPersona(persona1);
//            log.debug("Objeto modificado: " + persona1);
//            log.debug("Fin de prueba EJB transaccional");

            //Cambiar apellido para probar transaccion Correcta
            persona1.setApellido("Pepito");
            personaService.modificarPersona(persona1);
            log.debug("Objeto modificado: " + persona1);
            log.debug("Fin de prueba EJB transaccional");
            
        } catch (NamingException ex) {
            log.debug(ex.getMessage());
        }
    }
}
