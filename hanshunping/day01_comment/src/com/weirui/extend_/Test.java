package com.weirui.extend_;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("R7-5800H", 16, 512, "华硕台式电脑");
        pc.info();

        NotePad notePad = new NotePad("I7-12800H", 32, 1024, "白色");
        notePad.info();

    }
}
