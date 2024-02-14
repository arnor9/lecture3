class Rodent {


    public Rodent(){
        System.out.println("Rodent constructor");
    }
    public void sound(){
        System.out.println("Sound of a Rodent");
    }

    public void eat(){
        System.out.println("Rodent eating");
    }
}


class Mouse extends Rodent{
    String type;
    public Mouse(){
        System.out.println("Mouse constructor");
        type = "House Mouse";
    }
    @Override
    public void sound() {
        System.out.println("tjjtjjt");
    }

    @Override
    public void eat() {
        System.out.println("eating cheese");
    }
}

class Gerbil extends Rodent{
    String color;
    public Gerbil(){
        System.out.println("gerbil constructor");
        color = "Pink";
    }
    @Override
    public void sound() {
        System.out.println("slsls");
    }

    @Override
    public void eat() {
        System.out.println("eating something");
    }
}


class Hamster extends Rodent{
    int wheelSize;
    public Hamster(){
        System.out.println("Hamster constructor");
        wheelSize = 6;
    }
    @Override
    public void sound() {
        System.out.println("gjjdk");
    }

    @Override
    public void eat() {
        System.out.println("eating a carrot");
    }
}

public class Main{
    public static void main(String args[]){
        //Mouse mouse = new Mouse();
       // mouse.sound();

        Rodent mouse = new Mouse();
        Rodent gerbil = new Gerbil();
        Rodent hamster = new Hamster();
        System.out.println();

        if (mouse instanceof Mouse){
            System.out.println("Mouse type: " + ((Mouse) mouse).type);
            System.out.println();
        }


        mouse.eat();
        mouse.sound();
        System.out.println();

        gerbil.sound();
        gerbil.eat();
        System.out.println();

        hamster.eat();
        hamster.sound();


       // Rodent[] rodents = new Rodent[] {new Mouse(), new Gerbil(), new Hamster()};

        /*for(Rodent rodent : rodents){
            rodent.sound();
            rodent.eat();
        }*/

    }
}

