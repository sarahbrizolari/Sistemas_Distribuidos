import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.*;


public class ChatClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 8282);
            ChatService chatService = (ChatService) registry.lookup("ChatService");

            JFrame frame = new JFrame("Chat Client"); //criar uma janela JFrame com o título "Chat Client"
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new ChatPanel(chatService));//Instancia ChatPanel passando a instância de chatService como argumento para estabelecer a conexão com o servidor
            frame.pack();//O método pack() é chamado para ajustar o tamanho da janela ao tamanho preferido do painel ChatPanel
            frame.setVisible(true); //setVisible(true) é chamado para exibir a janela na tela
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}

