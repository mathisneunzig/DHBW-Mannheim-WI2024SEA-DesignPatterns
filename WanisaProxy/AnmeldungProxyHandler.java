import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnmeldungProxyHandler implements InvocationHandler {
    private final Object target;
    private final String role;

    public AnmeldungProxyHandler(Object target, String role) {
        this.target = target;
        this.role = role;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("FcBayernMitglied".equalsIgnoreCase(role)) {
            System.out.println("Zugriff erlaubt fuer: " + method.getName()); //Hier wird die Rolle "FcBayernMitglied" geprüft.
            return method.invoke(target, args);
        } else {
            System.out.println("Zugriff verweigert fuer: " + method.getName()); //Kein FCB Mitglied - Zugang verweigert bzw Anmeldung
            return false;
        }
    }
}


