package org.springframework.samples.petclinic.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.samples.petclinic.rest.JacksonCustomOwnerDeserializer;
import org.springframework.samples.petclinic.rest.JacksonCustomOwnerSerializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "contacto") //Nombre de la tabla en la BDD cuyas tuplas son owners
@JsonSerialize(using = JacksonCustomOwnerSerializer.class)
@JsonDeserialize(using = JacksonCustomOwnerDeserializer.class)
public class Contacto {
	@Column(name = "id_contacto")
    @NotEmpty
	protected Integer id_contacto;
	
	@Column(name = "fecha_contacto")
    @NotEmpty
	protected Date fecha_contacto;
	
	@Column(name = "mensaje")
    @NotEmpty
	protected String mensaje;
	
	@Column(name = "ubicacion")
    @NotEmpty
	protected String ubicacion;
	
	@Column(name = "formato_clase")
    @NotEmpty
	protected String formato_clase;
	
	@Column(name = "nivel_educacional")
    @NotEmpty
	protected String nivel_educacional;
	
    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private PetType id_profesor;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Owner id_estudiante;

	public Integer getId_contacto() {
		return id_contacto;
	}

	public void setId_contacto(Integer id_contacto) {
		this.id_contacto = id_contacto;
	}

	public Date getFecha_contacto() {
		return fecha_contacto;
	}

	public void setFecha_contacto(Date fecha_contacto) {
		this.fecha_contacto = fecha_contacto;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getFormato_clase() {
		return formato_clase;
	}

	public void setFormato_clase(String formato_clase) {
		this.formato_clase = formato_clase;
	}

	public String getNivel_educacional() {
		return nivel_educacional;
	}

	public void setNivel_educacional(String nivel_educacional) {
		this.nivel_educacional = nivel_educacional;
	}

	public PetType getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(PetType id_profesor) {
		this.id_profesor = id_profesor;
	}

	public Owner getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(Owner id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	@Override
	public String toString() {
		return "Contacto [id_contacto=" + id_contacto + ", fecha_contacto=" + fecha_contacto + ", mensaje=" + mensaje
				+ ", ubicacion=" + ubicacion + ", formato_clase=" + formato_clase + ", nivel_educacional="
				+ nivel_educacional + ", id_profesor=" + id_profesor + ", id_estudiante=" + id_estudiante + "]";
	}
    
    
}