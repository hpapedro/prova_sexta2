public class Main {
    public static void main(String[] args) {
        // Exemplo de Pedido 1: Drone
        Pedido pedido1 = new Pedido(3, false, true);  // Peso pequeno, área metropolitana
        TransporteFactory factory1 = GerenciarTransporte.selecionarFactory(pedido1);
        Transporte transporte1 = factory1.criarTransporte();
        transporte1.fazerEntrega();  // Realiza a entrega

        // Exemplo de Pedido 2: Transporte Aéreo
        Pedido pedido2 = new Pedido(20, false, false);  // Peso médio, entrega doméstica
        TransporteFactory factory2 = GerenciarTransporte.selecionarFactory(pedido2);
        Transporte transporte2 = factory2.criarTransporte();
        transporte2.fazerEntrega();  // Realiza a entrega

        // Exemplo de Pedido 3: Transporte Marítimo (Internacional)
        Pedido pedido3 = new Pedido(30, true, false);  // Envio internacional
        TransporteFactory factory3 = GerenciarTransporte.selecionarFactory(pedido3);
        Transporte transporte3 = factory3.criarTransporte();
        transporte3.fazerEntrega();  // Realiza a entrega

        // Exemplo de Pedido 4: Transporte Terrestre (Peso elevado)
        Pedido pedido4 = new Pedido(100, false, false);  // Peso elevado, entrega doméstica
        TransporteFactory factory4 = GerenciarTransporte.selecionarFactory(pedido4);
        Transporte transporte4 = factory4.criarTransporte();
        transporte4.fazerEntrega();  // Realiza a entrega
    }
}
