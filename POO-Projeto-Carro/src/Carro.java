public class Carro {

    // Declarando atributos
    int capacidadeTanque;
    double DistanciaLitro; 
    String cor;
    String modelo;


    // Criando sobrecarga dos métodos
    Carro(){


    }

    Carro(String cor, String modelo, int capacidadeTanque, double DistanciaLitro){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.DistanciaLitro = DistanciaLitro;

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

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;

    }

    int getCapacidadeTanque(){
        return capacidadeTanque;

    }

    void setDistanciaLitro(double DistanciaLitro){
        this.DistanciaLitro = DistanciaLitro;

    }

    double getDistanciaLitro(){
        return DistanciaLitro;

    }

    // Método de encher o tanque

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;


    }

    
}
