
/**
 *
 * @author Brian Avadikian
 * This is a simple class to create a Crayon Object with an associated color.]
 *
 * NOTE: The Crayon object is NOT have an associated role is the memento design
 * pattern.
 */
public class Crayon {

    private String color;

    public Crayon(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
