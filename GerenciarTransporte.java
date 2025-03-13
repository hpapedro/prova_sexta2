public class GerenciarTransporte {
    public static TransporteFactory selecionarFactory(Pedido pedido) {
        if (pedido.isInternacional()) {
            return new TransporteMaritimoFactory();  // Para envios internacionais
        } else if (pedido.isAreaMetropolitana() && pedido.getPeso() <= 5) {
            return new DroneFactory();  // Para pacotes pequenos em área metropolitana
        } else if (pedido.getPeso() <= 50) {
            return new TransporteAereoFactory();  // Para pacotes médios
        } else {
            return new TransporteTerrestreFactory();  // Para pacotes grandes
        }
    }
}
