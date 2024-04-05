/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplradarrodoviario;

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
public class Carro {

    private float frequencia;
    private int limiteVelocidade;
    private float valorMulta;
    private int pontosCarteira;

    private final float multa1 = 130.16f;
    private final float multa2 = 195.23f;
    private final float multa3 = 880.41f;
    private final int ponto1 = 4;
    private final int ponto2 = 5;
    private final int ponto3 = 7;

    //Metodo Construtor
    public Carro() {

        this.frequencia = 0;
        this.limiteVelocidade = 0;
        this.valorMulta = 0;
        this.pontosCarteira = 0;
    }

    public Carro(float frequencia, int limiteVelocidade) {
        this.frequencia = frequencia;
        this.limiteVelocidade = limiteVelocidade;
    }

    /// Setters
    public void setValorMulta(float valorMulta) {

        this.valorMulta = valorMulta;
    }

    public void setPontosCarteira(int pontosCarteira) {
        this.pontosCarteira = pontosCarteira;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public void setLimiteVelocidade(int limiteVelocidade) {
        this.limiteVelocidade = limiteVelocidade;
    }

    /// Getters
    public float getFrequencia() {
    if (this.frequencia >= 0.5 && this.frequencia <= 1) {
        return frequencia;
 }
        return 0;
    }

    public int getLimiteVelocidade() {
        return limiteVelocidade;
    }

    public float getValorMulta() {
        float multa = this.valorMulta;

        if (calculoPercentual() <= 20) {
            multa = this.multa1;

        } else if (calculoPercentual() <= 50) {
            multa = this.multa2;

        } else if (calculoPercentual() > 50) {
            multa = this.multa3;

        } else {

            return 0;
        }

        return multa;

    }

    public int getPontosCarteira() {
        int pontos = this.pontosCarteira;

        if (getValorMulta() == this.multa1) {
            pontos = this.ponto1;

        } else if (getValorMulta() == this.multa2) {
            pontos = this.ponto2;

        } else if (getValorMulta() == this.multa3) {
            pontos = this.ponto3;
        }
        return pontos;
    }

    public float getMulta1() {
        return multa1;
    }

    public float getMulta2() {
        return multa2;
    }

    public float getMulta3() {
        return multa3;
    }

    public int getPonto1() {
        return ponto1;
    }

    public int getPonto2() {
        return ponto2;
    }

    public int getPonto3() {
        return ponto3;
    }

    // Métodos
    public float calculoVelocidade() {
         if (getFrequencia() == 0) {
        return 0;
         }
        float velocidade = ((1 / getFrequencia()) - 1) * 300;
        return velocidade;
    }

    public float calculoPercentual() {

        float percentual = ((calculoVelocidade() - getLimiteVelocidade()) / getLimiteVelocidade()) * 100;
        return percentual;

    }

    public String infracao() {
         String infracao = "";
    
    if (calculoPercentual() < 0) {
        infracao = "Dentro do Limite de Velocidade";
        
    } else if (calculoPercentual() <= 20) {
        infracao = "Média";

    } else if (calculoPercentual() <= 50) {
        infracao = "Grave";

    } else if (calculoPercentual() > 50) {
        infracao = "Gravíssima*";
    }
        return infracao;
    }

    //Saida
    @Override
    public String toString() {
    String infracaoStr = infracao();
    String saida = "\nVelocidade do Carro (km/h): " + calculoVelocidade();
    
    if (infracao().equals("Dentro do Limite de Velocidade")) {
        saida += "\nDentro do Limite de Velocidade.";
    } else {
        saida += "\nInfração " + infracaoStr + "(" + getPontosCarteira() + " Pontos)";
        saida += "\nMulta de R$ " + getValorMulta();
    }

    return saida;
    }

}
