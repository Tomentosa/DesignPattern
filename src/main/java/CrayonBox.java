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

    public CrayonBox() {
        this.crayons = new ArrayList<Crayon>();             //initializing the new array list of crayons
        System.out.println("CrayonBox Object Created!");    //Providing a status update to terminal
    }

    public Memento createMemento() {                                //Originator has a method to create memento
        ArrayList<Crayon> mementoList = new ArrayList<Crayon>();

        //This loop reads through 
        for (int i = 0; i < crayons.size(); i++) {
            mementoList.add(crayons.get(i));
        }
        return new Memento(mementoList);
    }

    public void restoreFromMemento(Memento memento) {
        System.out.println("Restoring from memento! ");
        ArrayList<Crayon> restored = memento.getState();
        this.crayons = restored;

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

    public ArrayList<Crayon> getCrayons() {
        return this.crayons;
    }
}
