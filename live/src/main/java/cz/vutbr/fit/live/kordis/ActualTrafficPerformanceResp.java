
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActualTrafficPerformanceResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActualTrafficPerformanceResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MHDDelayedVhcPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TotalDelayedVhcPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TrainDelayedVhcPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="VLDDelayedVhcPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualTrafficPerformanceResp", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "mhdDelayedVhcPercent",
    "totalDelayedVhcPercent",
    "trainDelayedVhcPercent",
    "vldDelayedVhcPercent"
})
public class ActualTrafficPerformanceResp {

    @XmlElement(name = "MHDDelayedVhcPercent")
    protected Float mhdDelayedVhcPercent;
    @XmlElement(name = "TotalDelayedVhcPercent")
    protected Float totalDelayedVhcPercent;
    @XmlElement(name = "TrainDelayedVhcPercent")
    protected Float trainDelayedVhcPercent;
    @XmlElement(name = "VLDDelayedVhcPercent")
    protected Float vldDelayedVhcPercent;

    /**
     * Gets the value of the mhdDelayedVhcPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMHDDelayedVhcPercent() {
        return mhdDelayedVhcPercent;
    }

    /**
     * Sets the value of the mhdDelayedVhcPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMHDDelayedVhcPercent(Float value) {
        this.mhdDelayedVhcPercent = value;
    }

    /**
     * Gets the value of the totalDelayedVhcPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalDelayedVhcPercent() {
        return totalDelayedVhcPercent;
    }

    /**
     * Sets the value of the totalDelayedVhcPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalDelayedVhcPercent(Float value) {
        this.totalDelayedVhcPercent = value;
    }

    /**
     * Gets the value of the trainDelayedVhcPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTrainDelayedVhcPercent() {
        return trainDelayedVhcPercent;
    }

    /**
     * Sets the value of the trainDelayedVhcPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTrainDelayedVhcPercent(Float value) {
        this.trainDelayedVhcPercent = value;
    }

    /**
     * Gets the value of the vldDelayedVhcPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVLDDelayedVhcPercent() {
        return vldDelayedVhcPercent;
    }

    /**
     * Sets the value of the vldDelayedVhcPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVLDDelayedVhcPercent(Float value) {
        this.vldDelayedVhcPercent = value;
    }

}
