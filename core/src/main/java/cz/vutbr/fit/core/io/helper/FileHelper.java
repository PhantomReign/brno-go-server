package cz.vutbr.fit.core.io.helper;

import cz.vutbr.fit.core.tools.Constant;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.codec.multipart.FilePart;
import reactor.core.publisher.Flux;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.BaseStream;

public class FileHelper {

    /**
     * Save File on Server
     *
     * @param part multipart object
     * @param path path to file
     */
    public static void saveFile(FilePart part, String path) {
        ByteArrayOutputStream contentStream = new ByteArrayOutputStream();
        DataBufferUtils.write(part.content(), contentStream).blockLast();

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
            writer.write(contentStream.toString(Constant.Charset.DEFAULT));
        } catch (IOException e) {
            System.out.println("Could not create file.");
        }
    }

    /**
     * Check if file exist
     *
     * @param path path to file
     * @return boolean true or false
     */
    public static boolean fileExist(Path path) {
        return Files.exists(path);
    }

    /**
     * Create Flux Stream from file content:
     *
     * @param path path to file
     * @return {@link Flux} stream
     */
    public static Flux<String> fromPath(Path path) {
        return Flux.using(() -> Files.lines(path),
                Flux::fromStream,
                BaseStream::close
        );
    }
}
