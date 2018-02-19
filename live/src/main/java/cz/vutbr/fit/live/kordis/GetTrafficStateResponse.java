
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="GetTrafficStateResult" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}TrafficStateResp" minOccurs="0"/&gt;
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
    "getTrafficStateResult"
})
@XmlRootElement(name = "GetTrafficStateResponse")
public class GetTrafficStateResponse {

    @XmlElementRef(name = "GetTrafficStateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TrafficStateResp> getTrafficStateResult;

    /**
     * Gets the value of the getTrafficStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrafficStateResp }{@code >}
     *     
     */
    public JAXBElement<TrafficStateResp> getGetTrafficStateResult() {
        return getTrafficStateResult;
    }

    /**
     * Sets the value of the getTrafficStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrafficStateResp }{@code >}
     *     
     */
    public void setGetTrafficStateResult(JAXBElement<TrafficStateResp> value) {
        this.getTrafficStateResult = value;
    }

}
