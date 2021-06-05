/**
 *
 * @author TestUser
 */
import java.util.ArrayList;

public class CareTaker {

  private CrayonBox crayonBox;

  private ArrayList <Crayon> crayons;
  private ArrayList <Memento> previousStates;

  public void addCrayon() {
  }

  public void removeCrayon(int crayonToRemove) {
      crayons.remove(crayonToRemove);
  }

  public void undoAction(CrayonBox CrayonBoxToUndo) {
     Memento undo = previousStates.get(previousStates.size()-1);
     CrayonBoxToUndo.restoreFromMemento(undo);
  }
 public void addMemento(Memento mementoToAdd){
 previousStates.add(mementoToAdd);
 }
}
