package numeros;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Numeros {

    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            n = input.nextInt();
            s += n;
            System.out.print("Quer continuar [S/N]: ");
            resp = input.next();
        } while (resp.equalsIgnoreCase("S"));
        System.out.println("A soma de todos os valores é " + s);
    }

}
