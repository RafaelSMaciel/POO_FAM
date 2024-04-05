/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplradarrodoviario;

import java.util.Scanner;

/**
 *
 * @author 
 * 
 * *       Foi utilizado de IDE o Netbeans 8.2
 *         Não foi possível anexar a pasta inteira do Projeto no Canvas,
 *         Por isso enviamos apenas os arquivos.java
 * 
 *         Danilo Gonçalves Furlan RA:00349171
 *         Karla Gabriella Mendes Amorim RA:00351075 
 *         Lucas Quintino de Araujo RA:00348143
 *         Rafael Sebastião Maciel RA: 00348367
 *         
 */
public class AplRadarRodoviario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Informe a frequência do carro: ");
        float frequencia = scan.nextFloat();
        System.out.print("Informe o limite de velocidade da via: ");
        int velocidade = scan.nextInt();
        
        Carro carro = new Carro(frequencia, velocidade);
        System.out.println(carro);
      
    }
    
}
