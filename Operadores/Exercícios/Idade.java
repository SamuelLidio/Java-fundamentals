import java.util.Scanner;

public class Idade{

    public static void main(String[] args) {
        var baseyear = 2025;
        var scanner = new Scanner(System.in);

        System.out.println("Olá, informe seu nome e de seu colega por favor: ");
        var name1 = scanner.next();
        var name2 = scanner.next();

        System.out.println("Informe os anos de nascimento respectivamente por favor: ");
        var year1 = scanner.nextInt();
        var year2 = scanner.nextInt();

        var age1 = baseyear - year1;
        var age2 = baseyear - year2;
        var ageDiff = age1 - age2;

        System.out.printf("Olá %s e %s, vocês tem %s e %s anos de idade, a diferença de idade entre vocês é de %s anos. \n", name1, name2, age1, age2, ageDiff);




    }
}