package vetor04;

import java.util.Arrays;

/**
 *
 * @author Code36u4r60
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = {3, 7, 6, 1, 9, 4, 2};
        Arrays.sort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + i + "]:" + vetor[i] + " ");
        }
        System.out.println("");
        int num = 7;
        int pos = Arrays.binarySearch(vetor, num);
        System.out.println("Encontrei o " + num + "  na posição " + pos);
        
    }

}
