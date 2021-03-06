
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import static com.google.common.base.Preconditions.checkNotNull;


/**
 * <p>Clase Java para InformarCAEANoUtilizadoPtoVtaRequestType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="InformarCAEANoUtilizadoPtoVtaRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}AuthRequestType"/>
 *         &lt;element name="CAEA" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroPuntoVenta" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}NumeroPuntoVentaSimpleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformarCAEANoUtilizadoPtoVtaRequestType", propOrder = {
        "authRequest",
        "caea",
        "numeroPuntoVenta"
})
@Root(name = "informarCAEANoUtilizadoPtoVtaRequest")
@Namespace(reference = MTXCAServicePortType.SERVICE_NAMESPACE)
public class InformarCAEANoUtilizadoPtoVtaRequestType {

    @XmlElement(required = true)
    @Element
    protected AuthRequestType authRequest;
    @XmlElement(name = "CAEA")
    @Element(name = "CAEA")
    protected long caea;
    @Element
    protected short numeroPuntoVenta;

    public InformarCAEANoUtilizadoPtoVtaRequestType(AuthRequestType authRequest, long caea, short numeroPuntoVenta) {
        this.authRequest = checkNotNull(authRequest);
        this.caea = caea;
        this.numeroPuntoVenta = numeroPuntoVenta;
    }

    /**
     * Obtiene el valor de la propiedad authRequest.
     *
     * @return possible object is
     * {@link AuthRequestType }
     */
    public AuthRequestType getAuthRequest() {
        return authRequest;
    }

    /**
     * Define el valor de la propiedad authRequest.
     *
     * @param value allowed object is
     *              {@link AuthRequestType }
     */
    public void setAuthRequest(AuthRequestType value) {
        this.authRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad caea.
     */
    public long getCAEA() {
        return caea;
    }

    /**
     * Define el valor de la propiedad caea.
     */
    public void setCAEA(long value) {
        this.caea = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPuntoVenta.
     */
    public short getNumeroPuntoVenta() {
        return numeroPuntoVenta;
    }

    /**
     * Define el valor de la propiedad numeroPuntoVenta.
     */
    public void setNumeroPuntoVenta(short value) {
        this.numeroPuntoVenta = value;
    }

}
