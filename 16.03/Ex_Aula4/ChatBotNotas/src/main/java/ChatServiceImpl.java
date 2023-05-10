import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatServiceImpl extends UnicastRemoteObject implements ChatService {
    private List<String> chatHistory;

    protected ChatServiceImpl() throws RemoteException {
        super();
        this.chatHistory = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message) throws RemoteException {
        String fullMessage = message;
        this.chatHistory.add(fullMessage);
    }

    @Override
    public String getChatHistory() throws RemoteException { // Percorre chatHistory, retornando uma string que contem todas as mensagens e adiciona cada uma delas separada por uma quebra de linha no objeto StringBuilder.
        StringBuilder sb = new StringBuilder();
        for (String message : this.chatHistory) {
            sb.append(message);
            sb.append("\n");
        }
        return sb.toString();
    }

}