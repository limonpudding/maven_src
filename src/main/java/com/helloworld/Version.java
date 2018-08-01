package com.helloworld;
import java.io.InputStream;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Version {

    static String version;
    public Version() {
         version = getVersion();
    }

    private String getVersion() {
        final InputStream mfStream = getClass().getClassLoader().getResourceAsStream("META-INF/MANIFEST.MF");
        //java.util.Properties properties = new java.util.Properties();
        //String ver;
        Manifest mf = new Manifest();
        try {
            mf.read(mfStream);
            Attributes atts = mf.getMainAttributes();
            return atts.getValue(Attributes.Name.IMPLEMENTATION_VERSION);
        } catch (Exception e) {
            e.printStackTrace();
            return "unknown";
        }
    }
}
