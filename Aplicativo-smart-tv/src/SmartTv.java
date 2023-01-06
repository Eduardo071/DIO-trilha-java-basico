import java.util.Scanner;

public class SmartTv{
            // DEFINIÇÃO DE VARIÁVEIS E OBJETOS
    boolean ligada = false;
    boolean internet = false;
    boolean Bluetooth = false;
    boolean Espelhamento = false;
    int canal = 1;
    int volume = 25;
    int Brilho = 50;

            // CRIAÇÃO DE VARIÁVEL QUE MOSTRE TUDO QUANDO CHAMADA
    String StatusTv = ("A Tv está: " + ligada + "\n") + 
    ("O Bluetooth está: " + Bluetooth + "\n") + 
    ("O Modo de espelhamento está: " + Espelhamento + "\n") + 
    ("A Internet está: " + internet + "\n") + 
    ("O Canal atual é: " + canal + "\n") + 
    ("O Volume atual é: " + volume + "\n") + 
    ("O Brilho atual é: " + Brilho + "\n");

             
                // LIGAR E DESLIGAR A TV
    public void ligarTv(){
        ligada = true;
    }

    public void desligarTv(){
        ligada = false;
    }


                // LIGAR E DESLIGAR A INTERNET
    public void ligarInternet(){
        internet = true;
    }

    public void DesligarInternet(){
        internet = false;
    }


                // LIGAR E DESLIGAR O BLUETOOTH
    public void ligarBluetooth(){
        Bluetooth = true;
    }        
    
    public void desligarBluetooth(){
        Bluetooth = false;
    }


                // LIGAR E DESLIGAR O ESPELHAMENTO 

    public void ligarEspelhamento(){
        Espelhamento = true;
    }        
    
    public void desligarEspelhamento(){
        Espelhamento = false;
    }
        
                
                // MUDAR OU SELECIONAR CANAL
    
    public void SubirCanal(){
        canal++;

    }
    
    public void DescerCanal(){
        canal--;

    }  

    public void SelecionarCanal(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o canal desejado?: \n");
        canal = scan.nextInt();
        scan.close();
    }


                // AUMENTAR E DIMINUIR VOLUME

    public void AumentarVolume(){
        volume++;
    }

    public void DiminuirVolume(){
        volume--;
    }


                // AUMENTAR E DIMINUIR BRILHO

    public void AumentarBrilho(){
        Brilho++;
    }    
    
    
    public void DiminuirBrilho(){
        Brilho--;
    }   
    
}