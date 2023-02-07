package com.ncasanovas.crud.entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="PERSONA")
public class PersonaEntity implements Serializable {

    @Id
    @Column(name="documento")
    private Integer nroDeDocumento;

    @Column(name="tipo")
    private String tipoDeDocumento;

    @Column(name="pais")
    private String pais;

    @Column(name="edad")
    private Integer edad;

    @Column(name="contacto")
    private String datosDeContacto;

    public PersonaEntity() {
    }

    public PersonaEntity(Integer numeroDeDocumento, String tipoDeDocumento, String pais, int edad, String datosDeContacto) {
        this.nroDeDocumento = numeroDeDocumento;
        this.tipoDeDocumento = tipoDeDocumento;
        this.pais = pais;
        this.edad = edad;
        this.datosDeContacto = datosDeContacto;
    }

    public Integer getNroDeDocumento() {
        return nroDeDocumento;
    }

    public void setNroDeDocumento(Integer nroDeDocumento) {
        this.nroDeDocumento = nroDeDocumento;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDatosDeContacto() {
        return datosDeContacto;
    }

    public void setDatosDeContacto(String datosDeContacto) {
        this.datosDeContacto = datosDeContacto;
    }
}
