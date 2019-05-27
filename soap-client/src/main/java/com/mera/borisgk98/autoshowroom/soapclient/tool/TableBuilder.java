package com.mera.borisgk98.autoshowroom.soapclient.tool;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.shell.table.Table;
import org.springframework.shell.table.TableModelBuilder;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;


public class TableBuilder {
//    private static Logger logger = LoggerFactory.getLogger(TableBuilder.class);
    private static Set<String> excludeGetters;

    static {
        excludeGetters = new HashSet<>();
        excludeGetters.add("getClass");
    }

    public static <T> Table build(List<T> values, Class<T> c) {
//         get "getter" methods' list
        List<Method> getterMethods = getGetters(c);
        TableModelBuilder<String> modelBuilder = new TableModelBuilder<>();
        modelBuilder.addRow();
        for (Method getter : getterMethods) {
            modelBuilder.addValue("\t");
        }
        modelBuilder.addRow();
        for (Method getter : getterMethods) {
            String name = getter.getName().substring(3);
            name = name.substring(0, 1).toLowerCase() + name.substring(1);
            modelBuilder.addValue(name + "\t");
        }
        for (T model : values) {
            modelBuilder.addRow();
//            modelBuilder.addValue(model);
            for (Method getter : getterMethods) {
                Object value = null;
                try {
                    value = getter.invoke(model, null);
                }
                catch (Exception e) {
//                    logger.warn(e.toString());
                }
                if (value == null) {
                    value = "null";
                }
                modelBuilder.addValue(value.toString() + "\t");
            }
        }
        return (new org.springframework.shell.table.TableBuilder(modelBuilder.build())).build();
    }

    private static List<Method> getGetters(Class c) {
        List<Method> getterMethods = Arrays.stream(c.getMethods())
                .filter(x -> x.getName().length() > 3 && x.getName().substring(0, 3).equals("get"))
                .filter(x -> !excludeGetters.contains(x.getName()))
                .collect(Collectors.toList());
        Set<String> used = new HashSet<>();
        List<Method> filtered = new ArrayList<>();
        for (Method m : getterMethods) {
            String name = m.getName();
            if (!used.contains(name)) {
                filtered.add(m);
                used.add(name);
            }
        }
        return filtered;
    }
}
