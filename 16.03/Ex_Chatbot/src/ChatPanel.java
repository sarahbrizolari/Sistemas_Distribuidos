import javax.swing.*;
import java.awt.*;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class ChatPanel extends JPanel {
    private ChatService chatService;
    private JTextArea chatArea;
    private JTextField nameField;
    private JTextField messageField;

    public ChatPanel(ChatService chatService) {
        this.chatService = chatService;

        setLayout(new BorderLayout());

        chatArea = new JTextArea(10, 40);
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        nameField = new JTextField(10);
        inputPanel.add(nameField, BorderLayout.WEST);

        messageField = new JTextField(30);
        inputPanel.add(messageField, BorderLayout.CENTER);

        JButton sendButton = new JButton("Enviar");
        sendButton.addActionListener(e -> sendMessage());
        inputPanel.add(sendButton, BorderLayout.EAST);

        JButton helpButton = new JButton("Ajuda");
        helpButton.addActionListener(e -> sendHelpMessage());
        inputPanel.add(helpButton, BorderLayout.SOUTH);

        add(inputPanel, BorderLayout.SOUTH);
    }

    private void sendMessage() {
        try {
            String senderName = nameField.getText();
            String message = messageField.getText();
            if (!message.equals("")) {
                chatService.sendMessage(senderName, message); //envia a mensagem usando objeto ChatService
                chatArea.append(senderName + ": " + message + "\n");//add a mensagem no ChatArea
                messageField.setText("");//limpar messagefild

               //Alunos
                ArrayList<Aluno> alunos = new ArrayList<Aluno>();
                Aluno aluno1 = new Aluno("Pedrinho Matador", 18, "9090", "Sistemas de Informação",
                        "berranteiro123", 9, 9, 4,2,
                        10,  "matematica", "banco de dados",
                        "redacao", "portugues", "Java", 15);
                alunos.add(aluno1);

                alunos.add(aluno1);

                Aluno aluno2 = new Aluno("Lazaro", 21, "5678", "Ciências da Computação",
                        "outrasenha456", 5, 7, 9,8,
                        10,  "matematica", "banco de dados",
                "redacao", "portugues", "Java", 3);
                alunos.add(aluno2);


                //================ PERFIL ALUNO ================
                if (message.contains("meu") && message.contains("perfil")) {
                    chatArea.append("ChatBot: Digite sua matricula" + "\n");
                    String matricula = JOptionPane.showInputDialog("Digite sua matricula:");
                    String senha = JOptionPane.showInputDialog("Digite sua senha:");

                    for (Aluno aluno : alunos) {
                        if (aluno.getMatricula().equals(matricula) && aluno.getSenha().equals(senha)) {
                            chatArea.append("Nome:" + aluno.getNome() + "\n");
                            chatArea.append("Idade: " + aluno.getIdade() + "\n");
                            chatArea.append("Matrícula: " + aluno.getMatricula() + "\n");
                            chatArea.append("Senha: " + aluno.getSenha() + "\n");
                            chatArea.append("Curso: " + aluno.getCurso() +"\n");
                            chatArea.append("Disciplinas:\n" +
                                    aluno.getDisciplina1() + " Nota:"+ aluno.getMedia1() +"\n"+
                                    aluno.getDisciplina2() +" Nota:"+ aluno.getMedia2() +"\n"+
                                    aluno.getDisciplina3() + " Nota:"+aluno.getMedia3()+ "\n"+
                                    aluno.getDisciplina4() +" Nota:"+aluno.getMedia4() +"\n"+
                                    aluno.getDisciplina5() + " Nota:"+ aluno.getMedia5()+"\n");
                            chatArea.append("Sala:" + aluno.getSala());
                            break;
                        }
                    }
                }
               //======================== FIM PERFIL ALUNO ===========================

                //Quantos cursos

                if (message.contains("quantos") && message.contains("cursos")) {
                    for (Aluno aluno : alunos) {
                            chatArea.append("ChatBot: " + aluno.getCurso() +"\n");
                    }
                }
                //FIM qtd cursos

                //Notas aluno
                if (message.contains("minhas") && message.contains("notas")) {
                    chatArea.append("ChatBot: Digite sua matricula" + "\n");
                    String matricula = JOptionPane.showInputDialog("Digite sua matricula:");
                    String senha = JOptionPane.showInputDialog("Digite sua senha:");

                    for (Aluno aluno : alunos) {
                        if (aluno.getMatricula().equals(matricula) && aluno.getSenha().equals(senha)) {
                            chatArea.append("ChatBot: "+ aluno.getNome() + " suas notas são: \n" +
                                    aluno.getDisciplina1() + " Nota:"+ aluno.getMedia1() +"\n"+
                                    aluno.getDisciplina2() +" Nota:"+ aluno.getMedia2() +"\n"+
                                    aluno.getDisciplina3() + " Nota:"+aluno.getMedia3()+ "\n"+
                                    aluno.getDisciplina4() +" Nota:"+aluno.getMedia4() +"\n"+
                                    aluno.getDisciplina5() + " Nota:"+ aluno.getMedia5()+"\n");
                            break;
                        }
                    }
                }
                //FIM notas aluno

                //minha sala
                if (message.contains("meu") && message.contains("perfil")) {
                    chatArea.append("ChatBot: Digite sua matricula" + "\n");
                    String matricula = JOptionPane.showInputDialog("Digite sua matricula:");
                    String senha = JOptionPane.showInputDialog("Digite sua senha:");

                    for (Aluno aluno : alunos) {
                        if (aluno.getMatricula().equals(matricula) && aluno.getSenha().equals(senha)) {
                            chatArea.append("ChatBot: "+ aluno.getNome() + " sua sala é a: " + aluno.getSala());
                            break;
                        }
                    }
                }
                //FIM sala

            }
        } catch (RemoteException ex) {
            System.err.println("Error sending message: " + ex.getMessage());
        }
    }

    private void sendHelpMessage() {
        chatArea.append("ChatBot: Para enviar uma mensagem, digite seu nome no campo de texto à esquerda, digite a mensagem no campo de texto ao centro e clique no botão 'Enviar'. Para obter ajuda, clique no botão 'Ajuda'.\n");
    }
}
