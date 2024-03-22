package com.example.SpringBootLiquidaciones.service;

import com.example.SpringBootLiquidaciones.model.Cliente;

public interface ILoginService {

    public boolean login();
    public Cliente getUsuarioLogueado();
}
