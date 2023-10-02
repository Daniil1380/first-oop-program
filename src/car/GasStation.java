package car;

import java.util.List;
import java.util.Queue;
import java.util.Set;

public class GasStation {
    private List<Cabriolet> cabriolets;
    private Set<EngineType> availableEngineTypes;

    private Queue<Cabriolet> cabrioletQueue;

    public void refuel(Refuelable a) {
        System.out.println("К зарправке подъехал " + a.toString());
        a.refuel();
    }

    public void refuelNext() {
        if (cabrioletQueue == null) {
            return;
        }

        Cabriolet cabriolet = cabrioletQueue.poll();

        System.out.println("Заправляем машину " + cabriolet);
        cabriolet.refuel();
    }

    public Queue<Cabriolet> getCabrioletQueue() {
        return cabrioletQueue;
    }

    public void setCabrioletQueue(Queue<Cabriolet> cabrioletQueue) {
        this.cabrioletQueue = cabrioletQueue;
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
            if (cabriolet.getEngineType() != null
                    && availableEngineTypes != null
                    && availableEngineTypes.contains(cabriolet.getEngineType())) {
                cabriolet.refuel();
            }
        }

        cabriolets.clear();
    }

    public List<Cabriolet> getCabriolets() {
        return cabriolets;
    }

    public void setCabriolets(List<Cabriolet> cabriolets) {
        this.cabriolets = cabriolets;
    }

    public Set<EngineType> getAvailableEngineTypes() {
        return availableEngineTypes;
    }

    public void setAvailableEngineTypes(Set<EngineType> availableEngineTypes) {
        this.availableEngineTypes = availableEngineTypes;
    }
}
