public class TransporteTerrestre implements Transporte {
    @Override
    public void fazerEntrega() {
        System.out.println("Entrega terrestre realizada. Transportadora local utilizada.");
    }
}
