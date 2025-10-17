import java.lang.reflect.Proxy;

public class main {
    public static void main(String[] args) {
        Anmeldung echteAnmeldung = new RealAnmeldung(); //Objekt für die Anmeldung

        Anmeldung FcBayernMitgliedProxy = (Anmeldung) Proxy.newProxyInstance(
            Anmeldung.class.getClassLoader(),
            new Class[]{Anmeldung.class},
            new AnmeldungProxyHandler(echteAnmeldung, "FcBayernMitglied")); //Echtes *FCBAYERN* Mitglied

        Anmeldung userProxy = (Anmeldung) Proxy.newProxyInstance(
            Anmeldung.class.getClassLoader(),
            new Class[]{Anmeldung.class},
            new AnmeldungProxyHandler(echteAnmeldung, "user")); //Neuer User der kein FCB Mitglied ist 

        System.out.println("FcBayernMitglied versucht Anmeldung:");
        FcBayernMitgliedProxy.login("FcBayernMitglied", "mitgliedPass"); //Login des FCB Mitglieds
        System.out.println("-------------------------------------------");
        System.out.println("unbefugter Benutzer will sich anmelden:");
        userProxy.login("Benutzer", "12345"); //Login eines Users ohne Migliedschaft
    }
}



