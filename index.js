// Memento: speichert den Zustand (den Text)
var Memento = /** @class */ (function () {
    function Memento(text) {
        this.textState = text;
    }
    return Memento;
}());
// Originator: der TextEditor, der speichern und wiederherstellen kann
var TextEditor = /** @class */ (function () {
    function TextEditor() {
        this.text = "";
    }
    TextEditor.prototype.setText = function (newText) {
        this.text = newText;
        console.log("TextEditor: aktueller Text:", this.text);
    };
    TextEditor.prototype.saveToMemento = function () {
        console.log("TextEditor: Zustand wird gespeichert...");
        return new Memento(this.text);
    };
    TextEditor.prototype.restoreFromMemento = function (memento) {
        this.text = memento.textState;
        console.log("TextEditor: Text wiederhergestellt:", this.text);
    };
    return TextEditor;
}());
// Caretaker: verwaltet die gespeicherten Zustände
var Caretaker = /** @class */ (function () {
    function Caretaker(textEditor) {
        this.mementos = [];
        this.textEditor = textEditor;
    }
    Caretaker.prototype.save = function () {
        console.log("Caretaker: Zustand speichern...");
        this.mementos.push(this.textEditor.saveToMemento());
    };
    Caretaker.prototype.undo = function () {
        if (this.mementos.length === 0) {
            console.log("Caretaker: Kein Zustand zum Rückgängig machen.");
            return;
        }
        var lastMemento = this.mementos.pop();
        console.log("Caretaker: Letzte Änderung rückgängig...");
        if (lastMemento) {
            this.textEditor.restoreFromMemento(lastMemento);
        }
    };
    return Caretaker;
}());
// Demo: Nutzung des Memento-Patterns
var editor = new TextEditor();
var caretaker = new Caretaker(editor);
editor.setText("Hallo");
caretaker.save();
editor.setText("Hallo Welt");
caretaker.save();
editor.setText("Hallo Welt!!!");
caretaker.undo(); // sollte "Hallo Welt" wiederherstellen
caretaker.undo(); // sollte "Hallo" wiederherstellen
caretaker.undo(); // keine weiteren Zustände
