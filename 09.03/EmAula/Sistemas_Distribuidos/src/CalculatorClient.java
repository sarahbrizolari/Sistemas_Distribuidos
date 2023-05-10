import java.rmi.Naming;
public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Calculator c = (Calculator) Naming.lookup("//localhost:1020/CalculatorService");
            System.out.println(c.sub(4, 3));
            System.out.println(c.add(4, 3));
            System.out.println(c.mul(4, 3));
            System.out.println(c.div(4, 3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
