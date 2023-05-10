import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatService extends Remote {
    void sendMessage(String senderName, String message) throws RemoteException;
    String getChatHistory() throws RemoteException;
}
