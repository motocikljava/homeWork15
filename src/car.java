public class car {
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    @Override
    public String toString() {
        return "Автомобиль " + model + " " + productionYear + " года выпуска"
                + " страна сборки " + productionCountry
                + " цвет кузова " + color
                + " объем двигателя "  + engineVolume;
    }

    public car(String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;

    }
    /*- если не указана модель, марка машины и страна сборки, то значение по умолчанию – default
       - если не указан объем двигателя, то значение по умолчанию – 1,5 л
               - цвет кузова по умолчанию – белый
               - если не указан год производства, то значение по умолчанию – 2000

        */
    public car(double engineVolume, String color, int productionYear, String productionCountry) {
        this.model = "default";
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
}
    public car(String model, double engineVolume, String color, int productionYear) {
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = "default";

    }
    public car(String model, String color, int productionYear, String productionCountry) {
        this.model = model;
        this.engineVolume = 1.5;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;

    }
    public car(String model, double engineVolume, int productionYear, String productionCountry) {
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = "белый";
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;

    }
    public car(String model, double engineVolume, String color, String productionCountry) {
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = 2000;
        this.productionCountry = productionCountry;

    }
}

