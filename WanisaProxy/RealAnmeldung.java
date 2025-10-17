public class RealAnmeldung implements Anmeldung {
    @Override
    public boolean login(String name, String passwort) {
        System.out.println("Anmeldung erfolgreich, Willkommen " + name + "!");
        return true;
    }
}


