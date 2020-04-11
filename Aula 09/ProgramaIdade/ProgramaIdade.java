/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ano de nascimento: ");
        int ano = scan.nextInt();
        int idade = 2017 - ano;
        
        System.out.println("A tua idade = " + idade);
        if(idade < 18){
            System.out.println("Menor de idade");
        }else{
            System.out.println("Maior de idade");
        }
    }
    
}
