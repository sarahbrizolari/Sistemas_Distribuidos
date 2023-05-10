public class ChatBot {
    public String responder(String message) {
        message = message.toLowerCase();
        if (message.equals("oi") || message.equals("ola")) {
            return "Bem vindo";
        } else if (message.equals("3320618")) {
            return "Bem vindo, Igor!";
        } else if (message.equals("horas")){
            return "oito e sete meu";
        } else{
            return "Desculpe, não entendi.";
        }
    }
}
