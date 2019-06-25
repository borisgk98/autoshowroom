package com.mera.borisgk98.autoshowroom.server.services

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound
import com.mera.borisgk98.autoshowroom.server.models.AutoModel
import com.mera.borisgk98.autoshowroom.server.repositories.AutoModelRepository
import org.junit.Assert
import org.junit.Test
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


class AutoModelServiceTest {

    @Test
    void createTest() {
        AutoModel inputVal = new AutoModel()
        AutoModel outputVal = new AutoModel()
        outputVal.setId(1)
        AutoModelRepository repositoryMock = mock(AutoModelRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        AutoModelService service = new AutoModelServiceImpl(repositoryMock)
        AutoModel res = service.create(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testRead(){
        Integer inputVal = 1
        AutoModel outputVal = new AutoModel()
        outputVal.setId(1)
        AutoModelRepository repositoryMock = mock(AutoModelRepository.class)
        when(repositoryMock.findById(inputVal)).thenReturn(Optional.of(outputVal))
        AutoModelService service = new AutoModelServiceImpl(repositoryMock)
        AutoModel res = service.read(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testUpdate() {
        AutoModel inputVal = new AutoModel()
        inputVal.setId(1)
        AutoModel outputVal = new AutoModel()
        outputVal.setId(1)
        AutoModelRepository repositoryMock = mock(AutoModelRepository.class)
        when(repositoryMock.save(inputVal)).thenReturn(outputVal)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true)
        when(repositoryMock.existsById(inputVal.getId())).thenReturn(true)
        AutoModelService service = new AutoModelServiceImpl(repositoryMock)
        AutoModel res = service.update(inputVal)

        Assert.assertEquals(res, outputVal)
    }

    @Test
    void testDelete(){
        Integer inputVal = 1
        AutoModel outputVal = new AutoModel()
        outputVal.setId(1)
        AutoModelRepository repositoryMock = mock(AutoModelRepository.class)
        when(repositoryMock.getOne(inputVal)).thenReturn(void)
        when(repositoryMock.existsById(inputVal))
                .thenReturn(true)
                .thenReturn(false)
        AutoModelService service = new AutoModelServiceImpl(repositoryMock)
        service.delete(inputVal)
        try {
            service.delete(inputVal)
        }
        catch (ModelNotFound e) {}
    }

    @Test
    void testExist() {
        AutoModel inputVal = new AutoModel()
        inputVal.setId(1)
        AutoModelRepository repositoryMock = mock(AutoModelRepository.class)
        when(repositoryMock.exists(Example.of(inputVal))).thenReturn(true).thenReturn(false)
        AutoModelService service = new AutoModelServiceImpl(repositoryMock)

        Assert.assertEquals(service.exist(inputVal), true)
        Assert.assertEquals(service.exist(inputVal), false)
    }

    @Test
    void testExistById() {
        Integer inputVal = 1
        AutoModelRepository repositoryMock = mock(AutoModelRepository.class)
        when(repositoryMock.existsById(inputVal)).thenReturn(true).thenReturn(false)
        AutoModelService service = new AutoModelServiceImpl(repositoryMock)

        Assert.assertEquals(service.existById(inputVal), true)
        Assert.assertEquals(service.existById(inputVal), false)
    }

    @Test
    void testGetAll() {
        List<AutoModel> outputVal = [new AutoModel()]
        AutoModelRepository repositoryMock = mock(AutoModelRepository.class)
        when(repositoryMock.findAll()).thenReturn(outputVal)
        AutoModelService service = new AutoModelServiceImpl(repositoryMock)

        Assert.assertEquals(service.getAll(), outputVal)
    }

    @Test
    void testGetRange() {
        Integer limit = 2, offset = 3
        List<AutoModel> outputVal = [new AutoModel(), new AutoModel()]
        Page resPage = mock(Page.class)
        when(resPage.getContent()).thenReturn(outputVal)

        AutoModelRepository repositoryMock = mock(AutoModelRepository.class)
        when(repositoryMock.findAll((Pageable) notNull())).thenReturn(resPage)
        AutoModelService service = new AutoModelServiceImpl(repositoryMock)

        Assert.assertEquals(service.getRange(limit, offset), outputVal)
    }

}