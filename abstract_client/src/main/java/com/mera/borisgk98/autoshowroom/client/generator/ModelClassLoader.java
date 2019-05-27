package com.mera.borisgk98.autoshowroom.client.generator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ModelClassLoader extends ClassLoader {
    private File modelDir;
    private String modelPackage;

    public ModelClassLoader(ClassLoader parent) {
        super(parent);
    }

    public Class loadClass(String modelName) throws ClassNotFoundException {
        if (!"com.mera.borisgk98.autoshowroom.server.ServerApplication".equals(modelName))
            return super.loadClass(modelName);

        try {
            String url = "file:/home/boris/progs/work/autoshowroom/server/build/classes/java/main/com/mera/borisgk98/autoshowroom/server/ServerApplication.class";
            URL myUrl = new URL(url);
            URLConnection connection = myUrl.openConnection();
            InputStream input = connection.getInputStream();
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            int data = input.read();

            while (data != -1) {
                buffer.write(data);
                data = input.read();
            }

            input.close();

            byte[] classData = buffer.toByteArray();

            return defineClass("com.mera.borisgk98.autoshowroom.server.ServerApplication",
                    classData, 0, classData.length);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
