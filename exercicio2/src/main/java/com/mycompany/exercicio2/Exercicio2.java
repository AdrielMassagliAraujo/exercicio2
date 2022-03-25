/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int nuns = 0;
        int i = 0;
        int result = 0;
        
        do{
            nuns = sc.nextInt();
            
            if (nuns > 0){
                System.out.print("Digite outro número: ");
                i++;
                result = result + nuns;
            }
            else{
                System.out.println(result / i);
            }
        } 
        while(nuns > 0);
    }
}
