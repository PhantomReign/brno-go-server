
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineRouteDelayResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineRouteDelayResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DelayInMins" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="FoundRouteLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsBarrierLess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastPostID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="LastStopID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineRouteDelayResp", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "delayInMins",
    "foundRouteLine",
    "isBarrierLess",
    "lastPostID",
    "lastStopID",
    "latitude",
    "longitude"
})
public class LineRouteDelayResp {

    @XmlElement(name = "DelayInMins")
    protected Short delayInMins;
    @XmlElement(name = "FoundRouteLine")
    protected Boolean foundRouteLine;
    @XmlElement(name = "IsBarrierLess")
    protected Boolean isBarrierLess;
    @XmlElement(name = "LastPostID")
    @XmlSchemaType(name = "unsignedByte")
    protected Short lastPostID;
    @XmlElement(name = "LastStopID")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer lastStopID;
    @XmlElement(name = "Latitude")
    protected Float latitude;
    @XmlElement(name = "Longitude")
    protected Float longitude;

    /**
     * Gets the value of the delayInMins property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDelayInMins() {
        return delayInMins;
    }

    /**
     * Sets the value of the delayInMins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDelayInMins(Short value) {
        this.delayInMins = value;
    }

    /**
     * Gets the value of the foundRouteLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFoundRouteLine() {
        return foundRouteLine;
    }

    /**
     * Sets the value of the foundRouteLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFoundRouteLine(Boolean value) {
        this.foundRouteLine = value;
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
     * Gets the value of the lastPostID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLastPostID() {
        return lastPostID;
    }

    /**
     * Sets the value of the lastPostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLastPostID(Short value) {
        this.lastPostID = value;
    }

    /**
     * Gets the value of the lastStopID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastStopID() {
        return lastStopID;
    }

    /**
     * Sets the value of the lastStopID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastStopID(Integer value) {
        this.lastStopID = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLatitude(Float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLongitude(Float value) {
        this.longitude = value;
    }

}
