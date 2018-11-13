package org.springframework.samples.petclinic.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.samples.petclinic.rest.JacksonCustomOwnerDeserializer;
import org.springframework.samples.petclinic.rest.JacksonCustomOwnerSerializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "estudiante") //Nombre de la tabla en la BDD cuyas tuplas son owners
@JsonSerialize(using = JacksonCustomOwnerSerializer.class)
@JsonDeserialize(using = JacksonCustomOwnerDeserializer.class)

public class Estudiante {
	@Column(name = "id_estudiante")
    @NotEmpty
	protected Integer id_estudiante;
	
	@Column(name = "num_telefono")
    @NotEmpty
    @Digits(fraction = 0, integer = 9) //string de digitos 0 decimales, es un entero de 9 dig.
	protected Integer num_telefono;
	
	@Column(name = "nombre")
    @NotEmpty
	protected String nombre;
	
	@Column(name = "apellidos")
    @NotEmpty
	protected String apellidos;
	
	@Column(name = "email")
    @NotEmpty
	protected String email;
	
	@Column(name = "nivel_educacional")
    @NotEmpty
	protected String nivel_educacional;
	
	public Integer getId_estudiante() {
		return id_estudiante;
	}
	public void setId_estudiante(Integer id_estudiante) {
		this.id_estudiante = id_estudiante;
	}
	public Integer getNum_telefono() {
		return num_telefono;
	}
	public void setNum_telefono(Integer num_telefono) {
		this.num_telefono = num_telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellidos;
	}
	public void setApellido(String apellido) {
		this.apellidos = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNivel_educacional() {
		return nivel_educacional;
	}
	public void setNivel_educacional(String nivel_educacional) {
		this.nivel_educacional = nivel_educacional;
	}
	@Override
	public String toString() {
		return "Estudiante [id_estudiante=" + id_estudiante + ", num_telefono=" + num_telefono + ", nombre=" + nombre
				+ ", apellido=" + apellidos + ", email=" + email + ", nivel_educacional=" + nivel_educacional + "]";
	}	
}