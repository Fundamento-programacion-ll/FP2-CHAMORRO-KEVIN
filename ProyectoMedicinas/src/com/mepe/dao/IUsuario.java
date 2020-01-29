package com.mepe.dao;

import com.mepe.modelo.Usuario;
import java.util.List;

public interface IUsuario {
    public List<Usuario> ListarUsuario();
    public Usuario BuscarUsuarioId(int id);
    public Usuario BuscarUsuarioUsu(String usu);
    public Usuario BuscarUsuarioNombre(String nom);
    public void InsertarUsuario(Usuario usu);
    public void ActualizarUsuario(Usuario usu);
    public void EliminarUsuario(int id);
    public Usuario autenticarUsuario(String usuario, String clave);
}
