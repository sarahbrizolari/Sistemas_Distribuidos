package org.example;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto {
    public ServicoRemotoImpl() throws RemoteException{
        super();
    }
    public String talk(String message) throws RemoteException{
        String input = Arrays.toString(message.split(" "));
        String resposta = "";
        if (input.contains("Oi") || input.contains("Ola")){
            resposta = "Olá! em que posso ajudar ?";
        }else if (input.contains("Boa Tarde") || input.contains("boa tarde")) {
            resposta = "Boa Tarde! Como posso ajudar ?";
        }else if (input.contains("Bom dia") || input.contains("bom dia") ){
            resposta = "Bom dia! em que posso ajudar ?";
        }else{
           resposta = "Desculpe, não entendi o que quis dizer";
        }
        return resposta;
    }

    public static void main(String[] args) {
        try{
            ServicoRemotoImpl chatBot = new ServicoRemotoImpl();
            Naming.rebind("rmi://localhost:8282/ChatBopApp", chatBot);
        }catch (Exception e){
            System.out.println("ServicoRemotoImpl erro: "+ e.getMessage());
            e.printStackTrace();
        }
    }
//    private static List<Message> lstMessage = new ArrayList<>();

//    protected ServicoRemotoImpl() throws RemoteException{
//    }
//
//
//    @Override
//    public void inserir (Message msg) throws RemoteException{
//        lstMessage.add(msg);
//    }
//
//    @Override
//    public List<Message> listarMensagem() throws RemoteException {
//        return lstMessage;
//    }

}
