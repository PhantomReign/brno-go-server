
package cz.vutbr.fit.live.kordis;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.vutbr.fit.kordis package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NearDeparturesResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "NearDeparturesResp");
    private final static QName _ArrayOfNearDeparturesRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ArrayOfNearDeparturesResp.Entry");
    private final static QName _NearDeparturesRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "NearDeparturesResp.Entry");
    private final static QName _NearDeparturesWithPostsResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "NearDeparturesWithPostsResp");
    private final static QName _ArrayOfNearDeparturesWithPostsRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ArrayOfNearDeparturesWithPostsResp.Entry");
    private final static QName _NearDeparturesWithPostsRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "NearDeparturesWithPostsResp.Entry");
    private final static QName _WebRoCOrderMsgServerSinkEAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "WebRoCOrderMsgServerSink.EAction");
    private final static QName _RouteOnCallResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "RouteOnCallResp");
    private final static QName _ArrayOfRouteOnCallRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ArrayOfRouteOnCallResp.Entry");
    private final static QName _RouteOnCallRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "RouteOnCallResp.Entry");
    private final static QName _ListForRouteOfCallResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ListForRouteOfCallResp");
    private final static QName _ArrayOfListForRouteOfCallRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ArrayOfListForRouteOfCallResp.Entry");
    private final static QName _ListForRouteOfCallRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ListForRouteOfCallResp.Entry");
    private final static QName _LineRouteDelayResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "LineRouteDelayResp");
    private final static QName _TrafficStateResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "TrafficStateResp");
    private final static QName _ArrayOfTrafficStateRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ArrayOfTrafficStateResp.Entry");
    private final static QName _TrafficStateRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "TrafficStateResp.Entry");
    private final static QName _ActualTrafficPerformanceResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ActualTrafficPerformanceResp");
    private final static QName _NewRSDInfoResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "NewRSDInfoResp");
    private final static QName _ArrayOfNewRSDInfoRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ArrayOfNewRSDInfoResp.Entry");
    private final static QName _NewRSDInfoRespEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "NewRSDInfoResp.Entry");
    private final static QName _StopInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "StopInfoResponse");
    private final static QName _ArrayOfElpInfoResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ArrayOfElpInfoResp");
    private final static QName _ElpInfoResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ElpInfoResp");
    private final static QName _ArrayOfElpRowData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ArrayOfElpRowData");
    private final static QName _ElpRowData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ElpRowData");
    private final static QName _ArrayOfTweetsOnLinesResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ArrayOfTweetsOnLinesResp");
    private final static QName _TweetsOnLinesResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "TweetsOnLinesResp");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfunsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfunsignedInt");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _GetNearDeparturesResponseGetNearDeparturesResult_QNAME = new QName("http://tempuri.org/", "GetNearDeparturesResult");
    private final static QName _GetNearDeparturesWithCountResponseGetNearDeparturesWithCountResult_QNAME = new QName("http://tempuri.org/", "GetNearDeparturesWithCountResult");
    private final static QName _GetNearDeparturesByTimeResponseGetNearDeparturesByTimeResult_QNAME = new QName("http://tempuri.org/", "GetNearDeparturesByTimeResult");
    private final static QName _GetNearDeparturesByTimeWithCountResponseGetNearDeparturesByTimeWithCountResult_QNAME = new QName("http://tempuri.org/", "GetNearDeparturesByTimeWithCountResult");
    private final static QName _GetNearDeparturesAcrossPostsResponseGetNearDeparturesAcrossPostsResult_QNAME = new QName("http://tempuri.org/", "GetNearDeparturesAcrossPostsResult");
    private final static QName _ResolveIncRoCOrderResponseResolveIncRoCOrderResult_QNAME = new QName("http://tempuri.org/", "ResolveIncRoCOrderResult");
    private final static QName _ResolveIncRoCStornoResponseResolveIncRoCStornoResult_QNAME = new QName("http://tempuri.org/", "ResolveIncRoCStornoResult");
    private final static QName _GetListForRouteOfCallDate_QNAME = new QName("http://tempuri.org/", "date");
    private final static QName _GetListForRouteOfCallResponseGetListForRouteOfCallResult_QNAME = new QName("http://tempuri.org/", "GetListForRouteOfCallResult");
    private final static QName _GetLineRouteDelayResponseGetLineRouteDelayResult_QNAME = new QName("http://tempuri.org/", "GetLineRouteDelayResult");
    private final static QName _GetTrafficStateResponseGetTrafficStateResult_QNAME = new QName("http://tempuri.org/", "GetTrafficStateResult");
    private final static QName _GetTrafficStateVLDBusWoServiceResponseGetTrafficStateVLDBusWoServiceResult_QNAME = new QName("http://tempuri.org/", "GetTrafficStateVLDBusWoServiceResult");
    private final static QName _GetTrafficStateDPMBWoServiceResponseGetTrafficStateDPMBWoServiceResult_QNAME = new QName("http://tempuri.org/", "GetTrafficStateDPMBWoServiceResult");
    private final static QName _GetActualTrafficPerformanceResponseGetActualTrafficPerformanceResult_QNAME = new QName("http://tempuri.org/", "GetActualTrafficPerformanceResult");
    private final static QName _AddNewRSDInfoXmlMessage_QNAME = new QName("http://tempuri.org/", "xmlMessage");
    private final static QName _AddNewRSDInfoResponseAddNewRSDInfoResult_QNAME = new QName("http://tempuri.org/", "AddNewRSDInfoResult");
    private final static QName _GetStopInfoResponseGetStopInfoResult_QNAME = new QName("http://tempuri.org/", "GetStopInfoResult");
    private final static QName _GetPanelsInfoResponseGetPanelsInfoResult_QNAME = new QName("http://tempuri.org/", "GetPanelsInfoResult");
    private final static QName _GetTweetsResponseGetTweetsResult_QNAME = new QName("http://tempuri.org/", "GetTweetsResult");
    private final static QName _GetTweetsForLinesLinesL_QNAME = new QName("http://tempuri.org/", "linesL");
    private final static QName _GetTweetsForLinesResponseGetTweetsForLinesResult_QNAME = new QName("http://tempuri.org/", "GetTweetsForLinesResult");
    private final static QName _TweetsOnLinesRespLinesL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "LinesL");
    private final static QName _TweetsOnLinesRespTweet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Tweet");
    private final static QName _ElpRowDataDeparture_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Departure");
    private final static QName _ElpRowDataDirection_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Direction");
    private final static QName _ElpRowDataLine_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Line");
    private final static QName _ElpRowDataPlatform_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Platform");
    private final static QName _ElpRowDataSign_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Sign");
    private final static QName _ElpInfoRespActiveScenario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ActiveScenario");
    private final static QName _ElpInfoRespActiveScenarioData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ActiveScenarioData");
    private final static QName _ElpInfoRespActiveText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "ActiveText");
    private final static QName _ElpInfoRespDisplayInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "DisplayInfo");
    private final static QName _ElpInfoRespPanelNote_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "PanelNote");
    private final static QName _ElpInfoRespStopIdList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "StopIdList");
    private final static QName _ListForRouteOfCallRespEntryDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Destination");
    private final static QName _ListForRouteOfCallRespEntryFullDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "FullDate");
    private final static QName _ListForRouteOfCallRespEntryLineName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "LineName");
    private final static QName _ListForRouteOfCallRespEntryRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Route");
    private final static QName _ListForRouteOfCallRespEntryStationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "StationID");
    private final static QName _ListForRouteOfCallRespEntryStationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "StationName");
    private final static QName _RouteOnCallRespEntryAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Action");
    private final static QName _RouteOnCallRespEntryNote_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Note");
    private final static QName _RouteOnCallRespEntryRouteName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "RouteName");
    private final static QName _RouteOnCallRespEntryStation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Station");
    private final static QName _RouteOnCallRespEntryTicketIDName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "TicketIDName");
    private final static QName _RouteOnCallRespEntryTimeMark_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "TimeMark");
    private final static QName _NearDeparturesRespEntryDriveOrderSign_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "DriveOrderSign");
    private final static QName _NearDeparturesRespEntryFinalStation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "FinalStation");
    private final static QName _StopInfoResponseStopName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "StopName");
    private final static QName _NewRSDInfoRespNRSDIL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "NRSDIL");
    private final static QName _TrafficStateRespVehicleL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "VehicleL");
    private final static QName _ListForRouteOfCallRespDeparturesL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "DeparturesL");
    private final static QName _RouteOnCallRespError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "Error");
    private final static QName _RouteOnCallRespRoCL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "RoCL");
    private final static QName _NearDeparturesWithPostsRespInfoTextSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", "InfoTextSet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.vutbr.fit.kordis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNearDepartures }
     * 
     */
    public GetNearDepartures createGetNearDepartures() {
        return new GetNearDepartures();
    }

    /**
     * Create an instance of {@link GetNearDeparturesResponse }
     * 
     */
    public GetNearDeparturesResponse createGetNearDeparturesResponse() {
        return new GetNearDeparturesResponse();
    }

    /**
     * Create an instance of {@link NearDeparturesResp }
     * 
     */
    public NearDeparturesResp createNearDeparturesResp() {
        return new NearDeparturesResp();
    }

    /**
     * Create an instance of {@link GetNearDeparturesWithCount }
     * 
     */
    public GetNearDeparturesWithCount createGetNearDeparturesWithCount() {
        return new GetNearDeparturesWithCount();
    }

    /**
     * Create an instance of {@link GetNearDeparturesWithCountResponse }
     * 
     */
    public GetNearDeparturesWithCountResponse createGetNearDeparturesWithCountResponse() {
        return new GetNearDeparturesWithCountResponse();
    }

    /**
     * Create an instance of {@link GetNearDeparturesByTime }
     * 
     */
    public GetNearDeparturesByTime createGetNearDeparturesByTime() {
        return new GetNearDeparturesByTime();
    }

    /**
     * Create an instance of {@link GetNearDeparturesByTimeResponse }
     * 
     */
    public GetNearDeparturesByTimeResponse createGetNearDeparturesByTimeResponse() {
        return new GetNearDeparturesByTimeResponse();
    }

    /**
     * Create an instance of {@link GetNearDeparturesByTimeWithCount }
     * 
     */
    public GetNearDeparturesByTimeWithCount createGetNearDeparturesByTimeWithCount() {
        return new GetNearDeparturesByTimeWithCount();
    }

    /**
     * Create an instance of {@link GetNearDeparturesByTimeWithCountResponse }
     * 
     */
    public GetNearDeparturesByTimeWithCountResponse createGetNearDeparturesByTimeWithCountResponse() {
        return new GetNearDeparturesByTimeWithCountResponse();
    }

    /**
     * Create an instance of {@link GetNearDeparturesAcrossPosts }
     * 
     */
    public GetNearDeparturesAcrossPosts createGetNearDeparturesAcrossPosts() {
        return new GetNearDeparturesAcrossPosts();
    }

    /**
     * Create an instance of {@link GetNearDeparturesAcrossPostsResponse }
     * 
     */
    public GetNearDeparturesAcrossPostsResponse createGetNearDeparturesAcrossPostsResponse() {
        return new GetNearDeparturesAcrossPostsResponse();
    }

    /**
     * Create an instance of {@link NearDeparturesWithPostsResp }
     * 
     */
    public NearDeparturesWithPostsResp createNearDeparturesWithPostsResp() {
        return new NearDeparturesWithPostsResp();
    }

    /**
     * Create an instance of {@link ResolveIncRoCOrder }
     * 
     */
    public ResolveIncRoCOrder createResolveIncRoCOrder() {
        return new ResolveIncRoCOrder();
    }

    /**
     * Create an instance of {@link ResolveIncRoCOrderResponse }
     * 
     */
    public ResolveIncRoCOrderResponse createResolveIncRoCOrderResponse() {
        return new ResolveIncRoCOrderResponse();
    }

    /**
     * Create an instance of {@link RouteOnCallResp }
     * 
     */
    public RouteOnCallResp createRouteOnCallResp() {
        return new RouteOnCallResp();
    }

    /**
     * Create an instance of {@link ResolveIncRoCStorno }
     * 
     */
    public ResolveIncRoCStorno createResolveIncRoCStorno() {
        return new ResolveIncRoCStorno();
    }

    /**
     * Create an instance of {@link ResolveIncRoCStornoResponse }
     * 
     */
    public ResolveIncRoCStornoResponse createResolveIncRoCStornoResponse() {
        return new ResolveIncRoCStornoResponse();
    }

    /**
     * Create an instance of {@link GetListForRouteOfCall }
     * 
     */
    public GetListForRouteOfCall createGetListForRouteOfCall() {
        return new GetListForRouteOfCall();
    }

    /**
     * Create an instance of {@link GetListForRouteOfCallResponse }
     * 
     */
    public GetListForRouteOfCallResponse createGetListForRouteOfCallResponse() {
        return new GetListForRouteOfCallResponse();
    }

    /**
     * Create an instance of {@link ListForRouteOfCallResp }
     * 
     */
    public ListForRouteOfCallResp createListForRouteOfCallResp() {
        return new ListForRouteOfCallResp();
    }

    /**
     * Create an instance of {@link GetLineRouteDelay }
     * 
     */
    public GetLineRouteDelay createGetLineRouteDelay() {
        return new GetLineRouteDelay();
    }

    /**
     * Create an instance of {@link GetLineRouteDelayResponse }
     * 
     */
    public GetLineRouteDelayResponse createGetLineRouteDelayResponse() {
        return new GetLineRouteDelayResponse();
    }

    /**
     * Create an instance of {@link LineRouteDelayResp }
     * 
     */
    public LineRouteDelayResp createLineRouteDelayResp() {
        return new LineRouteDelayResp();
    }

    /**
     * Create an instance of {@link GetTrafficState }
     * 
     */
    public GetTrafficState createGetTrafficState() {
        return new GetTrafficState();
    }

    /**
     * Create an instance of {@link GetTrafficStateResponse }
     * 
     */
    public GetTrafficStateResponse createGetTrafficStateResponse() {
        return new GetTrafficStateResponse();
    }

    /**
     * Create an instance of {@link TrafficStateResp }
     * 
     */
    public TrafficStateResp createTrafficStateResp() {
        return new TrafficStateResp();
    }

    /**
     * Create an instance of {@link GetTrafficStateVLDBusWoService }
     * 
     */
    public GetTrafficStateVLDBusWoService createGetTrafficStateVLDBusWoService() {
        return new GetTrafficStateVLDBusWoService();
    }

    /**
     * Create an instance of {@link GetTrafficStateVLDBusWoServiceResponse }
     * 
     */
    public GetTrafficStateVLDBusWoServiceResponse createGetTrafficStateVLDBusWoServiceResponse() {
        return new GetTrafficStateVLDBusWoServiceResponse();
    }

    /**
     * Create an instance of {@link GetTrafficStateDPMBWoService }
     * 
     */
    public GetTrafficStateDPMBWoService createGetTrafficStateDPMBWoService() {
        return new GetTrafficStateDPMBWoService();
    }

    /**
     * Create an instance of {@link GetTrafficStateDPMBWoServiceResponse }
     * 
     */
    public GetTrafficStateDPMBWoServiceResponse createGetTrafficStateDPMBWoServiceResponse() {
        return new GetTrafficStateDPMBWoServiceResponse();
    }

    /**
     * Create an instance of {@link GetActualTrafficPerformance }
     * 
     */
    public GetActualTrafficPerformance createGetActualTrafficPerformance() {
        return new GetActualTrafficPerformance();
    }

    /**
     * Create an instance of {@link GetActualTrafficPerformanceResponse }
     * 
     */
    public GetActualTrafficPerformanceResponse createGetActualTrafficPerformanceResponse() {
        return new GetActualTrafficPerformanceResponse();
    }

    /**
     * Create an instance of {@link ActualTrafficPerformanceResp }
     * 
     */
    public ActualTrafficPerformanceResp createActualTrafficPerformanceResp() {
        return new ActualTrafficPerformanceResp();
    }

    /**
     * Create an instance of {@link AddNewRSDInfo }
     * 
     */
    public AddNewRSDInfo createAddNewRSDInfo() {
        return new AddNewRSDInfo();
    }

    /**
     * Create an instance of {@link AddNewRSDInfoResponse }
     * 
     */
    public AddNewRSDInfoResponse createAddNewRSDInfoResponse() {
        return new AddNewRSDInfoResponse();
    }

    /**
     * Create an instance of {@link NewRSDInfoResp }
     * 
     */
    public NewRSDInfoResp createNewRSDInfoResp() {
        return new NewRSDInfoResp();
    }

    /**
     * Create an instance of {@link GetStopInfo }
     * 
     */
    public GetStopInfo createGetStopInfo() {
        return new GetStopInfo();
    }

    /**
     * Create an instance of {@link GetStopInfoResponse }
     * 
     */
    public GetStopInfoResponse createGetStopInfoResponse() {
        return new GetStopInfoResponse();
    }

    /**
     * Create an instance of {@link StopInfoResponse }
     * 
     */
    public StopInfoResponse createStopInfoResponse() {
        return new StopInfoResponse();
    }

    /**
     * Create an instance of {@link GetPanelsInfo }
     * 
     */
    public GetPanelsInfo createGetPanelsInfo() {
        return new GetPanelsInfo();
    }

    /**
     * Create an instance of {@link GetPanelsInfoResponse }
     * 
     */
    public GetPanelsInfoResponse createGetPanelsInfoResponse() {
        return new GetPanelsInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfElpInfoResp }
     * 
     */
    public ArrayOfElpInfoResp createArrayOfElpInfoResp() {
        return new ArrayOfElpInfoResp();
    }

    /**
     * Create an instance of {@link GetTweets }
     * 
     */
    public GetTweets createGetTweets() {
        return new GetTweets();
    }

    /**
     * Create an instance of {@link GetTweetsResponse }
     * 
     */
    public GetTweetsResponse createGetTweetsResponse() {
        return new GetTweetsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTweetsOnLinesResp }
     * 
     */
    public ArrayOfTweetsOnLinesResp createArrayOfTweetsOnLinesResp() {
        return new ArrayOfTweetsOnLinesResp();
    }

    /**
     * Create an instance of {@link GetTweetsForLines }
     * 
     */
    public GetTweetsForLines createGetTweetsForLines() {
        return new GetTweetsForLines();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link GetTweetsForLinesResponse }
     * 
     */
    public GetTweetsForLinesResponse createGetTweetsForLinesResponse() {
        return new GetTweetsForLinesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNearDeparturesRespEntry }
     * 
     */
    public ArrayOfNearDeparturesRespEntry createArrayOfNearDeparturesRespEntry() {
        return new ArrayOfNearDeparturesRespEntry();
    }

    /**
     * Create an instance of {@link NearDeparturesRespEntry }
     * 
     */
    public NearDeparturesRespEntry createNearDeparturesRespEntry() {
        return new NearDeparturesRespEntry();
    }

    /**
     * Create an instance of {@link ArrayOfNearDeparturesWithPostsRespEntry }
     * 
     */
    public ArrayOfNearDeparturesWithPostsRespEntry createArrayOfNearDeparturesWithPostsRespEntry() {
        return new ArrayOfNearDeparturesWithPostsRespEntry();
    }

    /**
     * Create an instance of {@link NearDeparturesWithPostsRespEntry }
     * 
     */
    public NearDeparturesWithPostsRespEntry createNearDeparturesWithPostsRespEntry() {
        return new NearDeparturesWithPostsRespEntry();
    }

    /**
     * Create an instance of {@link ArrayOfRouteOnCallRespEntry }
     * 
     */
    public ArrayOfRouteOnCallRespEntry createArrayOfRouteOnCallRespEntry() {
        return new ArrayOfRouteOnCallRespEntry();
    }

    /**
     * Create an instance of {@link RouteOnCallRespEntry }
     * 
     */
    public RouteOnCallRespEntry createRouteOnCallRespEntry() {
        return new RouteOnCallRespEntry();
    }

    /**
     * Create an instance of {@link ArrayOfListForRouteOfCallRespEntry }
     * 
     */
    public ArrayOfListForRouteOfCallRespEntry createArrayOfListForRouteOfCallRespEntry() {
        return new ArrayOfListForRouteOfCallRespEntry();
    }

    /**
     * Create an instance of {@link ListForRouteOfCallRespEntry }
     * 
     */
    public ListForRouteOfCallRespEntry createListForRouteOfCallRespEntry() {
        return new ListForRouteOfCallRespEntry();
    }

    /**
     * Create an instance of {@link ArrayOfTrafficStateRespEntry }
     * 
     */
    public ArrayOfTrafficStateRespEntry createArrayOfTrafficStateRespEntry() {
        return new ArrayOfTrafficStateRespEntry();
    }

    /**
     * Create an instance of {@link TrafficStateRespEntry }
     * 
     */
    public TrafficStateRespEntry createTrafficStateRespEntry() {
        return new TrafficStateRespEntry();
    }

    /**
     * Create an instance of {@link ArrayOfNewRSDInfoRespEntry }
     * 
     */
    public ArrayOfNewRSDInfoRespEntry createArrayOfNewRSDInfoRespEntry() {
        return new ArrayOfNewRSDInfoRespEntry();
    }

    /**
     * Create an instance of {@link NewRSDInfoRespEntry }
     * 
     */
    public NewRSDInfoRespEntry createNewRSDInfoRespEntry() {
        return new NewRSDInfoRespEntry();
    }

    /**
     * Create an instance of {@link ElpInfoResp }
     * 
     */
    public ElpInfoResp createElpInfoResp() {
        return new ElpInfoResp();
    }

    /**
     * Create an instance of {@link ArrayOfElpRowData }
     * 
     */
    public ArrayOfElpRowData createArrayOfElpRowData() {
        return new ArrayOfElpRowData();
    }

    /**
     * Create an instance of {@link ElpRowData }
     * 
     */
    public ElpRowData createElpRowData() {
        return new ElpRowData();
    }

    /**
     * Create an instance of {@link TweetsOnLinesResp }
     * 
     */
    public TweetsOnLinesResp createTweetsOnLinesResp() {
        return new TweetsOnLinesResp();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfunsignedInt }
     * 
     */
    public ArrayOfunsignedInt createArrayOfunsignedInt() {
        return new ArrayOfunsignedInt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "NearDeparturesResp")
    public JAXBElement<NearDeparturesResp> createNearDeparturesResp(NearDeparturesResp value) {
        return new JAXBElement<NearDeparturesResp>(_NearDeparturesResp_QNAME, NearDeparturesResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNearDeparturesRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNearDeparturesRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ArrayOfNearDeparturesResp.Entry")
    public JAXBElement<ArrayOfNearDeparturesRespEntry> createArrayOfNearDeparturesRespEntry(ArrayOfNearDeparturesRespEntry value) {
        return new JAXBElement<ArrayOfNearDeparturesRespEntry>(_ArrayOfNearDeparturesRespEntry_QNAME, ArrayOfNearDeparturesRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearDeparturesRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NearDeparturesRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "NearDeparturesResp.Entry")
    public JAXBElement<NearDeparturesRespEntry> createNearDeparturesRespEntry(NearDeparturesRespEntry value) {
        return new JAXBElement<NearDeparturesRespEntry>(_NearDeparturesRespEntry_QNAME, NearDeparturesRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearDeparturesWithPostsResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NearDeparturesWithPostsResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "NearDeparturesWithPostsResp")
    public JAXBElement<NearDeparturesWithPostsResp> createNearDeparturesWithPostsResp(NearDeparturesWithPostsResp value) {
        return new JAXBElement<NearDeparturesWithPostsResp>(_NearDeparturesWithPostsResp_QNAME, NearDeparturesWithPostsResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNearDeparturesWithPostsRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNearDeparturesWithPostsRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ArrayOfNearDeparturesWithPostsResp.Entry")
    public JAXBElement<ArrayOfNearDeparturesWithPostsRespEntry> createArrayOfNearDeparturesWithPostsRespEntry(ArrayOfNearDeparturesWithPostsRespEntry value) {
        return new JAXBElement<ArrayOfNearDeparturesWithPostsRespEntry>(_ArrayOfNearDeparturesWithPostsRespEntry_QNAME, ArrayOfNearDeparturesWithPostsRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearDeparturesWithPostsRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NearDeparturesWithPostsRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "NearDeparturesWithPostsResp.Entry")
    public JAXBElement<NearDeparturesWithPostsRespEntry> createNearDeparturesWithPostsRespEntry(NearDeparturesWithPostsRespEntry value) {
        return new JAXBElement<NearDeparturesWithPostsRespEntry>(_NearDeparturesWithPostsRespEntry_QNAME, NearDeparturesWithPostsRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebRoCOrderMsgServerSinkEAction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebRoCOrderMsgServerSinkEAction }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "WebRoCOrderMsgServerSink.EAction")
    public JAXBElement<WebRoCOrderMsgServerSinkEAction> createWebRoCOrderMsgServerSinkEAction(WebRoCOrderMsgServerSinkEAction value) {
        return new JAXBElement<WebRoCOrderMsgServerSinkEAction>(_WebRoCOrderMsgServerSinkEAction_QNAME, WebRoCOrderMsgServerSinkEAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteOnCallResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RouteOnCallResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "RouteOnCallResp")
    public JAXBElement<RouteOnCallResp> createRouteOnCallResp(RouteOnCallResp value) {
        return new JAXBElement<RouteOnCallResp>(_RouteOnCallResp_QNAME, RouteOnCallResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteOnCallRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteOnCallRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ArrayOfRouteOnCallResp.Entry")
    public JAXBElement<ArrayOfRouteOnCallRespEntry> createArrayOfRouteOnCallRespEntry(ArrayOfRouteOnCallRespEntry value) {
        return new JAXBElement<ArrayOfRouteOnCallRespEntry>(_ArrayOfRouteOnCallRespEntry_QNAME, ArrayOfRouteOnCallRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteOnCallRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RouteOnCallRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "RouteOnCallResp.Entry")
    public JAXBElement<RouteOnCallRespEntry> createRouteOnCallRespEntry(RouteOnCallRespEntry value) {
        return new JAXBElement<RouteOnCallRespEntry>(_RouteOnCallRespEntry_QNAME, RouteOnCallRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListForRouteOfCallResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListForRouteOfCallResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ListForRouteOfCallResp")
    public JAXBElement<ListForRouteOfCallResp> createListForRouteOfCallResp(ListForRouteOfCallResp value) {
        return new JAXBElement<ListForRouteOfCallResp>(_ListForRouteOfCallResp_QNAME, ListForRouteOfCallResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListForRouteOfCallRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListForRouteOfCallRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ArrayOfListForRouteOfCallResp.Entry")
    public JAXBElement<ArrayOfListForRouteOfCallRespEntry> createArrayOfListForRouteOfCallRespEntry(ArrayOfListForRouteOfCallRespEntry value) {
        return new JAXBElement<ArrayOfListForRouteOfCallRespEntry>(_ArrayOfListForRouteOfCallRespEntry_QNAME, ArrayOfListForRouteOfCallRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListForRouteOfCallRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListForRouteOfCallRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ListForRouteOfCallResp.Entry")
    public JAXBElement<ListForRouteOfCallRespEntry> createListForRouteOfCallRespEntry(ListForRouteOfCallRespEntry value) {
        return new JAXBElement<ListForRouteOfCallRespEntry>(_ListForRouteOfCallRespEntry_QNAME, ListForRouteOfCallRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineRouteDelayResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LineRouteDelayResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "LineRouteDelayResp")
    public JAXBElement<LineRouteDelayResp> createLineRouteDelayResp(LineRouteDelayResp value) {
        return new JAXBElement<LineRouteDelayResp>(_LineRouteDelayResp_QNAME, LineRouteDelayResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficStateResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficStateResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "TrafficStateResp")
    public JAXBElement<TrafficStateResp> createTrafficStateResp(TrafficStateResp value) {
        return new JAXBElement<TrafficStateResp>(_TrafficStateResp_QNAME, TrafficStateResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTrafficStateRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTrafficStateRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ArrayOfTrafficStateResp.Entry")
    public JAXBElement<ArrayOfTrafficStateRespEntry> createArrayOfTrafficStateRespEntry(ArrayOfTrafficStateRespEntry value) {
        return new JAXBElement<ArrayOfTrafficStateRespEntry>(_ArrayOfTrafficStateRespEntry_QNAME, ArrayOfTrafficStateRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficStateRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficStateRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "TrafficStateResp.Entry")
    public JAXBElement<TrafficStateRespEntry> createTrafficStateRespEntry(TrafficStateRespEntry value) {
        return new JAXBElement<TrafficStateRespEntry>(_TrafficStateRespEntry_QNAME, TrafficStateRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualTrafficPerformanceResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualTrafficPerformanceResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ActualTrafficPerformanceResp")
    public JAXBElement<ActualTrafficPerformanceResp> createActualTrafficPerformanceResp(ActualTrafficPerformanceResp value) {
        return new JAXBElement<ActualTrafficPerformanceResp>(_ActualTrafficPerformanceResp_QNAME, ActualTrafficPerformanceResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRSDInfoResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NewRSDInfoResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "NewRSDInfoResp")
    public JAXBElement<NewRSDInfoResp> createNewRSDInfoResp(NewRSDInfoResp value) {
        return new JAXBElement<NewRSDInfoResp>(_NewRSDInfoResp_QNAME, NewRSDInfoResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewRSDInfoRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNewRSDInfoRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ArrayOfNewRSDInfoResp.Entry")
    public JAXBElement<ArrayOfNewRSDInfoRespEntry> createArrayOfNewRSDInfoRespEntry(ArrayOfNewRSDInfoRespEntry value) {
        return new JAXBElement<ArrayOfNewRSDInfoRespEntry>(_ArrayOfNewRSDInfoRespEntry_QNAME, ArrayOfNewRSDInfoRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRSDInfoRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NewRSDInfoRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "NewRSDInfoResp.Entry")
    public JAXBElement<NewRSDInfoRespEntry> createNewRSDInfoRespEntry(NewRSDInfoRespEntry value) {
        return new JAXBElement<NewRSDInfoRespEntry>(_NewRSDInfoRespEntry_QNAME, NewRSDInfoRespEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "StopInfoResponse")
    public JAXBElement<StopInfoResponse> createStopInfoResponse(StopInfoResponse value) {
        return new JAXBElement<StopInfoResponse>(_StopInfoResponse_QNAME, StopInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElpInfoResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfElpInfoResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ArrayOfElpInfoResp")
    public JAXBElement<ArrayOfElpInfoResp> createArrayOfElpInfoResp(ArrayOfElpInfoResp value) {
        return new JAXBElement<ArrayOfElpInfoResp>(_ArrayOfElpInfoResp_QNAME, ArrayOfElpInfoResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElpInfoResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElpInfoResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ElpInfoResp")
    public JAXBElement<ElpInfoResp> createElpInfoResp(ElpInfoResp value) {
        return new JAXBElement<ElpInfoResp>(_ElpInfoResp_QNAME, ElpInfoResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElpRowData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfElpRowData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ArrayOfElpRowData")
    public JAXBElement<ArrayOfElpRowData> createArrayOfElpRowData(ArrayOfElpRowData value) {
        return new JAXBElement<ArrayOfElpRowData>(_ArrayOfElpRowData_QNAME, ArrayOfElpRowData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElpRowData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElpRowData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ElpRowData")
    public JAXBElement<ElpRowData> createElpRowData(ElpRowData value) {
        return new JAXBElement<ElpRowData>(_ElpRowData_QNAME, ElpRowData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTweetsOnLinesResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTweetsOnLinesResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ArrayOfTweetsOnLinesResp")
    public JAXBElement<ArrayOfTweetsOnLinesResp> createArrayOfTweetsOnLinesResp(ArrayOfTweetsOnLinesResp value) {
        return new JAXBElement<ArrayOfTweetsOnLinesResp>(_ArrayOfTweetsOnLinesResp_QNAME, ArrayOfTweetsOnLinesResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TweetsOnLinesResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TweetsOnLinesResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "TweetsOnLinesResp")
    public JAXBElement<TweetsOnLinesResp> createTweetsOnLinesResp(TweetsOnLinesResp value) {
        return new JAXBElement<TweetsOnLinesResp>(_TweetsOnLinesResp_QNAME, TweetsOnLinesResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfunsignedInt")
    public JAXBElement<ArrayOfunsignedInt> createArrayOfunsignedInt(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ArrayOfunsignedInt_QNAME, ArrayOfunsignedInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetNearDeparturesResult", scope = GetNearDeparturesResponse.class)
    public JAXBElement<NearDeparturesResp> createGetNearDeparturesResponseGetNearDeparturesResult(NearDeparturesResp value) {
        return new JAXBElement<NearDeparturesResp>(_GetNearDeparturesResponseGetNearDeparturesResult_QNAME, NearDeparturesResp.class, GetNearDeparturesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetNearDeparturesWithCountResult", scope = GetNearDeparturesWithCountResponse.class)
    public JAXBElement<NearDeparturesResp> createGetNearDeparturesWithCountResponseGetNearDeparturesWithCountResult(NearDeparturesResp value) {
        return new JAXBElement<NearDeparturesResp>(_GetNearDeparturesWithCountResponseGetNearDeparturesWithCountResult_QNAME, NearDeparturesResp.class, GetNearDeparturesWithCountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetNearDeparturesByTimeResult", scope = GetNearDeparturesByTimeResponse.class)
    public JAXBElement<NearDeparturesResp> createGetNearDeparturesByTimeResponseGetNearDeparturesByTimeResult(NearDeparturesResp value) {
        return new JAXBElement<NearDeparturesResp>(_GetNearDeparturesByTimeResponseGetNearDeparturesByTimeResult_QNAME, NearDeparturesResp.class, GetNearDeparturesByTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NearDeparturesResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetNearDeparturesByTimeWithCountResult", scope = GetNearDeparturesByTimeWithCountResponse.class)
    public JAXBElement<NearDeparturesResp> createGetNearDeparturesByTimeWithCountResponseGetNearDeparturesByTimeWithCountResult(NearDeparturesResp value) {
        return new JAXBElement<NearDeparturesResp>(_GetNearDeparturesByTimeWithCountResponseGetNearDeparturesByTimeWithCountResult_QNAME, NearDeparturesResp.class, GetNearDeparturesByTimeWithCountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearDeparturesWithPostsResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NearDeparturesWithPostsResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetNearDeparturesAcrossPostsResult", scope = GetNearDeparturesAcrossPostsResponse.class)
    public JAXBElement<NearDeparturesWithPostsResp> createGetNearDeparturesAcrossPostsResponseGetNearDeparturesAcrossPostsResult(NearDeparturesWithPostsResp value) {
        return new JAXBElement<NearDeparturesWithPostsResp>(_GetNearDeparturesAcrossPostsResponseGetNearDeparturesAcrossPostsResult_QNAME, NearDeparturesWithPostsResp.class, GetNearDeparturesAcrossPostsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteOnCallResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RouteOnCallResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ResolveIncRoCOrderResult", scope = ResolveIncRoCOrderResponse.class)
    public JAXBElement<RouteOnCallResp> createResolveIncRoCOrderResponseResolveIncRoCOrderResult(RouteOnCallResp value) {
        return new JAXBElement<RouteOnCallResp>(_ResolveIncRoCOrderResponseResolveIncRoCOrderResult_QNAME, RouteOnCallResp.class, ResolveIncRoCOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteOnCallResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RouteOnCallResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ResolveIncRoCStornoResult", scope = ResolveIncRoCStornoResponse.class)
    public JAXBElement<RouteOnCallResp> createResolveIncRoCStornoResponseResolveIncRoCStornoResult(RouteOnCallResp value) {
        return new JAXBElement<RouteOnCallResp>(_ResolveIncRoCStornoResponseResolveIncRoCStornoResult_QNAME, RouteOnCallResp.class, ResolveIncRoCStornoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "date", scope = GetListForRouteOfCall.class)
    public JAXBElement<String> createGetListForRouteOfCallDate(String value) {
        return new JAXBElement<String>(_GetListForRouteOfCallDate_QNAME, String.class, GetListForRouteOfCall.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListForRouteOfCallResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListForRouteOfCallResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetListForRouteOfCallResult", scope = GetListForRouteOfCallResponse.class)
    public JAXBElement<ListForRouteOfCallResp> createGetListForRouteOfCallResponseGetListForRouteOfCallResult(ListForRouteOfCallResp value) {
        return new JAXBElement<ListForRouteOfCallResp>(_GetListForRouteOfCallResponseGetListForRouteOfCallResult_QNAME, ListForRouteOfCallResp.class, GetListForRouteOfCallResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineRouteDelayResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LineRouteDelayResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLineRouteDelayResult", scope = GetLineRouteDelayResponse.class)
    public JAXBElement<LineRouteDelayResp> createGetLineRouteDelayResponseGetLineRouteDelayResult(LineRouteDelayResp value) {
        return new JAXBElement<LineRouteDelayResp>(_GetLineRouteDelayResponseGetLineRouteDelayResult_QNAME, LineRouteDelayResp.class, GetLineRouteDelayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficStateResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficStateResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTrafficStateResult", scope = GetTrafficStateResponse.class)
    public JAXBElement<TrafficStateResp> createGetTrafficStateResponseGetTrafficStateResult(TrafficStateResp value) {
        return new JAXBElement<TrafficStateResp>(_GetTrafficStateResponseGetTrafficStateResult_QNAME, TrafficStateResp.class, GetTrafficStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficStateResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficStateResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTrafficStateVLDBusWoServiceResult", scope = GetTrafficStateVLDBusWoServiceResponse.class)
    public JAXBElement<TrafficStateResp> createGetTrafficStateVLDBusWoServiceResponseGetTrafficStateVLDBusWoServiceResult(TrafficStateResp value) {
        return new JAXBElement<TrafficStateResp>(_GetTrafficStateVLDBusWoServiceResponseGetTrafficStateVLDBusWoServiceResult_QNAME, TrafficStateResp.class, GetTrafficStateVLDBusWoServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficStateResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficStateResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTrafficStateDPMBWoServiceResult", scope = GetTrafficStateDPMBWoServiceResponse.class)
    public JAXBElement<TrafficStateResp> createGetTrafficStateDPMBWoServiceResponseGetTrafficStateDPMBWoServiceResult(TrafficStateResp value) {
        return new JAXBElement<TrafficStateResp>(_GetTrafficStateDPMBWoServiceResponseGetTrafficStateDPMBWoServiceResult_QNAME, TrafficStateResp.class, GetTrafficStateDPMBWoServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualTrafficPerformanceResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualTrafficPerformanceResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetActualTrafficPerformanceResult", scope = GetActualTrafficPerformanceResponse.class)
    public JAXBElement<ActualTrafficPerformanceResp> createGetActualTrafficPerformanceResponseGetActualTrafficPerformanceResult(ActualTrafficPerformanceResp value) {
        return new JAXBElement<ActualTrafficPerformanceResp>(_GetActualTrafficPerformanceResponseGetActualTrafficPerformanceResult_QNAME, ActualTrafficPerformanceResp.class, GetActualTrafficPerformanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "xmlMessage", scope = AddNewRSDInfo.class)
    public JAXBElement<String> createAddNewRSDInfoXmlMessage(String value) {
        return new JAXBElement<String>(_AddNewRSDInfoXmlMessage_QNAME, String.class, AddNewRSDInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewRSDInfoResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NewRSDInfoResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddNewRSDInfoResult", scope = AddNewRSDInfoResponse.class)
    public JAXBElement<NewRSDInfoResp> createAddNewRSDInfoResponseAddNewRSDInfoResult(NewRSDInfoResp value) {
        return new JAXBElement<NewRSDInfoResp>(_AddNewRSDInfoResponseAddNewRSDInfoResult_QNAME, NewRSDInfoResp.class, AddNewRSDInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStopInfoResult", scope = GetStopInfoResponse.class)
    public JAXBElement<StopInfoResponse> createGetStopInfoResponseGetStopInfoResult(StopInfoResponse value) {
        return new JAXBElement<StopInfoResponse>(_GetStopInfoResponseGetStopInfoResult_QNAME, StopInfoResponse.class, GetStopInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElpInfoResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfElpInfoResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPanelsInfoResult", scope = GetPanelsInfoResponse.class)
    public JAXBElement<ArrayOfElpInfoResp> createGetPanelsInfoResponseGetPanelsInfoResult(ArrayOfElpInfoResp value) {
        return new JAXBElement<ArrayOfElpInfoResp>(_GetPanelsInfoResponseGetPanelsInfoResult_QNAME, ArrayOfElpInfoResp.class, GetPanelsInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTweetsOnLinesResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTweetsOnLinesResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTweetsResult", scope = GetTweetsResponse.class)
    public JAXBElement<ArrayOfTweetsOnLinesResp> createGetTweetsResponseGetTweetsResult(ArrayOfTweetsOnLinesResp value) {
        return new JAXBElement<ArrayOfTweetsOnLinesResp>(_GetTweetsResponseGetTweetsResult_QNAME, ArrayOfTweetsOnLinesResp.class, GetTweetsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "linesL", scope = GetTweetsForLines.class)
    public JAXBElement<ArrayOfint> createGetTweetsForLinesLinesL(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetTweetsForLinesLinesL_QNAME, ArrayOfint.class, GetTweetsForLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTweetsOnLinesResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTweetsOnLinesResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTweetsForLinesResult", scope = GetTweetsForLinesResponse.class)
    public JAXBElement<ArrayOfTweetsOnLinesResp> createGetTweetsForLinesResponseGetTweetsForLinesResult(ArrayOfTweetsOnLinesResp value) {
        return new JAXBElement<ArrayOfTweetsOnLinesResp>(_GetTweetsForLinesResponseGetTweetsForLinesResult_QNAME, ArrayOfTweetsOnLinesResp.class, GetTweetsForLinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "LinesL", scope = TweetsOnLinesResp.class)
    public JAXBElement<ArrayOfint> createTweetsOnLinesRespLinesL(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_TweetsOnLinesRespLinesL_QNAME, ArrayOfint.class, TweetsOnLinesResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Tweet", scope = TweetsOnLinesResp.class)
    public JAXBElement<String> createTweetsOnLinesRespTweet(String value) {
        return new JAXBElement<String>(_TweetsOnLinesRespTweet_QNAME, String.class, TweetsOnLinesResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Departure", scope = ElpRowData.class)
    public JAXBElement<String> createElpRowDataDeparture(String value) {
        return new JAXBElement<String>(_ElpRowDataDeparture_QNAME, String.class, ElpRowData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Direction", scope = ElpRowData.class)
    public JAXBElement<String> createElpRowDataDirection(String value) {
        return new JAXBElement<String>(_ElpRowDataDirection_QNAME, String.class, ElpRowData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Line", scope = ElpRowData.class)
    public JAXBElement<String> createElpRowDataLine(String value) {
        return new JAXBElement<String>(_ElpRowDataLine_QNAME, String.class, ElpRowData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Platform", scope = ElpRowData.class)
    public JAXBElement<String> createElpRowDataPlatform(String value) {
        return new JAXBElement<String>(_ElpRowDataPlatform_QNAME, String.class, ElpRowData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Sign", scope = ElpRowData.class)
    public JAXBElement<String> createElpRowDataSign(String value) {
        return new JAXBElement<String>(_ElpRowDataSign_QNAME, String.class, ElpRowData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ActiveScenario", scope = ElpInfoResp.class)
    public JAXBElement<String> createElpInfoRespActiveScenario(String value) {
        return new JAXBElement<String>(_ElpInfoRespActiveScenario_QNAME, String.class, ElpInfoResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ActiveScenarioData", scope = ElpInfoResp.class)
    public JAXBElement<String> createElpInfoRespActiveScenarioData(String value) {
        return new JAXBElement<String>(_ElpInfoRespActiveScenarioData_QNAME, String.class, ElpInfoResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "ActiveText", scope = ElpInfoResp.class)
    public JAXBElement<String> createElpInfoRespActiveText(String value) {
        return new JAXBElement<String>(_ElpInfoRespActiveText_QNAME, String.class, ElpInfoResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElpRowData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfElpRowData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "DisplayInfo", scope = ElpInfoResp.class)
    public JAXBElement<ArrayOfElpRowData> createElpInfoRespDisplayInfo(ArrayOfElpRowData value) {
        return new JAXBElement<ArrayOfElpRowData>(_ElpInfoRespDisplayInfo_QNAME, ArrayOfElpRowData.class, ElpInfoResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "PanelNote", scope = ElpInfoResp.class)
    public JAXBElement<String> createElpInfoRespPanelNote(String value) {
        return new JAXBElement<String>(_ElpInfoRespPanelNote_QNAME, String.class, ElpInfoResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "StopIdList", scope = ElpInfoResp.class)
    public JAXBElement<ArrayOfunsignedInt> createElpInfoRespStopIdList(ArrayOfunsignedInt value) {
        return new JAXBElement<ArrayOfunsignedInt>(_ElpInfoRespStopIdList_QNAME, ArrayOfunsignedInt.class, ElpInfoResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Destination", scope = ListForRouteOfCallRespEntry.class)
    public JAXBElement<String> createListForRouteOfCallRespEntryDestination(String value) {
        return new JAXBElement<String>(_ListForRouteOfCallRespEntryDestination_QNAME, String.class, ListForRouteOfCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "FullDate", scope = ListForRouteOfCallRespEntry.class)
    public JAXBElement<String> createListForRouteOfCallRespEntryFullDate(String value) {
        return new JAXBElement<String>(_ListForRouteOfCallRespEntryFullDate_QNAME, String.class, ListForRouteOfCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "LineName", scope = ListForRouteOfCallRespEntry.class)
    public JAXBElement<String> createListForRouteOfCallRespEntryLineName(String value) {
        return new JAXBElement<String>(_ListForRouteOfCallRespEntryLineName_QNAME, String.class, ListForRouteOfCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Route", scope = ListForRouteOfCallRespEntry.class)
    public JAXBElement<String> createListForRouteOfCallRespEntryRoute(String value) {
        return new JAXBElement<String>(_ListForRouteOfCallRespEntryRoute_QNAME, String.class, ListForRouteOfCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "StationID", scope = ListForRouteOfCallRespEntry.class)
    public JAXBElement<String> createListForRouteOfCallRespEntryStationID(String value) {
        return new JAXBElement<String>(_ListForRouteOfCallRespEntryStationID_QNAME, String.class, ListForRouteOfCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "StationName", scope = ListForRouteOfCallRespEntry.class)
    public JAXBElement<String> createListForRouteOfCallRespEntryStationName(String value) {
        return new JAXBElement<String>(_ListForRouteOfCallRespEntryStationName_QNAME, String.class, ListForRouteOfCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Action", scope = RouteOnCallRespEntry.class)
    public JAXBElement<String> createRouteOnCallRespEntryAction(String value) {
        return new JAXBElement<String>(_RouteOnCallRespEntryAction_QNAME, String.class, RouteOnCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "LineName", scope = RouteOnCallRespEntry.class)
    public JAXBElement<String> createRouteOnCallRespEntryLineName(String value) {
        return new JAXBElement<String>(_ListForRouteOfCallRespEntryLineName_QNAME, String.class, RouteOnCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Note", scope = RouteOnCallRespEntry.class)
    public JAXBElement<String> createRouteOnCallRespEntryNote(String value) {
        return new JAXBElement<String>(_RouteOnCallRespEntryNote_QNAME, String.class, RouteOnCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "RouteName", scope = RouteOnCallRespEntry.class)
    public JAXBElement<String> createRouteOnCallRespEntryRouteName(String value) {
        return new JAXBElement<String>(_RouteOnCallRespEntryRouteName_QNAME, String.class, RouteOnCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Station", scope = RouteOnCallRespEntry.class)
    public JAXBElement<String> createRouteOnCallRespEntryStation(String value) {
        return new JAXBElement<String>(_RouteOnCallRespEntryStation_QNAME, String.class, RouteOnCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "TicketIDName", scope = RouteOnCallRespEntry.class)
    public JAXBElement<String> createRouteOnCallRespEntryTicketIDName(String value) {
        return new JAXBElement<String>(_RouteOnCallRespEntryTicketIDName_QNAME, String.class, RouteOnCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "TimeMark", scope = RouteOnCallRespEntry.class)
    public JAXBElement<String> createRouteOnCallRespEntryTimeMark(String value) {
        return new JAXBElement<String>(_RouteOnCallRespEntryTimeMark_QNAME, String.class, RouteOnCallRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "DriveOrderSign", scope = NearDeparturesRespEntry.class)
    public JAXBElement<String> createNearDeparturesRespEntryDriveOrderSign(String value) {
        return new JAXBElement<String>(_NearDeparturesRespEntryDriveOrderSign_QNAME, String.class, NearDeparturesRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "FinalStation", scope = NearDeparturesRespEntry.class)
    public JAXBElement<String> createNearDeparturesRespEntryFinalStation(String value) {
        return new JAXBElement<String>(_NearDeparturesRespEntryFinalStation_QNAME, String.class, NearDeparturesRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "LineName", scope = NearDeparturesRespEntry.class)
    public JAXBElement<String> createNearDeparturesRespEntryLineName(String value) {
        return new JAXBElement<String>(_ListForRouteOfCallRespEntryLineName_QNAME, String.class, NearDeparturesRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Platform", scope = NearDeparturesRespEntry.class)
    public JAXBElement<String> createNearDeparturesRespEntryPlatform(String value) {
        return new JAXBElement<String>(_ElpRowDataPlatform_QNAME, String.class, NearDeparturesRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "TimeMark", scope = NearDeparturesRespEntry.class)
    public JAXBElement<String> createNearDeparturesRespEntryTimeMark(String value) {
        return new JAXBElement<String>(_RouteOnCallRespEntryTimeMark_QNAME, String.class, NearDeparturesRespEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "StopName", scope = StopInfoResponse.class)
    public JAXBElement<String> createStopInfoResponseStopName(String value) {
        return new JAXBElement<String>(_StopInfoResponseStopName_QNAME, String.class, StopInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewRSDInfoRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNewRSDInfoRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "NRSDIL", scope = NewRSDInfoResp.class)
    public JAXBElement<ArrayOfNewRSDInfoRespEntry> createNewRSDInfoRespNRSDIL(ArrayOfNewRSDInfoRespEntry value) {
        return new JAXBElement<ArrayOfNewRSDInfoRespEntry>(_NewRSDInfoRespNRSDIL_QNAME, ArrayOfNewRSDInfoRespEntry.class, NewRSDInfoResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTrafficStateRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTrafficStateRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "VehicleL", scope = TrafficStateResp.class)
    public JAXBElement<ArrayOfTrafficStateRespEntry> createTrafficStateRespVehicleL(ArrayOfTrafficStateRespEntry value) {
        return new JAXBElement<ArrayOfTrafficStateRespEntry>(_TrafficStateRespVehicleL_QNAME, ArrayOfTrafficStateRespEntry.class, TrafficStateResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListForRouteOfCallRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListForRouteOfCallRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "DeparturesL", scope = ListForRouteOfCallResp.class)
    public JAXBElement<ArrayOfListForRouteOfCallRespEntry> createListForRouteOfCallRespDeparturesL(ArrayOfListForRouteOfCallRespEntry value) {
        return new JAXBElement<ArrayOfListForRouteOfCallRespEntry>(_ListForRouteOfCallRespDeparturesL_QNAME, ArrayOfListForRouteOfCallRespEntry.class, ListForRouteOfCallResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "Error", scope = RouteOnCallResp.class)
    public JAXBElement<String> createRouteOnCallRespError(String value) {
        return new JAXBElement<String>(_RouteOnCallRespError_QNAME, String.class, RouteOnCallResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteOnCallRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteOnCallRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "RoCL", scope = RouteOnCallResp.class)
    public JAXBElement<ArrayOfRouteOnCallRespEntry> createRouteOnCallRespRoCL(ArrayOfRouteOnCallRespEntry value) {
        return new JAXBElement<ArrayOfRouteOnCallRespEntry>(_RouteOnCallRespRoCL_QNAME, ArrayOfRouteOnCallRespEntry.class, RouteOnCallResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNearDeparturesWithPostsRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNearDeparturesWithPostsRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "DeparturesL", scope = NearDeparturesWithPostsResp.class)
    public JAXBElement<ArrayOfNearDeparturesWithPostsRespEntry> createNearDeparturesWithPostsRespDeparturesL(ArrayOfNearDeparturesWithPostsRespEntry value) {
        return new JAXBElement<ArrayOfNearDeparturesWithPostsRespEntry>(_ListForRouteOfCallRespDeparturesL_QNAME, ArrayOfNearDeparturesWithPostsRespEntry.class, NearDeparturesWithPostsResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "InfoTextSet", scope = NearDeparturesWithPostsResp.class)
    public JAXBElement<ArrayOfstring> createNearDeparturesWithPostsRespInfoTextSet(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_NearDeparturesWithPostsRespInfoTextSet_QNAME, ArrayOfstring.class, NearDeparturesWithPostsResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNearDeparturesRespEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNearDeparturesRespEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "DeparturesL", scope = NearDeparturesResp.class)
    public JAXBElement<ArrayOfNearDeparturesRespEntry> createNearDeparturesRespDeparturesL(ArrayOfNearDeparturesRespEntry value) {
        return new JAXBElement<ArrayOfNearDeparturesRespEntry>(_ListForRouteOfCallRespDeparturesL_QNAME, ArrayOfNearDeparturesRespEntry.class, NearDeparturesResp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Solution.Common.WebServices", name = "InfoTextSet", scope = NearDeparturesResp.class)
    public JAXBElement<ArrayOfstring> createNearDeparturesRespInfoTextSet(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_NearDeparturesWithPostsRespInfoTextSet_QNAME, ArrayOfstring.class, NearDeparturesResp.class, value);
    }

}
