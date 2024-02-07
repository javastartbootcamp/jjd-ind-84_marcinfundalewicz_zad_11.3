package pl.javastart.task;

public class HardDrive extends Component {
    int capacity;

    public HardDrive(String model, String producent, String seriesNumber, int capacity) {
        super(model, producent, seriesNumber);
        this.capacity = capacity;
    }
}
