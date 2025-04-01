package v2;

public class ParallelCircuit extends CopositeCircuit{

    public ParallelCircuit(Circuit[] circuits) {
        super(circuits);
    }

    @Override
    public double getResistance() {
        double rp = 0;
        for (int i = 0; i < getCircuits().length; i++) {
            rp += 1/(circuits[i].getResistance());
        }
        return 1/rp;
    }
}
