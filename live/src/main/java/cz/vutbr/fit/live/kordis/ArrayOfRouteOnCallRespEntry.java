
package cz.vutbr.fit.live.kordis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRouteOnCallResp.Entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouteOnCallResp.Entry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteOnCallResp.Entry" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}RouteOnCallResp.Entry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouteOnCallResp.Entry", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "routeOnCallRespEntry"
})
public class ArrayOfRouteOnCallRespEntry {

    @XmlElement(name = "RouteOnCallResp.Entry", nillable = true)
    protected List<RouteOnCallRespEntry> routeOnCallRespEntry;

    /**
     * Gets the value of the routeOnCallRespEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeOnCallRespEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteOnCallRespEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteOnCallRespEntry }
     * 
     * 
     */
    public List<RouteOnCallRespEntry> getRouteOnCallRespEntry() {
        if (routeOnCallRespEntry == null) {
            routeOnCallRespEntry = new ArrayList<RouteOnCallRespEntry>();
        }
        return this.routeOnCallRespEntry;
    }

}
