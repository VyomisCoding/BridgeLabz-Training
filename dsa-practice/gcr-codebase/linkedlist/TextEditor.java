// Node storing text state
class TextState{
    String text;
    TextState prev, next;

    TextState(String t){
        text = t;
    }
}

class TextEditor{
    TextState current;
    int size = 0, limit = 10;

    void type(String newText){   // add new state
        TextState node = new TextState(newText);
        if (current != null) current.next = null; // clear redo history
        node.prev = current;

        if (current != null) current.next = node;
        current = node;

        if (++size > limit) size--; // simple size limit
    }

    void undo(){    // undo operation
        if (current != null && current.prev != null)
            current = current.prev;
    }
    
    void redo(){   // redo operation
        if (current != null && current.next != null)
            current = current.next;
    }

    void display(){  // show current text
        if (current != null)
            System.out.println("Text: " + current.text);
    }
}
