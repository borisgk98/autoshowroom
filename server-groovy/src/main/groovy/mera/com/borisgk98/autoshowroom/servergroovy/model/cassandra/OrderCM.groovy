package mera.com.borisgk98.autoshowroom.servergroovy.model.cassandra

import mera.com.borisgk98.autoshowroom.servergroovy.model.Order
import org.springframework.data.cassandra.core.mapping.Table

@Table("order")
class OrderCM extends CassandraModel<Order>{
}
