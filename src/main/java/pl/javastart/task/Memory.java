package pl.javastart.task;

public class Memory extends Component implements Overclockable {
    private static final int MAX_TEMPERATURE_MEMORY = 100;
    private static final int TEMPERATURE_GAINING_DURING_TIMING_MEMORY = 15;
    private int amount;
    private int timing;
    private int currentTemperature = 50;

    public Memory(String model, String producent, String seriesNumber, int amount, int timing) {
        super(model, producent, seriesNumber);
        this.amount = amount;
        this.timing = timing;
    }

    @Override
    public void overlock() {
        checkTemperature();
        timing += MAX_TEMPERATURE_MEMORY;
        currentTemperature += TEMPERATURE_GAINING_DURING_TIMING_MEMORY;
        System.out.println("Taktwanie pamięci: " + timing);
        System.out.println("Temperatura pamięci: " + currentTemperature);
    }

    void checkTemperature() {
        if (MAX_TEMPERATURE_MEMORY - currentTemperature <= TEMPERATURE_GAINING_DURING_TIMING_MEMORY) {
            throw new MemoryTemperatureExceededException();
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
