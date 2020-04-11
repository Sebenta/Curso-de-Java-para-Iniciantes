/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author code36u4r60
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("A sua resuloção: " + tela.width + " x " + tela.height);
    }

}
