//
// Generated By:JAX-WS RI IBM 2.2.1-07/09/2014 01:52 PM(foreman)- (JAXB RI IBM 2.2.3-07/07/2014 12:54 PM(foreman)-)
//


package com.ibm.ws.wsat.fat.client.oneway;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;

@WebService(name = "HelloImplOneway", targetNamespace = "http://server.fat.wsat.ws.ibm.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloImplOneway {


    /**
     * 
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://server.fat.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.fat.client.oneway.SayHello")
    @Action(input = "http://server.fat.wsat.ws.ibm.com/HelloImplOneway/sayHelloRequest")
    public void sayHello();

}
