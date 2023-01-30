package pl.javastart.task.restricted;

public class Offer {

    private boolean valid;
    private double value;
    private double percentage;

    public boolean isValid() {
        return valid;
    }

    public double getValue() {
        return value;
    }

    public double getPercentage() {
        return percentage;
    }

    void setValid(boolean valid) {
        this.valid = valid;
    }

    void setValue(double value) {
        this.value = value;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }

}
