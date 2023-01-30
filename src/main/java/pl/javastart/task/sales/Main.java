package pl.javastart.task.sales;

import pl.javastart.task.restricted.Offer;
import pl.javastart.task.restricted.SalesRepresentative;

public class Main {
    public static void main(String[] args) {

        SalesRepresentative salesRepresentative = new SalesRepresentative();

        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 1500);

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}