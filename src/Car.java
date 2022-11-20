public class Car {
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    void info() {
        System.out.println("Автомобиль " + model + " " + productionYear + " года выпуска"
                + " страна сборки " + productionCountry
                + " цвет кузова " + color
                + " объем двигателя "  + engineVolume);
    }void info1() {
        System.out.println("Автомобиль " + model
                + " страна сборки " + productionCountry
                + " цвет кузова " + color
                + " объем двигателя "  + engineVolume
                + " " + productionYear + " года выпуска");
    }
}

