package controlador;

import java.util.ArrayList;

public class user {
    ArrayList listaPersonas= new ArrayList<String>();
    public String agregarPersona(String nombre){
        listaPersonas.add(nombre);
        return "nombre persona agragada "+nombre;
    }
    public String listaPersonas(){
        String lista="";
        listaPersonas.add("perro");
        listaPersonas.add("perro2");
        for (int i = 0; i <listaPersonas.size(); i++) {
            System.out.println(listaPersonas.get(i));
            lista +=listaPersonas.get(i).toString()+"\n";
        }
        return lista;
    }
}
