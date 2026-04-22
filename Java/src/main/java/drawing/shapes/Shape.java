package drawing.shapes;

import drawing.writing.JPEGWriter;
import drawing.writing.PNGWriter;

import java.io.IOException;
import java.io.Writer;

public interface Shape {

    Line[] toLines();

    /**
     * Рефакторинг: Drawing класс шугам дамжуулах шаардлагагүй болсон.
     * Дүрс өөрөө toLines() дуудаж шугамаа авна.
     */
   default void draw(Writer writer) {
    try {
        Line[] lines = toLines();
        for (Line line : lines) {
            if (writer instanceof JPEGWriter) {
                ((JPEGWriter) writer).writeLine(line); // Type casting хийж өгнө
            } else if (writer instanceof PNGWriter) {
                ((PNGWriter) writer).writeLine(line); // Type casting хийж өгнө
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}