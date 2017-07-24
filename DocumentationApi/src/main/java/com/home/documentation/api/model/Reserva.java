package com.home.documentation.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.home.documentation.api.json.JsonDateSerializer;



@JsonAutoDetect
@JsonRootName("reserva")
public class Reserva {

	private int numero;

	private String id_persona;
	private Date fecha_inicio;
	private Date fecha_fin;
	private int horas;
	private String lugar;
	private int estado;

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public String getId_persona() {
		return id_persona;
	}

	public void setId_persona(String id_persona) {
		this.id_persona = id_persona;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	
	@JsonSerialize(using = JsonDateSerializer.class)
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getFecha_fin() {
		return fecha_fin;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
}
