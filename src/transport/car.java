package transport;


import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class car {
    public static void autoNumber() {
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



    public static class key {
private String remoteStart;
private String keylessAccess;

        public key(String remoteStart, String keylessAccess) {
            if (remoteStart != null) {
                this.remoteStart = remoteStart;
            }

            if (keylessAccess != null) {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteStart() {
            return remoteStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

    }

    public static class Insurance {
        private int validity;
        private double price;
        private int number;
        public void validStrahovka() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер страховки в формате 123456789");
            String numberSt = scan.nextLine();
            Pattern pattern = Pattern.compile("[0-9]{9}");
            Matcher matcher2 = pattern.matcher(numberSt);
            if (matcher2.find() == true) {
                System.out.println("номер введён страховки корректно");
            } else {
                throw new NullPointerException("Введите номер страховки по заданным параметрам");
            }
        }


        public Insurance(int validity, double price, int number) {
            if (validity != 0) {
                this.validity = validity;
            }
            if (price != 0) {
                this.price = price;
            }
            if (number != 0) {
                this.number = number;
            }

        }
        public void checkVal() {
            if (validity <= 2023 && validity >= 2021) {
                System.out.println(" страховка действительна");
            } else {
                System.out.println("страховка истекла оформите новую");
            }
        }


        public int getValidity() {
            return validity;
        }

        public double getPrice() {
            return price;
        }

        public int getNumber() {
            return number;
        }

        public void setValidity(int validity) {
            this.validity = validity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
    private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }


    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

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

