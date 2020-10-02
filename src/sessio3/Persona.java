package sessio3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alpez
 */
public class Persona implements Comparable<Persona> {
    private String nom;
    private int id;

    public Persona(String nom, int age) {
        this.nom = nom;
        this.id = age;
    }

    
    public String getNom() {
        return nom;
    }

    public int getAge() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.id = age;
    }

    @Override
    public int compareTo(Persona o) {
       return this.id - o.id;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", id=" + id + '}';
    }
    
}
