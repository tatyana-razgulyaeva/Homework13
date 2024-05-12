public class  Ravenclaw extends Hogwarts {

    private int cleverness;
    private int wisdom;
    private int wit;
    private int creatively;

    public Ravenclaw(String name, int cleverness, int wisdom, int wit, int creatively, int powerOfMagic,
                     int transgressionDistance) {
        super(name, powerOfMagic, transgressionDistance);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creatively = creatively;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreatively() {
        return creatively;
    }

    public void setCreatively(int creatively) {
        this.creatively = creatively;
    }
}

