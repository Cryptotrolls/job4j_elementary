package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double rsl = Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(50, 5, 100, 10);
        System.out.println("result (50, 100) to (5, 10) " + result);
    }
}