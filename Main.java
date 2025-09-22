package poo.Trabalho;

import java.util.Scanner;
public class Main {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Pizza calabresa = new Pizza("Calabresa", 45);
        Pizza mussarela = new Pizza("Mussarela", 42);
        Bebida refrigerante = new Bebida("Refrigerante", 8);
        Bebida suco = new Bebida("Suco de Laranja", 12);

        Cardapio cardapio = new Cardapio();
        cardapio.adicionarBebida(suco);
        cardapio.adicionarBebida(refrigerante);
        cardapio.adicionarPizza(mussarela);
        cardapio.adicionarPizza(calabresa);
        Garcom garcom = new Garcom(0);

        while(true){
            System.out.println("1. fazer pedido");
            System.out.println("2. cardápio de pizzas");
            System.out.println("3. cardápio de bebidas");
            int entrada = sc.nextInt();    
            switch(entrada){
                case 1:
                fazerPedido();
                case 2:
                mostrarCardapioPizzas();
                case 3:
                mostrarCardapioBebidas();
            }
        }
    }

    public static void fazerPedido(){
        limparTela();
        float conta = 0;
        float percentualGarcom = 0;
        ArrayList pedidosDePizzas = new ArrayList<String>();
        ArrayList pedidosDeBebidas = new ArrayList<String>();

        while(true){
            System.out.println("insira o nome da pizza");
            String pedido = sc.nextInt();
            pedidosDePizzas.add(pedido);
            for (String pizzaPedida : pedidosDePizzas) {
                Pizza pizzaFeita  = obterPizzaPornome(pizzaPedida, cardapio); 
                conta += pizzaFeita.getPreco();           
            }

            System.out.println("insira o nome da bebida");
            pedido = sc.nextInt();
            pedidosDeBebidas.add(pedido);
            for (String bebidaPedida : pedidosDeBebidas) {
                Bebida bebidaRecebida  = obterBebidaPornome(bebidaPedida, cardapio); 
                conta += bebidaRecebida.getPreco();           
            }
            garcom.percentualGarcom += conta * (10/100);

            System.out.println("-------TOTAL-------");
            for (String pizzaPedida : pedidosDePizzas) {
                System.out.println("PIZZAS: %s - %fR$\n", pizzaPedida, p);
                
            } 
        }
    }
    public static void mostrarCardapioPizzas(){
    }
    public static void mostrarCardapioBebidas(){

    }

    public static void limparTela() {
        for (int i = 0; i < 40; ++i) {
            System.out.println();
        }
        System.out.print("\033\143");

    }
}
