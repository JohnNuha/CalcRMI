
package CalcRMI;


import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;

public class CalcServ {
    public static void main(String[] args) throws RemoteException,NotBoundException{
       
        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calculator", new CalcRmi());
            System.out.println("Server berjalan");

    }
}
