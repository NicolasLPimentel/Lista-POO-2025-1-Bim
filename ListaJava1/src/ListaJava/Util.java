package ListaJava;

import java.util.Scanner;

public class Util {

    private static Scanner input;

    public static void iniciarInput() {
        if (input == null) {
            input = new Scanner(System.in);
        }
    }

    public static void fecharInput() {
        if (input != null) {
            input.close();
        }
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static float lerFloat(String msg) {
        while (true) {
            print(msg);
            if (input.hasNextFloat()) {
                return input.nextFloat();
            } else {
                print("Entrada inválida! Digite um número real");
                input.next();
            }
        }
    }

    public static int lerInt(String msg) {
        while (true) {
            print(msg);
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                print("Entrada inválida! Digite um número inteiro");
                input.next();
            }
        }
    }

    public static String lerString(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String texto = input.nextLine();
            if (texto.matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
                return texto;
            } else {
                System.out.println("Entrada inválida! Digite apenas letras");
            }
        }
    }
}
