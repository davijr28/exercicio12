import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        int x, y, z;

        System.out.println("Digite o primeiro valor: ");
        x = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        y = leitor.nextInt();
        z = Math.max(x, y);
        if (x == y) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println(z + " é o maior número.");
        }

    }
}
