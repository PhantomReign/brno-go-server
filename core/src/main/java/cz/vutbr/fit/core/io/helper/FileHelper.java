package cz.vutbr.fit.core.io.helper;

import cz.vutbr.fit.core.tools.Constant;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.codec.multipart.FilePart;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHelper {

    public static void saveFile(FilePart part, String path) {
        ByteArrayOutputStream contentStream = new ByteArrayOutputStream();
        DataBufferUtils.write(part.content(), contentStream).blockLast();

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
            writer.write(contentStream.toString(Constant.Charset.DEFAULT));
        } catch (IOException e) {
            System.out.println("Could not create file.");
        }
    }
}
