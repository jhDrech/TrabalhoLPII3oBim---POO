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
        int i = 0;

        ArrayList<Pizza> pizzas = Cardapio.getCardapioPizzas();
        while(true){
            System.out.println("insira o numero da pizza (0 para finalizar):");
            int idPizza = sc.nextInt();
            if(idPizza == 0){
                break;
            }
            System.out.println("insira o numero da bebida(0 para finalizar):");
            int idBebida = sc.nextInt();
            if(idBebida == 0){
                break;
            }
            for (Pizza pizza : ) {
                if(idPizza == i){
                    conta += pizza.getPreco();
                }
                i++;
            }
            i = 0;
            for (Bebida bebida : lista) {
                if(idBebida == i){
                    conta+= bebida.getPreco();
                } 
                i++;
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
