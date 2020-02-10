package trabajo_en_clase_sueldos;


public class administrativo extends persona{
    
    private String area;
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public administrativo(String area, String nombre, String apellido, String genero, int edad, int ci, int sueldo) {
        super(nombre, apellido, genero, edad, ci, sueldo);
        this.area = area;
    }

    public administrativo() {
    }

    
    
    @Override
    public int calcularsueldo() {
        
        return getSueldo();
    }  
}
