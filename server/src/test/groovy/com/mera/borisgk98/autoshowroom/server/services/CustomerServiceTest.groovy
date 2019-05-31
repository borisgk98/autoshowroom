package com.mera.borisgk98.autoshowroom.server.services

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound
import com.mera.borisgk98.autoshowroom.server.models.Customer
import com.mera.borisgk98.autoshowroom.server.repositories.CustomerRepository
import org.junit.Assert
import org.junit.Test
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


class CustomerServiceTest {

    @Test
    void createTest() {
        Customer inputVal = new Customer()
        Customer outputVal = new Customer()
        outputVal.setId(1)
        CustomerRepository repositoryMock = mock(CustomerRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        CustomerService service = new CustomerServiceImpl(repositoryMock)
        Customer res = service.create(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testRead(){
        Integer inputVal = 1
        Customer outputVal = new Customer()
        outputVal.setId(1)
        CustomerRepository repositoryMock = mock(CustomerRepository.class)
        when(repositoryMock.findById(inputVal)).thenReturn(Optional.of(outputVal))
        CustomerService service = new CustomerServiceImpl(repositoryMock)
        Customer res = service.read(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testUpdate() {
        Customer inputVal = new Customer()
        inputVal.setId(1)
        Customer outputVal = new Customer()
        outputVal.setId(1)
        CustomerRepository repositoryMock = mock(CustomerRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true)
        when(repositoryMock.existsById(inputVal.getId())).thenReturn(true)
        CustomerService service = new CustomerServiceImpl(repositoryMock)
        Customer res = service.update(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testDelete(){
        Integer inputVal = 1
        Customer outputVal = new Customer()
        outputVal.setId(1)
        CustomerRepository repositoryMock = mock(CustomerRepository.class)
        when(repositoryMock.getOne(inputVal)).thenReturn(void)
        when(repositoryMock.existsById(inputVal))
                .thenReturn(true)
                .thenReturn(false)
        CustomerService service = new CustomerServiceImpl(repositoryMock)
        service.delete(inputVal)
        try {
            service.delete(inputVal)
        }
        catch (ModelNotFound e) {}
    }

    @Test
    void testExist() {
        Customer inputVal = new Customer()
        inputVal.setId(1)
        CustomerRepository repositoryMock = mock(CustomerRepository.class)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true).thenReturn(false)
        CustomerService service = new CustomerServiceImpl(repositoryMock)

        Assert.assertEquals(service.exist(inputVal), true)
        Assert.assertEquals(service.exist(inputVal), false)
    }

    @Test
    void testExistById() {
        Integer inputVal = 1
        CustomerRepository repositoryMock = mock(CustomerRepository.class)
        when(repositoryMock.existsById(inputVal)).thenReturn(true).thenReturn(false)
        CustomerService service = new CustomerServiceImpl(repositoryMock)

        Assert.assertEquals(service.existById(inputVal), true)
        Assert.assertEquals(service.existById(inputVal), false)
    }

    @Test
    void testGetAll() {
        List<Customer> outputVal = [new Customer()]
        CustomerRepository repositoryMock = mock(CustomerRepository.class)
        when(repositoryMock.findAll()).thenReturn(outputVal)
        CustomerService service = new CustomerServiceImpl(repositoryMock)

        Assert.assertEquals(service.getAll(), outputVal)
    }

    @Test
    void testGetRange() {
        Integer limit = 2, offset = 3
        List<Customer> outputVal = [new Customer(), new Customer()]
        Page resPage = mock(Page.class)
        when(resPage.getContent()).thenReturn(outputVal)

        CustomerRepository repositoryMock = mock(CustomerRepository.class)
        when(repositoryMock.findAll((Pageable) notNull())).thenReturn(resPage)
        CustomerService service = new CustomerServiceImpl(repositoryMock)

        Assert.assertEquals(service.getRange(limit, offset), outputVal)
    }

}