package beans;

import javax.ejb.*;

@Stateless
public class HolaMundoEjbimpl implements HolaMundoEjbRemote {

    @Override
    public int sumar(int a, int b){
        System.out.println("Ejecutando metodo suma en el servidor");
        return a + b;
    }
           

}
