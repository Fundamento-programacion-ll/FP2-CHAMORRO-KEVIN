package com.crud.dao;

import com.crud.modelo.Cliente;
import com.crud.modelo.Perfil;
import java.util.List;

public interface ICliente {

    public List<Cliente> ListarClientes();

    public Cliente BuscarClienteCedula(String cedula);

    public void InsertarCliente(Cliente cli);

    public void ActualizarCliente(Cliente cliente);

    public void EliminarCliente(String ced);

    public Perfil autenticarUsuario(String usuario, String clave);
}
