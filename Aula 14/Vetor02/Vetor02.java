package vetor02;

/**
 *
 * @author Code36u4r60
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mes[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEC"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i] + " têm " + tot[i] + " dias.");
        }
    }

}
