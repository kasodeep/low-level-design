package memento;

public class Demo {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker();

        editor.setContent("Version 1");
        caretaker.save(editor);

        editor.setContent("Version 2");
        caretaker.save(editor);

        editor.setContent("Version 3");
        System.out.println("Current Content: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("After Undo: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("After Undo: " + editor.getContent());
    }
}
