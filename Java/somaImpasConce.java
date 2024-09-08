import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();

        int menor = Math.min(X, Y);
        int maior = Math.max(X, Y);

        int somaImpares = 0;
        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                somaImpares += i; 
            }
        }

        System.out.println(somaImpares);
    }
 
}