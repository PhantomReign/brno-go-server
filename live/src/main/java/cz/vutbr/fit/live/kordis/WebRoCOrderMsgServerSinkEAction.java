
package cz.vutbr.fit.live.kordis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebRoCOrderMsgServerSink.EAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebRoCOrderMsgServerSink.EAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OrderStop"/&gt;
 *     &lt;enumeration value="OrderAllStops"/&gt;
 *     &lt;enumeration value="Storno"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WebRoCOrderMsgServerSink.EAction", namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices")
@XmlEnum
public enum WebRoCOrderMsgServerSinkEAction {

    @XmlEnumValue("OrderStop")
    ORDER_STOP("OrderStop"),
    @XmlEnumValue("OrderAllStops")
    ORDER_ALL_STOPS("OrderAllStops"),
    @XmlEnumValue("Storno")
    STORNO("Storno");
    private final String value;

    WebRoCOrderMsgServerSinkEAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebRoCOrderMsgServerSinkEAction fromValue(String v) {
        for (WebRoCOrderMsgServerSinkEAction c: WebRoCOrderMsgServerSinkEAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
