
/**
 *
 * @author Brian Avadikian
 */
import java.util.ArrayList;

public class CareTaker {

    private CrayonBox crayonBox;
    private ArrayList<Memento> previousStates;

    public CareTaker() {
        this.previousStates = new ArrayList<Memento>(); //initializing the new array list of crayons

        System.out.println("CareTaker Object Created!");
    }

    public void addCrayon(Crayon crayonToAdd) {
        crayonBox.addCrayon(crayonToAdd);
    }

    public void removeCrayon(int crayonToRemove) {
        crayonBox.removeCrayon(crayonToRemove);
    }

    public void undoAction(CrayonBox CrayonBoxToUndo) {
        Memento undo = previousStates.get(previousStates.size() - 1);
        CrayonBoxToUndo.restoreFromMemento(undo);
    }

    public void addMemento(Memento mementoToAdd) {
        previousStates.add(mementoToAdd);
    }
}
