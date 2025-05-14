package demo.busticketmanagementsystem.service;

import demo.busticketmanagementsystem.model.Drivers;
import demo.busticketmanagementsystem.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Drivers saveDriver(Drivers drivers) {
        return driverRepository.save(drivers);
    }
}
