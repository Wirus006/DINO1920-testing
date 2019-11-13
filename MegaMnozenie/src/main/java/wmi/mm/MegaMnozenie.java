/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.mm;

/**
 *
 * @author bikol
 */
public class MegaMnozenie {
    public static String mnozenie(String a, String b){
        try {
            int aa = Integer.parseInt(a);
            int bb = Integer.parseInt(b);
            if(aa <=100 && bb <=100){
                return Integer.toString(aa*bb);
            } else {
                throw new IllegalArgumentException();
            }
        }
        catch(Exception ex) {
            double aa = Double.parseDouble(a);
            double bb = Double.parseDouble(b);
            if(aa <=100 && bb <=100){
                return Double.toString(aa*bb);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
