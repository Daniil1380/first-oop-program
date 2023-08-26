package somewhere;

public class Person {

    String name;

    int age;

    double weight;

    int height;

    private double money;

    public Person(String name, int age, double weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printInfo() {
        System.out.println("Имя человека " + name);
        System.out.println("Возраст человека " + age);
        ///....
    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println("Отдыхаю");
        }
        else {
            System.out.println("Вот блин... работа");
        }
    }

    public double getMoney() {
        return money;
    }

}
