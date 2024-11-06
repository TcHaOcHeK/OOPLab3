import java.util.HashMap;
import Classes.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Double> poly1 = new HashMap<>();
        poly1.put(2, 3.0);
        poly1.put(1, 2.0);
        poly1.put(0, 1.0);

        HashMap<Integer, Double> poly2 = new HashMap<>();
        poly2.put(2, 4.0);
        poly2.put(1, 5.0);
        poly2.put(0, 6.0);

        // Сложение многочленов
        HashMap<Integer, Double> sumCoefficients = PolySum.addPoly(poly1, poly2);

        // Пример вывода суммы (можно убрать или оставить по желанию)
        System.out.println("Сумма многочленов: " + sumCoefficients);
    }
}