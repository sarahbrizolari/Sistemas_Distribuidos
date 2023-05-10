package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto {
    private static List <CadastroFisica> lstPessoaFisica = new ArrayList<>();
    private static List <CadastroJuridica> lstPessoaJuridica = new ArrayList<>();

    protected ServicoRemotoImpl() throws RemoteException{
             }
    @Override
    public void inserirCadastroFisica(CadastroFisica p) throws RemoteException{
        lstPessoaFisica.add(p);
    }
    @Override
    public List<CadastroFisica> listarCadastroFisica() throws RemoteException {
        return lstPessoaFisica;
    }
    @Override
    public void inserirCadastroJurudica(CadastroJuridica p) throws RemoteException {
    lstPessoaJuridica.add(p);
    }

    @Override
    public List<CadastroJuridica> listarCadastroJuridica() throws RemoteException {
        return lstPessoaJuridica;
    }

}
