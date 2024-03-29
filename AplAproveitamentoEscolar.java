/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplaproveitamentoescolar;
import java.util.Scanner;
/**
 *
 * @author Rafael Sebastião Maciel RA: 00348367
 *         Lucas Quintino de Araujo RA:00348143
 *         Danilo Gonçalves Furlan RA:00349171
 *         Karla Gabriella Mendes Amorim RA:00351075   
 */
public class AplAproveitamentoEscolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a nota A1 Obtida pelo aluno");
        float a1 = scan.nextFloat();
        System.out.println("Informe a nota A2 obtida pelo aluno");
        float a2 = scan.nextFloat();
        System.out.println("Informe a nota A3 obtida pelo aluno");
        float a3 = scan.nextFloat();
        System.out.println("Informe a nota A4 obtida pelo aluno");
        float a4 = scan.nextFloat();
        
        Aluno aluno = new Aluno(a1,a2,a3,a4);
        
  
        System.out.println(aluno);
        
        
        
    }
    
}
