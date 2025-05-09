import java.util.Scanner;

public class AreaQuad {
    public static void main(String [] args){
        var scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do lado do quadrado");
        var lado = scanner.nextDouble();
        var area = lado * lado;
        System.out.println("A area do quadrado é: " + area);
    }
}