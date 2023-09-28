package OOP_1;

public class Slytherin extends Hogwarts {
    private int cunning;//хитрость
    private int resolution;//решительность
    private int ambitiousness;//амибициозность
    private int resourcefulness;//находчивость
    private int thirstForPower;//жажда власти

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int resolution, int ambitiousness, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.resolution = resolution;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;

    }

    public int getCunning() {
        return cunning;
    }

    public int getResolution() {
        return resolution;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;

    }

    @Override
    public String toString() {
        return super.toString() + "Slytherin{" +
                "cunning=" + cunning +
                ", resolution=" + resolution +
                ", ambitiousness=" + ambitiousness +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    private int getTotalPowerSl() {
        return cunning + resolution + ambitiousness + resourcefulness + thirstForPower;
    }

    public void compareStudentsSl(Slytherin other) {
        if (this.getTotalPowerSl() > other.getTotalPowerSl()) {
            System.out.println(this.getName() + " лучший Слизеринец,, чем " + other.getName());
        } else if (this.getTotalPowerSl() < other.getTotalPowerSl()) {
            System.out.println(other.getName() + " лучший Слизеринец,, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " " + other.getName() + " Слизеринцы равны ");
        }
    }
}


