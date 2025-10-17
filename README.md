# Design Pattern Aufgabe (5 Punkte) - Memento von Christina & Lea

## Onepager der Aufgabe
Unser Onepager ist "Memento_OnePager.pdf". In welchem das Grundprinzip, Einsatzgebiete, Vor und Nachteile sowie ein Beispiel enthalten sind

## TypeScript Codebeispiel
- Idee: Memento Pattern mit Klassen Caretaker, Memento & Texteditor (Originator) am Beispiel eines Texteditors zeigen
- Wie man das Beispiel ausführt: 
    1. ```npm install```
    2. ```tsc index.ts``` -> generiert js datei
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

## ***Builder*** - Katrin, Leonie, Daniel


<table>
<tr>
<td style="vertical-align: top;">

1.  Ordner "<b>Builder Pattern</b>" in IDE öffnen
2.  Im Source Folder die Main Klasse auswählen
3.  <strong><em>Optional:</em></strong> Lieblingskatze mit CatBuilder erstellen
4.  Main methode ausführen
5.  Das Katzenbild genießen 😻

</td>
<td style="vertical-align: top;">
<img src="https://i.pinimg.com/474x/c9/37/0b/c9370b56dda66f84f228dd49d73cd0ce--ginger-kitten-ginger-cats.jpg" 
     alt="Süße Mietzekatze" width="300"/>
</td>
</tr>
</table>

