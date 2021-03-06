/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

import java.util.Objects;

/**
 *
 * @author Edgar
 */
public class ContactoDTO {
    private String nombre;
    private String correo;
    private String asunto;
    private String comentario;
    
    //metodos
    
    //constructores

    public ContactoDTO(String nombre, String correo, String asunto, String comentario) {
        this.nombre = nombre;
        this.correo = correo;
        this.asunto = asunto;
        this.comentario = comentario;
    }
    
    public ContactoDTO() {
        this.nombre = "";
        this.correo = "";
        this.asunto = "";
        this.comentario = "";
    }
    
    //to string

    @Override
    public String toString() {
        return "nombre: "+nombre+" asunto: "+asunto;
    }
    
        
    //hash equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.correo);
        hash = 79 * hash + Objects.hashCode(this.asunto);
        hash = 79 * hash + Objects.hashCode(this.comentario);
        return hash;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContactoDTO other = (ContactoDTO) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.asunto, other.asunto)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
