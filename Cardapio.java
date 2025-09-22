package poo.Trabalho;

import java.util.ArrayList;
public class Cardapio {
    //mostrar as pizzas
    private ArrayList<Pizza> cardapioPizzas;
    private ArrayList<Bebida> cardapioBebidas;

    public Cardapio() {
        this.cardapioBebidas = new ArrayList<>();
        this.cardapioPizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza){
        this.cardapioPizzas.add(pizza);
    }

    public void adicionarBebida(Bebida bebida){
        this.cardapioBebidas.add(bebida);
    }

    public void mostrarCardapio(ArrayList cardapio){
        System.out.println("\n--- PIZZAS ---");
        for (Pizza pizza : this.cardapioPizzas) {
            System.out.printf("- %s: R$ %f\n", pizza.getNome(), pizza.getPreco());
        }
        System.out.println("\n--- BEBIDAS ---");
        for (Bebida bebida : this.cardapioBebidas) {
            System.out.printf("- %s R$ %f\n", bebida.getNome(), bebida.getPreco());
        }
        System.out.println("-------------------");
    }

    public Pizza obterPizzaPorNome(String nome, cardapioPizzas cardapio){
        for (Pizza pedido : cardapioPizzas) {
            if (pedido.getNome().equals(nome)) return pedido;
        }
    }
    public Bebida obterBebidaPorNome(String nome, cardapioBebidas cardapio){
        for (Bebida pedido : cardapioBebidas) {
            if (pedido.getNome().equals(nome)) return pedido;
        }
    }
    public ArrayList<Pizza> getCardapioPizzas() {
        return cardapioPizzas;
    }
    public void setCardapioPizzas(ArrayList<Pizza> cardapioPizzas) {
        this.cardapioPizzas = cardapioPizzas;
    }
    public ArrayList<Bebida> getCardapioBebidas() {
        return cardapioBebidas;
    }
    public void setCardapioBebidas(ArrayList<Bebida> cardapioBebidas) {
        this.cardapioBebidas = cardapioBebidas;
    }
}
