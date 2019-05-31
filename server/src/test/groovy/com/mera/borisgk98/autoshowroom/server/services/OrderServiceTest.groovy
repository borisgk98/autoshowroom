//package com.mera.borisgk98.autoshowroom.server.services
//
//import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound
//import com.mera.borisgk98.autoshowroom.server.models.Order
//import com.mera.borisgk98.autoshowroom.server.repositories.OrderRepository
//import org.junit.Assert
//import org.junit.Test
//import org.springframework.data.domain.Example
//import org.springframework.data.domain.Page
//import org.springframework.data.domain.PageRequest
//import org.springframework.data.domain.Pageable
//import org.springframework.data.repository.CrudRepository
//import static org.mockito.Mockito.*;
//import static org.junit.Assert.*;
//
//
//class OrderServiceTest {
//
//    @Test
//    void createTest() {
//        Order inputVal = new Order()
//        Order outputVal = new Order()
//        outputVal.setId(1)
//        OrderRepository repositoryMock = mock(OrderRepository.class)
//        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
//        OrderService service = new OrderServiceImpl(repositoryMock)
//        Order res = service.create(inputVal)
//
//        Assert.assertEquals(res, outputVal)
//    }
//
//    @Test
//    void testRead(){
//        Integer inputVal = 1
//        Order outputVal = new Order()
//        outputVal.setId(1)
//        OrderRepository repositoryMock = mock(OrderRepository.class)
//        when(repositoryMock.findById(inputVal)).thenReturn(Optional.of(outputVal))
//        OrderService service = new OrderServiceImpl(repositoryMock)
//        Order res = service.read(inputVal)
//
//        Assert.assertEquals(res, outputVal)
//    }
//
//    @Test
//    void testUpdate() {
//        Order inputVal = new Order()
//        inputVal.setId(1)
//        Order outputVal = new Order()
//        outputVal.setId(1)
//        OrderRepository repositoryMock = mock(OrderRepository.class)
//        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
//        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true)
//        when(repositoryMock.existsById(inputVal.getId())).thenReturn(true)
//        OrderService service = new OrderServiceImpl(repositoryMock)
//        Order res = service.update(inputVal)
//
//        Assert.assertEquals(res, outputVal)
//    }
//
//    @Test
//    void testDelete(){
//        Integer inputVal = 1
//        Order outputVal = new Order()
//        outputVal.setId(1)
//        OrderRepository repositoryMock = mock(OrderRepository.class)
//        when(repositoryMock.getOne(inputVal)).thenReturn(void)
//        when(repositoryMock.existsById(inputVal))
//                .thenReturn(true)
//                .thenReturn(false)
//        OrderService service = new OrderServiceImpl(repositoryMock)
//        service.delete(inputVal)
//        try {
//            service.delete(inputVal)
//        }
//        catch (ModelNotFound e) {}
//    }
//
//    @Test
//    void testExist() {
//        Order inputVal = new Order()
//        inputVal.setId(1)
//        OrderRepository repositoryMock = mock(OrderRepository.class)
//        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true).thenReturn(false)
//        OrderService service = new OrderServiceImpl(repositoryMock)
//
//        Assert.assertEquals(service.exist(inputVal), true)
//        Assert.assertEquals(service.exist(inputVal), false)
//    }
//
//    @Test
//    void testExistById() {
//        Integer inputVal = 1
//        OrderRepository repositoryMock = mock(OrderRepository.class)
//        when(repositoryMock.existsById(inputVal)).thenReturn(true).thenReturn(false)
//        OrderService service = new OrderServiceImpl(repositoryMock)
//
//        Assert.assertEquals(service.existById(inputVal), true)
//        Assert.assertEquals(service.existById(inputVal), false)
//    }
//
//    @Test
//    void testGetAll() {
//        List<Order> outputVal = [new Order()]
//        OrderRepository repositoryMock = mock(OrderRepository.class)
//        when(repositoryMock.findAll()).thenReturn(outputVal)
//        OrderService service = new OrderServiceImpl(repositoryMock)
//
//        Assert.assertEquals(service.getAll(), outputVal)
//    }
//
//    @Test
//    void testGetRange() {
//        Integer limit = 2, offset = 3
//        List<Order> outputVal = [new Order(), new Order()]
//        Page resPage = mock(Page.class)
//        when(resPage.getContent()).thenReturn(outputVal)
//
//        OrderRepository repositoryMock = mock(OrderRepository.class)
//        when(repositoryMock.findAll((Pageable) notNull())).thenReturn(resPage)
//        OrderService service = new OrderServiceImpl(repositoryMock)
//
//        Assert.assertEquals(service.getRange(limit, offset), outputVal)
//    }
//
//}