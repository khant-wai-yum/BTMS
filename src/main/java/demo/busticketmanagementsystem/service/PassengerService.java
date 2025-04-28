package demo.busticketmanagementsystem.service;

import demo.busticketmanagementsystem.model.Passenger;
import demo.busticketmanagementsystem.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    public PassengerRepository passengerRepository;

    public Passenger savePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    };

    public Page<Passenger> getAllPassengers(int page, int size) {
        Sort.Direction passengerDir = Sort.Direction.ASC;


        Pageable pageable = PageRequest.of(page, size);
        return passengerRepository.findAll(pageable);
    }

    public Optional<Passenger> findPassengerByID(Long passengerId) {
        return passengerRepository.findById(passengerId);
    }

    public void delPassengerByID(Long passenger_id) {
        passengerRepository.deleteById(passenger_id);
    }
}


