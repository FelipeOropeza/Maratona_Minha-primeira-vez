import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        int cont = 0;

        for (int i = 0; i < 5; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                cont++;
            }
        }
        scanner.close();

        System.out.println(cont + " valores pares");
    }
 
}