package com.royalmaster.royalmaster.entities;
// Generated 23/10/2015 10:18:54 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PeliculasXcliente generated by hbm2java
 */
@Entity
@Table(name="peliculasXCliente"
    ,catalog="RoyalMaster"
)
public class PeliculasXcliente  implements java.io.Serializable {


     private Integer idPeliculasXcliente;
     private Peliculas peliculas;
     private Usuarios usuarios;
     private Date fechaCompra;
     private double precioPelicula;
     private Set visualizacioneses = new HashSet(0);

    public PeliculasXcliente() {
    }

	
    public PeliculasXcliente(Peliculas peliculas, Usuarios usuarios, Date fechaCompra, double precioPelicula) {
        this.peliculas = peliculas;
        this.usuarios = usuarios;
        this.fechaCompra = fechaCompra;
        this.precioPelicula = precioPelicula;
    }
    public PeliculasXcliente(Peliculas peliculas, Usuarios usuarios, Date fechaCompra, double precioPelicula, Set visualizacioneses) {
       this.peliculas = peliculas;
       this.usuarios = usuarios;
       this.fechaCompra = fechaCompra;
       this.precioPelicula = precioPelicula;
       this.visualizacioneses = visualizacioneses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idPeliculasXCliente", unique=true, nullable=false)
    public Integer getIdPeliculasXcliente() {
        return this.idPeliculasXcliente;
    }
    
    public void setIdPeliculasXcliente(Integer idPeliculasXcliente) {
        this.idPeliculasXcliente = idPeliculasXcliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idPelicula", nullable=false)
    public Peliculas getPeliculas() {
        return this.peliculas;
    }
    
    public void setPeliculas(Peliculas peliculas) {
        this.peliculas = peliculas;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idCliente", nullable=false)
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechaCompra", nullable=false, length=10)
    public Date getFechaCompra() {
        return this.fechaCompra;
    }
    
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    
    @Column(name="precioPelicula", nullable=false, precision=22, scale=0)
    public double getPrecioPelicula() {
        return this.precioPelicula;
    }
    
    public void setPrecioPelicula(double precioPelicula) {
        this.precioPelicula = precioPelicula;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="peliculasXcliente")
    public Set getVisualizacioneses() {
        return this.visualizacioneses;
    }
    
    public void setVisualizacioneses(Set visualizacioneses) {
        this.visualizacioneses = visualizacioneses;
    }




}


