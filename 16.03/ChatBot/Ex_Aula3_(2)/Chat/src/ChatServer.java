import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ChatService chatService = new ChatServiceImpl();

            Registry registry = LocateRegistry.createRegistry(8282);
            registry.rebind("ChatService", chatService);

            System.out.println("Server started.");
        } catch (RemoteException e) {
            System.err.println("Error starting server: " + e.getMessage());
        }
    }
}

