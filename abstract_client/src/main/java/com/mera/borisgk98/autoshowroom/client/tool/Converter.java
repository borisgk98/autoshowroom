package com.mera.borisgk98.autoshowroom.client.tool;

import com.mera.borisgk98.autoshowroom.client.exception.UnsupportedConvertation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

public class Converter {
    public static  <T, F> F convert(T o, Class<F> resultClass) {
//        try {
//            Class oc = o.getClass();
//            F result = null;
//                result = resultClass.newInstance();
//            for (Method getter : oc.getMethods()) {
//                String getterName = getter.getName();
//                String getterModel = getterName.substring(3);
//
//                if (getterModel.length() > 3 &&
//                        getterName.substring(0, 3).equals("get")) {
//                    for (Method setter : resultClass.getMethods()) {
//                        String setterName = setter.getName();
//                        String setterModel = setterName.substring(3);
//
//                        if (setterName.length() > 3 &&
//                                setterName.substring(0, 3).equals("set") &&
//                                setterModel.equals(getterModel)) {
//                            setter.invoke(result, getter.invoke(o));
//                        }
//                    }
//                }
//            }
//            return result;
//        }
//        catch (Exception e) {
//            return null;
//        }
        F result = null;
        try {
            result = resultClass.newInstance();
        }
        catch (Exception e) {
            return null;
        }
        BeanUtils.copyProperties(o, result);
        return result;
    }
}
