/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Aula3Exercicio3Dominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String agenda [][] = {{"Florence", "735-1234", "Manila"}, {"Joyce","983-3333","Quezon City"}, {"Becca", "456-3322", "Manila"}};
        int c = 0;
        while (c<3){
        System.out.println("Nome: " + agenda[c][0]);
        System.out.println("Telefone: "+ agenda [c][1]);
        System.out.println("Cidade: "+ agenda [c][2]);
        System.out.println(" ");
        c++;
        }
                
        
        /*
        System.out.println("Nome: " + agenda[0][0]);
        System.out.println("Telefone: "+ agenda [1][0]);
        System.out.println("Cidade: "+ agenda [2][0]);
        System.out.println(" ");
        System.out.println("Nome: " + agenda[0][1]);
        System.out.println("Telefone: "+ agenda [1][1]);
        System.out.println("Cidade: "+ agenda [2][1]);
        System.out.println(" ");
        System.out.println("Nome: " + agenda[0][2]);
        System.out.println("Telefone: "+ agenda [1][2]);
        System.out.println("Cidade: "+ agenda [2][2]);
        */
    }
    
}
