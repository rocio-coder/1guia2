import java.util.Scanner;

public class Ada {
    public static void main(String[] args) {
        int primernumero, segundonumero, mayor;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        primernumero = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        segundonumero = scanner.nextInt();

        if (primernumero > segundonumero) {
            mayor = primernumero;
        } else {
            mayor = segundonumero;

            System.out.println("el mayor valor es :" + mayor);
        }
    }}