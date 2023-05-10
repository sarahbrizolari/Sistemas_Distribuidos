package servidor;

import comum.ServicoRemotoImpl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servico {
    public Servico() throws RemoteException{
        try{
            LocateRegistry.createRegistry(8282);
            System.out.println("Inicio");
            Naming.rebind("rmi://localhosto:8282/pessoa", new ServicoRemotoImpl());
            System.out.println("FIM");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws RemoteException{
        new Servico();
    }
}
