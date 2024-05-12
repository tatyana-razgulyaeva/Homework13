public class PrintService {
    public void print(Gryffindor[] students) {
        for (int i = 0; i < students.length; i++) {
            Gryffindor gryffindor = students[i];
            System.out.println(gryffindor.getName() + ": "
                    + " Благородство - " + gryffindor.getNobility()
                    + ", Честь - " + gryffindor.getHonor()
                    + ", Храбрость - " + gryffindor.getBravery()
                    + ", Сила магии - " + gryffindor.getPowerOfMagic()
                    + ", Расстонии трансгрессии - " + gryffindor.getTransgressionDistance());
        }
        System.out.println();

    }
    public void print(Hufflepuff[] students1) {
        for (int i = 0; i < students1.length; i++) {
            Hufflepuff hufflepuff = students1[i];
            System.out.println(hufflepuff.getName() + ": "
                    + " Трудолюбие - " + hufflepuff.getHardWork()
                    + ", Верность - " + hufflepuff.getLoyalty()
                    + ", Честность - " + hufflepuff.getHonesty()
                    + ", Сила магии - " + hufflepuff.getPowerOfMagic()
                    + ", Расстояние трансгрессии - " + hufflepuff.getTransgressionDistance());
        }
        System.out.println();

    }
    public void print(Ravenclaw[] students2) {
        for (int i = 0; i < students2.length; i++) {
            Ravenclaw ravenclaw = students2[i];
            System.out.println(ravenclaw.getName() + ": "
                    + " Ум - " + ravenclaw.getCleverness()
                    + ", Мудрость - " + ravenclaw.getWisdom()
                    + ", Остроумие - " + ravenclaw.getWit()
                    + ", Креативность - " + ravenclaw.getCreatively()
                    + ", Сила магии - " + ravenclaw.getPowerOfMagic()
                    + ", Расстояние трансгрессии - " + ravenclaw.getTransgressionDistance());
        }
        System.out.println();

    }
    public void print(Slytherin[] students3) {
        for (int i = 0; i < students3.length; i++) {
            Slytherin slytherin = students3[i];
            System.out.println(slytherin.getName() + ": "
                    + " Хитрость - " + slytherin.getCunning()
                    + ", Решительность - " + slytherin.getDetermination()
                    + ", Амбициозность - " + slytherin.getAmbition()
                    + ", Находчивость - " + slytherin.getResourcefulness()
                    + ", Жажда власти - " + slytherin.getLustForPower()
                    + ", Сила магии - " + slytherin.getPowerOfMagic()
                    + ", Расстояние трансгрессии - " + slytherin.getTransgressionDistance());

        }
    }
}
