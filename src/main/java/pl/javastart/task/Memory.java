package pl.javastart.task;

public class Memory extends Component implements Overclockable {
    public static final int MAX_TEMPERATURE = 100;
    int amount;
    int timing;
    int currentTemperature = 50;

    public Memory(String model, String producent, String seriesNumber, int amount, int timing) {
        super(model, producent, seriesNumber);
        this.amount = amount;
        this.timing = timing;
    }

    @Override
    public void overlock() {
        try {
            checkTemperature();
            timing += MAX_TEMPERATURE;
            currentTemperature += 15;
            System.out.println("Taktwanie pamięci: " + timing);
            System.out.println("Temperatura pamięci: " + currentTemperature);
        } catch (TemperatureExceeded e) {
            System.out.println("Brak możliwości podkręcenia pamięci, ryzyko spalenia.");
        }
    }

    void checkTemperature() {
        if (MAX_TEMPERATURE - currentTemperature <= 15) {
            throw new TemperatureExceeded();
        }
    }
}
