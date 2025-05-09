import java.util.Scanner;

public class AreaRet {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho da altura do retangulo");
        var altura = scanner.nextDouble();
        System.out.println("Qual o tamanho da base do retangulo: ");
        var base = scanner.nextDouble();
        var area = altura * base;
        System.out.println("A area do quadrado é: " + area);

    }
}    
