package com.digipymes360.clienteFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digipymes360.clienteFinal.dto.PedidoRequest;
import com.digipymes360.clienteFinal.model.Negocio;
import com.digipymes360.clienteFinal.model.Pedido;
import com.digipymes360.clienteFinal.service.NegocioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Negocios", description = "CRUD de Negocios")
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/negocios")
public class NegocioController {
    @Autowired
    private NegocioService negocioService;

    @Operation(summary = "Crear Negocio")
    @PostMapping(value = "/create",produces = MediaTypes.HAL_JSON_VALUE)
    public Negocio crearNegocio(@RequestParam String id_negocio,@RequestParam String nombre,@RequestParam String descripcion,@RequestParam String img) {
        Negocio negocio = new Negocio();

        negocio.setId_negocio(null);
        negocio.setNombre(nombre);
        negocio.setDescripcion(descripcion);
        negocio.setImg_url(img);
        return negocioService.addNegocio(negocio);
    }

    @Operation(summary = "Obtener Negocios por Id")
    @GetMapping(value = "/getbyid",produces = MediaTypes.HAL_JSON_VALUE)
    public Negocio obtenerNegocioPorId(@RequestParam Long id_negocio) {
        return negocioService.getNegocio(id_negocio);
    }


    @Operation(summary = "Obtener Todos los Negocios")
    @GetMapping(value = "/getAll",produces = MediaTypes.HAL_JSON_VALUE)
    public List<Negocio> obtenerNegocios() {
        return negocioService.getNegocios();
    }

}
