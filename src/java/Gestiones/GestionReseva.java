/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;


import Clases.JGreserva;
import java.util.List;

/**
 *
 * @author JhonAndres
 */
public class GestionReseva implements ICRUD<JGreserva>{
    
    private List<JGreserva> listaDeReserva;
    
    @Override
    public void insertar(JGreserva p) {
        getListaDeReserva().add(p);
    }

    @Override
    public void modificar(JGreserva p) {
        JGreserva A = listaDeReserva.stream().
                filter(x -> x.getCodigodereserva().equals(p.getCodigodereserva()))
                .findFirst().get();  
        A.setCedula(p.getCedula());
        A.setDestinoaviajar(p.getDestinoaviajar());
        A.setFechadereserva(p.getFechadereserva());
        A.setListaasiento(p.getListaasiento());
    }

    @Override
    public void eliminar(JGreserva p) {
        JGreserva Auxiliar=consultarIndividual(p.getCodigodereserva());
        listaDeReserva.remove(Auxiliar);
    }

    @Override
    public List<JGreserva> consultar() {
        return listaDeReserva;
    }

    @Override
    public JGreserva consultaIndividual(JGreserva p) {
        try 
        {
                return listaDeReserva.stream().
                filter(x -> x.getCodigodereserva().equals(p.getCodigodereserva()))
                .findFirst().get() ;
        }
        catch (Exception ex)
        {
            return null;
        }
    }

    public List<JGreserva> getListaDeReserva() {
        return listaDeReserva;
    }

    public void setListaDeReserva(List<JGreserva> listaDeReserva) {
        this.listaDeReserva = listaDeReserva;
    }
    
     public JGreserva consultarIndividual(String parametro) {
        try 
        {
                return getListaDeReserva().stream().
                filter(x -> x.getCodigodereserva().equals(parametro) )
                .findFirst().get() ;
        }
        catch (Exception ex)
        {
            return null;
        }
        finally
        {
            
        }
    }
    
}
