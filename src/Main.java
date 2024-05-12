public class Main {
    public static void main(String[] args) {
        Gryffindor[] students = {
                new Gryffindor("Гарри Поттер", 30, 35, 32, 26, 24),
                new Gryffindor("Гермиона Грейнджер", 41, 39, 38, 45, 48),
                new Gryffindor("Рон Уизли", 26, 26, 29, 25, 21),
        };

        Hufflepuff[] students1 = {
                new Hufflepuff("Захария Смит", 25, 34, 21, 26, 23),
                new Hufflepuff("Седрик Диггори", 36, 35, 38, 39, 38),
                new Hufflepuff("Джастин Финч-Флетчли", 26, 2321, 26, 27, 22),
        };

        Ravenclaw[] students2 = {
                new Ravenclaw("Чжоу Чанг", 23, 35, 20, 27, 26, 35),
                new Ravenclaw("Падма Патил", 20, 31, 25, 26, 23, 32),
                new Ravenclaw("Маркус Белби", 31, 26, 24, 23, 25, 26),
        };

        Slytherin[] students3 = {
                new Slytherin("Драко Малфой", 25, 31, 26, 27, 28, 27, 29),
                new Slytherin("Грэхэм Монтегю", 21, 26, 23, 31, 28, 23, 30),
                new Slytherin("Грегори Гойл", 27, 24, 21, 29, 21, 20, 25),
        };

        PrintService printService = new PrintService();
        printService.print(students);
        printService.print(students1);
        printService.print(students2);
        printService.print(students3);
    }
}

