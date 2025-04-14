package memento;

import java.util.Stack;

/**
 * Caretaker: Manages mementos (e.g., stores them in a stack for undo operations).
 * */
public class CareTaker {

    private final Stack<TextEditorMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}

