public class Resistor implements Circuit{
    double resistance;
    public Resistor(double resistance) {
        this.resistance = resistance;
    }

    @Override
     public double getResistance() {
        return resistance;
    }
}
