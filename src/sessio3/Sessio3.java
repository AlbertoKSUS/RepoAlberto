/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author alpez
 */
public class Sessio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer,String> persones = new HashMap<>();
        persones.put(2,"Paco");
        persones.put(5,"Maria");
        persones.put(10, "Joan");
        
        System.out.println(">la clau 2 conté:" + persones.get(2));
        System.out.println(">la clau 20 conté:" + persones.get(20));
        System.out.println(">conté la clau 20?" + persones.containsKey(20));
        
        
        persones.put(2,"substituit");
        
        System.out.println(">la clau 2 conté:"+persones.get(2));
        
        for(String p: persones.values()){
            System.out.println(">"+ p);
        }
        System.out.println("-----------------------------s");
        for(Integer k: persones.keySet()){
            System.out.println(">"+ k);
        }
        
        String[] frase ={"Hola", "bon",  "dia", "fa", "bon",  "dia" , "avui", "Hola"};
        Map<String,Integer> freq = new HashMap<>();
        for (int i = 0; i < frase.length;++i){
            frase[i] = frase[i].toUpperCase();
           boolean answer = freq.containsKey(frase[i]);
           if (answer){
               int aux = freq.get(frase[i]);
               ++aux;
               freq.put(frase[i], aux);
           }else{
               freq.put(frase[i],1);
           }
           
         
        }        
        System.out.println("-----------------------------");
        for(String k: freq.keySet()){
            System.out.println(">"+ k +"-->Valor:" + freq.get(k));
           
        }
        Set<String> paraules = freq.keySet();
        ArrayList<String> llistaParaules = new ArrayList<>();
        for(String p:freq.keySet()){
            llistaParaules.add(p);
        }
        Collections.sort(llistaParaules);
        
        for(String paraula:llistaParaules){
            System.out.println(">"+paraula+": ocurrencies ->"+freq.get(paraula));
        }
        
    }
    
}
