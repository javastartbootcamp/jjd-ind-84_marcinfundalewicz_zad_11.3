package pl.javastart.task;

public class Processor extends Component implements Overclockable {
    private static final int MAX_TEMPERATURE_PROCESSOR = 100;
    private static final int TEMPERATURE_GAINING_DURING_TIMING_PROCESSOR = 10;
    private int timing;
    private int currentTemperature = 50;

    public Processor(String model, String producent, String seriesNumber, int timing) {
        super(model, producent, seriesNumber);
        this.timing = timing;
    }

    @Override
    public void overlock() {
        checkTemperature();
        timing += MAX_TEMPERATURE_PROCESSOR;
        currentTemperature += TEMPERATURE_GAINING_DURING_TIMING_PROCESSOR;
        System.out.println("Taktwanie procesora: " + timing);
        System.out.println("Temperatura procesora: " + currentTemperature);
    }

    void checkTemperature() {
        if (MAX_TEMPERATURE_PROCESSOR - currentTemperature <= TEMPERATURE_GAINING_DURING_TIMING_PROCESSOR) {
            throw new ProcessorTemperatureExceededException();
        }
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
}
