package demo.busticketmanagementsystem.service;

import demo.busticketmanagementsystem.model.Driver;
import demo.busticketmanagementsystem.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }
}
