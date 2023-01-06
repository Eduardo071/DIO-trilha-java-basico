//CRIAÇÃO DA CLASSE DO USUÁRIO
public class Usuario {

// CRIAÇÃO DO MÉTODO MAIN
    public static void main(String[] args) throws Exception {
        //CRIANDO O OBJETO SmartTv
            SmartTv smartTv = new SmartTv();

        // ALGUNS TESTES A PARTE
            System.out.println("TV Ligada? " + smartTv.ligada);
            System.out.println("A internet está ligada? " + smartTv.internet);
            System.out.println("Qual o canal atual? " + smartTv.canal);
            System.out.println("Qual o volume atual? " + smartTv.volume);
            //TESTE DA FUNÇÃO STATUS QUE EXIBE TUDO DE UMA VEZ
            System.out.println("Novo status da TV: \n" + smartTv.StatusTv);
            
                    //TESTANDO TODAS FUNÇÕES DA TV SEPARADAMENTE PARA VER SE TEM ALGUM ERRO
            smartTv.ligarTv();
            System.out.println("A Tv está ligada?: \n" + smartTv.ligada+ "\n"); 

            smartTv.SelecionarCanal();
            System.out.println("O canal selecionado é: \n" + smartTv.canal + "\n");

            smartTv.AumentarVolume();
            System.out.println("O volume atual é: \n" + smartTv.volume + "\n");

            smartTv.DiminuirVolume();
            System.out.println("O volume atual é: \n" + smartTv.volume + "\n");

            smartTv.SubirCanal();
            System.out.println("O canal atual é: \n" + smartTv.canal + "\n");

            smartTv.DescerCanal();
            System.out.println("O canal atual é: \n" + smartTv.canal + "\n");

            smartTv.AumentarBrilho();
            System.out.println("O nível de brilho está em: \n" + smartTv.Brilho + "\n");

            smartTv.DiminuirBrilho();
            System.out.println("O nível de brilho está em: \n" + smartTv.Brilho + "\n");

            smartTv.ligarBluetooth();
            System.out.println("O bluetooth está ligado?: \n" + smartTv.Bluetooth + "\n");

            smartTv.desligarBluetooth();
            System.out.println("O bluetooth está ligado?: \n" + smartTv.Bluetooth + "\n");

            smartTv.ligarEspelhamento();
            System.out.println("O espelhamento está ligado?: \n" + smartTv.Espelhamento + "\n");

            smartTv.desligarEspelhamento();
            System.out.println("O espelhamento está ligado?: \n" + smartTv.Espelhamento + "\n");

            smartTv.ligarInternet();
            System.out.println("A internet está ligada?: \n" + smartTv.internet + "\n");

            smartTv.DesligarInternet();
            System.out.println("A internet está ligada?: \n" + smartTv.internet + "\n");

            smartTv.desligarTv();
            System.out.println("A Tv está ligada?: \n" + smartTv.ligada + "\n");

        }
}
