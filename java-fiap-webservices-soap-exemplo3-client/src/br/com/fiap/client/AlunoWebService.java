
package br.com.fiap.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AlunoWebService", targetNamespace = "http://ws.exemplos.fiap.com/", wsdlLocation = "http://l2901micro15:8080/java-fiap-webservices-soap-exemplo3/AlunoWebService?wsdl")
public class AlunoWebService
    extends Service
{

    private final static URL ALUNOWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException ALUNOWEBSERVICE_EXCEPTION;
    private final static QName ALUNOWEBSERVICE_QNAME = new QName("http://ws.exemplos.fiap.com/", "AlunoWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://l2901micro15:8080/java-fiap-webservices-soap-exemplo3/AlunoWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ALUNOWEBSERVICE_WSDL_LOCATION = url;
        ALUNOWEBSERVICE_EXCEPTION = e;
    }

    public AlunoWebService() {
        super(__getWsdlLocation(), ALUNOWEBSERVICE_QNAME);
    }

    public AlunoWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ALUNOWEBSERVICE_QNAME, features);
    }

    public AlunoWebService(URL wsdlLocation) {
        super(wsdlLocation, ALUNOWEBSERVICE_QNAME);
    }

    public AlunoWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ALUNOWEBSERVICE_QNAME, features);
    }

    public AlunoWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AlunoWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AlunoWeb
     */
    @WebEndpoint(name = "AlunoWebPort")
    public AlunoWeb getAlunoWebPort() {
        return super.getPort(new QName("http://ws.exemplos.fiap.com/", "AlunoWebPort"), AlunoWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AlunoWeb
     */
    @WebEndpoint(name = "AlunoWebPort")
    public AlunoWeb getAlunoWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.exemplos.fiap.com/", "AlunoWebPort"), AlunoWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ALUNOWEBSERVICE_EXCEPTION!= null) {
            throw ALUNOWEBSERVICE_EXCEPTION;
        }
        return ALUNOWEBSERVICE_WSDL_LOCATION;
    }

}
