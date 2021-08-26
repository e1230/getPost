/*
    Se conecta con la base de datos
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.ContactoDTO;

/**
 *
 * @author Edgar
 */
public class ContactoDAO {
    private static final List<ContactoDTO> lista = new ArrayList<>();
    
    public ContactoDAO(){
        
    }
    
    public boolean crear(ContactoDTO contact){
        if(contact!=null){
            lista.add(contact);
            return true;
        }else{
            return false;
        }
    }
    
    public List<ContactoDTO> readAll(){
        List<ContactoDTO> obj=null;
        obj= lista;
        return obj;
    }
}
