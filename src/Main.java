public class Main {
    public static void main(String[] args) {

car lada = new car("Lada Grande",1.7,"жёлтый", 2015, "Россиия");
car audi = new car("Audi A8 50 L TDI quattro",3.0,"чёрный", 2020, "Германия");
car bmw = new car("BMW Z8","чёрный", 2021, "Германия");
car kia = new car("Kia Sportage 4 поколение",2.4,"красный", 2018, "Южная Корея");
car huindai = new car("Hyundai Avante",1.6,"оранжевый", 2016, "Южная Корея");
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
        /*- Роза обыкновенная из Голландии, стоимость штуки – 35,59 рублей
- Хризантема, стоимость штуки – 15 рублей, срок стояния – 5 дней
- Пион из Англии, стоимость штуки – 69,9 рублей, срок стояния – 1 день
- Гипсофила, страна происхождения – Турция, стоимость штуки – 19,5 рублей, срок стояния – 10 дней
public flower(String flowerColor, String country, double cost, String nameFlower, int lifeSpan
String country, double cost, String nameFlower, int lifeSpan
         */
        flower rose = new flower("красный", "Голландия", 15.00, "Роза");
        flower hriz = new flower("Россия", 15.0, "Хризантема", 5);
        flower pion = new flower(null, "Англия", 69.9, "Пион", 1);
        flower gips = new flower("жёлтый", "Турция", 19.5, "Гипсофила", 10);
        System.out.println(rose);
        System.out.println(hriz);
        System.out.println(pion);
        System.out.println(gips);


    }
    }