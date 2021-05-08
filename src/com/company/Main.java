package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	double height = 0, weight, index, heightInMetrs;

        Scanner input = new Scanner(System.in);

        System.out.println("Рассчитайте свой индекс массы тела");

        System.out.print("Введите свой рост (в сантиметрах):");

        try {
            height = input.nextDouble();
        }
        catch (Exception e){
            System.out.println("Ошибка. Запустите программу и попробуйте снова");
            return;

        }

        System.out.print("Введите свой вес (в килограммах):");

        try {
            weight = input.nextDouble();
        }

        catch (Exception e){
            System.out.println("Ошибка. Запустите программу и попробуйте снова");
            return;
        }

        heightInMetrs = height/100;     //переводим сантиметры в метры

        index = weight / Math.pow(heightInMetrs, 2);

        String output = String.format("Индекс массы тела: %.1f", index);


        if (index > 0 && index <= 16.5){
            System.out.println(""+output+" - крайний недостаток веса");
        }
        if (index >= 16.5 && index <= 18.4){
            System.out.println(""+output+" - недостаток в весе");
        }
        if (index >= 18.5 && index <= 24.9){
            System.out.println(" "+output+" - нормальный вес тела");
        }
        if (index >= 25 && index <= 30){
            System.out.println(""+output+" - избыточная масса тела");
        }
        if (index >= 30.1 && index <= 34.9){
            System.out.println(""+output+" - ожирение (Класс I)");
        }
        if (index >= 35 && index <= 40){
            System.out.println(""+output+" - ожирение (Класс II - тяжелое)");
        }
        if (index > 40){
            System.out.println(""+output+" - ожирение (Класс III - крайне тяжелое)");
        }






    }
}
