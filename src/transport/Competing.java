package transport;

public interface Competing {

    String[] getCompetingCommands = new String[0];
    String[] getAllCommands = new String[]{"Пит-стоп", "Лучшее время круга",
            "Максимальная скорость"};

    void сompeting(String command, Object[] competingCommands);

    void doCommand(String command);
}



