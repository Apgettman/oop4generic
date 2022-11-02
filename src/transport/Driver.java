package transport;

public class Driver extends Car implements Competing {
    private final String fio;
    private final String availabilityOfRights;
    private final int experience;

    public Driver(String fio, String availabilityOfRights, int experience) {
        this.fio = fio;
        this.availabilityOfRights = availabilityOfRights;
        this.experience = experience;
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
            System.out.println("Завершить движение");
        this.finishMovement = finishMovement;
    }

    public String getFio() {
        return fio;
    }

    public String getAvailabilityOfRights() {
        return availabilityOfRights;
    }

    public double getExperience() {
        return experience;
    }

    public void сompeting(String command, Object[] competingCommands) {

    }

    public void doCommand(String command) {
    }

    public String[] getAllCommands(String[] ALL_COMPETING_COMMANDS) {
        return ALL_COMPETING_COMMANDS;
    }

    public String[] getCompetingCommands(String[] сompetingCommands) {
        return сompetingCommands;

    }

    public void refill() {
        System.out.println("Заправить авто!");
    }
}
