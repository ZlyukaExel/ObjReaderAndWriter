package objwriter;

import math.Vector2f;
import math.Vector3f;
import model.Model;
import model.Polygon;

import java.io.FileWriter;
import java.io.IOException;

public class ObjWriter {

    private static final String OBJ_VERTEX_TOKEN = "v";
    private static final String OBJ_TEXTURE_TOKEN = "vt";
    private static final String OBJ_NORMAL_TOKEN = "vn";
    private static final String OBJ_FACE_TOKEN = "f";

    public static void write(Model model, String outputPath) {

        try (FileWriter writer = new FileWriter(outputPath)) {

            // Запись вершин
            for (Vector3f vertex : model.vertices) {
                writer.write(OBJ_VERTEX_TOKEN + " " + vertex.X() + " " + vertex.Y() + " " + vertex.Z());
            }

            writer.write("\n");

            // Запись текстур вершин
            for (Vector2f vertexTexture : model.textureVertices) {
                writer.write(OBJ_TEXTURE_TOKEN + " " + vertexTexture.X() + " " + vertexTexture.Y() + " 0.0000");
            }

            writer.write("\n");

            // Запись нормалей вершин
            for (Vector3f vertexNormal : model.normals) {
                writer.write(OBJ_NORMAL_TOKEN + " " + vertexNormal.X() + " " + vertexNormal.Y() + " " + vertexNormal.Z());
            }

            // Запись полигонов
            for (Polygon polygon : model.polygons) {
                String string = "";
                writer.write(OBJ_FACE_TOKEN + " " +  + " " +  + " " + );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
