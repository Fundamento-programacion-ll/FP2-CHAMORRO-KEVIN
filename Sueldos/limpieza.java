package trabajo_en_clase_sueldos;

public class limpieza extends persona{
    
    private String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public limpieza(String turno, String nombre, String apellido, String genero, int edad, int ci, int sueldo) {
        super(nombre, apellido, genero, edad, ci, sueldo);
        this.turno = turno;
    }

    public limpieza() {
    }
    
    @Override
    public int calcularsueldo() {
        return getSueldo();
    } 
}
