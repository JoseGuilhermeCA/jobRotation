import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, a = 0, b = 1, c;
        boolean pertence = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num == a || num == b) {
            pertence = true;
        } else {
            while (b <= num) {
                c = a + b;
                if (c == num) {
                    pertence = true;
                    break;
                }
                a = b;
                b = c;
            }
        }

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}
