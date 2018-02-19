
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
 *         &lt;element name="GetStopInfoResult" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}StopInfoResponse" minOccurs="0"/&gt;
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
    "getStopInfoResult"
})
@XmlRootElement(name = "GetStopInfoResponse")
public class GetStopInfoResponse {

    @XmlElementRef(name = "GetStopInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<StopInfoResponse> getStopInfoResult;

    /**
     * Gets the value of the getStopInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopInfoResponse }{@code >}
     *     
     */
    public JAXBElement<StopInfoResponse> getGetStopInfoResult() {
        return getStopInfoResult;
    }

    /**
     * Sets the value of the getStopInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopInfoResponse }{@code >}
     *     
     */
    public void setGetStopInfoResult(JAXBElement<StopInfoResponse> value) {
        this.getStopInfoResult = value;
    }

}
