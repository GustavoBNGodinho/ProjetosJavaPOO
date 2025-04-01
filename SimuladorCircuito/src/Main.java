public class Main {
    public static void main(String[] args) {
        Circuit[] circuits = new Circuit[]{
                new Resistor(1_000.0),
                new Resistor(2_000.0),
                new ParallelCircuit(new Circuit[]{
                        new Resistor(200.0),
                        new Resistor(470.0)
                }),
                new Resistor(6_000.0)
        };
        SerialCircuit serial = new SerialCircuit(circuits);
        System.out.println(serial.getResistance());

        for (Circuit circuit : serial.getCircuits()) {
            System.out.println(circuit.getResistance());
        }
    }
}