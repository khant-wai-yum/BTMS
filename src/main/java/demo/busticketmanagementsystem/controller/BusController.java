package demo.busticketmanagementsystem.controller;

import demo.busticketmanagementsystem.model.*;
import demo.busticketmanagementsystem.service.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.imageio.spi.ServiceRegistry;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/buses")
public class BusController {

    @Autowired
    private BusService busService;

    @Autowired
    private DriverService driverService;

    @Autowired
    private PassengerService passengerService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private RouteService routeService;

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private TicketService ticketService;


    //  Bus
    @PostMapping("/saveBus")
    public Bus saveBus(@RequestBody Bus bus) {
        return busService.saveBus(bus);
    }

    @GetMapping("/getAllBuses")
    public Page<Bus> getAllBuses(
            @RequestParam int page,
            @RequestParam int size) {
        return busService.getAllBuses(page, size);
    }

    @GetMapping("/findBusByID/{bus_id}")
    public Optional<Bus> findBusByID(@PathVariable Long bus_id) {
        return busService.findBusByID(bus_id);
    }

    @DeleteMapping("delBusByID/{bus_id}")
    public void delBusByID(@PathVariable Long bus_id) {
        busService.delBusByID(bus_id);
    }
//--------------------------------------------------------------------------------


    // Driver
    @PostMapping("/saveDriver")
    public Drivers saveDriver(@RequestBody Drivers drivers) {
        return driverService.saveDriver(drivers);
    }
//---------------------------------------------------------------------------------


    //  Passenger
    @PostMapping("/savePassenger")
    public Passenger savePassenger(@RequestBody Passenger passenger) {
        return passengerService.savePassenger(passenger);
    }

    @GetMapping("/getAllPassengers")
    public Page<Passenger> getAllPassengers(
            @RequestParam int page,
            @RequestParam int size
    ) {
        return passengerService.getAllPassengers(page, size);
    }

    @GetMapping("/findPassengerByID/{passenger_id}")
    public Optional<Passenger> findPassengerByID(@PathVariable Long passenger_id) {
        return passengerService.findPassengerByID(passenger_id);
    }

    @DeleteMapping("/delPassengerByID/{passenger_id}")
    public void delPassengerByID(@PathVariable Long passenger_id) {
        passengerService.delPassengerByID(passenger_id);
    }
    //--------------------------------------------------------------------------------


    //  Route
    @PostMapping("/saveRoute")
    public Route saveRoute(@RequestBody Route route) {
        return routeService.saveRoute(route);
    }

    @GetMapping("/getAllRoutes")
    public Page<Route> getAllRoutes(
            @RequestParam int page,
            @RequestParam int size
    ) {
        return routeService.getAllRoutes(page, size);
    }

    @GetMapping("/findRouteByID/{route_id}")
    public Optional<Route> findRouteByID(@PathVariable Long route_id) {
        return routeService.findRouteByID(route_id);
    }

    @DeleteMapping("/delRouteByID/{route_id}")
    public void delRouteByID(@PathVariable Long route_id) {
        routeService.delRouteByID(route_id);
    }
    //--------------------------------------------------------------------------------------------------------------


    //Schedule
    @PostMapping("/saveSchedule")
    public Schedule schedule(@RequestBody Schedule schedule) {

        return scheduleService.saveSchedule(schedule);
    }


    //--------------------------------------------------------------------------------------------------------------


    //Payment

    @PostMapping("/savePayment")
    public Payment payment(@RequestBody Payment payment) {

        return paymentService.savePayment(payment);
    }


    //--------------------------------------------------------------------------------------------------------------

    //Ticket


    @PostMapping("/saveTicket")
    public Ticket ticket(@RequestBody Ticket ticket) {

        return ticketService.saveTicket(ticket);
    }
}

