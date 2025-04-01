package v2;

public abstract class CopositeCircuit implements Circuit {
    protected Circuit[] circuits;

    CopositeCircuit(Circuit[] circuits) {
        this.circuits = circuits;
    }

    protected Circuit[] getCircuits() {
        return circuits;
    }
}
