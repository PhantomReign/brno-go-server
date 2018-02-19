
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NearDeparturesResp.Entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NearDeparturesResp.Entry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DriveOrderSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinalStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsBarrierLess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Platform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NearDeparturesResp.Entry", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "driveOrderSign",
    "finalStation",
    "isBarrierLess",
    "lineName",
    "platform",
    "timeMark"
})
@XmlSeeAlso({
    NearDeparturesWithPostsRespEntry.class
})
public class NearDeparturesRespEntry {

    @XmlElementRef(name = "DriveOrderSign", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> driveOrderSign;
    @XmlElementRef(name = "FinalStation", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> finalStation;
    @XmlElement(name = "IsBarrierLess")
    protected Boolean isBarrierLess;
    @XmlElementRef(name = "LineName", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineName;
    @XmlElementRef(name = "Platform", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> platform;
    @XmlElementRef(name = "TimeMark", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeMark;

    /**
     * Gets the value of the driveOrderSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDriveOrderSign() {
        return driveOrderSign;
    }

    /**
     * Sets the value of the driveOrderSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDriveOrderSign(JAXBElement<String> value) {
        this.driveOrderSign = value;
    }

    /**
     * Gets the value of the finalStation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinalStation() {
        return finalStation;
    }

    /**
     * Sets the value of the finalStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinalStation(JAXBElement<String> value) {
        this.finalStation = value;
    }

    /**
     * Gets the value of the isBarrierLess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBarrierLess() {
        return isBarrierLess;
    }

    /**
     * Sets the value of the isBarrierLess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBarrierLess(Boolean value) {
        this.isBarrierLess = value;
    }

    /**
     * Gets the value of the lineName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineName() {
        return lineName;
    }

    /**
     * Sets the value of the lineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineName(JAXBElement<String> value) {
        this.lineName = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlatform(JAXBElement<String> value) {
        this.platform = value;
    }

    /**
     * Gets the value of the timeMark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeMark() {
        return timeMark;
    }

    /**
     * Sets the value of the timeMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeMark(JAXBElement<String> value) {
        this.timeMark = value;
    }

}
