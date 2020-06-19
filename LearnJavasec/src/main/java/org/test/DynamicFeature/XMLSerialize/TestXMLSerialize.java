package org.test.DynamicFeature.XMLSerialize;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestXMLSerialize {
    public static void main(String[] args) {
        String path = "src\\main\\java\\org\\test\\DynamicFeature\\XMLSerialize\\poc.xml";
        try {
            File file = new File(path);
            FileInputStream fis = null;
            fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            XMLDecoder xd = new XMLDecoder(bis);
            xd.readObject();
            xd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

