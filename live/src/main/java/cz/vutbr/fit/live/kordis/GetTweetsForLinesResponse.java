
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetTweetsForLinesResult" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}ArrayOfTweetsOnLinesResp" minOccurs="0"/&gt;
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
    "getTweetsForLinesResult"
})
@XmlRootElement(name = "GetTweetsForLinesResponse")
public class GetTweetsForLinesResponse {

    @XmlElementRef(name = "GetTweetsForLinesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTweetsOnLinesResp> getTweetsForLinesResult;

    /**
     * Gets the value of the getTweetsForLinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTweetsOnLinesResp }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTweetsOnLinesResp> getGetTweetsForLinesResult() {
        return getTweetsForLinesResult;
    }

    /**
     * Sets the value of the getTweetsForLinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTweetsOnLinesResp }{@code >}
     *     
     */
    public void setGetTweetsForLinesResult(JAXBElement<ArrayOfTweetsOnLinesResp> value) {
        this.getTweetsForLinesResult = value;
    }

}
