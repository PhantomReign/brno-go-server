
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewRSDInfoResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewRSDInfoResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NRSDIL" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}ArrayOfNewRSDInfoResp.Entry" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewRSDInfoResp", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "nrsdil"
})
public class NewRSDInfoResp {

    @XmlElementRef(name = "NRSDIL", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNewRSDInfoRespEntry> nrsdil;

    /**
     * Gets the value of the nrsdil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNewRSDInfoRespEntry }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNewRSDInfoRespEntry> getNRSDIL() {
        return nrsdil;
    }

    /**
     * Sets the value of the nrsdil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNewRSDInfoRespEntry }{@code >}
     *     
     */
    public void setNRSDIL(JAXBElement<ArrayOfNewRSDInfoRespEntry> value) {
        this.nrsdil = value;
    }

}
