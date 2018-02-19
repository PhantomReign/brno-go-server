
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficStateResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficStateResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehicleL" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}ArrayOfTrafficStateResp.Entry" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficStateResp", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "vehicleL"
})
public class TrafficStateResp {

    @XmlElementRef(name = "VehicleL", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTrafficStateRespEntry> vehicleL;

    /**
     * Gets the value of the vehicleL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTrafficStateRespEntry }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTrafficStateRespEntry> getVehicleL() {
        return vehicleL;
    }

    /**
     * Sets the value of the vehicleL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTrafficStateRespEntry }{@code >}
     *     
     */
    public void setVehicleL(JAXBElement<ArrayOfTrafficStateRespEntry> value) {
        this.vehicleL = value;
    }

}
