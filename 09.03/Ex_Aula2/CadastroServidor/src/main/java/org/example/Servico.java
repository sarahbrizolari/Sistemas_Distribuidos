package org.example;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servico {
    public Servico() throws RemoteException {
        try{
            LocateRegistry.createRegistry(8282);
            System.out.println("INICIO");
            Naming.rebind("rmi://localhost:8282/cadastro", new ServicoRemotoImpl());
            System.out.println("FIM");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws RemoteException {
        new Servico();
    }
}