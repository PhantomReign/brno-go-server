
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NearDeparturesResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NearDeparturesResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeparturesL" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}ArrayOfNearDeparturesResp.Entry" minOccurs="0"/&gt;
 *         &lt;element name="InfoTextSet" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NearDeparturesResp", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "departuresL",
    "infoTextSet"
})
public class NearDeparturesResp {

    @XmlElementRef(name = "DeparturesL", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNearDeparturesRespEntry> departuresL;
    @XmlElementRef(name = "InfoTextSet", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> infoTextSet;

    /**
     * Gets the value of the departuresL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNearDeparturesRespEntry }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNearDeparturesRespEntry> getDeparturesL() {
        return departuresL;
    }

    /**
     * Sets the value of the departuresL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNearDeparturesRespEntry }{@code >}
     *     
     */
    public void setDeparturesL(JAXBElement<ArrayOfNearDeparturesRespEntry> value) {
        this.departuresL = value;
    }

    /**
     * Gets the value of the infoTextSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getInfoTextSet() {
        return infoTextSet;
    }

    /**
     * Sets the value of the infoTextSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setInfoTextSet(JAXBElement<ArrayOfstring> value) {
        this.infoTextSet = value;
    }

}
