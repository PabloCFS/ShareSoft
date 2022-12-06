/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfscr.sharesoft.excel;

import com.cfscr.sharesoft.entities.DocumentoLogistica;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;

/**
 *
 * @author pablo.elizondo
 */
public class CargarDocLogistica {
    
    private final char abc[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public DocumentoLogistica obtener(List cellDataList){
        
        ArrayList<String> coordenadas = new ArrayList();
        ArrayList<Float> datos = new ArrayList();
        
        for(int i=0; i<cellDataList.size(); i++){
            List cellTempList = (List) cellDataList.get(i);
            
            for(int j=0; j<cellTempList.size(); j++){
                XSSFCell hssfCell = (XSSFCell) cellTempList.get(j);
                
                if(hssfCell.toString().equals("FLETE CON SEGURO")){
                    coordenadas = retornaCoordenadas(hssfCell.getCTCell().getR());
                }
                
                for(int k=0; k<coordenadas.size(); k++){
                    if(hssfCell.getCTCell().getR().equals(coordenadas.get(k))){
                        datos.add(retornaDato(hssfCell));
                    }
                }
            }
        }
        
        DocumentoLogistica documento = new DocumentoLogistica(datos.get(0),datos.get(1),datos.get(2),datos.get(3),
                datos.get(4),datos.get(5),datos.get(6),datos.get(7),datos.get(8),datos.get(9),datos.get(10),datos.get(11),datos.get(12),datos.get(13));
        
        return documento;    
    }
    //FUNCIONA PARA RETORNAR LAS COORDENADAS
    private ArrayList<String> retornaCoordenadas(String coordenada){
        
        char[] caracteres = coordenada.toCharArray();
        int num = Integer.parseInt(caracteres[1] + "" + caracteres[2]);
        
        ArrayList<String> vectorCoordenadas = new ArrayList<String>();
        
        for(int i=0; i<abc.length; i++){
            if(abc[i] == caracteres[0]){
                for(int j=0; j<=2; j++){
                    vectorCoordenadas.add(abc[i+3] + "" + (num+j));
                }
                
                for(int j=4; j<=14; j++){
                    vectorCoordenadas.add(abc[i+3] + "" + (num+j));
                }
            }
        }
        return vectorCoordenadas;
    }
    
    //RETORNA EL DATO DE CADA CELDA
    private float retornaDato(XSSFCell hssfCell){
        
        float dato = 0.f;
        
        switch(hssfCell.getCellType()){
            case XSSFCell.CELL_TYPE_NUMERIC:
                dato = (float) hssfCell.getNumericCellValue();
                break;
            case XSSFCell.CELL_TYPE_STRING:
                dato = (float) 0.0;
                break;
        }
        return dato;
    }
}