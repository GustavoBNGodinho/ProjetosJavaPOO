public abstract class CompositeCircuit implements Circuit{
    protected Circuit[] circuits;

    CompositeCircuit(Circuit[] circuits) {
        this.circuits = circuits;
    }

    protected Circuit[] getCircuits() {
        return circuits;
    }
}
