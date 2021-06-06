
/**
 *
 * @author TestUser
 */
public class Test {

    public static void main(String[] args) {
        CareTaker toddler = new CareTaker();

        CrayonBox crayola = new CrayonBox();

        //Lets add some crayons to the box
        crayola.addCrayon(new Crayon("Red"));
        crayola.addCrayon(new Crayon("Blue"));
        crayola.addCrayon(new Crayon("Green"));
        crayola.addCrayon(new Crayon("Yellow"));
        crayola.addCrayon(new Crayon("Magenta"));

        System.out.println(crayola.toString());
        Memento eventMemento = new Memento(crayola);
        //toddler.addMemento(eventMemento);

        crayola.removeCrayon(4);
        crayola.removeCrayon(3);
        crayola.removeCrayon(2);
        System.out.println(crayola.toString());

        crayola.restoreFromMemento(eventMemento);
        System.out.println(crayola.toString());

    }
}
