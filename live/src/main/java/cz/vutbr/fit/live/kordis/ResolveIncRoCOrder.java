
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="action" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}WebRoCOrderMsgServerSink.EAction" minOccurs="0"/&gt;
 *         &lt;element name="ticketID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="lineNum" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="routeID" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="statinID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "action",
    "ticketID",
    "lineNum",
    "routeID",
    "statinID",
    "date"
})
@XmlRootElement(name = "ResolveIncRoCOrder")
public class ResolveIncRoCOrder {

    @XmlSchemaType(name = "string")
    protected WebRoCOrderMsgServerSinkEAction action;
    @XmlSchemaType(name = "unsignedInt")
    protected Long ticketID;
    @XmlSchemaType(name = "unsignedInt")
    protected Long lineNum;
    protected Short routeID;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer statinID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link WebRoCOrderMsgServerSinkEAction }
     *     
     */
    public WebRoCOrderMsgServerSinkEAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRoCOrderMsgServerSinkEAction }
     *     
     */
    public void setAction(WebRoCOrderMsgServerSinkEAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the ticketID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTicketID() {
        return ticketID;
    }

    /**
     * Sets the value of the ticketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTicketID(Long value) {
        this.ticketID = value;
    }

    /**
     * Gets the value of the lineNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineNum() {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineNum(Long value) {
        this.lineNum = value;
    }

    /**
     * Gets the value of the routeID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRouteID() {
        return routeID;
    }

    /**
     * Sets the value of the routeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRouteID(Short value) {
        this.routeID = value;
    }

    /**
     * Gets the value of the statinID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatinID() {
        return statinID;
    }

    /**
     * Sets the value of the statinID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatinID(Integer value) {
        this.statinID = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
