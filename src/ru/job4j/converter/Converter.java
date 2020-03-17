package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {      // перевод рубли в евро
        int rsl = value / 70;                       //рубли делим на евро получаем евро(целое число)
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(1300);
        System.out.println("1300 рублей стоят " + euro + " евро.");
        int dollar = Converter.rubleToDollar(1300);
        System.out.println("1300 рублей стоят " + dollar + " доллар.");
    }
}
