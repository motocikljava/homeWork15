public class flower {

    private String nameFlower;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    @Override
    public String toString() {
        return "Разновидность цвтека " + nameFlower
                + ", цвет " + flowerColor
                +", страна произростания " + country
                +", cтоимость одного цветка " + String.format("%.2f",cost)
                +", длительность стояния " + lifeSpan;
    }

    public String getNameFlower() {
        return nameFlower;
    }
/*При этом если цвет цветка не указан или равен null, то по дефолту он должен быть белым.
    Если не указана страна происхождения или значение равно null, то значением по умолчанию будет считаться Россия.
     */

    public String getFlowerColor() {

        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
            this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public flower(String flowerColor, String country, double cost, String nameFlower, int lifeSpan) {
        if (flowerColor != null) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
        if (country != null) {
            this.country = country;
        }else {
            this.country = "Россия";
        }

        if (this.cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00;
        }
        if (nameFlower!= null)
            this.nameFlower = nameFlower;
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            throw new NullPointerException("Введите корректное количество дней");
        }



    }
    public flower(String country, double cost, String nameFlower, int lifeSpan) {
        this.flowerColor = "белый";
        this.country = country;
        if (this.cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00;
        }
        if (nameFlower!= null)
            this.nameFlower = nameFlower;
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            throw new NullPointerException("Введите корректное количество дней");
        }

    }
    public flower(double cost, String flowerColor ,String nameFlower, int lifeSpan) {
        this.flowerColor = flowerColor;
        this.country = "Россия";
        if (this.cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00;
        }
        if (nameFlower!= null)
            this.nameFlower = nameFlower;
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            throw new NullPointerException("Введите корректное количество дней");
        }

    }
    public flower(String flowerColor, String country, double cost, String nameFlower) {
        this.flowerColor = flowerColor;
        this.country = country;
        if (this.cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00;
        }
        if (nameFlower!= null)
            this.nameFlower = nameFlower;
        this.lifeSpan = 3;

    }
}
