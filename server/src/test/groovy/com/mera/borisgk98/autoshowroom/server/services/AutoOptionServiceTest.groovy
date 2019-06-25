package com.mera.borisgk98.autoshowroom.server.services

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound
import com.mera.borisgk98.autoshowroom.server.models.AutoOption
import com.mera.borisgk98.autoshowroom.server.repositories.AutoOptionRepository
import org.junit.Assert
import org.junit.Test
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


class AutoOptionServiceTest {

    @Test
    void createTest() {
        AutoOption inputVal = new AutoOption()
        AutoOption outputVal = new AutoOption()
        outputVal.setId(1)
        AutoOptionRepository repositoryMock = mock(AutoOptionRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        AutoOptionService service = new AutoOptionServiceImpl(repositoryMock)
        AutoOption res = service.create(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testRead(){
        Integer inputVal = 1
        AutoOption outputVal = new AutoOption()
        outputVal.setId(1)
        AutoOptionRepository repositoryMock = mock(AutoOptionRepository.class)
        when(repositoryMock.findById(inputVal)).thenReturn(Optional.of(outputVal))
        AutoOptionService service = new AutoOptionServiceImpl(repositoryMock)
        AutoOption res = service.read(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testUpdate() {
        AutoOption inputVal = new AutoOption()
        inputVal.setId(1)
        AutoOption outputVal = new AutoOption()
        outputVal.setId(1)
        AutoOptionRepository repositoryMock = mock(AutoOptionRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true)
        when(repositoryMock.existsById(inputVal.getId())).thenReturn(true)
        AutoOptionService service = new AutoOptionServiceImpl(repositoryMock)
        AutoOption res = service.update(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testDelete(){
        Integer inputVal = 1
        AutoOption outputVal = new AutoOption()
        outputVal.setId(1)
        AutoOptionRepository repositoryMock = mock(AutoOptionRepository.class)
        when(repositoryMock.getOne(inputVal)).thenReturn(void)
        when(repositoryMock.existsById(inputVal))
                .thenReturn(true)
                .thenReturn(false)
        AutoOptionService service = new AutoOptionServiceImpl(repositoryMock)
        service.delete(inputVal)
        try {
            service.delete(inputVal)
        }
        catch (ModelNotFound e) {}
    }

    @Test
    void testExist() {
        AutoOption inputVal = new AutoOption()
        inputVal.setId(1)
        AutoOptionRepository repositoryMock = mock(AutoOptionRepository.class)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true).thenReturn(false)
        AutoOptionService service = new AutoOptionServiceImpl(repositoryMock)

        Assert.assertEquals(service.exist(inputVal), true)
        Assert.assertEquals(service.exist(inputVal), false)
    }

    @Test
    void testExistById() {
        Integer inputVal = 1
        AutoOptionRepository repositoryMock = mock(AutoOptionRepository.class)
        when(repositoryMock.existsById(inputVal)).thenReturn(true).thenReturn(false)
        AutoOptionService service = new AutoOptionServiceImpl(repositoryMock)

        Assert.assertEquals(service.existById(inputVal), true)
        Assert.assertEquals(service.existById(inputVal), false)
    }

    @Test
    void testGetAll() {
        List<AutoOption> outputVal = [new AutoOption()]
        AutoOptionRepository repositoryMock = mock(AutoOptionRepository.class)
        when(repositoryMock.findAll()).thenReturn(outputVal)
        AutoOptionService service = new AutoOptionServiceImpl(repositoryMock)

        Assert.assertEquals(service.getAll(), outputVal)
    }

    @Test
    void testGetRange() {
        Integer limit = 2, offset = 3
        List<AutoOption> outputVal = [new AutoOption(), new AutoOption()]
        Page resPage = mock(Page.class)
        when(resPage.getContent()).thenReturn(outputVal)

        AutoOptionRepository repositoryMock = mock(AutoOptionRepository.class)
        when(repositoryMock.findAll((Pageable) notNull())).thenReturn(resPage)
        AutoOptionService service = new AutoOptionServiceImpl(repositoryMock)

        Assert.assertEquals(service.getRange(limit, offset), outputVal)
    }

}