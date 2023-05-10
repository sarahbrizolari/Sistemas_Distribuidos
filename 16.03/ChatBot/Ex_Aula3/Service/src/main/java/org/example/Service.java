package org.example;

import com.sun.corba.se.impl.protocol.giopmsgheaders.LocateReplyMessage;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class Service {
    public Service() throws RemoteException {

        try{
            LocateRegistry.createRegistry(8282);
            System.out.println("Inicio");
            Naming.rebind("rmi://localhost:8282/ChatBopApp", new ServicoRemotoImpl());
            System.out.println("Fim");
            /*for (Message messageuser : MsgUser.listarMensagem()){
            }*/
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws RemoteException{
        new Service();
    }
}