package org.example;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AppCadastro {
    public static void main(String[] args) throws RemoteException {
        Scanner sc = new Scanner(System.in);
      //  DecimalFormat CNPJ = new DecimalFormat("00.000.000/0000-00");
      //  DecimalFormat CPF = new DecimalFormat("00.000.000-00");
     //   DecimalFormat FONE = new DecimalFormat("(00) 00000 - 0000");

        try{
            IServicoRemoto objCadastro = (IServicoRemoto) Naming.lookup("rmi://localhost:8282/cadastro");
           // CadastroFisica PFisica = new CadastroFisica();
           // CadastroJuridica PJuridica = new CadastroJuridica();
            int x = 0;
            int opc = 0;
            while (x == 0) {
                System.out.println("Digite 1 para pessoa cadastrar Jurídica\nDigite 2 para cadastrar Pessoa Física" +
                        "\nDigite 3 para listar cadastro de pessoas física" +
                        "\nDigite 4 para consultar cadastro de pessoas jurídicas\nDigite 5 para sair");
                opc = sc.nextInt();
                if(opc == 1){
                    CadastroJuridica PJuridica = new CadastroJuridica();

                    System.out.print("Infome um ID para Cadastro: ");
                    PJuridica.setId(sc.nextInt());
                    //int id = sc.nextInt();
                    //PJuridica.setId(id);
                    System.out.print("Informe o CNPJ da empresa: ");
                    //int cnpj = sc.nextInt();
                    PJuridica.setCNPJ(sc.nextInt());
                    System.out.print("Informe o nome fantasia da empresa: ");
                    //String nomeJ = sc.nextLine();
                    PJuridica.setNome(sc.next());
                    System.out.print("Informe o telefone para cadastro: ");
                    //String telefoneJ = sc.nextLine();
                    PJuridica.setTelefone(sc.next());
                    System.out.println("Informe o Endereço com Número e complemento: ");
                    //String enderecoJ = sc.nextLine();
                    PJuridica.setEndereco(sc.next());
                    System.out.print("Informe a cidade para cadastro: ");
                    //String cidadeJ = sc.nextLine();
                    PJuridica.setCidade(sc.next());
                    System.out.print("Informe o estado para cadastro: ");
                    //String estadoJ = sc.nextLine();
                    PJuridica.setEstado(sc.next());

                    objCadastro.inserirCadastroJurudica(PJuridica);

                }else if (opc == 2) {
                    int scape = 0;
                    CadastroFisica PFisica = new CadastroFisica();
                    System.out.print("Informe o ID para Cadastro: ");
                    int idF = sc.nextInt();
                    PFisica.setId(idF);
                    System.out.print("Informe um nome para cadastro: ");
                    //String nomeF = sc.next();
                    PFisica.setNome(sc.next());
                    while (scape == 0) {
                        System.out.print("informe a Idade para cadastro: ");
                        int idadeF = sc.nextInt();
                        if (idadeF < 16) {
                            System.out.println("idade informada abaixo da idade legal!");
                            scape = 0;
                        } else {
                            PFisica.setIdade(idadeF);
                            scape = 1;
                        }
                    }
                    System.out.print("Informe o nome do Pai do Cadastrado: ");
                    //String NomePaiF = sc.nextLine();
                    PFisica.setNomeDoPai(sc.next());
                    System.out.print("Informe o nome da Mãe do Cadastrado: ");
                    //String NomeMaeF = sc.nextLine();
                    PFisica.setNomeDaMae(sc.next());
                    System.out.print("Informe o CPF para cadastro: ");
                    int cpf = sc.nextInt();
                    PFisica.setCPF(cpf);
                    System.out.print("Informe um telefone para cadastro: ");
                   // String telefoneF = sc.nextLine();
                    PFisica.setTelefone(sc.next());
                    System.out.print("Informe o endereço com Numéro: ");
                    //String enderecoF = sc.nextLine();
                    PFisica.setEndereco(sc.next());
                    System.out.print("Informe a cidade: ");
                    //String cidadeF = sc.nextLine();
                    PFisica.setCidade(sc.next());
                    System.out.print("Informe o Estado: ");
                    //String estadoF = sc.nextLine();
                    PFisica.setEstado(sc.next());
                    System.out.print("Informe o valor do salário recebido: ");
                    if (PFisica.getIdade() <= 20) {
                        float salarioF = sc.nextFloat();
                        float aumento = (float) ((salarioF * 0.10));
                        PFisica.setAumento(aumento);
                        PFisica.setSalario(salarioF + aumento);
                    } else if (PFisica.getIdade() > 20 && PFisica.getIdade() <= 30) {
                        float salarioF = sc.nextFloat();
                        float aumento = (float) ((salarioF * 0.15));
                        PFisica.setAumento(aumento);
                        PFisica.setSalario(salarioF + aumento);
                    } else if (PFisica.getIdade() > 30) {
                        float salarioF = sc.nextFloat();
                        float aumento = (float) ((salarioF * 0.20));
                        PFisica.setSalario(salarioF + aumento);
                        PFisica.setAumento(aumento);
                    } else {
                        System.out.println("idade informada abaixo da idade legal!");
                    }
                    objCadastro.inserirCadastroFisica(PFisica);
                }else if (opc == 3){
                    for (CadastroFisica PFisica : objCadastro.listarCadastroFisica()) {
                        System.out.println("\nID: " + PFisica.getId());
                        System.out.println("Nome: " + PFisica.getNome());
                        System.out.println("Idade: " + PFisica.getIdade());
                        System.out.println("Nome do Pai: " + PFisica.getNomeDoPai());
                        System.out.println("Nome da Mãe: " + PFisica.getNomeDaMae());
                        System.out.println("CPF: " + (PFisica.getCPF()));
                        System.out.println("Telefone para Contato: " + (PFisica.getTelefone()));
                        System.out.println("Endereço com Numero: " + PFisica.getEndereco());
                        System.out.println("Cidade: " + PFisica.getCidade());
                        System.out.println("Estado: " + PFisica.getEstado());
                        System.out.println("Salário com aumento: R$" + PFisica.getSalario());
                        System.out.println("Valor do aumento: R$" + PFisica.getAumento());
                    }
                }else if (opc == 4){
                    for (CadastroJuridica PJuridica : objCadastro.listarCadastroJuridica()){
                        System.out.println("ID: " + PJuridica.getId());
                        System.out.println("CNPJ: " + (PJuridica.getCNPJ()));
                        System.out.println("Nome fantasia da empresa: " + PJuridica.getNome());
                        System.out.println("Telefone da empresa: " + (PJuridica.getTelefone()));
                        System.out.println("Endereço com Número e complemento: " + PJuridica.getEndereco());
                        System.out.println("Cidade: " + PJuridica.getCidade());
                        System.out.println("Estado: " + PJuridica.getEstado());
                    }
                }else if (opc == 5)
                    x = 1;
                else
                    System.out.println("Digite uma opção válida!");
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}