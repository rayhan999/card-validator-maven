
package com.validate.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidCardLengthResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validCardLengthResult"
})
@XmlRootElement(name = "ValidCardLengthResponse")
public class ValidCardLengthResponse {

    @XmlElement(name = "ValidCardLengthResult")
    protected boolean validCardLengthResult;

    /**
     * Gets the value of the validCardLengthResult property.
     * 
     */
    public boolean isValidCardLengthResult() {
        return validCardLengthResult;
    }

    /**
     * Sets the value of the validCardLengthResult property.
     * 
     */
    public void setValidCardLengthResult(boolean value) {
        this.validCardLengthResult = value;
    }

}
