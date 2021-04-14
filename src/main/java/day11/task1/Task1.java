package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        businessProcess(picker);
        System.out.println(picker + " " + warehouse);
        businessProcess(courier);
        System.out.println(courier + " " + warehouse);
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        businessProcess(picker1);
        System.out.println(picker1 + " " + warehouse1);
        businessProcess(courier1);
        System.out.println(courier1 + " " + warehouse1);
        picker1.doWork();
        courier1.doWork();

    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
