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
@Table(name = "profesor") //Nombre de la tabla en la BDD cuyas tuplas son owners
@JsonSerialize(using = JacksonCustomOwnerSerializer.class)
@JsonDeserialize(using = JacksonCustomOwnerDeserializer.class)


public class Profesor {
	@Column(name = "id_profesor")
    @NotEmpty
	protected Integer id_profesor;
	
	@Column(name = "nombre")
    @NotEmpty
	protected String nombre;
	
	@Column(name = "apellidos")
    @NotEmpty
	protected String apellidos;
	
	@Column(name = "email")
    @NotEmpty
	protected String email;
	
	@Column(name = "precio")
    @NotEmpty
	protected Integer precio;
	
	@Column(name = "num_telefono")
    @NotEmpty
    @Digits(fraction = 0, integer = 9) //string de digitos 0 decimales, es un entero de 9 dig.
	protected Integer num_telefono;
	
	@Column(name = "descripcion")
    @NotEmpty
	protected Integer descripcion;
	
	@Column(name = "modalidad")
    @NotEmpty
	protected Integer modalidad;

	public Integer getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(Integer id_profesor) {
		this.id_profesor = id_profesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getNum_telefono() {
		return num_telefono;
	}

	public void setNum_telefono(Integer num_telefono) {
		this.num_telefono = num_telefono;
	}

	public Integer getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(Integer descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getModalidad() {
		return modalidad;
	}

	public void setModalidad(Integer modalidad) {
		this.modalidad = modalidad;
	}

	@Override
	public String toString() {
		return "Profesor [id_profesor=" + id_profesor + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + ", precio=" + precio + ", num_telefono=" + num_telefono + ", descripcion=" + descripcion
				+ ", modalidad=" + modalidad + "]";
	}
}
