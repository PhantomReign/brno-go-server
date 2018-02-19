
package cz.vutbr.fit.live.kordis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTweetsOnLinesResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTweetsOnLinesResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TweetsOnLinesResp" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}TweetsOnLinesResp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTweetsOnLinesResp", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "tweetsOnLinesResp"
})
public class ArrayOfTweetsOnLinesResp {

    @XmlElement(name = "TweetsOnLinesResp", nillable = true)
    protected List<TweetsOnLinesResp> tweetsOnLinesResp;

    /**
     * Gets the value of the tweetsOnLinesResp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tweetsOnLinesResp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTweetsOnLinesResp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TweetsOnLinesResp }
     * 
     * 
     */
    public List<TweetsOnLinesResp> getTweetsOnLinesResp() {
        if (tweetsOnLinesResp == null) {
            tweetsOnLinesResp = new ArrayList<TweetsOnLinesResp>();
        }
        return this.tweetsOnLinesResp;
    }

}
