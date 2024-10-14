
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
 *         &lt;element name="ValidMod10Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "validMod10Result"
})
@XmlRootElement(name = "ValidMod10Response")
public class ValidMod10Response {

    @XmlElement(name = "ValidMod10Result")
    protected boolean validMod10Result;

    /**
     * Gets the value of the validMod10Result property.
     * 
     */
    public boolean isValidMod10Result() {
        return validMod10Result;
    }

    /**
     * Sets the value of the validMod10Result property.
     * 
     */
    public void setValidMod10Result(boolean value) {
        this.validMod10Result = value;
    }

}
