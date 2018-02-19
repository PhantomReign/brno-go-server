
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListForRouteOfCallResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListForRouteOfCallResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeparturesL" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}ArrayOfListForRouteOfCallResp.Entry" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListForRouteOfCallResp", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "departuresL"
})
public class ListForRouteOfCallResp {

    @XmlElementRef(name = "DeparturesL", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfListForRouteOfCallRespEntry> departuresL;

    /**
     * Gets the value of the departuresL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfListForRouteOfCallRespEntry }{@code >}
     *     
     */
    public JAXBElement<ArrayOfListForRouteOfCallRespEntry> getDeparturesL() {
        return departuresL;
    }

    /**
     * Sets the value of the departuresL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfListForRouteOfCallRespEntry }{@code >}
     *     
     */
    public void setDeparturesL(JAXBElement<ArrayOfListForRouteOfCallRespEntry> value) {
        this.departuresL = value;
    }

}
