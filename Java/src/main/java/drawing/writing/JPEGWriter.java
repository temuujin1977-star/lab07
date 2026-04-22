package drawing.writing;
import drawing.shapes.Line;
import java.io.IOException;
import java.io.Writer;

/**
 * Refactor Task 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class JPEGWriter extends Writer {
    // This is a stub class. Pretend this writer work.
    public JPEGWriter(String s) {
    }
    public void writeLine(Line line) throws IOException {
    this.write(line.toJPEG()); 
    }
    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
    }

    @Override
    public void flush() throws IOException {
    }

    @Override
    public void close() throws IOException {
    }
}
