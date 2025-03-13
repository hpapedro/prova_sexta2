public class TransporteAereoFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new TransporteAereo();
    }
}
