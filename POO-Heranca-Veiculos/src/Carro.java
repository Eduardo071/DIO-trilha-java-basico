public class Carro extends Veiculos{

    
    // setando caracteristicas
    final String MarcaCarro1 = "Range Rover";
    final String ModeloCarro1 = "Avelar ";
    final String ModoFuncionamentoCarro1 = "Gasolina";
    final String PrecoCarro1 = "R$ 595.950,00";
    String CorCarro1 = "Preto";
    final String AnoFabricacaoCarro1 = "2022";


    String getDadosCarro1(){
        String Caracteristicas = "Marca do veículo: " + MarcaCarro1 + "\n" +"Modelo do veículo: " + ModeloCarro1 + "\n" + "O modo de funcionamento desse veículo é " + ModoFuncionamentoCarro1 + "\n" +  "O preço este veículo é: " + PrecoCarro1 + "\n" + "A cor disponível para esse veículo é: " + CorCarro1 + "\n" + "Esse modelo é do ano " + AnoFabricacaoCarro1;
        return Caracteristicas;

    }

    final String MarcaCarro2 = "Tesla";
    final String ModeloCarro2 = "Model X";
    final String ModoFuncionamentoCarro2 = "Elétrico";
    final String PrecoCarro2 = "R$ 1.372.990,00";
    String CorCarro2 = "Branco";
    final String AnoFabricacaoCarro2 = "2023";

    String getDadosCarro2(){
        String Caracteristicas = "Marca do veículo: " + MarcaCarro2 + "\n" +"Modelo do veículo: " + ModeloCarro2 + "\n" + "O modo de funcionamento desse veículo é " + ModoFuncionamentoCarro2 + "\n" + "O preço este veículo é: " + PrecoCarro2 + "\n" + "A cor disponível para esse veículo é: " + CorCarro2 + "\n" + "Esse modelo é do ano " + AnoFabricacaoCarro2;
        return Caracteristicas;

    }
    




}