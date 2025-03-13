public class DroneFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new Drone();
    }
}
