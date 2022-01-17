package ro.fasttrackit.curs14.maven;

import com.github.lalyos.jfiglet.FigletFont;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Maven");
        System.out.println(FigletFont.convertOneLine("Hello Maven!"));
    }
}
