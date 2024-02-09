package pl.javastart.task;

public class HardDrive extends Component {
    private int capacity;

    public HardDrive(String model, String producent, String seriesNumber, int capacity) {
        super(model, producent, seriesNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
