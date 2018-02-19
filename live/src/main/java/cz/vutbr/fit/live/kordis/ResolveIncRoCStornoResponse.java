
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
 *         &lt;element name="ResolveIncRoCStornoResult" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}RouteOnCallResp" minOccurs="0"/&gt;
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
    "resolveIncRoCStornoResult"
})
@XmlRootElement(name = "ResolveIncRoCStornoResponse")
public class ResolveIncRoCStornoResponse {

    @XmlElementRef(name = "ResolveIncRoCStornoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteOnCallResp> resolveIncRoCStornoResult;

    /**
     * Gets the value of the resolveIncRoCStornoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteOnCallResp }{@code >}
     *     
     */
    public JAXBElement<RouteOnCallResp> getResolveIncRoCStornoResult() {
        return resolveIncRoCStornoResult;
    }

    /**
     * Sets the value of the resolveIncRoCStornoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteOnCallResp }{@code >}
     *     
     */
    public void setResolveIncRoCStornoResult(JAXBElement<RouteOnCallResp> value) {
        this.resolveIncRoCStornoResult = value;
    }

}
