package somewhere;

public class Main {

    public static void main(String[] args) {
        Car a = new Car(1, "BMW E34", "black", 0);
        Car b = new Car(2, "TESLA X", "red", 0);

        //System.out.println(a.id);
        //System.out.println(b.id);

        //System.out.println(a.model);
        //System.out.println(b.model);

        //System.out.println(a.color);
        //System.out.println(b.color);

        //hello();
        //abc();
        //int c = abc();
        //System.out.println(c);

        a.drift();
        b.drift();

        a.getInfo();
        b.getInfo();

        //a.go(10);
        //a.go(20);
        //a.go(200);
        //a.go(150);

        a.getInfo();

        a.setColor("yellow");
        a.getInfo();


        System.out.println("--------------");
        System.out.println(a.getColor());
        System.out.println("--------------"); //эта строка выводит на экран

        System.out.println("Текущая скорость: " + a.getCurrentSpeed());
        a.setCurrentSpeed(250);
        System.out.println("Текущая скорость: " + a.getCurrentSpeed());
        a.setCurrentSpeed(1000);
        System.out.println("Текущая скорость: " + a.getCurrentSpeed());

        a.startEngine();

        //a.startAfterCheck();

        //javadoc

        //a.model = "123";

        //В класс Car добавить поле типа int,
        //которое будет хранить стоимость автомобиля

        //1) приватный доступ
        //2) выдать гетеры и сетеры на это поле
        //3) создать метод, который принимает, число
        //это число - скидка на машину, изменить цену

        //Пример: машина стоит 1000 долларов
        //a.findSale(15)

        //После вызова метода стоимость машины должны быть 850 долларов

        //@Tkach1380

    }

    public static void hello() {
        System.out.println("Привет");
    }

    public static int abc() {
        System.out.println("Привет");
        return 5;
    }

}