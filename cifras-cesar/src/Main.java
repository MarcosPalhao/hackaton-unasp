
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cifracesar cifra = new Cifracesar();

        String textoCifrado = cifra.encriptar(1, "acao");
        System.out.println(textoCifrado);

        System.out.println(cifra.decriptar(1, textoCifrado));
    }

}