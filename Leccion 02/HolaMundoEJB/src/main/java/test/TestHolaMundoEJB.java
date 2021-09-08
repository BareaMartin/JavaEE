package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import beans.HolaMundoEjbRemote;

public class TestHolaMundoEJB {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try{
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundoEJB = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEJB.sumar(5,3);
            System.out.println("Resultado EJB suma 5+3 = " + resultado);
        }
        catch(NamingException e){
            e.printStackTrace(System.out);
        }
    }
}