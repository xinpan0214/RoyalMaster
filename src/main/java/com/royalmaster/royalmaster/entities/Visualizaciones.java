package com.royalmaster.royalmaster.entities;
// Generated 23/10/2015 10:18:54 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Visualizaciones generated by hbm2java
 */
@Entity
@Table(name="visualizaciones"
    ,catalog="RoyalMaster"
)
public class Visualizaciones  implements java.io.Serializable {


     private Integer idVisualizacion;
     private PeliculasXcliente peliculasXcliente;
     private String fechaVisualizacion;
     private Date visualizacionescol;

    public Visualizaciones() {
    }

    public Visualizaciones(PeliculasXcliente peliculasXcliente, String fechaVisualizacion, Date visualizacionescol) {
       this.peliculasXcliente = peliculasXcliente;
       this.fechaVisualizacion = fechaVisualizacion;
       this.visualizacionescol = visualizacionescol;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idVisualizacion", unique=true, nullable=false)
    public Integer getIdVisualizacion() {
        return this.idVisualizacion;
    }
    
    public void setIdVisualizacion(Integer idVisualizacion) {
        this.idVisualizacion = idVisualizacion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idPeliculasXCliente", nullable=false)
    public PeliculasXcliente getPeliculasXcliente() {
        return this.peliculasXcliente;
    }
    
    public void setPeliculasXcliente(PeliculasXcliente peliculasXcliente) {
        this.peliculasXcliente = peliculasXcliente;
    }

    
    @Column(name="fechaVisualizacion", nullable=false, length=45)
    public String getFechaVisualizacion() {
        return this.fechaVisualizacion;
    }
    
    public void setFechaVisualizacion(String fechaVisualizacion) {
        this.fechaVisualizacion = fechaVisualizacion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="visualizacionescol", nullable=false, length=19)
    public Date getVisualizacionescol() {
        return this.visualizacionescol;
    }
    
    public void setVisualizacionescol(Date visualizacionescol) {
        this.visualizacionescol = visualizacionescol;
    }




}


