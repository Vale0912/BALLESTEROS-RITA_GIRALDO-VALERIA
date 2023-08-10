package com.backend.integrador.Service;

import com.backend.integrador.dao.IDao;
import com.backend.integrador.entity.Odontologo;

import java.util.List;

public class OdontologoService {

    private final IDao <Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }

    public Odontologo buscarOdontologoPorId(int id){
        return odontologoIDao.buscarPorId(id);
    }

    public List<Odontologo> listarTodosLosOdontologos(){
        return odontologoIDao.listarTodos();
    }

}
