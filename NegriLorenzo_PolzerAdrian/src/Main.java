public class Main {
    public static void main(String[] args) {
        Handler level1 = new LevelOneSupport();
        Handler level2 = new LevelTwoSupport();
        Handler manager = new ManagerSupport();

        level1.setNextHandler(level2);
        level2.setNextHandler(manager);

        SupportRequest r1 = new SupportRequest("Passwort vergessen", 1);
        SupportRequest r2 = new SupportRequest("Datenbank langsam", 2);
        SupportRequest r3 = new SupportRequest("Server komplett ausgefallen!", 3);
        SupportRequest r4 = new SupportRequest("Unbekanntes Problem", 99);

        level1.handle(r1);
        level1.handle(r2);
        level1.handle(r3);
        level1.handle(r4);
    }
}
