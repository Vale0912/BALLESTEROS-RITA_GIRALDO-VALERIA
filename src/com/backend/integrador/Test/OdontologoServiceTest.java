package com.backend.integrador.Test;

import com.backend.integrador.Service.OdontologoService;
import com.backend.integrador.dao.impl.OdontologoDaoH2;
import com.backend.integrador.entity.Odontologo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

    OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    void deberiaListarTodosLosOdontologos() {
        List<Odontologo> odontologoTest = odontologoService.listarTodosLosOdontologos();
        assertFalse(odontologoTest.isEmpty());
        assertTrue(odontologoTest.size() >= 1);
    }

    @Test
    void deberiaGuardarUnOdontologo(){
        Odontologo odon1 = new Odontologo("DAVID", "GUTIERREZ", 7654);
        Odontologo odontologoGuardado = odontologoService.guardarOdontologo(odon1);

        assertNotNull(odontologoGuardado.getId());
    }
}