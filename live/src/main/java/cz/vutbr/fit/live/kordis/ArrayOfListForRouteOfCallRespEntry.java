
package cz.vutbr.fit.live.kordis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfListForRouteOfCallResp.Entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfListForRouteOfCallResp.Entry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListForRouteOfCallResp.Entry" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}ListForRouteOfCallResp.Entry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfListForRouteOfCallResp.Entry", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "listForRouteOfCallRespEntry"
})
public class ArrayOfListForRouteOfCallRespEntry {

    @XmlElement(name = "ListForRouteOfCallResp.Entry", nillable = true)
    protected List<ListForRouteOfCallRespEntry> listForRouteOfCallRespEntry;

    /**
     * Gets the value of the listForRouteOfCallRespEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listForRouteOfCallRespEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListForRouteOfCallRespEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListForRouteOfCallRespEntry }
     * 
     * 
     */
    public List<ListForRouteOfCallRespEntry> getListForRouteOfCallRespEntry() {
        if (listForRouteOfCallRespEntry == null) {
            listForRouteOfCallRespEntry = new ArrayList<ListForRouteOfCallRespEntry>();
        }
        return this.listForRouteOfCallRespEntry;
    }

}
