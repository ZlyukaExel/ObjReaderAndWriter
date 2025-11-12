import model.Model;
import objreader.ObjReader;
import objwriter.ObjWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path fileName = Path.of("./3DModels/WrapHead.obj");
        String fileContent;
        try {
            fileContent = Files.readString(fileName);
        } catch (IOException e) {
            throw new RuntimeException("File not found");
        }

        Model model = ObjReader.read(fileContent);

        String saveTo = "./3DModels/TestModel.obj";
        ObjWriter.write(model, saveTo);
    }
}
