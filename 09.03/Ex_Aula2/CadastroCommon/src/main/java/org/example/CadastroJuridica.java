package org.example;

import java.io.Serializable;
import java.rmi.RemoteException;

public class CadastroJuridica extends Pessoa {
    int CNPJ;

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public CadastroJuridica() throws RemoteException{
        super();
    }
}
