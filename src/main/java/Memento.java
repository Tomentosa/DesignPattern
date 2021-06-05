
/**
 *
 * @author Brian Avadikian
 */
public class Memento {

    private Object state;

    public Memento(Object state) {
        System.out.println("Memento Created");
    }

    public Object getState() {
        return state;
    }

}
