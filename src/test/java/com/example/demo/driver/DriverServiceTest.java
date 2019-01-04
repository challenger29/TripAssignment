package com.example.demo.driver;

import com.example.demo.driver.Driver;
import com.example.demo.driver.DriverRepository;
import com.example.demo.driver.DriverService;
import com.sun.tools.javac.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DriverServiceTest {

    private DriverRepository driverRepository;
    private DriverService driverService;
    private List<Driver> drivers ;
    private Driver driver1;
    private Driver driver2;
    private Driver driver3;

    @Before
    public void setUp() throws Exception{
        driverRepository = Mockito.mock(DriverRepository.class);
        driverService= new DriverService();
        driverService.driverRepository = driverRepository;
        driver1 = Driver.builder().name("Amit").avgRating(4.5).build();
        driver2 = Driver.builder().name("Ankit").avgRating(2.0).build();


    }
    @Test
    public void testAddDriver(){
        driver3 = Driver.builder().name("Amit").avgRating(4.5).build();
        Mockito.when(driverRepository.save(driver3)).thenReturn(driver3);
        Driver response = driverService.addDriver(driver3);
        Assert.assertEquals(driver3.getName() , response.getName());

    }

}
