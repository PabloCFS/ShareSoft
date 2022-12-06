/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfscr.sharesoft.exe;

import com.cfscr.sharesoft.excel.CargarDocLogistica;
import com.cfscr.sharesoft.excel.LecturaExcel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo.elizondo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        LecturaExcel lecturaExcel = new LecturaExcel();
        
        File f2 = new File("C:/Digitalizacion/3-R-3.1 Calculo de Suministro-Horas v22.xlsx");
        List lista2 = new ArrayList();
        CargarDocLogistica cargarLogistica = new CargarDocLogistica();
        
        lista2 = lecturaExcel.leerExcel(f2);
        cargarLogistica.obtener(lista2);
        
        //=============
        File f = new File("C:/Digitalizacion");
        String[] nombres_archivos = f.list();
        
        for(int i=0; i<nombres_archivos.length; i++){
            System.out.println("Archivos -> " + nombres_archivos[i]);
        }
    }
}
