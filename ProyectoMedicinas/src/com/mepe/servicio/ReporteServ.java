package com.mepe.servicio;

import com.mepe.dao.ReporteMetodos;
import com.mepe.modelo.Reporte;
import java.util.List;

public class ReporteServ {
    public static List<Reporte> Ireporte(){
        return new ReporteMetodos().Ireporte();
    }
    
}
