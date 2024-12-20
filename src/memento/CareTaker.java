package memento;

import java.util.Stack;

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

