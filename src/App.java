import java.text.Format;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a área do círculo?");
        double raio = sc.nextDouble();
        sc.close();

        double area = Math.PI * (raio * raio);
        System.out.print("O valor da area é " + area);
    }
}
