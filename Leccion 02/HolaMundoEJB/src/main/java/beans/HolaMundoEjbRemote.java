package beans;

import javax.ejb.*;

@Remote
public interface HolaMundoEjbRemote {
    public int sumar(int a, int b);
}
//java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote