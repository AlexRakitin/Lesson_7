public class Circle implements Figures {

    int r = (int) (Math.random() * 10) + 1;
    double pi = 3.14;

    @Override
    public double square() {
        System.out.println("Площадь круга = " + (pi * Math.pow(r,2)));
        return pi * Math.pow(r,2);
    }

    @Override
    public double perimeter() {
        System.out.println("Периметр круга = " + (2 * pi * r));
        System.out.println();
        return 2 * pi * r;
    }
}
