package com.crud.servicio;

import com.crud.modelo.Cliente;
import com.crud.dao.ClienteMetodos;
import com.crud.modelo.Perfil;
import java.util.List;

public class ClienteServ {

    public static List<Cliente> ListarClientes() {
        return new ClienteMetodos().ListarClientes();
    }

    public static Cliente BuscarClienteCedula(String cedula) {
        return new ClienteMetodos().BuscarClienteCedula(cedula);
    }

    public static void InsertarCliente(Cliente cli) {
        new ClienteMetodos().InsertarCliente(cli);
    }

    public static void ActualizarCliente(Cliente cli) {
        new ClienteMetodos().ActualizarCliente(cli);
    }

    public static void EliminarCliente(String ced) {
        new ClienteMetodos().EliminarCliente(ced);
    }
    
     public static Perfil autenticarUsuario(String usuario, String clave){
        return new ClienteMetodos().autenticarUsuario(usuario, clave);
    }
}

