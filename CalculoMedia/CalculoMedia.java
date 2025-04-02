package CalculoMedia;
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ac1, ac2, ag, af, media;

        System.out.println("Digite a nota da AC1: ");
        ac1 = scanner.nextDouble();

        System.out.println("Digite a nota da AC2: ");
        ac2 = scanner.nextDouble();

        System.out.println("Digite a nota da AG: ");    
        ag = scanner.nextDouble();

        System.out.println("Digite a nota da AF: ");
        af = scanner.nextDouble();

        media = (ac1 * 0.15) + (ac2 * 0.3) + (ag * 0.10) + (af * 0.45);

        if (media >= 5) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }

        System.out.println("Resultado de cada nota individual: " + "\n" + "AC1: " + ac1 + "\n" + "AC2: " + ac2 + "\n" + "AG: " + ag + "\n" + "AF: " + af);

        scanner.close();
    }
}