package demo.busticketmanagementsystem.controller;

import demo.busticketmanagementsystem.model.Bus;
import demo.busticketmanagementsystem.model.Driver;
import demo.busticketmanagementsystem.model.Passenger;
import demo.busticketmanagementsystem.model.Route;
import demo.busticketmanagementsystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping ("/saveBus")
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
    public void delBusByID(@PathVariable Long bus_id){
        busService.delBusByID(bus_id);
    }
//--------------------------------------------------------------------------------

    @PostMapping("/saveDriver")
    public Driver saveDriver(@RequestBody Driver driver) {
        return driverService.saveDriver(driver);
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
    ){
        return passengerService.getAllPassengers(page,size);
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
    ){
        return routeService.getAllRoutes(page,size);
    }

    @GetMapping("/findRouteByID/{route_id}")
    public Optional<Route> findRouteByID(@PathVariable Long route_id) {
        return routeService.findRouteByID(route_id);
    }

    @DeleteMapping("/delRouteByID/{route_id}")
    public void delRouteByID(@PathVariable Long route_id) {
        routeService.delRouteByID(route_id);
    }
}

