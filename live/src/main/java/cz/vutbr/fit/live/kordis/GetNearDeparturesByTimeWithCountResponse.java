
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
 *         &lt;element name="GetNearDeparturesByTimeWithCountResult" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}NearDeparturesResp" minOccurs="0"/&gt;
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
    "getNearDeparturesByTimeWithCountResult"
})
@XmlRootElement(name = "GetNearDeparturesByTimeWithCountResponse")
public class GetNearDeparturesByTimeWithCountResponse {

    @XmlElementRef(name = "GetNearDeparturesByTimeWithCountResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<NearDeparturesResp> getNearDeparturesByTimeWithCountResult;

    /**
     * Gets the value of the getNearDeparturesByTimeWithCountResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     *     
     */
    public JAXBElement<NearDeparturesResp> getGetNearDeparturesByTimeWithCountResult() {
        return getNearDeparturesByTimeWithCountResult;
    }

    /**
     * Sets the value of the getNearDeparturesByTimeWithCountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     *     
     */
    public void setGetNearDeparturesByTimeWithCountResult(JAXBElement<NearDeparturesResp> value) {
        this.getNearDeparturesByTimeWithCountResult = value;
    }

}
