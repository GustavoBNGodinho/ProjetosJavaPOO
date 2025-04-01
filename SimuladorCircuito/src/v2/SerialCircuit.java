package v2;

public class SerialCircuit extends CopositeCircuit {

    public SerialCircuit(Circuit[] circuits) {
        super(circuits);
    }

    @Override
    public double getResistance() {
        double resistance = 0;
        for (int i = 0; i < getCircuits().length; i++) {
            resistance += circuits[i].getResistance();
        }
        return resistance;
    }
}
