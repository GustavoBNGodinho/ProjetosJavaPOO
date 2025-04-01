import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(15, "Carlos");
        Pessoa p2 = new Pessoa(12, "Denis");
        Pessoa p3 = new Pessoa(0, "pi");
        Pessoa[] pessoas =  {p3, p1, p2};
        System.out.println(p1);

        Arrays.sort(pessoas, new NomeComparator());

        System.out.println(Arrays.toString(pessoas));
    }
}