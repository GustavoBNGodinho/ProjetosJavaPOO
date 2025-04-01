import java.awt.print.PrinterAbortException;

public class Main {
    //funcionando;
    public static void main(String[] args) {
       // {p1=(0.752243, 0.654986), p2=(0.776068, 0.654986), p3=(0.975263, 0.629362), p4=(0.951438, 0.629362)
        Ponto p1 = new Ponto(0.752243, 0.654986);
        Ponto p2 = new Ponto(0.776068, 0.654986);
        Ponto p3 = new Ponto(0.975263, 0.629362);
        Ponto p4 = new Ponto(0.951438, 0.629362);
        Trapezio trapezio = new Trapezio(p1, p2, p3, p4);

        Paralelogramo paralelogramo = new Paralelogramo(p1, p2, p3, p4);

        System.out.println(paralelogramo.largura());



//        SegmentoReta segmentoReta = new SegmentoReta(p1, p2);
//        System.out.println(segmentoReta.coeficienteAngular());
//        SegmentoReta segmentoReta1 = new SegmentoReta(p2, p3);
//        System.out.println(segmentoReta1.coeficienteAngular());
//        SegmentoReta segmentoReta2 = new SegmentoReta(p3, p4);
//        System.out.println(segmentoReta2.coeficienteAngular());
//        SegmentoReta segmentoReta3 = new SegmentoReta(p4, p1);
//        System.out.println(segmentoReta3.coeficienteAngular());
//        System.out.println(segmentoReta.paralelo(segmentoReta2));
//        System.out.println(segmentoReta1.paralelo(segmentoReta3));
//        System.out.println(Paralelogramo.existe(p1,p2,p3,p4));
//        System.out.println();
//        System.out.println(segmentoReta.getP2().getCoordY());
//        System.out.println(segmentoReta.getP1().getCoordY());
//        System.out.println(segmentoReta1.getP2().getCoordY());
//        System.out.println(segmentoReta1.getP1().getCoordY());
//        System.out.println();
//
//        System.out.println((segmentoReta1.getP2().getCoordY() - segmentoReta1.getP1().getCoordY()) / (segmentoReta1.getP2().getCoordX() - segmentoReta1.getP1().getCoordX()));
//        System.out.println((0.091275 - 0.221670) / (0.997759 - 0.991706));
    }
}
