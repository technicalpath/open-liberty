//
// Generated By:JAX-WS RI IBM 2.2.1-07/09/2014 01:52 PM(foreman)- (JAXB RI IBM 2.2.3-07/07/2014 12:54 PM(foreman)-)
//


package com.ibm.ws.wsat.test.client.ejb;

import javax.xml.ws.WebFault;

@WebFault(name = "NamingException", targetNamespace = "http://server.test.wsat.ws.ibm.com/")
public class NamingException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NamingException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public NamingException_Exception(String message, NamingException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public NamingException_Exception(String message, NamingException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.ibm.ws.wsat.test.client.ejb.NamingException
     */
    public NamingException getFaultInfo() {
        return faultInfo;
    }

}
