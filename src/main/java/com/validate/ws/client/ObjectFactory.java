
package com.validate.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.validate.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _String_QNAME = new QName("http://localhost/SmartPayments/", "string");
    private final static QName _Boolean_QNAME = new QName("http://localhost/SmartPayments/", "boolean");
    private final static QName _Int_QNAME = new QName("http://localhost/SmartPayments/", "int");
    private final static QName _Response_QNAME = new QName("http://localhost/SmartPayments/", "Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.validate.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsDebitCardResponse }
     * 
     */
    public IsDebitCardResponse createIsDebitCardResponse() {
        return new IsDebitCardResponse();
    }

    /**
     * Create an instance of {@link GetCardType }
     * 
     */
    public GetCardType createGetCardType() {
        return new GetCardType();
    }

    /**
     * Create an instance of {@link GetCardTypeResponse }
     * 
     */
    public GetCardTypeResponse createGetCardTypeResponse() {
        return new GetCardTypeResponse();
    }

    /**
     * Create an instance of {@link IsCommercialCard }
     * 
     */
    public IsCommercialCard createIsCommercialCard() {
        return new IsCommercialCard();
    }

    /**
     * Create an instance of {@link IsCommercialCardResponse }
     * 
     */
    public IsCommercialCardResponse createIsCommercialCardResponse() {
        return new IsCommercialCardResponse();
    }

    /**
     * Create an instance of {@link ValidCard }
     * 
     */
    public ValidCard createValidCard() {
        return new ValidCard();
    }

    /**
     * Create an instance of {@link ValidCardResponse }
     * 
     */
    public ValidCardResponse createValidCardResponse() {
        return new ValidCardResponse();
    }

    /**
     * Create an instance of {@link ValidCardLength }
     * 
     */
    public ValidCardLength createValidCardLength() {
        return new ValidCardLength();
    }

    /**
     * Create an instance of {@link ValidCardLengthResponse }
     * 
     */
    public ValidCardLengthResponse createValidCardLengthResponse() {
        return new ValidCardLengthResponse();
    }

    /**
     * Create an instance of {@link ValidExpDate }
     * 
     */
    public ValidExpDate createValidExpDate() {
        return new ValidExpDate();
    }

    /**
     * Create an instance of {@link ValidExpDateResponse }
     * 
     */
    public ValidExpDateResponse createValidExpDateResponse() {
        return new ValidExpDateResponse();
    }

    /**
     * Create an instance of {@link ValidMod10 }
     * 
     */
    public ValidMod10 createValidMod10() {
        return new ValidMod10();
    }

    /**
     * Create an instance of {@link ValidMod10Response }
     * 
     */
    public ValidMod10Response createValidMod10Response() {
        return new ValidMod10Response();
    }

    /**
     * Create an instance of {@link GetNetworkID }
     * 
     */
    public GetNetworkID createGetNetworkID() {
        return new GetNetworkID();
    }

    /**
     * Create an instance of {@link GetNetworkIDResponse }
     * 
     */
    public GetNetworkIDResponse createGetNetworkIDResponse() {
        return new GetNetworkIDResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link IsFSACard }
     * 
     */
    public IsFSACard createIsFSACard() {
        return new IsFSACard();
    }

    /**
     * Create an instance of {@link IsFSACardResponse }
     * 
     */
    public IsFSACardResponse createIsFSACardResponse() {
        return new IsFSACardResponse();
    }

    /**
     * Create an instance of {@link IsValidCheckRoutingNumber }
     * 
     */
    public IsValidCheckRoutingNumber createIsValidCheckRoutingNumber() {
        return new IsValidCheckRoutingNumber();
    }

    /**
     * Create an instance of {@link IsValidCheckRoutingNumberResponse }
     * 
     */
    public IsValidCheckRoutingNumberResponse createIsValidCheckRoutingNumberResponse() {
        return new IsValidCheckRoutingNumberResponse();
    }

    /**
     * Create an instance of {@link IsDebitCard }
     * 
     */
    public IsDebitCard createIsDebitCard() {
        return new IsDebitCard();
    }

    /**
     * Create an instance of {@link IsDebitCardResponse.IsDebitCardResult }
     * 
     */
    public IsDebitCardResponse.IsDebitCardResult createIsDebitCardResponseIsDebitCardResult() {
        return new IsDebitCardResponse.IsDebitCardResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://localhost/SmartPayments/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://localhost/SmartPayments/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://localhost/SmartPayments/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://localhost/SmartPayments/", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

}
