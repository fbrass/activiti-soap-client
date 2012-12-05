/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.activitisoapclient;


import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 *
 * @author said
 */


@WebServiceClient(name = "OrderServerImplService", 
		targetNamespace="http://activitiderbysoapservice.spqr.de/", 
		wsdlLocation = "http://localhost:9876/os?wsdl")
public class OrderServerImplService extends Service{   
    
    private final static URL ENTITYSERVERIMPLSERVICE_WSDL_LOCATION;
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9876/os?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ENTITYSERVERIMPLSERVICE_WSDL_LOCATION = url;
    }
 

	public OrderServerImplService(URL wsdlDocumentLocation,
			QName serviceName) {
		super(wsdlDocumentLocation, serviceName);
	}
	
	public OrderServerImplService() {
		super(ENTITYSERVERIMPLSERVICE_WSDL_LOCATION,
				new QName("http://activitiderbysoapservice.spqr.de/","OrderServerImplService"));
	}


	@WebEndpoint(name="OrderServerPort")
	public OrderServer getOrderServerImplPort(){
		return (OrderServer) super.getPort(new QName("http://activitiderbysoapservice.spqr.de/","OrderServerImplPort"),OrderServer.class);
	}
	
	@WebEndpoint(name="OrderServerPort")
	public OrderServer getOrderServerImplPort(WebServiceFeature...features){
		return (OrderServer) super.getPort(new QName("http://activitiderbysoapservice.spqr.de/","OrderServerImplport"),OrderServer.class,features);
	}
}
