package ar.com.system.afip.wsmtxca.service.api;


import ar.com.system.afip.util.Constants;
import ar.com.system.afip.wsaa.business.api.Service;

import static ar.com.system.afip.wsaa.WsaaComponents.credentials;
import static ar.com.system.afip.wsmtxca.WsmtxcaComponents.mtxcaService;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MTXCAServicePortTypeTestImpl {
    public static void testDummy() {
        MTXCAServicePortType serviceSoap = mtxcaService();

        DummyResponseType response = null;
        try {
            response = serviceSoap.dummy();
        } catch (ExceptionFaultMsg e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertNotNull(response);
        assertEquals("OK", response.getAppserver());
        assertEquals("OK", response.getAuthserver());
        assertEquals("OK", response.getDbserver());
    }

    public static void testParamGetTiposIva() throws ExceptionFaultMsg {
        MTXCAServicePortType serviceSoap = mtxcaService();

        ConsultarCondicionesIVAResponseType response = serviceSoap
                .consultarCondicionesIVA(new ConsultarCondicionesIVARequestType(buildAuthRequestType()));

        assertNotNull(response);
        assertNotNull(response.getEvento());
        assertNotNull(response.getArrayCondicionesIVA());
    }

    private static AuthRequestType buildAuthRequestType() {
        return AuthRequestType.fromCredentials(credentials(Service.WSMTXCA),
                Constants.CUIT);
    }
}
