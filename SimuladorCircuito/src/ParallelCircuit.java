public class ParallelCircuit extends CompositeCircuit {

    ParallelCircuit(Circuit[] circuits) {
        super(circuits);
    }

    @Override
    public double getResistance() {
        double rp = 0;
        for (Circuit circuit : getCircuits()) {
            rp += 1 / circuit.getResistance();
        }
        return 1/rp;
    }
}
