package rs.ac.uns.ftn.osavezbe02.primer02;

import org.springframework.stereotype.Component;

@Component
public class PaymentBean implements Payment {

    @Override
    public boolean processCreditCard(CreditCard card) {
        return true;
    }
}
