import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Quadrado(4.0));
        figuras.add(new Retangulo(5.0, 3.0));
        figuras.add(new Circulo(2.5));

        System.out.println("=== CÁLCULO DE ÁREA DE FIGURAS GEOMÉTRICAS ===\n");

        for (FiguraGeometrica figura : figuras) {
            String nomeFigura = figura.getClass().getSimpleName();
            System.out.printf("Figura: %s | Área: %.2f\n", nomeFigura, figura.calcularArea());
        }
    }
}