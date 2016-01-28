/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import java.util.List;

/**
 *
 * @author JhonAndres
 */
public interface ICRUD<parametro> {
    public abstract void insertar(parametro p);
    public abstract void modificar(parametro p);
    public abstract void eliminar(parametro p);
    public abstract List<parametro> consultar(); 
    public abstract parametro consultaIndividual(parametro p); 
    
}
