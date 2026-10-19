/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laborvizsga;

/**
 *
 * @author mcsab
 */
class CsillamPoni {
 private String nev;
 private int csillamPont;
    public CsillamPoni(String nev, int csillamPont) {
        //nev = nev; 
        if(nev == null || nev.isBlank()){
            throw new IllegalArgumentException("A nev nem lehet ures!");
        }else{
        this.nev = nev;//Missing this.
        }
        if(csillamPont < 0){
            throw new IllegalArgumentException("A csillampont nem lehet negativ!");
        }
        this.csillamPont = csillamPont;
    }
    public void adjCsillamot(int mennyiseg) {
        if(csillamPont >= 0 || mennyiseg>= 0){
            csillamPont += mennyiseg;
        }
    }
    public int getCsillamPont() {
        return csillamPont;
    }
    public String bemutatkozas() {
        return nev + ": " + csillamPont;
    }
    public String getNev(){
        return nev;//new getter
    }
}