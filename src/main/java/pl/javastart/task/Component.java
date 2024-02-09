package pl.javastart.task;

public abstract class Component {
    private String model;
    private String producent;
    private String seriesNumber;

    public Component(String model, String producent, String seriesNumber) {
        this.model = model;
        this.producent = producent;
        this.seriesNumber = seriesNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(String seriesNumber) {
        this.seriesNumber = seriesNumber;
    }
}
