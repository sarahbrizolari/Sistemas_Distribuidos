import javax.swing.*;
import java.awt.*;
import java.rmi.RemoteException;
import java.util.Arrays;

public class ChatPanel extends JPanel {
    Aluno aluno = new Aluno();
    private ChatService chatService; //chatService é um objeto da interface ChatService que é usado para enviar e receber mensagens.
    private JTextArea chatArea; //chatArea é um objeto da classe JTextArea que é usada para exibir a caixa de texto com as mensagens.
    private JTextField nameField;// nameField é um objeto da classe JTextField que é usada para obter o nome do remetente da mensagem.
    private JTextField messageField; //messageField é um objeto da classe JTextField que é usada para obter a mensagem digitada pelo usuário.

    public ChatPanel(ChatService chatService) { //No construtor, passamos o objeto chatService como parâmetro, e em seguida, definimos o layout do painel como um BorderLayout.
        this.chatService = chatService; //inicializa a variável de instância chatService com a instância passada como argumento no construtor.

        setLayout(new BorderLayout()); //Este comando define o layout do painel como um layout de borda. Isso significa que os componentes adicionados ao painel serão organizados ao longo das bordas do painel.

        chatArea = new JTextArea(10, 40); //Em seguida, criamos a caixa de texto chatArea com as dimensões 10 e 40, indicando que ela deve ter 10 linhas e 40 colunas. Em seguida, definimos que ela não pode ser editável. Em seguida, criamos um objeto JScrollPane com a caixa de texto chatArea e adicionamos esse objeto ao pain
        chatArea.setEditable(false);  //define que o usuário não pode editar o texto da chatArea.
        JScrollPane scrollPane = new JScrollPane(chatArea); //Cria um JScrollPane que contém o chatArea, que exibe as mensagens do chat.
        add(scrollPane, BorderLayout.CENTER); //Adiciona o JScrollPane ao painel ChatPanel no centro do layout BorderLayout.

        JPanel inputPanel = new JPanel(); //Cria um novo painel JPanel para conter os componentes de entrada de texto.
        inputPanel.setLayout(new BorderLayout()); //Define o layout do painel inputPanel como BorderLayout.

       // nameField = new JTextField(10); // Cria um JTextField que permite ao usuário inserir seu nome para identificar as mensagens que envia.
       // inputPanel.add(nameField, BorderLayout.WEST); //Adiciona o nameField no lado esquerdo do painel inputPanel.

        messageField = new JTextField(30);//Cria um JTextField que permite ao usuário inserir sua mensagem.
        messageField.addActionListener(e -> sendMessage()); //Adiciona um ActionListener que chama o método sendMessage() quando o usuário pressiona a tecla Enter no messageField.
        inputPanel.add(messageField, BorderLayout.CENTER); //Adiciona o messageField no centro do painel inputPanel.

        JButton sendButton = new JButton("Send"); // Cria um botão JButton para enviar a mensagem.
        sendButton.addActionListener(e -> sendMessage()); //Adiciona um ActionListener que chama o método sendMessage() quando o usuário clica no botão sendButton
        inputPanel.add(sendButton, BorderLayout.EAST); // Adiciona o sendButton no lado direito do painel inputPanel.

        add(inputPanel, BorderLayout.SOUTH);//Adiciona o painel inputPanel na parte inferior do ChatPanel.

        Thread thread = new Thread(this::updateChat); // Cria uma nova Thread que executa o método updateChat().
        thread.start(); //Inicia a Thread criada no passo anterior. O método updateChat() é executado continuamente em segundo plano para atualizar o chatArea com novas mensagens recebidas.
    }

    public String talk (String message) throws RemoteException {
        String resposta = "";
        message = Arrays.toString(message.split(" "));
        if (message.contains("Ola") || message.contains("Oi")) {
            resposta = "Olá em que posso ajudar ??";


            try {
                chatService.sendMessage(message);
                messageField.setText("");
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            return resposta;
        }
    return resposta;
    }
    private void sendMessage() {  //Método para enviar as mensagens
        Aluno aluno = new Aluno();
        String name = "zezinho";
        aluno.setNome(name);
        String message = "";
     //   message = messageField.getText();
        try {
            chatService.sendMessage(message);
           // messageField.setText(message);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void updateChat() { //Método para atualizar área Chat com loop infinito
        try {
            while (true) {
                String chatHistory = chatService.getChatHistory();// A cada segundo, ele chama o método getChatHistory() da instância de chatService para obter o histórico de chat completo a partir do servidor de bate-papo.
                SwingUtilities.invokeLater(() -> { //método invokeLater() da classe SwingUtilities para atualizar a área de texto do chat
                    chatArea.setText(chatHistory);//a área de texto do chat é atualizada com o histórico de chat e a posição do cursor é definida para o final da área de texto para que o texto mais recente seja sempre visível.
                    chatArea.setCaretPosition(chatArea.getDocument().getLength());
                });
                Thread.sleep(1000);
            }
        } catch (RemoteException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}