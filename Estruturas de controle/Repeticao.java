import java.util.Scanner;

public class Repeticao {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Exemplo calculo de tabuada");
        System.out.println("==================================");

        System.out.println("Digite um número para calcular a tabuada:");
        var num = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num *i));
        }

        System.out.println("Exemplo IMC");
        System.out.println("==================================");

        System.out.println("Digite seu peso em kg:");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura em metros:");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        switch((imc >= 0 && imc < 18.5) ? 1 : 
                (imc >= 18.5 && imc < 24.9) ? 2 : 
                (imc >= 25 && imc < 29.9) ? 3 : 
                (imc >= 30 && imc < 34.9) ? 4 : 
                (imc >= 35 && imc < 39.9) ? 5 : 
                (imc >= 40) ? 6 : 0) {
            case 1:
                System.out.println("Abaixo do peso" + " (IMC: " + imc + ")");
                break;
            case 2:
                System.out.println("Peso normal" + " (IMC: " + imc + ")");
                break;
            case 3:
                System.out.println("Sobrepeso"  + " (IMC: " + imc + ")");
                break;
            case 4:
                System.out.println("Obesidade grau I" + " (IMC: " + imc + ")");
                break;
            case 5:
                System.out.println("Obesidade grau II" + " (IMC: " + imc + ")");
                break;
            case 6:
                System.out.println("Obesidade grau III" + " (IMC: " + imc + ")");
                break;
            default:
                System.out.println("IMC inválido");
        }






        
    }

}
