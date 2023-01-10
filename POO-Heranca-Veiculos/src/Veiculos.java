import java.util.Scanner;

public class Veiculos {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Caminhao exibirCaminhao = new Caminhao();
    Carro exibirCarro = new Carro();
    Moto exibirMoto = new Moto();

    System.out.println("Temos 3 classes de veículo, qual deseja saber mais sobre?" + "\n" + "1. Carro" + "\n" + "2. Moto" + "\n" + "3. Caminhão" + "\n");
    int EntradaUsuario = scan.nextInt();


    if(EntradaUsuario == 1){
        System.out.println(exibirCarro.getDadosCarro1() + "\n");
        System.out.println(exibirCarro.getDadosCarro2() + "\n");

    }else if(EntradaUsuario == 2){
        System.out.println(exibirMoto.getDadosMoto1() + "\n");
        System.out.println(exibirMoto.getDadosMoto2() + "\n");


    }else if(EntradaUsuario == 3){
        System.out.println(exibirCaminhao.getDadosCaminhao1() + "\n");
        System.out.println(exibirCaminhao.getDadosCaminhao2() + "\n");


    }else{
        System.out.println("Apenas são permitidos valores númericos de 1 a 3");


    }
    scan.close();
   }
}
