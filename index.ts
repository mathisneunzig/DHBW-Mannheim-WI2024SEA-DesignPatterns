// Memento: speichert den Zustand (den Text)
class Memento {
  textState: string;

  constructor(text: string) {
    this.textState = text;
  }
}

// Originator: der TextEditor, der speichern und wiederherstellen kann
class TextEditor {
  text: string = "";

  setText(newText: string): void {
    this.text = newText;
    console.log("TextEditor: aktueller Text:", this.text);
  }

  saveToMemento(): Memento {
    console.log("TextEditor: Zustand wird gespeichert...");
    return new Memento(this.text);
  }

  restoreFromMemento(memento: Memento): void {
    this.text = memento.textState;
    console.log("TextEditor: Text wiederhergestellt:", this.text);
  }
}

// Caretaker: verwaltet die gespeicherten Zustände
class Caretaker {
  private mementos: Memento[] = [];
  private textEditor: TextEditor;

  constructor(textEditor: TextEditor) {
    this.textEditor = textEditor;
  }

  save(): void {
    console.log("Caretaker: Zustand speichern...");
    this.mementos.push(this.textEditor.saveToMemento());
  }

  undo(): void {
    if (this.mementos.length === 0) {
      console.log("Caretaker: Kein Zustand zum Rückgängig machen.");
      return;
    }

    const lastMemento = this.mementos.pop();
    console.log("Caretaker: Letzte Änderung rückgängig...");
    if (lastMemento) {
      this.textEditor.restoreFromMemento(lastMemento);
    }
  }
}

// Demo: Nutzung des Memento-Patterns
const editor = new TextEditor();
const caretaker = new Caretaker(editor);

editor.setText("Hallo");
caretaker.save();

editor.setText("Hallo Welt");
caretaker.save();

editor.setText("Hallo Welt!!!");

caretaker.undo(); // sollte "Hallo Welt" wiederherstellen
caretaker.undo(); // sollte "Hallo" wiederherstellen
caretaker.undo(); // keine weiteren Zustände
