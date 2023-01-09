
// Criação da classe que será responsável por rodar a aplicação

class rodarAplicacao{

    // Criando o Método main
    public static void main(String[] args) {
        // Sobrecarregando a classe carro para criar ramificações que facilitem a praticidade do código
        Carro carro1 = new Carro();

        // Atribuindo Valores para cada atributo 
        carro1.setCor("Branco");
        carro1.setModelo("BMW X7");
        carro1.setcapacidadeTanque(60);

        // Escrevendo na tela as características desse novo objeto "carro1"
        System.out.println("\n" + "A cor do carro é: " + carro1.getCor());
        System.out.println("O modelo do carro é: " + carro1.getModelo());
        System.out.println("A capacidade do tanque do carro é: " + carro1.getcapacidadeTanque() + " Litros");
        System.out.println("O valor para encher o tanque é: " + "R$ " + carro1.totalValorTanque(4.60));

        // Criando mais um objeto "carro2" mas atribuindo os valores passasndo como parâmetros dentro da criação do mesmo
        Carro carro2 = new Carro("Cinza", "Range Rover", 70);

        // Escrevendo na tela as características desse novo objeto "carro2"
        System.out.println("\n" + "A cor do carro é: " + carro2.getCor());
        System.out.println("O modelo do carro é: " + carro2.getModelo());
        System.out.println("A capacidade do tanque do carro é: " + carro2.getcapacidadeTanque() + " Litros");
        System.out.println("O valor para encher o tanque é: " + "R$ " + carro2.totalValorTanque(4.60));

    }

}