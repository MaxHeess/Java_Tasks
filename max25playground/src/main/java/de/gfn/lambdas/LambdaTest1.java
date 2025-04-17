package de.gfn.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        MathOperation add = (a, b) -> a + b;
        MathOperation multi = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;
        MathOperation sub = (a, b) -> a - b;

        double erg = add.exec(100, 200);
        System.out.println(erg);

        erg = multi.exec(100, 200);
        System.out.println(erg);

        Consumer<String> printer = (s) -> System.out.println("#" + s.toUpperCase() + "#");
        Consumer<String> printer2 = (s) -> System.out.println(s);
        Consumer<String> printer3 = (s) -> System.out.println(">>>" + s.toLowerCase());

        printer.accept("Das ist das Haus von Nikigraus!");

        System.out.println();

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Carol");
        namen.add("Natasha");
        namen.add("Bruce");

        namen.forEach(s -> System.out.println(s.charAt(0)));

        List<Integer> ints = new ArrayList<>(List.of(10, 17, 22, 1, 9, 100, -17, -8, 0));

        Predicate<Integer> pred1 = i -> i < 0;
        ints.removeIf(pred1);
        System.out.println(ints);

        System.out.println();

        namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Carol");
        namen.add("Natasha");
        namen.add("Bruce");
        namen.add("Tony");
        namen.add("Scott");

        Comparator<String> comp1 = (s1, s2) -> s1.compareTo(s2);
        Comparator<String> comp2 = (s1, s2) -> s2.compareTo(s1);
        Comparator<String> comp3 = (s1, s2) -> s1.length() - s2.length();
        namen.sort(comp3);

        System.out.println(namen);
    }

    @FunctionalInterface
    interface MathOperation {
        double exec(double a, double b);
    }

    class Add implements MathOperation {

        @Override
        public double exec(double a, double b) {
            return a + b;
        }
    }
}
