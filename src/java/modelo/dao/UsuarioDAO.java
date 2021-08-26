/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.UsuarioDTO;

/**
 *
 * @author Edgar
 */
public class UsuarioDAO {
     private static final List<UsuarioDTO> lista = new ArrayList<>();
    
    public UsuarioDAO(){
        
    }
    
    public void datosPruebas(){
        UsuarioDTO usu = new UsuarioDTO(1,"edgar","correo@correo.com","e1230",UsuarioDTO.ADMINISTRADOR);
        UsuarioDTO usu1 = new UsuarioDTO(2,"milena","correo2@correo.com","m0206",UsuarioDTO.VENDEDOR);
        UsuarioDTO usu2 = new UsuarioDTO(3,"mauricio","correo3@correo.com","850518",UsuarioDTO.CLIENTE);
        lista.add(usu);
        lista.add(usu1);
        lista.add(usu2);
    }
    
    public boolean crear(UsuarioDTO usuario){
        if(usuario!=null){
            lista.add(usuario);
            return true;
        }else{
            return false;
        }
    }
    
    public List<UsuarioDTO> readAll(){
        List<UsuarioDTO> obj=null;
        obj= lista;
        return obj;
    }
}
