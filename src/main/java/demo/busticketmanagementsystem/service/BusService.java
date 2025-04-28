package demo.busticketmanagementsystem.service;

import demo.busticketmanagementsystem.model.Bus;
import demo.busticketmanagementsystem.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }

    public Page<Bus> getAllBuses(int page, int size) {
        Sort.Direction busDir = Sort.Direction.DESC;

//        try {
//            direction = Sort.Direction.valueOf(String.valueOf(sortBy.doubleValue()));
//        }catch (IllegalArgumentException e){
//
//        }

        Pageable pageable = PageRequest.of(page, size);
        return busRepository.findAll(pageable);
    }


    public Optional<Bus> findBusByID(Long busId) {
        return busRepository.findById(busId);
    }


    public void delBusByID(Long bus_id) {
        busRepository.deleteById(bus_id);
    }
}

