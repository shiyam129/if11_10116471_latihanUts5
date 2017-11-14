/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116471_latihanutss5;

/**
 *
 * @author thosiba c55-b5101
 */
public class Segitiga implements BangunDatar  {
    int luas;
    int keliling;
    final int sisiAb = 50;
    final int sisiBc = 60;
    final int sisiCa = 70;
    final int alas = 100;
    final int tinggi = 120;

    
    public void hitungLuas() {
        luas = (int) (0.5 * alas * tinggi);
        System.out.println("Luas Segitu : "+luas);
    }

    
    public void hitungKeliling() {
       keliling = sisiAb+sisiBc+sisiCa;
        System.out.println("Keliling Segita : "+keliling);
    }
    
    
}
