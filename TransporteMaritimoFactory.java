public class TransporteMaritimoFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new TransporteMaritimo();
    }
}
