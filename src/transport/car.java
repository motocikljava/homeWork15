package transport;


public class car {
    private String model;
    double engineVolume;
    String color;
    private int productionYear;
    private String productionCountry;
    String transmission;
    private String bodyType;
    private int numberOfSeats;
    int winOrSumSires;
    String sires;

    public String getSires() {
        return sires;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getWinOrSumSires() {
        return winOrSumSires;
    }

    public void setWinOrSumSires(int winOrSumSires) {
        this.winOrSumSires = winOrSumSires;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;

    }


    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", winOrSumSires='" +  sires +
                '}';
    }
/*
    @Override
    public String toString() {
        return "Автомобиль " + model + " " + productionYear + " года выпуска"
                + " страна сборки " + productionCountry
                + " цвет кузова " + color
                + " объем двигателя "  + engineVolume;

    }

     */

    public car(String model, double engineVolume, String color, int productionYear, String productionCountry,
               String transmission, String bodyType, int numberOfSeats, int winOrSumSires) {
        /*
- - коробка передач
- тип кузова
- регистрационный номер
- количество мест
- признак летняя или зимняя резина
     */
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        if (transmission != null) {
            this.transmission = transmission;
        } else {
            this.transmission = "неверная информация";
        }

        if (bodyType != null) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "неверная информация";
        }
        if (this.numberOfSeats > 0 || this.numberOfSeats <=5) {
            this.numberOfSeats = numberOfSeats;
        } else {
            throw new NullPointerException("Введите корректное число посадочных мест");
        }
        if (winOrSumSires >= 1) {
            sires = "зимняя резина";
        } else if (winOrSumSires == 0) {
            sires = "летняя резина";
        } else {
            throw new NullPointerException("Введите корректное  мест");
        }




    /*
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

 */
    }



}

