import model.Model;
import objreader.ObjReader;
import objwriter.ObjWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        Path fileName = Path.of("./3DModels/WrapHead.obj");
        String fileContent = Files.readString(fileName);
        Model model = ObjReader.read(fileContent);

//        System.out.println("Vertices: " + model.vertices.size());
//        System.out.println("Texture vertices: " + model.textureVertices.size());
//        System.out.println("Normals: " + model.normals.size());
//        System.out.println("Polygons: " + model.polygons.size());

        String saveTo = "./3DModels/TestModel.obj";
        ObjWriter.write(model, saveTo);

    }
}