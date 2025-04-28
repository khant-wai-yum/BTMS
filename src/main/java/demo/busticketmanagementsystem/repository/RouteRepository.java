package demo.busticketmanagementsystem.repository;

import demo.busticketmanagementsystem.model.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route,Long> {


}
