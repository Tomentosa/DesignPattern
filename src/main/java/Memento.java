
import java.util.ArrayList;

/**
 *
 * @author Brian Avadikian
 */
public class Memento {

    private ArrayList<Crayon> state;

    public Memento(ArrayList state) {
        this.state = state;
        System.out.println("Memento Created");
    }

    public ArrayList<Crayon> getState() {
        return state;

    }

}
