package pl.javastart.task;

public abstract class Component {
    String model;
    String producent;
    String seriesNumber;

    public Component(String model, String producent, String seriesNumber) {
        this.model = model;
        this.producent = producent;
        this.seriesNumber = seriesNumber;
    }
}
