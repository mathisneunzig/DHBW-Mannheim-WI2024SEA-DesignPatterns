# OnePager – Chain of Responsibility 

## Anforderungen (für die Abgabe)
- **Code:** Funktionsfähiges, lauffähiges Beispiel des Patterns.
- **README.md:** Kurze Startanleitung (Kompilieren & Ausführen).
- **OnePager/Plakat:** Steckbrief, Vorteile/Nachteile, Einsatzgebiete, Grund für Existenz des Patterns und prägnante Code-Auszüge, die das Pattern veranschaulichen.

---

## Steckbrief
- **Name:** Chain of Responsibility (Verarbeitungskette)
- **Art/Kategorie:** Verhaltensmuster (Behavioral Pattern)
- **Synonyme:** Responsibility Chain, Zuständigkeitskette, Handler-Kette
- **Kernidee:** Eine Anfrage (Request) wird durch eine Kette von Handlern geleitet. Jeder Handler entscheidet selbständig, ob er:

  1. die Anfrage bearbeitet, oder  
  2. an den nächsten Handler weiterleitet.


- **Ziele:**
  - **Entkopplung** von Sender und Empfänger (Sender kennt die konkrete Zuständigkeit nicht).
  - **Flexible Zuständigkeiten** (Reihenfolge und Teilnehmer können zur Laufzeit variiert werden).
  - **Vermeidung** großer if/else- oder switch-Kaskaden.


- **Typische Rollen:**
  - `Handler` (Abstrakt/Interface): definiert Weiterleitung + Prüflogik.
  - `ConcreteHandler`: bearbeitet bestimmte Fälle oder leitet weiter.
  - `Client`: erstellt die Kette und schickt die Anfrage ab.


- **Mini-UML (vereinfacht):**

    ` Client --> Handler --> Handler --> Handler `


---

## Warum existiert das Pattern?
- In vielen Systemen ist nicht im Voraus klar, welche Komponente eine Anfrage bearbeiten soll (z. B. Logging, Validierung, Support).
- Klassische Implementierungen mit verschachtelten Bedingungen skalieren schlecht, sind       schwer wartbar und verletzen oft das Open/Closed-Prinzip.
- Die Kette ermöglicht:
- **Erweiterbarkeit** (neue Handler hinzufügen, ohne existierenden Code anzupassen).
- **Konfigurierbare Reihenfolge** (Austausch/Neuverkettung).
- **Lose Kopplung** (Sender kennt nur den Einstieg in die Kette).

---

## Einsatzgebiete
- **Validierungspipelines:** Form-/Domain-Validierungen nacheinander ausführen.
- **HTTP-/Middleware-Stacks:** Auth, Logging, Caching, Rate Limiting, Routing.
- **Support-/Störungsmanagement:** 1st-Level → 2nd-Level → Management/Eskalation.
- **UI-/Event-Handling:** Ereignisse wandern durch Komponenten bis eine reagiert.
- **Sicherheitsketten:** Authentifizierung → Autorisierung → Policies.
- **Fehlerbehandlung:** Verschiedene Catch-/Recovery-Handler.
- **Preis-/Regel-Engines:** Rabatt-/Gebühren- oder Regelketten.

---

## Vorteile / Nachteile
### Vorteile
- **Lose Kopplung**: Sender kennt konkrete Empfänger nicht.
- **Hohe Flexibilität**: Reihenfolge/Teilnehmer zur Laufzeit austauschbar.
- **Besser testbar**: Handler einzeln testbar (Single Responsibility).
- **Erweiterbar (OCP)**: Neue Handler hinzufügen statt Code anzupassen.
- **Wiederverwendbarkeit**: Handler auch in anderen Ketten nutzbar.

### Nachteile 
- **Keine Garantie auf Bearbeitung**: Wenn kein Handler zuständig ist, bleibt die Anfrage eventuell unbearbeitet.

- **Schwierige Nachvollziehbarkeit**: Der tatsächliche Bearbeitungspfad kann schwer zu verfolgen sein, besonders bei langen Ketten.

- **Leicht ineffizient**: Bei sehr langen Ketten werden Anfragen möglicherweise mehrfach weitergereicht, ohne verarbeitet zu werden.

- **Fehlersuche komplexer**: Fehleranalyse kann aufwändig werden, da viele Handler beteiligt sind.

---

## Code-Beispiele (wichtige Auszüge)

#### Abstrakter Handler:

```java
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(SupportRequest request) {
        if (canHandle(request)) {
            process(request);
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println("Keine passende Stelle für: " + request.getMessage());
        }
    }

    protected abstract boolean canHandle(SupportRequest request);
    protected abstract void process(SupportRequest request);
}

```


#### Konkrete Handler: 

``` java
public class LevelOneSupport extends Handler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getLevel() == 1;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println(" Level 1 Support bearbeitet: " + request.getMessage());
    }
}
```

``` java 
public class Managersupport extends Handler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getLevel() == 3;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("Manager kümmert sich um: " + request.getMessage());
    }
}
```


#### Nutzung der Chain: 

``` java 
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
```


## Startanleitung: 
**Voraussetzungen**: Java17+ installiert. 

1. Ordner `NegriLorenzo_PolzerAdrian` in der IDE öffnen.
2. Im Source Folder die `Main` Klasse auswählen.
3. Main-Methode ausführen.

**Alternativ über die Konsole:**

```bash
javac *.java
java -cp . Main
```