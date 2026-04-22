package drawing;

import drawing.shapes.Shape;
import drawing.writing.JPEGWriter;
import drawing.writing.PNGWriter;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Drawing {

    private List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void draw(String format, String filename) {
        Writer writer = null;
        try {
            // 1. Форматын дагуу Writer-ийг нэг удаа үүсгэнэ (Duplicated Code засав)
            if (format.equals("jpeg")) {
                writer = new JPEGWriter(filename + ".jpeg");
            } else if (format.equals("png")) {
                writer = new PNGWriter(filename + ".png");
            }

            // 2. Хэрэв writer үүссэн бол ганцхан циклээр бүх дүрсийг зурна
            if (writer != null) {
                for (Shape shape : this.shapes) {
                    // Зөвхөн writer-ийг дамжуулна (Inappropriate Intimacy засав)
                    shape.draw(writer);
                }
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}