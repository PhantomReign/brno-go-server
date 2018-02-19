
package cz.vutbr.fit.live.kordis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNearDeparturesWithPostsResp.Entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNearDeparturesWithPostsResp.Entry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NearDeparturesWithPostsResp.Entry" type="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}NearDeparturesWithPostsResp.Entry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNearDeparturesWithPostsResp.Entry", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "nearDeparturesWithPostsRespEntry"
})
public class ArrayOfNearDeparturesWithPostsRespEntry {

    @XmlElement(name = "NearDeparturesWithPostsResp.Entry", nillable = true)
    protected List<NearDeparturesWithPostsRespEntry> nearDeparturesWithPostsRespEntry;

    /**
     * Gets the value of the nearDeparturesWithPostsRespEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nearDeparturesWithPostsRespEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNearDeparturesWithPostsRespEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NearDeparturesWithPostsRespEntry }
     * 
     * 
     */
    public List<NearDeparturesWithPostsRespEntry> getNearDeparturesWithPostsRespEntry() {
        if (nearDeparturesWithPostsRespEntry == null) {
            nearDeparturesWithPostsRespEntry = new ArrayList<NearDeparturesWithPostsRespEntry>();
        }
        return this.nearDeparturesWithPostsRespEntry;
    }

}
