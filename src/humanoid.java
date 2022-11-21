public class humanoid {
    /*
    Создайте новый проект в IDEA. Создайте класс человек, у которого есть:
- дата рождения
- имя
- город проживания
Создайте объекты для следующий персон:

Напишу программу так, чтобы в консоль выводились приветственное сообщение в формате :” Привет! Меня зовут …. Я из города …. Я родился в  … году. Будем знакомы!”
     */
    String name;
    String city;
    String arbaite;
    @Override
    public String toString() {
        return "Привет! Меня зовут "
                + name + " Я из города " + city + " Я родился в "
                + getBirthday() + " Будем знакомы!"
                + " Я работаю на должности " + arbaite;
    }

    int age;
    public int getBirthday() {
        int birthday = 2022 - age;
        return birthday;
    }
    public humanoid(String name, String city, int age, String arbaite) {
        this.name = name;
        this.city = city;
        if (age >= 0) {
            this.age = age;
        } else {
            throw new NullPointerException("Введите корректный возраст");
        }

        this.arbaite = arbaite;
    }

    public humanoid(String name, int age, String arbaite) {
        this.name = name;
        this.city = "информация не указана";
        if (age >= 0) {
            this.age = age;
        } else {
            throw new NullPointerException("Введите корректный возраст");
        }

        this.arbaite = arbaite;
    }
     public humanoid(String name, String city, int age) {
        this.name = name;
        this.city = city;
        if (age >= 0) {
            this.age = age;
        } else {
            throw new NullPointerException("Введите корректный возраст");
        }

        this.arbaite = "информация не указана";
    }
    public humanoid(int age, String city, String arbaite) {
        this.name = "информация не указана";
        this.city = city;
        if (age >= 0) {
            this.age = age;
        } else {
            throw new NullPointerException("Введите корректный возраст");
        }

        this.arbaite = arbaite;
    }




}
