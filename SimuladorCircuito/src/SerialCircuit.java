public class SerialCircuit extends CompositeCircuit {
    SerialCircuit(Circuit[] circuits) {
        super(circuits);
    }

    @Override
    public double getResistance() {
        double rt = 0;
        for (Circuit circuit : getCircuits()) {
            rt += circuit.getResistance();
        }
        return rt;
    }
}
