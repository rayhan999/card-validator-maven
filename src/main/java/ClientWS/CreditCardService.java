package ClientWS;

import com.validate.ws.client.CreditCardValidator;
import com.validate.ws.client.CreditCardValidatorSoap;
import com.validate.ws.client.ValidCardResponse;

public class CreditCardService {

    public static int validateCard(String cardNumber, String expDate) {
      
        CreditCardValidator service = new CreditCardValidator();
        CreditCardValidatorSoap soap = service.getCreditCardValidatorSoap();

        
        return soap.validCard(cardNumber, expDate);
    }
}
