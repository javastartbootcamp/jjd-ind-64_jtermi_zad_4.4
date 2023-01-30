package pl.javastart.task;

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

    public void createLoanOffer(int requestedAmount, int earnings, Config config) {
        if (earnings >= config.getMinRequiredEarnings()) {
            percentage = config.getPercentage();
            valid = true;
            value = requestedAmount;
        }
    }
}
