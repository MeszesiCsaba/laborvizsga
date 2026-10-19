/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laborvizsga;

/**
 *
 * @author mcsab
 */
public class Main {

    public static void main(String[] args) {
        CsillamPoni simap = new CsillamPoni("SimaCsillamPoni" ,8);//Creating a new Csillamponi object using the Csillamponi class
        System.out.println(simap.bemutatkozas());
        
        CsillamPoni p = new RepuloCsillamPoni(
        "CsillamKapitan", 7, "lila");
        p.adjCsillamot(3);
        System.out.println(p.bemutatkozas());
        
        // Expected: 3 (days 3, 4 and 5)
        int[] NapiPontok = {4, 7, 9, 9, 8, 2, 10};
        System.out.println(leghosszabbCsillamSorozat(NapiPontok,8));
        // Expected: 0
        System.out.println(leghosszabbCsillamSorozat(new int[0], 5));
    }
     public static int leghosszabbCsillamSorozat(int[] Napipontok, int minimum){
        int sorozat = 0;
        int i=0;
        while(i<=7){
        if(Napipontok[i]>minimum){
            sorozat+=1;
        }
        i++;
        }
        return sorozat;
    }
}
