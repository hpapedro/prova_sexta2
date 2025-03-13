public class Pedido {
    private double peso;
    private boolean internacional;
    private boolean areaMetropolitana;

    public Pedido(double peso, boolean internacional, boolean areaMetropolitana) {
        this.peso = peso;
        this.internacional = internacional;
        this.areaMetropolitana = areaMetropolitana;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public boolean isAreaMetropolitana() {
        return areaMetropolitana;
    }
}
