package com.mepe.servicio;

import com.mepe.dao.UsuarioMetodos;
import com.mepe.modelo.Usuario;
import java.util.List;

public class UsuarioServ {
    //listar metodos 
    public static List<Usuario> ListarUsuario(){
        return new UsuarioMetodos().ListarUsuario();
    }
    public static Usuario BuscarUsuarioId(int id){
        return new UsuarioMetodos().BuscarUsuarioId(id);
    }
    public static Usuario BuscarUsuarioUsu(String usu){
        return new UsuarioMetodos().BuscarUsuarioUsu(usu);
    }
    public static Usuario BuscarUsuarioNombre(String nom){
        return new UsuarioMetodos().BuscarUsuarioNombre(nom);
    }
    public static Usuario AutenticarUsuario(String usu,String cla){
        return new UsuarioMetodos().autenticarUsuario(usu, cla);
    }
    public static void InsertarUsuario(Usuario usu){
        new UsuarioMetodos().InsertarUsuario(usu);
    }
    public static void ActualizarUsuario(Usuario usu){
        new UsuarioMetodos().ActualizarUsuario(usu);
    }
    public static void EliminarUsuario(int id){
        new UsuarioMetodos().EliminarUsuario(id);
    }
        
}
