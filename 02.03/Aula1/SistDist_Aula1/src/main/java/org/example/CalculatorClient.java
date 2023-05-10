package org.example;
import javax.swing.*;
import java.rmi.Naming;
public class CalculatorClient{
    public static void main (String[] args) {
        String opcao[] = {"+","-","*","/"}; // inputMessage = inserir nome
        int operacao =   JOptionPane.showOptionDialog(null, "Escolha uma das operações", "tipo de Operação" ,
                0, JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);
        try{
            Calculator c = (Calculator) Naming.lookup("//localhost:1020/CalculatorService");

            System.out.println(c.sub(4, 3));
            System.out.println(c.add(4, 5));
            System.out.println(c.mul(3, 6));
            System.out.println(c.div(9, 3));
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

