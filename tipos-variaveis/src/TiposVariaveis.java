import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) {
       

        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto você ganha de mesada? " );
        int Mesada = scan.nextInt();
        System.out.println("Quantos palavrões foram falados no mês?");
        int palavrões = scan.nextInt();
        int NovaMesada = Mesada - (palavrões * 5);
        String Erro = "Apenas são Permitidos números maiores ou iguais a 0";
        if(palavrões == 0){
            System.out.println("Sua mesada será mantida pois você foi um(a) bom menino(a)!!");
        }else if(palavrões > 0){
            System.out.println(NovaMesada);
        }else {
            System.out.println(Erro);
        
        }
    }

}
