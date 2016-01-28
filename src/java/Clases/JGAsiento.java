/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JhonAndres
 */
@XmlRootElement
public class JGAsiento {
    
    private String codigo;
    private String precio;
    private String clase;
    private String ubicacion;

    public JGAsiento() {
    }

    public JGAsiento(String codigo, String precio, String clase, String ubicacion) {
        this.codigo = codigo;
        this.precio = precio;
        this.clase = clase;
        this.ubicacion = ubicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
