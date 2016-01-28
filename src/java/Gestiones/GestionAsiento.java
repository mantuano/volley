/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import Clases.JGAsiento;
import java.util.List;

/**
 *
 * @author JhonAndres
 */
public class GestionAsiento implements ICRUD<JGAsiento>{

    private List<JGAsiento> listaDeAsiento;
    @Override
    public void insertar(JGAsiento p) {
        getListaDeAsiento().add(p);
    }

    @Override
    public void modificar(JGAsiento p) {
        JGAsiento A = listaDeAsiento.stream().
                filter(x -> x.getCodigo().equals(p.getCodigo()))
                .findFirst().get();  
        A.setPrecio(p.getPrecio());
        A.setClase(p.getClase());
        A.setUbicacion(p.getUbicacion());
        
    }

    @Override
    public void eliminar(JGAsiento p) {
        JGAsiento Auxiliar=consultarIndividual(p.getCodigo());
        listaDeAsiento.remove(Auxiliar);
    }

    @Override
    public List<JGAsiento> consultar() {
        return listaDeAsiento;
    }

    @Override
    public JGAsiento consultaIndividual(JGAsiento p) {
        try 
        {
                return listaDeAsiento.stream().
                filter(x -> x.getCodigo().equals(p.getCodigo()))
                .findFirst().get() ;
        }
        catch (Exception ex)
        {
            return null;
        }
    }

    public List<JGAsiento> getListaDeAsiento() {
        return listaDeAsiento;
    }

    public void setListaDeAsiento(List<JGAsiento> listaDeAsiento) {
        this.listaDeAsiento = listaDeAsiento;
    }
    
        public JGAsiento consultarIndividual(String parametro) {
        try 
        {
                return getListaDeAsiento().stream().
                filter(x -> x.getCodigo().equals(parametro) )
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
