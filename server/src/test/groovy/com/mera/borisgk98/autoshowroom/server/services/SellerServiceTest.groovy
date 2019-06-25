package com.mera.borisgk98.autoshowroom.server.services

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound
import com.mera.borisgk98.autoshowroom.server.models.Seller
import com.mera.borisgk98.autoshowroom.server.repositories.SellerRepository
import org.junit.Assert
import org.junit.Test
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


class SellerServiceTest {

    @Test
    void createTest() {
        Seller inputVal = new Seller()
        Seller outputVal = new Seller()
        outputVal.setId(1)
        SellerRepository repositoryMock = mock(SellerRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        SellerService service = new SellerServiceImpl(repositoryMock)
        Seller res = service.create(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testRead(){
        Integer inputVal = 1
        Seller outputVal = new Seller()
        outputVal.setId(1)
        SellerRepository repositoryMock = mock(SellerRepository.class)
        when(repositoryMock.findById(inputVal)).thenReturn(Optional.of(outputVal))
        SellerService service = new SellerServiceImpl(repositoryMock)
        Seller res = service.read(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testUpdate() {
        Seller inputVal = new Seller()
        inputVal.setId(1)
        Seller outputVal = new Seller()
        outputVal.setId(1)
        SellerRepository repositoryMock = mock(SellerRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true)
        when(repositoryMock.existsById(inputVal.getId())).thenReturn(true)
        SellerService service = new SellerServiceImpl(repositoryMock)
        Seller res = service.update(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testDelete(){
        Integer inputVal = 1
        Seller outputVal = new Seller()
        outputVal.setId(1)
        SellerRepository repositoryMock = mock(SellerRepository.class)
        when(repositoryMock.getOne(inputVal)).thenReturn(void)
        when(repositoryMock.existsById(inputVal))
                .thenReturn(true)
                .thenReturn(false)
        SellerService service = new SellerServiceImpl(repositoryMock)
        service.delete(inputVal)
        try {
            service.delete(inputVal)
        }
        catch (ModelNotFound e) {}
    }

    @Test
    void testExist() {
        Seller inputVal = new Seller()
        inputVal.setId(1)
        SellerRepository repositoryMock = mock(SellerRepository.class)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true).thenReturn(false)
        SellerService service = new SellerServiceImpl(repositoryMock)

        Assert.assertEquals(service.exist(inputVal), true)
        Assert.assertEquals(service.exist(inputVal), false)
    }

    @Test
    void testExistById() {
        Integer inputVal = 1
        SellerRepository repositoryMock = mock(SellerRepository.class)
        when(repositoryMock.existsById(inputVal)).thenReturn(true).thenReturn(false)
        SellerService service = new SellerServiceImpl(repositoryMock)

        Assert.assertEquals(service.existById(inputVal), true)
        Assert.assertEquals(service.existById(inputVal), false)
    }

    @Test
    void testGetAll() {
        List<Seller> outputVal = [new Seller()]
        SellerRepository repositoryMock = mock(SellerRepository.class)
        when(repositoryMock.findAll()).thenReturn(outputVal)
        SellerService service = new SellerServiceImpl(repositoryMock)

        Assert.assertEquals(service.getAll(), outputVal)
    }

    @Test
    void testGetRange() {
        Integer limit = 2, offset = 3
        List<Seller> outputVal = [new Seller(), new Seller()]
        Page resPage = mock(Page.class)
        when(resPage.getContent()).thenReturn(outputVal)

        SellerRepository repositoryMock = mock(SellerRepository.class)
        when(repositoryMock.findAll((Pageable) notNull())).thenReturn(resPage)
        SellerService service = new SellerServiceImpl(repositoryMock)

        Assert.assertEquals(service.getRange(limit, offset), outputVal)
    }

}