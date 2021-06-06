
/**
 *
 * @author Brian Avadikian
 */

public class Crayon {

    private String color;

    public Crayon(String color) {
        this.color = color;
        System.out.println(color + " Crayon Object Created!");

    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

}
