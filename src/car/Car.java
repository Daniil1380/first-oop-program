package car;

import java.util.Objects;

public class Car {

    private final int id;
    private final String model;
    private String color;
    private int currentSpeed;

    private int cost;

    public Car(int id, String model, String color, int currentSpeed) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public void drift() {
        System.out.println("Супер-крутой дрифт...");
    }

    public void getInfo() {
        System.out.println();
        System.out.println("Информация о машине");
        System.out.println("Идентификатор машины = " + id);
        System.out.println("Модель машины - это " + model);
        System.out.println("Цвет машины: " + color);
        System.out.println();
    }

    public void go(int speed) {
        if (currentSpeed == 0) {
            System.out.println("Машина начала движение со скоростью " + speed);
        }
        else {
            System.out.println("Машина продолжает движение со скоростью " + speed);
        }
        currentSpeed = speed;
    }

    public void setColor(String color) { //запись, set - установить
        this.color = color;
    }

    public String getColor() { //чтение, get - получить
        return color;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed >= 0 && currentSpeed < 500) {
            this.currentSpeed = currentSpeed;
        }
        else {
            System.out.println("Скорость не была изменена");
        }
    }

    public void startEngine() {
        check();
        if (currentSpeed == 0) {
            startAfterCheck();
        }
    }

    private void check() {
        System.out.println("Проверить топливо");
        System.out.println("Проверить электронику");
    }

    private void startAfterCheck() {
        System.out.println("Запуск электроники");
        System.out.println("Запуск стартера");
        System.out.println("...Двигатель запущен");
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void changeCost(int sale) {
        cost = cost - cost * sale / 100;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + currentSpeed;
        result = 31 * result + cost;
        return result;
    }

    //override

}
