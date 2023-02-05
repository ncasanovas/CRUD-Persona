package com.ncasanovas.crud.entity;

import com.ncasanovas.crud.enums.TipoDeDocumento;

import javax.persistence.*;

@Entity
@Table(name = "RELACION")
public class RelacionEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="numeroDocumento1")
    private long numeroDeDocumento1;

    @Column(name="numeroDocumento2")
    private long numeroDeDocumento2;

    @Column(name="relacion")

    private String relacion;

    public RelacionEntity(long numeroDeDocumento1, long numeroDeDocumento2, String relacion) {
        this.numeroDeDocumento1 = numeroDeDocumento1;
        this.numeroDeDocumento2 = numeroDeDocumento2;
        this.relacion = relacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumeroDeDocumento1() {
        return numeroDeDocumento1;
    }

    public void setNumeroDeDocumento1(long numeroDeDocumento1) {
        this.numeroDeDocumento1 = numeroDeDocumento1;
    }

    public long getNumeroDeDocumento2() {
        return numeroDeDocumento2;
    }

    public void setNumeroDeDocumento2(long numeroDeDocumento2) {
        this.numeroDeDocumento2 = numeroDeDocumento2;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
}
