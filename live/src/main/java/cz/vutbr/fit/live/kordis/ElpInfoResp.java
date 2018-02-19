
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElpInfoResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElpInfoResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveScenario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveScenarioData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayInfo" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}ArrayOfElpRowData" minOccurs="0"/&gt;
 *         &lt;element name="GPSLatitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="GPSLongitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsInPhonic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PanelID" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="PanelNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PanelRCA" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="StopIdList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfunsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElpInfoResp", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "activeScenario",
    "activeScenarioData",
    "activeText",
    "displayInfo",
    "gpsLatitude",
    "gpsLongitude",
    "isActive",
    "isInPhonic",
    "panelID",
    "panelNote",
    "panelRCA",
    "stopIdList"
})
public class ElpInfoResp {

    @XmlElementRef(name = "ActiveScenario", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeScenario;
    @XmlElementRef(name = "ActiveScenarioData", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeScenarioData;
    @XmlElementRef(name = "ActiveText", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeText;
    @XmlElementRef(name = "DisplayInfo", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfElpRowData> displayInfo;
    @XmlElement(name = "GPSLatitude")
    protected Float gpsLatitude;
    @XmlElement(name = "GPSLongitude")
    protected Float gpsLongitude;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IsInPhonic")
    protected Boolean isInPhonic;
    @XmlElement(name = "PanelID")
    protected Short panelID;
    @XmlElementRef(name = "PanelNote", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> panelNote;
    @XmlElement(name = "PanelRCA")
    protected Short panelRCA;
    @XmlElementRef(name = "StopIdList", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfunsignedInt> stopIdList;

    /**
     * Gets the value of the activeScenario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveScenario() {
        return activeScenario;
    }

    /**
     * Sets the value of the activeScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveScenario(JAXBElement<String> value) {
        this.activeScenario = value;
    }

    /**
     * Gets the value of the activeScenarioData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveScenarioData() {
        return activeScenarioData;
    }

    /**
     * Sets the value of the activeScenarioData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveScenarioData(JAXBElement<String> value) {
        this.activeScenarioData = value;
    }

    /**
     * Gets the value of the activeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveText() {
        return activeText;
    }

    /**
     * Sets the value of the activeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveText(JAXBElement<String> value) {
        this.activeText = value;
    }

    /**
     * Gets the value of the displayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfElpRowData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfElpRowData> getDisplayInfo() {
        return displayInfo;
    }

    /**
     * Sets the value of the displayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfElpRowData }{@code >}
     *     
     */
    public void setDisplayInfo(JAXBElement<ArrayOfElpRowData> value) {
        this.displayInfo = value;
    }

    /**
     * Gets the value of the gpsLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGPSLatitude() {
        return gpsLatitude;
    }

    /**
     * Sets the value of the gpsLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGPSLatitude(Float value) {
        this.gpsLatitude = value;
    }

    /**
     * Gets the value of the gpsLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGPSLongitude() {
        return gpsLongitude;
    }

    /**
     * Sets the value of the gpsLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGPSLongitude(Float value) {
        this.gpsLongitude = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isInPhonic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInPhonic() {
        return isInPhonic;
    }

    /**
     * Sets the value of the isInPhonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInPhonic(Boolean value) {
        this.isInPhonic = value;
    }

    /**
     * Gets the value of the panelID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPanelID() {
        return panelID;
    }

    /**
     * Sets the value of the panelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPanelID(Short value) {
        this.panelID = value;
    }

    /**
     * Gets the value of the panelNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPanelNote() {
        return panelNote;
    }

    /**
     * Sets the value of the panelNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPanelNote(JAXBElement<String> value) {
        this.panelNote = value;
    }

    /**
     * Gets the value of the panelRCA property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPanelRCA() {
        return panelRCA;
    }

    /**
     * Sets the value of the panelRCA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPanelRCA(Short value) {
        this.panelRCA = value;
    }

    /**
     * Gets the value of the stopIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     *     
     */
    public JAXBElement<ArrayOfunsignedInt> getStopIdList() {
        return stopIdList;
    }

    /**
     * Sets the value of the stopIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     *     
     */
    public void setStopIdList(JAXBElement<ArrayOfunsignedInt> value) {
        this.stopIdList = value;
    }

}
