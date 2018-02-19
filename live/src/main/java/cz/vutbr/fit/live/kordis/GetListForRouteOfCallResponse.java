
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
 *         &lt;element name="GetListForRouteOfCallResult" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}ListForRouteOfCallResp" minOccurs="0"/&gt;
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
    "getListForRouteOfCallResult"
})
@XmlRootElement(name = "GetListForRouteOfCallResponse")
public class GetListForRouteOfCallResponse {

    @XmlElementRef(name = "GetListForRouteOfCallResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ListForRouteOfCallResp> getListForRouteOfCallResult;

    /**
     * Gets the value of the getListForRouteOfCallResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListForRouteOfCallResp }{@code >}
     *     
     */
    public JAXBElement<ListForRouteOfCallResp> getGetListForRouteOfCallResult() {
        return getListForRouteOfCallResult;
    }

    /**
     * Sets the value of the getListForRouteOfCallResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListForRouteOfCallResp }{@code >}
     *     
     */
    public void setGetListForRouteOfCallResult(JAXBElement<ListForRouteOfCallResp> value) {
        this.getListForRouteOfCallResult = value;
    }

}
