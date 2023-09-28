package OOP_1;

public class Ravenclaw extends Hogwarts {
    private int mind;//ум
    private int wisdom;//мудрость
    private int wit;//остроумие
    private int creation;//творчесво

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;

    }

    @Override
    public String toString() {
        return super.toString() + "Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }

    private int getTotalPowerRa() {
        return mind + wisdom + wit + creation;
    }

    public void compareStudentsRa(Ravenclaw other) {
        if (this.getTotalPowerRa() > other.getTotalPowerRa()) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + other.getName());
        } else if (this.getTotalPowerRa() < other.getTotalPowerRa()) {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " " + other.getName() + " Когтевранцы равны ");
        }
    }
}

