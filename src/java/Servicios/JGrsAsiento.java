/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.JGAsiento;
import Gestiones.GestionAsiento;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author JhonAndres
 */
@Path("Asiento")
public class JGrsAsiento {
    public static List<JGAsiento> listaAuxiliar=new ArrayList<>();
    public GestionAsiento gc=new GestionAsiento();
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<JGAsiento> consultar()
    {
         gc.setListaDeAsiento(listaAuxiliar);
         //gc.insertar(new JGAsiento("1","300","asientopra","Manta"));
        return gc.consultar();
    }
    @GET
    @Path("{paramconsultar}")
    @Produces({MediaType.APPLICATION_JSON})
    public JGAsiento consultaindividual (@PathParam("paramconsultar") String parametro  )
    {
        
        gc.setListaDeAsiento(listaAuxiliar);
        return gc.consultarIndividual(parametro);
    }
    
    @DELETE
    @Path ("{parameliminar}")
    public void eliminar( @PathParam("parameliminar") String parametro )
    {
       
        JGAsiento c=new JGAsiento(parametro, null,null,null);
        gc.setListaDeAsiento(listaAuxiliar);
        gc.eliminar(c);
    }
    
    
    @POST
    @Consumes ({ MediaType.APPLICATION_JSON  })
    public void insertar(JGAsiento v)
    {
        gc.setListaDeAsiento(listaAuxiliar);
        gc.insertar(v);
    }
    
    @PUT
    @Consumes ({ MediaType.APPLICATION_JSON })
    public void modificar(JGAsiento v)
    {
        gc.setListaDeAsiento(listaAuxiliar);
        gc.modificar(v);
    }
    
}
