
package com.validate.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Credit Card Validation and Card Type Web Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CreditCardValidator", targetNamespace = "http://localhost/SmartPayments/", wsdlLocation = "https://secure.ftipgw.com/ArgoFire/validate.asmx?WSDL")
public class CreditCardValidator
    extends Service
{

    private final static URL CREDITCARDVALIDATOR_WSDL_LOCATION;
    private final static WebServiceException CREDITCARDVALIDATOR_EXCEPTION;
    private final static QName CREDITCARDVALIDATOR_QNAME = new QName("http://localhost/SmartPayments/", "CreditCardValidator");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://secure.ftipgw.com/ArgoFire/validate.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CREDITCARDVALIDATOR_WSDL_LOCATION = url;
        CREDITCARDVALIDATOR_EXCEPTION = e;
    }

    public CreditCardValidator() {
        super(__getWsdlLocation(), CREDITCARDVALIDATOR_QNAME);
    }

    public CreditCardValidator(WebServiceFeature... features) {
        super(__getWsdlLocation(), CREDITCARDVALIDATOR_QNAME, features);
    }

    public CreditCardValidator(URL wsdlLocation) {
        super(wsdlLocation, CREDITCARDVALIDATOR_QNAME);
    }

    public CreditCardValidator(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CREDITCARDVALIDATOR_QNAME, features);
    }

    public CreditCardValidator(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CreditCardValidator(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CreditCardValidatorSoap
     */
    @WebEndpoint(name = "CreditCardValidatorSoap")
    public CreditCardValidatorSoap getCreditCardValidatorSoap() {
        return super.getPort(new QName("http://localhost/SmartPayments/", "CreditCardValidatorSoap"), CreditCardValidatorSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreditCardValidatorSoap
     */
    @WebEndpoint(name = "CreditCardValidatorSoap")
    public CreditCardValidatorSoap getCreditCardValidatorSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost/SmartPayments/", "CreditCardValidatorSoap"), CreditCardValidatorSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CREDITCARDVALIDATOR_EXCEPTION!= null) {
            throw CREDITCARDVALIDATOR_EXCEPTION;
        }
        return CREDITCARDVALIDATOR_WSDL_LOCATION;
    }

}
