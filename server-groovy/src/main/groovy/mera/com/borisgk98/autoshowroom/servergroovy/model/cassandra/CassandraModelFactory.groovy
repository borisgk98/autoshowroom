package mera.com.borisgk98.autoshowroom.servergroovy.model.cassandra

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.BeanDescription
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationConfig
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import java.util.function.Function

@Component
class CassandraModelFactory {
    CassandraModelFactory() {
        om = new ObjectMapper()
//        om.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
    }

    ObjectMapper om

    CassandraModel getModel(Class c) {
        CassandraModel model
        if (c.equals(OrderCM.class)) {
            model = new OrderCM()
        }
        else {
            throw new IllegalArgumentException()
        }
        model.om = om
        return model
    }
}
