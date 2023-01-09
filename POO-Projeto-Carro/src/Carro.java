public class Carro {

    // Declarando atributos
    int capacidadeTanque;
    String cor;
    String modelo;

    // Criando sobrecarga dos métodos
    Carro(){


    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }
    // Criando Métodos dos atributos

    void setCor(String cor){
        this.cor = cor;

    }

    String getCor(){
        return cor;

    }

    void setModelo(String modelo){
        this.modelo = modelo;

    }

    String getModelo(){
        return modelo;

    }

    void setcapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;

    }

    int getcapacidadeTanque(){
        return capacidadeTanque;

    }

    // Método de encher o tanque

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;


    }

    
}
