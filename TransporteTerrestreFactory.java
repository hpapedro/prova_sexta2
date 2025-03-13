public class TransporteTerrestreFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }
}
