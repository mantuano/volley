/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JhonAndres
 */
@XmlRootElement
public class JGreserva {
    private String codigodereserva;
    private String fechadereserva;
    private String destinoaviajar;
    private List<JGAsiento> listaasiento;
    private String cedula;

    public JGreserva() {
    }

    public JGreserva(String codigodereserva, String fechadereserva, String destinoaviajar, List<JGAsiento> listaasiento, String cedula) {
        this.codigodereserva = codigodereserva;
        this.fechadereserva = fechadereserva;
        this.destinoaviajar = destinoaviajar;
        this.listaasiento = listaasiento;
        this.cedula = cedula;
    }
    

    public String getCodigodereserva() {
        return codigodereserva;
    }

    public void setCodigodereserva(String codigodereserva) {
        this.codigodereserva = codigodereserva;
    }

    public String getFechadereserva() {
        return fechadereserva;
    }

    public void setFechadereserva(String fechadereserva) {
        this.fechadereserva = fechadereserva;
    }

    public String getDestinoaviajar() {
        return destinoaviajar;
    }

    public void setDestinoaviajar(String destinoaviajar) {
        this.destinoaviajar = destinoaviajar;
    }

    public List<JGAsiento> getListaasiento() {
        return listaasiento;
    }

    public void setListaasiento(List<JGAsiento> listaasiento) {
        this.listaasiento = listaasiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
