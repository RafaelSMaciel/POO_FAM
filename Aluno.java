/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplaproveitamentoescolar;


/**
 *
 * @author Rafael Sebastião Maciel RA: 00348367
 *         Lucas Quintino de Araujo RA:00348143
 *         Danilo Gonçalves Furlan RA:00349171
 *         Karla Gabriella Mendes Amorim RA:00351075   
 */
public final class Aluno {
    
    public float a1;
    public float a2;
    public float a3;
    public float a4;
    public float menorNota;
    public float media;
    public String status;
    
    
    
    //Método Construtor
   public Aluno (){
       
       this.a1 = 0;
       this.a2 = 0;
       this.a3 = 0;
       this.a4 = 0;
       this.menorNota = 0;
       this.media = 0;
       this.status = "";
   }
   
   //Método que declara as notas do Aluno
 public Aluno(float a1, float a2, float a3, float a4) {
        this.a1 = validarNota(a1);
        this.a2 = validarNota(a2);
        this.a3 = validarNota(a3);
        this.a4 = validarNota(a4);
        calcularMedia();
        
    }
   
public float validarNota(float nota) {
    if (nota >= 0 && nota <= 10) {
        // Se estiver no intervalo permitido, verifica se é um múltiplo de 0.5
        if (nota % 0.5 == 0) {
            // Se for múltiplo de 0.5, retorna a nota fornecida
            return nota;
        } else {
            // Se não for múltiplo de 0.5, retorna 0
            return 0;
        }
    } else {
        // Se estiver fora do intervalo permitido, retorna 0
        return 0;
    }
}

  void calcularMedia() {
        // Acha a menor nota
        this.menorNota = Math.min(Math.min(a1, a2), Math.min(a3, a4));
      
        // Média das 3 notas restantes
        this.media = (a1 + a2 + a3 + a4 - menorNota) / 3;
        
        //Verifica a situação que o aluno fica
        this.status = (media >= 7.0) ? "Aprovado" : "Reprovado";
    } 
   
    @Override
   public String toString(){
       String saida = "\n\nNotas Obtidas: " + this.a1 + " - " + this.a2 + " - " + this.a3 + " - " + this.a4;
              saida += "\nNota Descartada: " + this.menorNota;
              saida += "\nMédia do Aluno: " + this.media;
              saida += "\nSituação: " + this.status;
       return saida;
       
      
   }
   
    
    
}
