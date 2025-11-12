//package objwriter;
//
//import model.Model;
//import objreader.ObjReader;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//
//import static org.junit.Assert.*;
//
//public class ObjWriterTest {
//
//    @Test
//    public void writeTest() {
//        Path fileName = Path.of("./3DModels/WrapHead.obj");
//        String fileContent = null;
//        try {
//            fileContent = Files.readString(fileName);
//        } catch (IOException e) {
//            fail("File not found");
//        }
//
//        Model model = ObjReader.read(fileContent);
//
//        String saveTo = "./3DModels/TestModel.obj";
//        ObjWriter.write(model, saveTo);
//    }
//}