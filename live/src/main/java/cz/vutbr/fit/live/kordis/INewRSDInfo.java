
package cz.vutbr.fit.live.kordis;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "INewRSDInfo", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface INewRSDInfo {


    /**
     * 
     * @param xmlMessage
     * @return
     *     returns cz.vutbr.fit.kordis.NewRSDInfoResp
     */
    @WebMethod(operationName = "AddNewRSDInfo", action = "http://tempuri.org/INewRSDInfo/AddNewRSDInfo")
    @WebResult(name = "AddNewRSDInfoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddNewRSDInfo", targetNamespace = "http://tempuri.org/", className = "cz.vutbr.fit.kordis.AddNewRSDInfo")
    @ResponseWrapper(localName = "AddNewRSDInfoResponse", targetNamespace = "http://tempuri.org/", className = "cz.vutbr.fit.kordis.AddNewRSDInfoResponse")
    public NewRSDInfoResp addNewRSDInfo(
        @WebParam(name = "xmlMessage", targetNamespace = "http://tempuri.org/")
        String xmlMessage);

}