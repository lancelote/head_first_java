public class Doggie {
    private String name;

    public static void main(String[] args) {
        Doggie dog1 = new Doggie();
        dog1.name = "Bart";
        dog1.bark();

        Doggie[] myDogs = new Doggie[3];
        myDogs[0] = new Doggie();
        myDogs[1] = new Doggie();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Jorge";

        System.out.print("Last dog name - ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    private void bark() {
        System.out.println(name + " said woof!");
    }

    void eat() {}
    void chaseCat() {}
}
