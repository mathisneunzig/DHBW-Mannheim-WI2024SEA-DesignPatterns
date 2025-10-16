# Design Pattern Aufgabe (5 Punkte) - Memento von Christina & Lea

## Onepager der Aufgabe
Unser Onepager ist "Memento_OnePager.pdf". In welchem das Grundprinzip, Einsatzgebiete, Vor und Nachteile sowie ein Beispiel enthalten sind

## TypeScript Codebeispiel
- Idee: Memento Pattern mit Klassen Caretaker, Memento & Texteditor (Originator) am Beispiel eines Texteditors zeigen
- Wie man das Beispiel ausführt: 
    1. ```npm install```
    2. ```tsc run index.ts``` -> generiert js datei
    2. ```node index.js``` -> die generierte js datei ausführen

- gewünschte Ausgabe im Terminal bei Ausführung:
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



