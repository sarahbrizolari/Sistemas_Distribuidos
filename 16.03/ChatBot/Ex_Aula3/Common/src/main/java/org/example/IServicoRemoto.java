package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServicoRemoto extends Remote {
    public String talk(String message) throws RemoteException;

//    void inserir(Message msg) throws RemoteException;
//    List<Message>listarMensagem() throws RemoteException;
}
