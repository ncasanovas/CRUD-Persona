package com.ncasanovas.crud.entity;

import javax.persistence.*;

@Entity
@Table(name = "RELACION")
public class RelacionEntity {

    @Id
    @Column(name="numeroDocumento1")
    private Integer numeroDeDocumento1;

    @Column(name="numeroDocumento2")
    private Integer numeroDeDocumento2;

    @Column(name="relacion")

    private String relacion;

    public RelacionEntity(Integer numeroDeDocumento1, Integer numeroDeDocumento2, String relacion) {
        this.numeroDeDocumento1 = numeroDeDocumento1;
        this.numeroDeDocumento2 = numeroDeDocumento2;
        this.relacion = relacion;
    }

    public RelacionEntity() {
    }

    public Integer getNumeroDeDocumento1() {
        return numeroDeDocumento1;
    }

    public void setNumeroDeDocumento1(Integer numeroDeDocumento1) {
        this.numeroDeDocumento1 = numeroDeDocumento1;
    }

    public Integer getNumeroDeDocumento2() {
        return numeroDeDocumento2;
    }

    public void setNumeroDeDocumento2(Integer numeroDeDocumento2) {
        this.numeroDeDocumento2 = numeroDeDocumento2;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
}
