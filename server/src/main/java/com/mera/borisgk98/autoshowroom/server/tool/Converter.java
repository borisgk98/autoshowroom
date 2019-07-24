package com.mera.borisgk98.autoshowroom.server.tool;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Converter {
    public static  <T, F> F convert(T o, Class<F> resultClass) {
        try {
            Class oc = o.getClass();
            F result = null;
                result = resultClass.newInstance();
            for (Method getter : oc.getMethods())label: {
                String getterName = getter.getName();
                if (getterName.length() <= 3) {
                    continue;
                }
                String getterModel = getterName.substring(3);
                Class getterType = getter.getReturnType();

                if (getterName.substring(0, 3).equals("get")) {
                    for (Method setter : resultClass.getMethods()) {
                        String setterName = setter.getName();
                        if (setterName.length() <= 3) {
                            continue;
                        }
                        String setterModel = setterName.substring(3);
                        Parameter[] parameters = setter.getParameters();
                        if (parameters.length != 1) {
                            continue;
                        }
                        Class setterType = parameters[0].getType();

                        if (setterName.substring(0, 3).equals("set") &&
                                setterModel.equals(getterModel)) {
                            try {
                                if (setterType.equals(getterType)){
                                    setter.invoke(result, getter.invoke(o));
                                    break label;
                                }
                                else {
                                    try {
                                        if (setterType.isEnum() && getterType.isEnum()) {
                                            Method constructor = setterType.getMethod("fromValue", String.class);
                                            Method toString = getterType.getMethod("toString");
                                            setter.invoke(result, constructor.invoke(null, toString.invoke(getter.invoke(o))));
                                            break label;
                                        }
                                    }
                                    catch (Exception e) {
                                        break label;
                                    }
                                    setter.invoke(result, convert(getter.invoke(o), setterType));
                                    break label;
                                }
                            }
                            catch (Exception e) {
                                continue;
                            }
                        }
                    }
                }
            }
            return result;
        }
        catch (Exception e) {
            return null;
        }

//        F result = null;
//        try {
//            result = resultClass.newInstance();
//        }
//        catch (Exception e) {
//            return null;
//        }
//        BeanUtils.copyProperties(o, result);
//        return result;
    }
}
