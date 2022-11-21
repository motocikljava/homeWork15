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
        System.out.println(max);
        System.out.println(anya);
        System.out.println(tema);
        System.out.println(kate);

/*
Humanoid max = new Humanoid();
        max.age = 35;
        max.city = "Минск";
        max.name = "Пётр";
        max.arbaite = "бренд-менеджер.";
        max.say();
Humanoid anya = new Humanoid();
        anya.age = 29;
        anya.city = "Москва";
        anya.name = "Аня";
        anya.arbaite = "методист образовательных программ.";
        anya.say();
Humanoid kate = new Humanoid();
        kate.age = 28;
        kate.city = "Калининград";
        kate.name = "Катя";
        kate.arbaite = "продакт-менеджер.";
        kate.say();
Humanoid artemon = new Humanoid();
        artemon.age = 27;
        artemon.city = "Москва";
        artemon.name = "Артём";
        artemon.arbaite = "директорор по развитию бизнеса.";
        artemon.say();

        - Lada Grande, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя - 1,7
- Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя 3.0 литра
- BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем – 3.0
- Kia Sportage 4 поколение, 2018 год выпуска, сборка в Южной Корее, цвет кузова красный, объем двигателя – 2,4 литра.
- Hyundai Avante, сборка в Южной Корее, цвет кузова оранжевый, объем двигателя - 1,6 литра, год выпуска - 2016 год.

            Car lada = new Car();
            lada.model = "Lada Grande";
            lada.productionYear = 2015;
            lada.productionCountry = "Россия";
            lada.color = "цвет кузова жёлтый";
            lada.engineVolume = 1.7;
            lada.info();
            Car audi = new Car();
            audi.model = "Audi A8 50 L TDI quattro";
            audi.productionYear = 2020;
            audi.productionCountry = "Германия";
            audi.color = "черный";
            audi.engineVolume = 3.8;
            audi.info();
            Car bmw = new Car();
            bmw.model = "BMW Z8";
            bmw.productionYear = 2021;
            bmw.productionCountry = "Германия";
            bmw.color = "чёрный";
            bmw.engineVolume = 3.0;
            bmw.info();
            Car kia = new Car();
            kia.model = "Kia Sportage 4 поколение";
            kia.productionYear = 2018;
            kia.productionCountry = "Южная Корея";
            kia.color = "красный";
            kia.engineVolume = 2.4;
            kia.info();
            Car huindai = new Car();
            huindai.model = "Hyundai Avante";
            huindai.productionYear = 2016;
            huindai.productionCountry = "Южная Корея";
            huindai.color = "оранжевый";
            huindai.engineVolume = 1.6;
            huindai.info1();
             */


    }
    }