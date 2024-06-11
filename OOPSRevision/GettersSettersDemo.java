package OOPSRevision;
/*
Object --> Proprtites associates hai like in

PEN--> Color, TipSize

Getters : is used to return the value / get the value
Setters : is use to set the value
 */


class Pen1
{
   private String Color;
    private int TipSize;


    public int getTipSize() {
        return TipSize;
    }

    public void setTipSize(int tipSize) {
        this.TipSize = tipSize;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }





}
public class GettersSettersDemo {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();
        p1.setColor("Green");
        System.out.println(p1.getColor());

        p1.setColor("Black");
        System.out.println(p1.getColor());
    }


}
