package mera.com.borisgk98.autoshowroom.servergroovy.model.cassandra

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.cassandra.core.mapping.PrimaryKey

class CassandraModel<T> {
    @Transient
    T model
    @Transient
    Class<T> modelClass

    @Transient
    ObjectMapper om

    @PrimaryKey
    String uuid

    String jsonData

    T getModel() {
      om.readValue(jsonData, modelClass)
    }

    void initStringData() {
        jsonData = om.writeValueAsString(model)
    }
}
