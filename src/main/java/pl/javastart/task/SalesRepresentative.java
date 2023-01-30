package pl.javastart.task;

public class SalesRepresentative {

    private Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        offer.createLoanOffer(requestedAmount, earnings, this.config);
        return offer;
    }

}
