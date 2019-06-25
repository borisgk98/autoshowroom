package com.mera.borisgk98.autoshowroom.server.services

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound
import com.mera.borisgk98.autoshowroom.server.models.Auto
import com.mera.borisgk98.autoshowroom.server.repositories.AutoRepository
import org.junit.Assert
import org.junit.Test
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


class AutoServiceTest {

    @Test
    void createTest() {
        Auto inputVal = new Auto()
        Auto outputVal = new Auto()
        outputVal.setId(1)
        AutoRepository repositoryMock = mock(AutoRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        AutoService service = new AutoServiceImpl(repositoryMock)
        Auto res = service.create(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testRead(){
        Integer inputVal = 1
        Auto outputVal = new Auto()
        outputVal.setId(1)
        AutoRepository repositoryMock = mock(AutoRepository.class)
        when(repositoryMock.findById(inputVal)).thenReturn(Optional.of(outputVal))
        AutoService service = new AutoServiceImpl(repositoryMock)
        Auto res = service.read(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testUpdate() {
        Auto inputVal = new Auto()
        inputVal.setId(1)
        Auto outputVal = new Auto()
        outputVal.setId(1)
        AutoRepository repositoryMock = mock(AutoRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true)
        when(repositoryMock.existsById(inputVal.getId())).thenReturn(true)
        AutoService service = new AutoServiceImpl(repositoryMock)
        Auto res = service.update(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testDelete(){
        Integer inputVal = 1
        Auto outputVal = new Auto()
        outputVal.setId(1)
        AutoRepository repositoryMock = mock(AutoRepository.class)
        when(repositoryMock.getOne(inputVal)).thenReturn(void)
        when(repositoryMock.existsById(inputVal))
                .thenReturn(true)
                .thenReturn(false)
        AutoService service = new AutoServiceImpl(repositoryMock)
        service.delete(inputVal)
        try {
            service.delete(inputVal)
        }
        catch (ModelNotFound e) {}
    }

    @Test
    void testExist() {
        Auto inputVal = new Auto()
        inputVal.setId(1)
        AutoRepository repositoryMock = mock(AutoRepository.class)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true).thenReturn(false)
        AutoService service = new AutoServiceImpl(repositoryMock)

        Assert.assertEquals(service.exist(inputVal), true)
        Assert.assertEquals(service.exist(inputVal), false)
    }

    @Test
    void testExistById() {
        Integer inputVal = 1
        AutoRepository repositoryMock = mock(AutoRepository.class)
        when(repositoryMock.existsById(inputVal)).thenReturn(true).thenReturn(false)
        AutoService service = new AutoServiceImpl(repositoryMock)

        Assert.assertEquals(service.existById(inputVal), true)
        Assert.assertEquals(service.existById(inputVal), false)
    }

    @Test
    void testGetAll() {
        List<Auto> outputVal = [new Auto()]
        AutoRepository repositoryMock = mock(AutoRepository.class)
        when(repositoryMock.findAll()).thenReturn(outputVal)
        AutoService service = new AutoServiceImpl(repositoryMock)

        Assert.assertEquals(service.getAll(), outputVal)
    }

    @Test
    void testGetRange() {
        Integer limit = 2, offset = 3
        List<Auto> outputVal = [new Auto(), new Auto()]
        Page resPage = mock(Page.class)
        when(resPage.getContent()).thenReturn(outputVal)

        AutoRepository repositoryMock = mock(AutoRepository.class)
        when(repositoryMock.findAll((Pageable) notNull())).thenReturn(resPage)
        AutoService service = new AutoServiceImpl(repositoryMock)

        Assert.assertEquals(service.getRange(limit, offset), outputVal)
    }

}