package pl.javastart.task.restricted;

import pl.javastart.task.restricted.Config;

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

    public Offer() {
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
