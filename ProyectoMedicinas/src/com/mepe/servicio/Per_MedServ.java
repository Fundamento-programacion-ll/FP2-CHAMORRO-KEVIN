package com.mepe.servicio;

import com.mepe.dao.Per_MedMetodos;
import com.mepe.modelo.Per_Med;

public class Per_MedServ {
    public static void InsertarPerMed(Per_Med perMed){
        new Per_MedMetodos().InsertarPer_Med(perMed);
    }
}
