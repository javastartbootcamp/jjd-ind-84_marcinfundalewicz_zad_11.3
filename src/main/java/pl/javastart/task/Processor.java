package pl.javastart.task;

public class Processor extends Component implements Overclockable {
    public static final int MAX_TEMPERATURE = 100;
    int timing;
    int currentTemperature = 50;

    public Processor(String model, String producent, String seriesNumber, int timing) {
        super(model, producent, seriesNumber);
        this.timing = timing;
    }

    @Override
    public void overlock() {
        try {
            checkTemperature();
            timing += MAX_TEMPERATURE;
            currentTemperature += 10;
            System.out.println("Taktwanie procesora: " + timing);
            System.out.println("Temperatura procesora: " + currentTemperature);
        } catch (TemperatureExceeded e) {
            System.out.println("Brak możliwości podkręcenia procesora, ryzyko spalenia.");
        }
    }

    void checkTemperature() {
        if (currentTemperature >= MAX_TEMPERATURE) {
            throw new TemperatureExceeded();
        }
    }
}
