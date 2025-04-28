package demo.busticketmanagementsystem.service;

import demo.busticketmanagementsystem.model.Route;
import demo.busticketmanagementsystem.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public Route saveRoute(Route route) {
        return routeRepository.save(route);
    }

    public Page<Route> getAllRoutes(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return routeRepository.findAll(pageable);
    }

    public Optional<Route> findRouteByID(Long routeId) {
        return routeRepository.findById(routeId);
    }

    public void delRouteByID(Long route_id) {
        routeRepository.deleteById(route_id);
    }
}
