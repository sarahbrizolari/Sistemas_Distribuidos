package org.example;

import java.io.Serializable;
import java.rmi.RemoteException;

public class CadastroFisica extends Pessoa {
    private int Idade;
    private int CPF;
    private float Salario;
    private float aumento;
    private String NomeDoPai;
    private String NomeDaMae;

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public float getAumento() {
        return aumento;
    }

    public void setAumento(float aumento) {
        this.aumento = aumento;
    }

    public String getNomeDoPai() {
        return NomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        NomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return NomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        NomeDaMae = nomeDaMae;
    }

    public CadastroFisica () throws RemoteException{
        super();

    }
}
