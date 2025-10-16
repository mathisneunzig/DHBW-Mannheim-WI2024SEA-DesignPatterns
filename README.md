# Design Pattern Aufgabe (5 Punkte) - Memento von Christina & Lea

## Ziel der Aufgabe
Design Pattern und ein Plakat oder einen OnePager dazu.

## TypeScript Codebeispiel
- Idee: Memento Pattern mit Klassen Caretaker, Memenot & Texteditor (Originator) am Beispiel eines Texteditors zeigen
- ausführen mit...
    1. ```tsc run index.ts``` -> generiert js datei
    2. ```node index.js```

- gewünschte Ausgabe im Terminal:
```TextEditor: aktueller Text: Hallo```
```Caretaker: Zustand speichern...```
```TextEditor: Zustand wird gespeichert...```
```TextEditor: aktueller Text: Hallo Welt```
```Caretaker: Zustand speichern...```
```TextEditor: Zustand wird gespeichert...```
```TextEditor: aktueller Text: Hallo Welt!!!```
```Caretaker: Letzte Änderung rückgängig...```
```TextEditor: Text wiederhergestellt: Hallo Welt```
```Caretaker: Letzte Änderung rückgängig...```
```TextEditor: Text wiederhergestellt: Hallo```
```Caretaker: Kein Zustand zum Rückgängig machen.```

## OnePager
- pdf Datei

