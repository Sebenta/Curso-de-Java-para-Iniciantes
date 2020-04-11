package vetor05;

import java.util.Arrays;

/**
 *
 * @author Code36u4r60
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int v[] = new int[20];
        Arrays.fill(v, 0);

        for (int valor : v) {
            System.out.print(valor + " ");
        }
        System.out.println("");
    }

}
