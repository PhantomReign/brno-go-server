
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrafficStateResp.Entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficStateResp.Entry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarNum" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="DelayInMins" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FinalStopID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="IsBarrierLess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastPostID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="LastStopID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="LineID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RouteID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficStateResp.Entry", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "carNum",
    "delayInMins",
    "departureDT",
    "finalStopID",
    "isBarrierLess",
    "lastPostID",
    "lastStopID",
    "latitude",
    "lineID",
    "longitude",
    "routeID",
    "state"
})
public class TrafficStateRespEntry {

    @XmlElement(name = "CarNum")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer carNum;
    @XmlElement(name = "DelayInMins")
    protected Short delayInMins;
    @XmlElement(name = "DepartureDT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDT;
    @XmlElement(name = "FinalStopID")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer finalStopID;
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
    @XmlElement(name = "LineID")
    @XmlSchemaType(name = "unsignedInt")
    protected Long lineID;
    @XmlElement(name = "Longitude")
    protected Float longitude;
    @XmlElement(name = "RouteID")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer routeID;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "unsignedByte")
    protected Short state;

    /**
     * Gets the value of the carNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarNum() {
        return carNum;
    }

    /**
     * Sets the value of the carNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarNum(Integer value) {
        this.carNum = value;
    }

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
     * Gets the value of the departureDT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDT() {
        return departureDT;
    }

    /**
     * Sets the value of the departureDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDT(XMLGregorianCalendar value) {
        this.departureDT = value;
    }

    /**
     * Gets the value of the finalStopID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinalStopID() {
        return finalStopID;
    }

    /**
     * Sets the value of the finalStopID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinalStopID(Integer value) {
        this.finalStopID = value;
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
     * Gets the value of the lineID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineID() {
        return lineID;
    }

    /**
     * Sets the value of the lineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineID(Long value) {
        this.lineID = value;
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

    /**
     * Gets the value of the routeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouteID() {
        return routeID;
    }

    /**
     * Sets the value of the routeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteID(Integer value) {
        this.routeID = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setState(Short value) {
        this.state = value;
    }

}
