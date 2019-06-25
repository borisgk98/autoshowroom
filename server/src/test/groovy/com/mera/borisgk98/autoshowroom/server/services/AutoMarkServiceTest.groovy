package com.mera.borisgk98.autoshowroom.server.services

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound
import com.mera.borisgk98.autoshowroom.server.models.AutoMark
import com.mera.borisgk98.autoshowroom.server.repositories.AutoMarkRepository
import org.junit.Assert
import org.junit.Test
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


class AutoMarkServiceTest {

    @Test
    void createTest() {
        AutoMark inputVal = new AutoMark()
        AutoMark outputVal = new AutoMark()
        outputVal.setId(1)
        AutoMarkRepository repositoryMock = mock(AutoMarkRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        AutoMarkService service = new AutoMarkServiceImpl(repositoryMock)
        AutoMark res = service.create(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testRead(){
        Integer inputVal = 1
        AutoMark outputVal = new AutoMark()
        outputVal.setId(1)
        AutoMarkRepository repositoryMock = mock(AutoMarkRepository.class)
        when(repositoryMock.findById(inputVal)).thenReturn(Optional.of(outputVal))
        AutoMarkService service = new AutoMarkServiceImpl(repositoryMock)
        AutoMark res = service.read(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testUpdate() {
        AutoMark inputVal = new AutoMark()
        inputVal.setId(1)
        AutoMark outputVal = new AutoMark()
        outputVal.setId(1)
        AutoMarkRepository repositoryMock = mock(AutoMarkRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true)
        when(repositoryMock.existsById(inputVal.getId())).thenReturn(true)
        AutoMarkService service = new AutoMarkServiceImpl(repositoryMock)
        AutoMark res = service.update(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testDelete(){
        Integer inputVal = 1
        AutoMark outputVal = new AutoMark()
        outputVal.setId(1)
        AutoMarkRepository repositoryMock = mock(AutoMarkRepository.class)
        when(repositoryMock.getOne(inputVal)).thenReturn(void)
        when(repositoryMock.existsById(inputVal))
                .thenReturn(true)
                .thenReturn(false)
        AutoMarkService service = new AutoMarkServiceImpl(repositoryMock)
        service.delete(inputVal)
        try {
            service.delete(inputVal)
        }
        catch (ModelNotFound e) {}
    }

    @Test
    void testExist() {
        AutoMark inputVal = new AutoMark()
        inputVal.setId(1)
        AutoMarkRepository repositoryMock = mock(AutoMarkRepository.class)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true).thenReturn(false)
        AutoMarkService service = new AutoMarkServiceImpl(repositoryMock)

        Assert.assertEquals(service.exist(inputVal), true)
        Assert.assertEquals(service.exist(inputVal), false)
    }

    @Test
    void testExistById() {
        Integer inputVal = 1
        AutoMarkRepository repositoryMock = mock(AutoMarkRepository.class)
        when(repositoryMock.existsById(inputVal)).thenReturn(true).thenReturn(false)
        AutoMarkService service = new AutoMarkServiceImpl(repositoryMock)

        Assert.assertEquals(service.existById(inputVal), true)
        Assert.assertEquals(service.existById(inputVal), false)
    }

    @Test
    void testGetAll() {
        List<AutoMark> outputVal = [new AutoMark()]
        AutoMarkRepository repositoryMock = mock(AutoMarkRepository.class)
        when(repositoryMock.findAll()).thenReturn(outputVal)
        AutoMarkService service = new AutoMarkServiceImpl(repositoryMock)

        Assert.assertEquals(service.getAll(), outputVal)
    }

    @Test
    void testGetRange() {
        Integer limit = 2, offset = 3
        List<AutoMark> outputVal = [new AutoMark(), new AutoMark()]
        Page resPage = mock(Page.class)
        when(resPage.getContent()).thenReturn(outputVal)

        AutoMarkRepository repositoryMock = mock(AutoMarkRepository.class)
        when(repositoryMock.findAll((Pageable) notNull())).thenReturn(resPage)
        AutoMarkService service = new AutoMarkServiceImpl(repositoryMock)

        Assert.assertEquals(service.getRange(limit, offset), outputVal)
    }

}