package com.learning;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            String algorithm = scanner.nextLine();

            switch (algorithm) {

                case "1":
                    System.out.println("Введите число: ");
                    try {
                        int number = scanner.nextInt();
                        scanner.nextLine();

                        if (number > 7) {
                            System.out.println("Привет!");
                        }
                        else {
                            System.out.println("Попробуйте снова!");
                        }
                    } catch (InputMismatchException ex) {
                        System.out.println("Ошибка! Вы ввели не цифру, а что-то другое");
                    }
                    return;

                case "2":
                    System.out.println("Введите имя: ");
                    try {
                        String name = scanner.nextLine();

                        if (name.equals("Вячеслав")) {
                            System.out.println("Привет, Вячеслав");
                        }
                        else {
                            System.out.println("Нет такого имени");
                        }
                    } catch (InputMismatchException ex1) {
                        System.out.println("Ошибка! Вы ввели не имя, а что-то другое");
                    }
                    return;

                case "3":
                    System.out.println("Введите числа через запятую без пробела: ");
                    String numbers = scanner.nextLine();
                    String[] arr = numbers.split(",");

                    for (int i = 0; i < arr.length; i++) {
                        try {

                        if(Integer.parseInt(arr[i]) % 3 == 0)
                            System.out.println(arr[i] + " кратно 3");

                        } catch (NumberFormatException ex) {
                            System.out.println("Ошибка! Вы ввели не числа, а что-то другое! Неправильный элемент массива: " + arr[i]);
                        }
                    }

                    System.out.println(java.util.Arrays.toString(arr));
                    break;

                default:
                    System.out.println("Неверно введен номер алгоритма!");
                    return;
            }
        }
    }


    public static void printMenu() {
        System.out.println("Выберите алгоритм: ");
        System.out.println("1 - Алгоритм с числом больше 7");
        System.out.println("2 - Алгоритм с именем Вячеслав");
        System.out.println("3 - Алгоритм с массивом");
    }
}


