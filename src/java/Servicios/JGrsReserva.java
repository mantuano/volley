/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.*;
import Gestiones.*;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author JhonAndres
 */
@Path("Reserva")
public class JGrsReserva {
    
    public static List<JGreserva> listaAuxiliar=new ArrayList<>();
    public GestionReseva gr=new GestionReseva();
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<JGreserva> consultar()
    {
         gr.setListaDeReserva(listaAuxiliar);
         /*gr.insertar(new JGreserva("1","12/08/2015","Colombia",new ArrayList<JGAsiento>(){{
            add(new JGAsiento ("2","200","suerpra","trasera"));}},"0802268615"));*/
         return gr.consultar();
    }
    @GET
    @Path("{paramconsultar}")
    @Produces({MediaType.APPLICATION_JSON})
    public JGreserva consultaindividual (@PathParam("paramconsultar") String parametro )
    {
        
        gr.setListaDeReserva(listaAuxiliar);
        return gr.consultarIndividual(parametro);
       
    }
    
    @DELETE
    @Path ("{parameliminar}")
    public void eliminar( @PathParam("parameliminar") String parametro )
    {
       
        JGreserva r=new JGreserva(parametro,null,null,null,null);
        gr.setListaDeReserva(listaAuxiliar);
        gr.eliminar(r);
    }
    
    
    @POST
    @Consumes ({ MediaType.APPLICATION_JSON  })
    public void insertar(JGreserva v)
    {
        gr.setListaDeReserva(listaAuxiliar);
        gr.insertar(v);
    }
    
    @PUT
    @Consumes ({ MediaType.APPLICATION_JSON })
    public void modificar(JGreserva v)
    {
        gr.setListaDeReserva(listaAuxiliar);
        gr.modificar(v);
    }
}
