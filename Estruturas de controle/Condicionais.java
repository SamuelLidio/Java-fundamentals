import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

        // Exemplo de estruturas de controle condicionais

        var scanner = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        var idade = scanner.nextInt();

        if (idade < 18){
            System.out.println("você é menor de idade");
        }
        else if( idade >= 18 && idade < 60){
            System.out.println("Você é maior de idade");
        }
        else {
            System.out.println("Você é idoso");
        }
        
        System.out.println("Escolha um número entre 1 e 5:");
        var number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Você escolheu o numero 1");
                break;
            case 2:
                System.out.println("Você escolheu o numero 2");
                break;
            case 3:
                System.out.println("Você escolheu o numero 3");
                break;
            case 4:
                System.out.println("Você escolheu o numero 4");
                break;
            case 5:
                System.out.println("Você escolheu o numero 5");
                break;
        }        

    }
    
}
