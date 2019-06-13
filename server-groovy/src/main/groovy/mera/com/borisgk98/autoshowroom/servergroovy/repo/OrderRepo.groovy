package mera.com.borisgk98.autoshowroom.servergroovy.repo

import mera.com.borisgk98.autoshowroom.servergroovy.model.cassandra.OrderCM
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepo extends CrudRepository<OrderCM, Integer> {
}