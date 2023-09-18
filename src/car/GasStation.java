package car;

import java.util.ArrayList;
import java.util.List;

public class GasStation {

    private List<Cabriolet> cabriolets;

    public void refuel(Refuelable a) {
        System.out.println("К зарправке подъехал " + a.toString());
        a.refuel();
    }

    public void printInfoAboutQueue() {
        if (cabriolets == null) {
            System.out.println("Очередь не существует");
            return;
        }

        System.out.println("Сейчас очередь из автомобилей составляет " + cabriolets.size());
        System.out.println("Вот эти машины " + cabriolets);
    }

    public void refuelAll() {
        if (cabriolets == null || cabriolets.size() == 0) {
            return;
        }

        for (Cabriolet cabriolet : cabriolets) {
            cabriolet.refuel();
        } //foreach

        cabriolets.clear();
    }

    public List<Cabriolet> getCabriolets() {
        return cabriolets;
    }

    public void setCabriolets(List<Cabriolet> cabriolets) {
        this.cabriolets = cabriolets;
    }
}
