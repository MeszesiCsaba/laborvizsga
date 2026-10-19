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
        this.nev = nev;//Missing this.
        this.csillamPont = csillamPont;
    }
    public void adjCsillamot(int mennyiseg) {
        csillamPont += mennyiseg;
    }
    public int getCsillamPont() {
        return csillamPont;
    }
    public String bemutatkozas() {
        return nev + ": " + csillamPont;
    }
    public String getNev(){
        return nev;
    }
}