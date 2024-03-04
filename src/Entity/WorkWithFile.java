package Entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWithFile {
    private Path pathFileWork;

    public WorkWithFile(Path pathFileWork) {
        this.pathFileWork = pathFileWork;
    }

    public Path getPathF() {
        return pathFileWork;
    }
    public void setPathF(Path pathFileWork) {
        this.pathFileWork = pathFileWork;
    }

    public void writeFile(Toy toy, boolean userLastName) {
        try (BufferedWriter writer = Files.newBufferedWriter(pathFileWork)) {
            if (userLastName) writer.append(toy.toString());
            else writer.write(toy.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFile() throws IOException {
        if (Files.notExists(pathFileWork)) {
            Files.createFile(pathFileWork);
        } else {
            try (BufferedReader reader = Files.newBufferedReader(pathFileWork)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }
    }
}
