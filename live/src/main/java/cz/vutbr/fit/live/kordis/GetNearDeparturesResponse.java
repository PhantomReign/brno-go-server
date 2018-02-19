
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
 *         &lt;element name="GetNearDeparturesResult" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}NearDeparturesResp" minOccurs="0"/&gt;
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
    "getNearDeparturesResult"
})
@XmlRootElement(name = "GetNearDeparturesResponse")
public class GetNearDeparturesResponse {

    @XmlElementRef(name = "GetNearDeparturesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<NearDeparturesResp> getNearDeparturesResult;

    /**
     * Gets the value of the getNearDeparturesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     *     
     */
    public JAXBElement<NearDeparturesResp> getGetNearDeparturesResult() {
        return getNearDeparturesResult;
    }

    /**
     * Sets the value of the getNearDeparturesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     *     
     */
    public void setGetNearDeparturesResult(JAXBElement<NearDeparturesResp> value) {
        this.getNearDeparturesResult = value;
    }

}
