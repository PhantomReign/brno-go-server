
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NearDeparturesWithPostsResp.Entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NearDeparturesWithPostsResp.Entry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Solution.Common.WebServices}NearDeparturesResp.Entry"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NearDeparturesWithPostsResp.Entry", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", propOrder = {
    "postID"
})
public class NearDeparturesWithPostsRespEntry
    extends NearDeparturesRespEntry
{

    @XmlElement(name = "PostID")
    @XmlSchemaType(name = "unsignedByte")
    protected Short postID;

    /**
     * Gets the value of the postID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPostID() {
        return postID;
    }

    /**
     * Sets the value of the postID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPostID(Short value) {
        this.postID = value;
    }

}
