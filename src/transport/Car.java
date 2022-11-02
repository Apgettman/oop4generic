package transport;

import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Objects;

public class Car implements Competing {

    protected String brand;
    protected String model;
    protected double engineCapacity;
    protected int maxSpeed;
    protected String startMoving;
    protected String finishMovement;
    private OptionalDataException competingCommands;


    public Car(String brand, String model, double engineCapacity, int maxSpeed) {
        super();
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.maxSpeed = maxSpeed;

    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.out.println("Неверное значение");
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank())
            System.out.println("Неверное значение");
        this.model = model;
    }

    public double getEngineCapacity() {

        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {

        this.engineCapacity = engineCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed == 0 || maxSpeed < 0)
            System.out.println("Неверное значение");
        this.maxSpeed = maxSpeed;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineCapacity, engineCapacity) == 0 && maxSpeed == car.maxSpeed
                && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity, maxSpeed);
    }

    public String getStartMoving() {
        return startMoving;
    }

    public void setStartMoving(String startMoving) {
        if (startMoving == null || startMoving.isEmpty() || startMoving.isBlank())
            System.out.println("Начать движение");
        this.startMoving = startMoving;
    }

    public String getFinishMovement() {
        return finishMovement;
    }

    public void setFinishMovement(String finishMovement) {
        if (finishMovement == null || finishMovement.isEmpty() || finishMovement.isBlank())
            System.out.println("Закончить движение");
        this.finishMovement = finishMovement;
    }

    public String toString() {

        return "Car={Марка: " + brand + ", Модель: " + model + ", Объем: " + engineCapacity
                + ", Скорость: " + maxSpeed + " км/ч" + '}';

    }

    public static final String CMD_PIT = "Пит-стоп";
    public static final String CMD_TIME = "Лучшее время круга";
    public static final String CMD_SPEED = "Максимальная скорость";

    public String[] ALL_COMPETING_COMMANDS = new String[]{CMD_PIT, CMD_TIME, CMD_SPEED};

    public String[] getCompetingCommands(String[] competingCommands) {
        return competingCommands;
    }

    public String[] getAllCommands() {
        return ALL_COMPETING_COMMANDS;
    }

    @Override
    public void сompeting(String command, Object[] competingCommands) {
        competingCommands = Arrays.copyOf(competingCommands, competingCommands.length + 1);
        competingCommands[this.competingCommands.length - 1] = command;

    }

    @Override
    public void doCommand(String command) {
        System.out.println("Выполняю команду:");

        switch (command) {
            case CMD_PIT:
                System.out.println("Пит-стоп!");
                break;
            case CMD_TIME:
                System.out.println("Лучшее время круга!");
                break;
            case CMD_SPEED:
                System.out.println("Максимальная скорость!");
                break;
            default:
                System.out.println("Нет такой команды!");
        }
    }
}

