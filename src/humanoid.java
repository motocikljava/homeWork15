import java.time.LocalDate;

public class humanoid {

    String name;
    private String city;
    String arbaite;
    private int age;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null || city.isEmpty() || city.isBlank()) {
            this.city = city;
        } else {
            this.city = "Информация не указана.";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age != 0) {
            this.age = age;
        } else {
            System.out.println("Информация не указана.");
        }

    }

    @Override
    public String toString() {
        return "Привет! Меня зовут "
                + name + " Я из города " + city + " Я родился в "
                + getBirthday() + " Будем знакомы!"
                + " Я работаю на должности " + arbaite;
    }


    public int getBirthday() {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new NullPointerException("Введите корректный возраст");
        }
        int birthday = LocalDate.now().getYear() - age;
        return birthday;
        // немного видоизменил задание не ставлю дефолтное значение, решил оставить ошибку.
    }
    public humanoid(String name, String city, int age, String arbaite) {
        this.name = name;
        this.city = city;
        this.age = age;

        this.arbaite = arbaite;
    }

    public humanoid(String name, int age, String arbaite) {
        this.name = name;
        this.city = "информация не указана";
        this.age = age;

        this.arbaite = arbaite;
    }
     public humanoid(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;


        this.arbaite = "информация не указана";
    }
    public humanoid(int age, String city, String arbaite) {
        this.name = "информация не указана";
        this.city = city;
        this.age = age;

        this.arbaite = arbaite;
    }





}
