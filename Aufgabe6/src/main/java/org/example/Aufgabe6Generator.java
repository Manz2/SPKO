package org.example;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe6Generator {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        List<String> ar = new ArrayList();
        ar.add("java.lang.String");
        ar.add("java.util.Iterator");
        ar.add("java.time.Month");


        STGroup group = new STGroupFile("aufgabe6.stg");
        List<Class<?>> classes = new ArrayList<>();

        for (String className : ar) {
            classes.add(Class.forName(className));
        }

        ST template = group.getInstanceOf("surrounding");

        template.add("classes", classes);

        BufferedWriter writer = new BufferedWriter(new FileWriter("test.html"));
        writer.write(template.render());

        writer.close();
    }
}
