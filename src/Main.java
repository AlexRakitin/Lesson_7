import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //        Основное задание
        //        1. Написать иерархию классов «Фигуры».
        //        Фигура -> Треугольник -> Прямоугольник -> Круг.
        //        Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
        //        Создать массив из 5 фигур.
        //        Вывести на экран сумму периметра всех фигур в массиве.

        System.out.println("_________________________________");

        double sumS = 0;
        double sumP = 0;
        Figures triangle = new Triangle();

        Figures rectangle1 = new Rectangle();
        Figures rectangle2 = new Rectangle();

        Figures circle1 = new Circle();
        Figures circle2 = new Circle();

        Figures[] mas = {triangle, rectangle1, rectangle2, circle1, circle2};
        for (Figures fig : mas) {
            sumS += fig.square();
            sumP += fig.perimeter();
        }
        System.out.println("Сумма всех площадей = " + sumS);
        System.out.println("Сумма всех периметров = " + sumP);
        System.out.println("_________________________________");
        System.out.println();

    }

}