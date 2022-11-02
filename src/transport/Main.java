package transport;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car("БМВ", "760М", 6.0, 250);
        System.out.println(bmw);
        Bus mercedes = new Bus("Мерседес", "9906", 6.0, 180);
        System.out.println(mercedes);
        Truck man = new Truck("Ман", "TGS", 6.5, 160);
        System.out.println(man);

        Driver driverB = new Driver("Петров Петр Петрович,", "В/У кат.B,", 10);
        System.out.println(driverB.getFio() + " " + driverB.getAvailabilityOfRights() + " Стаж "
                + driverB.getExperience() + " лет! Управляет автомобилем: " + bmw + " и будет участвовать в заезде!");
        driverB.сompeting(Car.CMD_PIT, Competing.getCompetingCommands);
        chekCompeting(driverB, bmw);
        driverB.refill();

        Driver driverC = new Driver("Иванов Иван Иванович,", "В/У кат.С,", 15);
        System.out.println(driverC.getFio() + " " + driverC.getAvailabilityOfRights() + " Стаж "
                + driverC.getExperience() + " лет! Управляет грузовиком: " + man + " и будет участвовать в заезде!");
        driverC.сompeting(Truck.CMD_PIT, Competing.getCompetingCommands);
        chekCompeting(driverC, man);
        driverC.refill();

        Driver driverD = new Driver("Васильев Василий Васильевич,", "В/У кат.Д,", 20);
        System.out.println(driverD.getFio() + " " + driverD.getAvailabilityOfRights() + " Стаж "
                + driverD.getExperience() + " лет! Управляет автобусом: " + mercedes + " и будет участвовать в заезде!");
        driverD.сompeting(Bus.CMD_PIT, Competing.getCompetingCommands);
        chekCompeting(driverD, mercedes);
        driverD.refill();
    }

    public static void chekCompeting(Competing... competings) {
        for (Competing competing : competings) {
            for (String command : competing.getAllCommands) {
                competing.doCommand(command);
            }
        }
    }
}