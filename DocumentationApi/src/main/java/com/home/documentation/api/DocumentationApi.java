package com.home.documentation.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.documentation.api.model.Reserva;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v01/documentation")
public class DocumentationApi {

	/**
	 * Servicio REST para insertar una reserva
	 */
	@GetMapping(produces = { MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiOperation(value = "/insert", 
		notes = "Si no se produce alguna excepcion se inserta el registro.", 
		code = 200, 
		produces = "application/json, application/xml")
	@RequestMapping(value = "/reservas", method = RequestMethod.PUT)
	public @ResponseBody boolean insertReserva(@RequestBody Reserva reserva) {
		return true;
	}

	/**
	 * Servicio REST para modificar una reserva
	 */
	@GetMapping(produces = { MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiOperation(value = "/update", notes = "Si no se produce alguna excepcion se inserta el registro.", code = 200, response = Boolean.class, produces = "application/json, application/xml")
	@RequestMapping(value = "/reservas", method = RequestMethod.POST)
	public @ResponseBody Boolean updateReserva(@RequestBody Reserva reserva) {
		return true;
	}

	/**
	 * Servicio REST para obtener los detalles de una reserva
	 */
	@GetMapping(produces = { MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiOperation(value = "/search", notes = "Si no se produce alguna excepcion se inserta el registro.", code = 200, produces = "application/json, application/xml")
	@RequestMapping(value = "/reservas", method = RequestMethod.GET)
	public @ResponseBody Reserva detailsReserva(@RequestBody Reserva reserva) {
		Reserva r = new Reserva();
		r.setId_persona("123456");
		return r;
	}

	/**
	 * Servicio REST para eliminar una reserva
	 */
	@GetMapping(produces = { MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiOperation(value = "/delete", notes = "Si no se produce alguna excepcion se inserta el registro.", code = 200, produces = "application/json, application/xml")
	@RequestMapping(value = "/reservas", method = RequestMethod.DELETE)
	public @ResponseBody Boolean deleteReserva(@RequestParam int numero) {
		return true;
	}

	/**
	 * Servicio REST para obtener las reservas
	 */
	@GetMapping(produces = { MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiOperation(value = "/details", notes = "Si no se produce alguna excepcion se inserta el registro.", code = 200, produces = "application/json, application/xml")
	@RequestMapping(value = "/reservas/misreservas", method = RequestMethod.GET)
	public @ResponseBody List<Reserva> getReservas(@RequestParam(value = "usuario") String usuario) {
		List<Reserva> misReservas = new ArrayList<>();
		Reserva r = new Reserva();
		r.setId_persona("123456");
		return misReservas;
	}

}
