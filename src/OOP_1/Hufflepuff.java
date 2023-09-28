package OOP_1;

public class Hufflepuff extends Hogwarts {
    private int industry;//трудолюбие
    private int faithfulness;//верность
    private int honesty;//честность

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int industry, int faithfulness, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industry = industry;
        this.faithfulness = faithfulness;
        this.honesty = honesty;
    }

    public int getIndustry() {
        return industry;
    }

    public int getFaithfulness() {
        return faithfulness;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "Hufflepuff{" +
                "industry=" + industry +
                ", faithfulness=" + faithfulness +
                ", honesty=" + honesty +
                '}';
    }

    private int getTotalPowerHu() {
        return industry + faithfulness + honesty;
    }

    public void compareStudentsHu(Hufflepuff other) {
        if (this.getTotalPowerHu() > other.getTotalPowerHu()) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + other.getName());
        } else if (this.getTotalPowerHu() < other.getTotalPowerHu()) {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " " + other.getName() + " Пуффендуйцы равны ");
        }
    }
}




