package com.example.SpringBootLiquidaciones.service;

import com.example.SpringBootLiquidaciones.model.Poliza;
import com.example.SpringBootLiquidaciones.model.example.BaseData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private BaseData data;
    private ILoginService loginService;

    public UserService(BaseData data, ILoginService loginService) {
        this.data = data;
        this.loginService = loginService;
    }

    @Override
    public void verPolizas() {
        System.out.println("Polizas del usuario: ");
        List<Poliza> polizaList = this.data.findPolizasByUser(this.loginService.getUsuarioLogueado());
        polizaList.forEach(poliza -> {
            System.out.printf("Poliza - Código: %s,  Importe: %d, Producto: %s", poliza.getCodigo(), poliza.getImporteCapitalesContratados(), poliza.getProducto().getCode());
        });
    }
}
