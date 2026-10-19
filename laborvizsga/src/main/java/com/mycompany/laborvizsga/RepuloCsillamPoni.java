/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laborvizsga;

/**
 *
 * @author mcsab
 */
public class RepuloCsillamPoni extends CsillamPoni{
    private String szarnySzin;
    public RepuloCsillamPoni(String nev, int csillamPont,
        String szarnySzin) {
        super(nev, csillamPont);
        this.szarnySzin = szarnySzin;
 }
    public String getSzarnySzin(){
        return szarnySzin;
    }
    
    @Override
    public String bemutatkozas() {
    return "Repulo poni: " + getNev() + "pontja: " + getCsillamPont() + " szarnyanak szine: " + getSzarnySzin();//getNev instead of nev , using a getter
    }
}


