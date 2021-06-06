
/**
 *
 * @author TestUser
 */
public class Test {

    public static void main(String[] args) {
        CrayonBox crayola = new CrayonBox();
        CareTaker toddler = new CareTaker(crayola);

        //Lets add some crayons to the box
        toddler.addCrayon(new Crayon("Red"));
        toddler.addCrayon(new Crayon("Blue"));
        toddler.addCrayon(new Crayon("Green"));
        toddler.addCrayon(new Crayon("Yellow"));
        toddler.addCrayon(new Crayon("Magenta"));

        System.out.println(crayola.toString());

        toddler.removeCrayon(4);
        toddler.removeCrayon(3);
        toddler.removeCrayon(2);

        System.out.println(crayola.toString());

        toddler.undoAction(crayola, 0);
        System.out.println(crayola.toString());

        toddler.undoAction(crayola, 1);
        System.out.println(crayola.toString());

        toddler.undoAction(crayola, 2);
        System.out.println(crayola.toString());

    }
}
