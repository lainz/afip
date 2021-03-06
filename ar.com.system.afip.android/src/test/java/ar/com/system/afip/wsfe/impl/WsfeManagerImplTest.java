package ar.com.system.afip.wsfe.impl;

import ar.com.system.afip.utils.Utils;
import ar.com.system.afip.wsfe.business.impl.WsfeManagerImplTestImpl;
import org.junit.Before;
import org.junit.Test;

public class WsfeManagerImplTest {
    @Before
    public void setUp() {
        Utils.initWsfe();
    }

    @Test
    public void testSolicitar() {
        WsfeManagerImplTestImpl.testSolicitar();
    }

    @Test
    public void testParamGetTiposIva() {
        WsfeManagerImplTestImpl.testParamGetTiposIva();
    }

    @Test
    public void testParamGetTiposCbte() {
        WsfeManagerImplTestImpl.testParamGetTiposCbte();
    }

    @Test
    public void testParamGetTiposConcepto() {
        WsfeManagerImplTestImpl.testParamGetTiposConcepto();
    }

    @Test
    public void testParamGetTiposDoc() {
        WsfeManagerImplTestImpl.testParamGetTiposDoc();
    }

    @Test
    public void testParamGetTiposMonedas() {
        WsfeManagerImplTestImpl.testParamGetTiposMonedas();
    }

    @Test
    public void testParamGetTiposOpcional() {
        WsfeManagerImplTestImpl.testParamGetTiposOpcional();
    }

    @Test
    public void testParamGetTiposPaises() {
        WsfeManagerImplTestImpl.testParamGetTiposPaises();
    }

    @Test
    public void testParamGetTiposTributos() {
        WsfeManagerImplTestImpl.testParamGetTiposTributos();
    }

    @Test
    public void testParamGetCotizacion() {
        WsfeManagerImplTestImpl.testParamGetCotizacion();
    }

    @Test
    public void testParamGetPtosVenta() {
        WsfeManagerImplTestImpl.testParamGetPtosVenta();
    }
}
