/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TestUser
 */
import java.util.ArrayList;

public class CrayonBox {

    private ArrayList<Crayon> crayons;

    public Memento createMemento() {
        return new Memento(crayons);
    }

    public void restoreFromMemento(Memento memento) {
    }

    public void addCrayon(Crayon crayonToAdd) {
        crayons.add(crayonToAdd);
    }

    public void removeCrayon(int crayonToRemove) {
        crayons.remove(crayonToRemove);
    }

    public CrayonBox() {
        this.crayons = new ArrayList<Crayon>(); //initializing the new array list of crayons
    }

}
