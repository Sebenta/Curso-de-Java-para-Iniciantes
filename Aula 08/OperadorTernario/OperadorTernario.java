package operadorternario;

/**
 *
 * @author code36u4r60
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, r;

        n1 = 4;
        n2 = 8;

        r = (n1 > n2) ? n1 + n2 : 1;
        System.out.println(r);

    }

}
