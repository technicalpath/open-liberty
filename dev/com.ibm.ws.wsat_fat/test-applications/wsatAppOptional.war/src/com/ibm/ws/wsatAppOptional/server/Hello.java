//
// Generated By:JAX-WS RI IBM 2.2.1-07/09/2014 01:52 PM(foreman)- (JAXB RI IBM 2.2.3-07/07/2014 12:54 PM(foreman)-)
//


package com.ibm.ws.wsatAppOptional.server;

import javax.jws.WebService;

@WebService(name = "Hello", targetNamespace = "http://server.wsatAppOptional.ws.ibm.com/", wsdlLocation="WEB-INF/wsdl/hello.wsdl")
public interface Hello {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    public String sayHello();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    public String sayHelloToOther(String arg0, String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    public String sayHelloToOtherWithout(String arg0, String arg1);

}
