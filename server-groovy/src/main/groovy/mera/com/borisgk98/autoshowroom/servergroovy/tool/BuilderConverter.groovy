package mera.com.borisgk98.autoshowroom.servergroovy.tool

import java.lang.reflect.Method
import java.lang.reflect.Parameter

class BuilderConverter {
    static  <T, F> F convert(T o, Class<F> resultClass) {
        try {
            Class oc = o.getClass()
            def builder = null
//            def builderClass = null
//            for (def c : resultClass.getClasses()) {
//                if (c.simpleName.equals("Builder")) {
//                    builderClass = c
//                    break
//                }
//            }
            builder = resultClass.getMethod("newBuilder", null).invoke(null, null)
            def buildeClass = builder.getClass()
            for (Method getter : oc.getMethods())label: {
                String getterName = getter.getName()
                if (getterName.length() <= 3) {
                    continue
                }
                String getterModel = getterName.substring(3)
                Class getterType = getter.getReturnType()

                if (getterName.substring(0, 3).equals("get")) {
                    for (Method setter : buildeClass.getMethods()) {
                        String setterName = setter.getName()
                        if (setterName.length() <= 3) {
                            continue
                        }
                        String setterModel = setterName.substring(3)
                        Parameter[] parameters = setter.getParameters()
                        if (parameters.length != 1) {
                            continue
                        }
                        Class setterType = parameters[0].getType()

                        if (setterName.substring(0, 3).equals("set") &&
                                setterModel.equals(getterModel)) {
                            try {
                                if (setterType.equals(int) && getterType.equals(Integer.class)) {
                                    builder = setter.invoke(builder, getter.invoke(o).intValue())
                                    break label
                                }
                                else if (setterType.equals(getterType)){
                                    builder = setter.invoke(builder, getter.invoke(o))
                                    break label
                                }
                                else {
                                    try {
                                        if (setterType.isEnum() && getterType.isEnum()) {
                                            Method constructor = setterType.getMethod("fromValue", String.class)
                                            Method toString = getterType.getMethod("toString")
                                            builder = setter.invoke(builder, constructor.invoke(null, toString.invoke(getter.invoke(o))))
                                            break label
                                        }
                                    }
                                    catch (Exception e) {
                                        break label
                                    }
                                    builder = setter.invoke(builder, convert(getter.invoke(o), setterType))
                                    break label
                                }
                            }
                            catch (Exception e) {
                                continue
                            }
                        }
                    }
                }
            }
            return builder.build()
        }
        catch (Exception e) {
            return null
        }

//        F result = null
//        try {
//            result = resultClass.newInstance()
//        }
//        catch (Exception e) {
//            return null
//        }
//        BeanUtils.copyProperties(o, result)
//        return result
    }
}
