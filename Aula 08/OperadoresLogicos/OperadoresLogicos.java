/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author code36u4r60
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 4;
        int y = 7;
        int z = 12;

        boolean r;

        r = (x < y && y == z) ? true : false;
        System.out.println(r);

        r = (x < y || y == z) ? true : false;
        System.out.println(r);

        r = (x < y ^ y < z) ? true : false;
        System.out.println(r);
    }

}
