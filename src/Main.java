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


    }
}