package com.example.SpringBootLiquidaciones.service;

import com.example.SpringBootLiquidaciones.model.Dano;
import com.example.SpringBootLiquidaciones.model.Poliza;
import com.example.SpringBootLiquidaciones.model.Siniestro;
import com.example.SpringBootLiquidaciones.model.example.BaseData;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class SiniestrosService implements ISiniestrosService {

    private BaseData data;

    public SiniestrosService(BaseData data) {
        this.data = data;
    }

    @Override
    public void generarSiniestro() {
        Scanner sc = new Scanner(System.in);

        Poliza polizaAsociada = null;
        Boolean polizaCorrecta = false;
        while (!polizaCorrecta) {
            System.out.println("Por favor, introduzca a continuación los datos del siniestro: ");
            System.out.println("Código de Poliza: ");
            String codigoPoliza = sc.nextLine();
            polizaAsociada = obtenerPoliza(codigoPoliza);

            if (polizaAsociada == null) {
                System.err.println("Esa poliza no existe.");
            } else {
                polizaCorrecta = true;
            }

        }

        System.out.println("Fecha de ocurrencia (dd/MM/YYYY): ");
        String fecha = sc.nextLine();
        Date fechaSiniestro = null;
        try {
            fechaSiniestro = procesarFecha(fecha);
        } catch (ParseException e) {
            throw new RuntimeException("Formato de fecha incorrecto");
        }

        System.out.println("Cause de origen del siniestro: ");
        String causaSiniestro = sc.nextLine();

        //TODO DESCOMENTAR
        //List<Dano> daños = procesarDaños();


        //registrarSiniestro(daños, causaSiniestro, fechaSiniestro, polizaAsociada);
    }

    //TODO CAMBIAR TIPO DE DAÑO
    @Override
    public boolean validarDatos(List<String> danos, String causaSiniestro, String fecha, String codigoPoliza) {
        Poliza polizaAsociada = obtenerPoliza(codigoPoliza);
        Date fechaSiniestro;
        if (polizaAsociada == null) {
            return false;
        }
        try {
            fechaSiniestro = procesarFecha(fecha);
        } catch (ParseException e) {
            return false;
        }
        if (danos.isEmpty()){
            return false;
        }

        registrarSiniestro(danos, causaSiniestro, fechaSiniestro, polizaAsociada);
        return true;
    }

    //TODO CAMBIAR TIPO DE DAÑO
    public void registrarSiniestro(List<String> danos, String causaSiniestro, Date fechaSiniestro, Poliza polizaAsociada) {
        Siniestro siniestro = new Siniestro();
        //siniestro.setListaDeDaños(danos);
        siniestro.setListaDeDanos(danos);
        siniestro.setCausa(causaSiniestro);
        siniestro.setFechaDeOcurrencia(fechaSiniestro);
        siniestro.setPolizaAsociada(polizaAsociada);

        this.data.altaSiniestro(siniestro);
        System.out.println("Siniestro registrado");
    }

    private Date procesarFecha(String fecha) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.GERMAN);
        return formatter.parse(fecha);
    }

    private List<Dano> procesarDaños() {
        System.out.println("Listado de daños");
        List<Dano> danos = new ArrayList<>();
        boolean isDone = false;
        while (!isDone) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Codigo de poliza (o 'exit'): ");
            String codigoPoliza = sc.nextLine();

            if (codigoPoliza.equalsIgnoreCase("exit")) {
                return danos;
            }

            System.out.println("Valor: ");
            int valor = sc.nextInt();
            Dano dano = new Dano();
            //daño.setPoliza(this.obtenerPoliza(codigoPoliza));
            //daño.setValor(valor);
            danos.add(dano);
        }
        return danos;
    }


    private Poliza obtenerPoliza(String code) {
        return this.data.findPolizaByCode(code);
    }
}
