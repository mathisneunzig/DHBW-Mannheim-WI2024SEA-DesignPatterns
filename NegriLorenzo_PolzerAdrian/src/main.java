public class main {
    public static void main(String[] args) {
        handler level1 = new levelonesupport();
        handler level2 = new leveltwosupport();
        handler manager = new managersupport();

        level1.setNextHandler(level2);
        level2.setNextHandler(manager);

        supportrequest r1 = new supportrequest("Passwort vergessen", 1);
        supportrequest r2 = new supportrequest("Datenbank langsam", 2);
        supportrequest r3 = new supportrequest("Server komplett ausgefallen!", 3);
        supportrequest r4 = new supportrequest("Unbekanntes Problem", 99);

        level1.handle(r1);
        level1.handle(r2);
        level1.handle(r3);
        level1.handle(r4);
    }
}
