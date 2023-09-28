package OOP_1;

public class Gryffindor extends Hogwarts {
    private int nobleness;//благородство
    private int honour;//честь
    private int bravery;//храбрость

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobleness, int honour, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobleness = nobleness;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobleness() {
        return nobleness;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "Gryffindor{" +
                "nobleness=" + nobleness +
                ", honour=" + honour +
                ", bravery=" + bravery +
                '}';
    }

    private int getTotalPowerGr() {
        return nobleness + honour + bravery;
    }

    public void compareStudentsGr(Gryffindor other) {
        if (this.getTotalPowerGr() > other.getTotalPowerGr()) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else if (this.getHonour() < other.getTotalPowerGr()) {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println("Гриффиндорцы равны");
        }
    }

}

