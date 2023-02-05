package com.ncasanovas.crud.entity;

import com.ncasanovas.crud.enums.TipoDeDocumento;

import javax.persistence.*;

@Entity
@Table(name = "PERSONA")
public class PersonaEntity {

    @Id
    @Column(name="numeroDocumento")
    private long numeroDeDocumento;
    @Id
    @Column(name="tipoDocumento")
    private TipoDeDocumento tipoDeDocumento;

    @Id
    @Column(name="pais")
    private String pais;

    @Column(name="contacto")
    private String datoDeContacto;

    public PersonaEntity(long numeroDeDocumento, TipoDeDocumento tipoDeDocumento, String pais, String datoDeContacto) {
        this.numeroDeDocumento = numeroDeDocumento;
        this.tipoDeDocumento = tipoDeDocumento;
        this.pais = pais;
        this.datoDeContacto = datoDeContacto;
    }

    public long getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(long numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public TipoDeDocumento getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDatoDeContacto() {
        return datoDeContacto;
    }

    public void setDatoDeContacto(String datoDeContacto) {
        this.datoDeContacto = datoDeContacto;
    }
}
