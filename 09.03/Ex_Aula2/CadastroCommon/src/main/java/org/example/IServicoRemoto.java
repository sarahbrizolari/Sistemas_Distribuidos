package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServicoRemoto extends Remote {
    void inserirCadastroFisica(CadastroFisica p) throws RemoteException;
    List<CadastroFisica> listarCadastroFisica() throws RemoteException;
    void inserirCadastroJurudica(CadastroJuridica p) throws RemoteException;
    List<CadastroJuridica> listarCadastroJuridica() throws RemoteException;

}
