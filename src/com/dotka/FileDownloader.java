package com.dotka;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class FileDownloader {
    public static void download(String url, String fileName) throws IOException {
        try (InputStream in = URI.create(url).toURL().openStream()) {
            Files.copy(in, Paths.get("./src/com/dotka/csv/" + fileName), StandardCopyOption.REPLACE_EXISTING);
        }
    }
}