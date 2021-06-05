/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian Avadikian
 */
import java.util.ArrayList;

public class CrayonBox {

    private Crayon crayon;
    private ArrayList<Crayon> crayons;

    public Memento createMemento() {
        Memento eventMemento = new Memento(crayons);
        return eventMemento;
    }

    public void restoreFromMemento(Memento memento) {
        System.out.println("Restoring from memento!");
        this.crayons = (ArrayList<Crayon>) memento.getState();
    }

    public void addCrayon(Crayon crayonToAdd) {
        crayons.add(crayonToAdd);
        System.out.println("Crayon Added");

    }

    public void removeCrayon(int crayonToRemove) {
        crayons.remove(crayonToRemove);
        System.out.println("Crayon Removed");

    }

    @Override
    public String toString() {
        String crayonList = "";

        for (int i = 0; i < crayons.size(); i++) {
            crayonList = crayonList + crayons.get(i).getColor() + ", ";
        }
        return crayonList;
    }
    public ArrayList<Crayon> getCrayons(){
    return this.crayons;
    }

    public CrayonBox() {
        this.crayons = new ArrayList<Crayon>(); //initializing the new array list of crayons
        System.out.println("CrayonBox Object Created!");
    }

}
