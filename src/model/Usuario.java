/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lisseth
 */
public class Usuario {
    private int IDUsuario;
    private String Usuario;
    private String NombreApellidos;
    private String Identificacion;
    private String IdTipoUsuario;
    
    private static Usuario instance;
   
    /*
    public Usuario(int idusuario, String usuario, String nombreapellido, String identificacion, String idtipous ){
        this.IDUsuario = idusuario;
        this.Usuario = usuario;
        this.NombreApellidos = nombreapellido;
        this.Identificacion = identificacion;
        this.IdTipoUsuario = idtipous;
    }*/
    
    private Usuario(){
        
    }
    
    
    /**
     * @return the IDUsuario
     */
    public int getIDUsuario() {
        return IDUsuario;
    }

    /**
     * @param IDUsuario the IDUsuario to set
     */
    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the NombreApellidos
     */
    public String getNombreApellidos() {
        return NombreApellidos;
    }

    /**
     * @param NombreApellidos the NombreApellidos to set
     */
    public void setNombreApellidos(String NombreApellidos) {
        this.NombreApellidos = NombreApellidos;
    }

    /**
     * @return the Identificacion
     */
    public String getIdentificacion() {
        return Identificacion;
    }

    /**
     * @param Identificacion the Identificacion to set
     */
    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    /**
     * @return the IdTipoUsuario
     */
    public String getIdTipoUsuario() {
        return IdTipoUsuario;
    }

    /**
     * @param IdTipoUsuario the IdTipoUsuario to set
     */
    public void setIdTipoUsuario(String IdTipoUsuario) {
        this.IdTipoUsuario = IdTipoUsuario;
    }
    
    public static Usuario getInstance() {
        if (instance == null)
            instance = new Usuario();
        return instance;
    }
}
