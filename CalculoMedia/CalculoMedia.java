package CalculoMedia;
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaMinima, ac1, ac2, ag, af, mediaFinal;

        System.out.println("Digite a nota mínima");
        notaMinima = scanner.nextDouble();

        System.out.println("Digite a nota da AC1: ");
        ac1 = scanner.nextDouble();

        System.out.println("Digite a nota da AC2: ");
        ac2 = scanner.nextDouble();

        System.out.println("Digite a nota da AG: ");    
        ag = scanner.nextDouble();

        System.out.println("Digite a nota da AF: ");
        af = scanner.nextDouble();

        mediaFinal = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);

        if (mediaFinal >= notaMinima) {
            System.out.println("Aprovado com média: " + mediaFinal);
        } else {
            System.out.println("Reprovado com média: " + mediaFinal);
        }
        
        System.out.println("Nota minima digitada" + notaMinima);
        
        System.out.println("Resultado de cada nota individual:");
        System.out.println("AC1: " + ac1);
        System.out.println("AC2: " + ac2);
        System.out.println("AG: " + ag);
        System.out.println("AF: " + af);

        scanner.close();
    }
}
