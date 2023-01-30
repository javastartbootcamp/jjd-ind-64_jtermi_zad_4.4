package pl.javastart.task.restricted;

import pl.javastart.task.restricted.Config;
import pl.javastart.task.restricted.Offer;

public class SalesRepresentative {

    private Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.getMinRequiredEarnings()) {
            offer.setPercentage(config.getPercentage());
            offer.setValid(true);
            offer.setValue(requestedAmount);
        }
        return offer;
    }
}
