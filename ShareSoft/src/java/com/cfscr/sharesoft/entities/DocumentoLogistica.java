/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfscr.sharesoft.entities;

/**
 *
 * @author pablo.elizondo
 */
public class DocumentoLogistica {
    private float fs_Terrestre, fs_Maritimo, fs_Aereo;
    private float nac_Timbres, nac_ServAduanas, nac_BodFiscal, nac_BodGeneral, nac_TrasLocal, nac_TrasCaucionado, nac_LiberaDocs, nac_DAI, nac_Ley6946, nac_ServExportacion, nac_ServVarios; 
    
    //CONSTRUCTORES CON Y SIN PARAMETROS
    public DocumentoLogistica() {
        this.fs_Terrestre = 0.f;
        this.fs_Maritimo = 0.f;
        this.fs_Aereo = 0.f;
        
        this.nac_Timbres = 0.f;
        this.nac_ServAduanas = 0.f;
        this.nac_BodFiscal = 0.f;
        this.nac_BodGeneral = 0.f;
        this.nac_TrasLocal = 0.f;
        this.nac_TrasCaucionado = 0.f;
        this.nac_LiberaDocs = 0.f;
        this.nac_DAI = 0.f;
        this.nac_Ley6946 = 0.f;
        this.nac_ServExportacion = 0.f;
        this.nac_ServVarios = 0.f;
    }

    public DocumentoLogistica(float pFs_Terrestre, float pFs_Maritimo, float pFs_Aereo,
            float pNac_Timbres, float pNac_ServAduanas, float pNac_BodFiscal, float pNac_BodGeneral, float pNac_TrasLocal, float pNac_TrasCaucionado, float pNac_LiberaDocs, float pNac_DAI, float pNac_Ley6946, float pNac_ServExportacion, float pNac_ServVarios) {
        this.fs_Terrestre = pFs_Terrestre;
        this.fs_Maritimo = pFs_Maritimo;
        this.fs_Aereo = pFs_Aereo;
        this.nac_Timbres = pNac_Timbres;
        this.nac_ServAduanas = pNac_ServAduanas;
        this.nac_BodFiscal = pNac_BodFiscal;
        this.nac_BodGeneral = pNac_BodGeneral;
        this.nac_TrasLocal = pNac_TrasLocal;
        this.nac_TrasCaucionado = pNac_TrasCaucionado;
        this.nac_LiberaDocs = pNac_LiberaDocs;
        this.nac_DAI = pNac_DAI;
        this.nac_Ley6946 = pNac_Ley6946;
        this.nac_ServExportacion = pNac_ServExportacion;
        this.nac_ServVarios = pNac_ServVarios;
    }
    
    //SETS AND GETS
    public void setFs_Terrestre(float pFs_Terrestre) { this.fs_Terrestre = pFs_Terrestre; }
    public void setFs_Maritimo(float pFs_Maritimo) { this.fs_Maritimo = pFs_Maritimo; }
    public void setFs_Aereo(float pFs_Aereo) { this.fs_Aereo = pFs_Aereo; }
    public void setNac_Timbres(float pNac_Timbres) { this.nac_Timbres = pNac_Timbres; }
    public void setNac_ServAduanas(float pNac_ServAduanas) { this.nac_ServAduanas = pNac_ServAduanas; }
    public void setNac_BodFiscal(float pNac_BodFiscal) { this.nac_BodFiscal = pNac_BodFiscal; }
    public void setNac_BodGeneral(float pNac_BodGeneral) { this.nac_BodGeneral = pNac_BodGeneral; }
    public void setNac_TrasLocal(float pNac_TrasLocal) { this.nac_TrasLocal = pNac_TrasLocal; }
    public void setNac_TrasCaucionado(float pNac_TrasCaucionado) { this.nac_TrasCaucionado = pNac_TrasCaucionado; }
    public void setNac_LiberaDocs(float pNac_LiberaDocs) { this.nac_LiberaDocs = pNac_LiberaDocs; }
    public void setNac_DAI(float pNac_DAI) { this.nac_DAI = pNac_DAI; }
    public void setNac_Ley6946(float pNac_Ley6946) { this.nac_Ley6946 = pNac_Ley6946; }
    public void setNac_ServExportacion(float pNac_ServExportacion) { this.nac_ServExportacion = pNac_ServExportacion; }
    public void setNac_ServVarios(float pNac_ServVarios) { this.nac_ServVarios = pNac_ServVarios; }

    public float getFs_Terrestre() { return this.fs_Terrestre; }
    public float getFs_Maritimo() { return this.fs_Maritimo; }
    public float getFs_Aereo() { return this.fs_Aereo; }
    public float getNac_Timbres() { return this.nac_Timbres; }
    public float getNac_ServAduanas() {return this.nac_ServAduanas; }
    public float getNac_BodFiscal() { return this.nac_BodFiscal; }
    public float getNac_BodGeneral() { return this.nac_BodGeneral; }
    public float getNac_TrasLocal() { return this.nac_TrasLocal; }
    public float getNac_TrasCaucionado() { return this.nac_TrasCaucionado; }
    public float getNac_LiberaDocs() { return this.nac_LiberaDocs; }
    public float getNac_DAI() { return this.nac_DAI; }
    public float getNac_Ley6946() { return this.nac_Ley6946; }
    public float getNac_ServExportacion() { return this.nac_ServExportacion; }
    public float getNac_ServVarios() { return this.nac_ServVarios; }
}
