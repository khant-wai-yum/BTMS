package demo.busticketmanagementsystem.service;

import demo.busticketmanagementsystem.model.Bus;
import demo.busticketmanagementsystem.model.Route;
import demo.busticketmanagementsystem.model.Schedule;
import demo.busticketmanagementsystem.repository.BusRepository;
import demo.busticketmanagementsystem.repository.RouteRepository;
import demo.busticketmanagementsystem.repository.ScheduleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;


    public Schedule saveSchedule(Schedule schedule) {

        return scheduleRepository.save(schedule);
    }




}
