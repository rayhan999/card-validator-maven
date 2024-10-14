
package com.validate.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RespMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Message1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Message2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HostURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetAVSResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetAVSResultTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetStreetMatchTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetZipMatchTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetCVResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetCVResultTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetGetOrigResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetCommercialCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkingKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KeyPointer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "result",
    "respMSG",
    "message",
    "message1",
    "message2",
    "authCode",
    "pnRef",
    "hostCode",
    "hostURL",
    "receiptURL",
    "getAVSResult",
    "getAVSResultTXT",
    "getStreetMatchTXT",
    "getZipMatchTXT",
    "getCVResult",
    "getCVResultTXT",
    "getGetOrigResult",
    "getCommercialCard",
    "workingKey",
    "keyPointer",
    "extData"
})
public class Response {

    @XmlElement(name = "Result")
    protected int result;
    @XmlElement(name = "RespMSG")
    protected String respMSG;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Message1")
    protected String message1;
    @XmlElement(name = "Message2")
    protected String message2;
    @XmlElement(name = "AuthCode")
    protected String authCode;
    @XmlElement(name = "PNRef")
    protected String pnRef;
    @XmlElement(name = "HostCode")
    protected String hostCode;
    @XmlElement(name = "HostURL")
    protected String hostURL;
    @XmlElement(name = "ReceiptURL")
    protected String receiptURL;
    @XmlElement(name = "GetAVSResult")
    protected String getAVSResult;
    @XmlElement(name = "GetAVSResultTXT")
    protected String getAVSResultTXT;
    @XmlElement(name = "GetStreetMatchTXT")
    protected String getStreetMatchTXT;
    @XmlElement(name = "GetZipMatchTXT")
    protected String getZipMatchTXT;
    @XmlElement(name = "GetCVResult")
    protected String getCVResult;
    @XmlElement(name = "GetCVResultTXT")
    protected String getCVResultTXT;
    @XmlElement(name = "GetGetOrigResult")
    protected String getGetOrigResult;
    @XmlElement(name = "GetCommercialCard")
    protected String getCommercialCard;
    @XmlElement(name = "WorkingKey")
    protected String workingKey;
    @XmlElement(name = "KeyPointer")
    protected String keyPointer;
    @XmlElement(name = "ExtData")
    protected String extData;

    /**
     * Gets the value of the result property.
     * 
     */
    public int getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(int value) {
        this.result = value;
    }

    /**
     * Gets the value of the respMSG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespMSG() {
        return respMSG;
    }

    /**
     * Sets the value of the respMSG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespMSG(String value) {
        this.respMSG = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the message1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage1() {
        return message1;
    }

    /**
     * Sets the value of the message1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage1(String value) {
        this.message1 = value;
    }

    /**
     * Gets the value of the message2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage2() {
        return message2;
    }

    /**
     * Sets the value of the message2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage2(String value) {
        this.message2 = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the pnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRef() {
        return pnRef;
    }

    /**
     * Sets the value of the pnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRef(String value) {
        this.pnRef = value;
    }

    /**
     * Gets the value of the hostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostCode() {
        return hostCode;
    }

    /**
     * Sets the value of the hostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostCode(String value) {
        this.hostCode = value;
    }

    /**
     * Gets the value of the hostURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostURL() {
        return hostURL;
    }

    /**
     * Sets the value of the hostURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostURL(String value) {
        this.hostURL = value;
    }

    /**
     * Gets the value of the receiptURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptURL() {
        return receiptURL;
    }

    /**
     * Sets the value of the receiptURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptURL(String value) {
        this.receiptURL = value;
    }

    /**
     * Gets the value of the getAVSResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAVSResult() {
        return getAVSResult;
    }

    /**
     * Sets the value of the getAVSResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAVSResult(String value) {
        this.getAVSResult = value;
    }

    /**
     * Gets the value of the getAVSResultTXT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAVSResultTXT() {
        return getAVSResultTXT;
    }

    /**
     * Sets the value of the getAVSResultTXT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAVSResultTXT(String value) {
        this.getAVSResultTXT = value;
    }

    /**
     * Gets the value of the getStreetMatchTXT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetStreetMatchTXT() {
        return getStreetMatchTXT;
    }

    /**
     * Sets the value of the getStreetMatchTXT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetStreetMatchTXT(String value) {
        this.getStreetMatchTXT = value;
    }

    /**
     * Gets the value of the getZipMatchTXT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetZipMatchTXT() {
        return getZipMatchTXT;
    }

    /**
     * Sets the value of the getZipMatchTXT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetZipMatchTXT(String value) {
        this.getZipMatchTXT = value;
    }

    /**
     * Gets the value of the getCVResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCVResult() {
        return getCVResult;
    }

    /**
     * Sets the value of the getCVResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCVResult(String value) {
        this.getCVResult = value;
    }

    /**
     * Gets the value of the getCVResultTXT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCVResultTXT() {
        return getCVResultTXT;
    }

    /**
     * Sets the value of the getCVResultTXT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCVResultTXT(String value) {
        this.getCVResultTXT = value;
    }

    /**
     * Gets the value of the getGetOrigResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetGetOrigResult() {
        return getGetOrigResult;
    }

    /**
     * Sets the value of the getGetOrigResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetGetOrigResult(String value) {
        this.getGetOrigResult = value;
    }

    /**
     * Gets the value of the getCommercialCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCommercialCard() {
        return getCommercialCard;
    }

    /**
     * Sets the value of the getCommercialCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCommercialCard(String value) {
        this.getCommercialCard = value;
    }

    /**
     * Gets the value of the workingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingKey() {
        return workingKey;
    }

    /**
     * Sets the value of the workingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingKey(String value) {
        this.workingKey = value;
    }

    /**
     * Gets the value of the keyPointer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPointer() {
        return keyPointer;
    }

    /**
     * Sets the value of the keyPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyPointer(String value) {
        this.keyPointer = value;
    }

    /**
     * Gets the value of the extData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtData() {
        return extData;
    }

    /**
     * Sets the value of the extData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtData(String value) {
        this.extData = value;
    }

}
