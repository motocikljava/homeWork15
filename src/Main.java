import transport.car;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
            //(String model, double engineVolume, String color, int productionYear, String productionCountry,
            //               String transmission, String bodyType, String numberOfSeats, String winOrSumSires) {

car lada = new car("Lada Grande",1.7,"жёлтый", 2015,
        "Россиия", null, "седан", 3, 0);
car audi = new car("Audi A8 50 L TDI quattro",3.0,"чёрный", 2020, "Германия",
        "автоматическая", "седан", 4, 0);
car bmw = new car("BMW Z8",3.0, "чёрный", 2021, "Германия",
        "автоматическая", "седан", 4, 1);
car kia = new car("Kia Sportage 4 поколение",2.4,"красный", 2018, "Южная Корея",
        "автоматическая", "седан", 4, 1);
car huindai = new car("Hyundai Avante",1.6,"оранжевый", 2016, "Южная Корея",
        "автоматическая", "седан", 4, 0);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(huindai);

        humanoid max = new humanoid(29, "Москва", "бренд-менеджер");
        humanoid anya = new humanoid("Аня", "Москва", 29, "методист образовательных программ");
        humanoid tema = new humanoid("Артём", "Москва", 27, "директор по развитию бизнеса");
        humanoid kate = new humanoid("Катя", "Калининград", 28, "продакт-менеджер");
        humanoid vlad = new humanoid("Владимир", "Казань", 21);
        System.out.println(vlad);
        System.out.println(max);
        System.out.println(anya);
        System.out.println(tema);
        System.out.println(kate);

        flower rose = new flower("красный", "Голландия", 15.00, "Роза");
        flower hriz = new flower("Россия", 15.0, "Хризантема", 5);
        flower pion = new flower(null, "Англия", 69.9, "Пион", 1);
        flower gips = new flower("жёлтый", "Турция", 19.5, "Гипсофила", 10);
        System.out.println(rose);
        System.out.println(hriz);
        System.out.println(pion);
        System.out.println(gips);
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите автомобильный номер в формате х000хх000");
            String number = scan.nextLine();


        Pattern pattern = Pattern.compile("^[авекмнорстух]{1}[0-9]{3}(?<!0{3})[авекмнорстух]{2}[0-9]{3}$");
            Matcher matcher1 = pattern.matcher(number);
            if (matcher1.find() == true) {
                    System.out.println("номер введён корректно");
            } else {
                    throw new NullPointerException("Введите номер автомобиля по заданным параметрам");
            }


    }
    }