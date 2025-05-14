package demo.busticketmanagementsystem.service;

import demo.busticketmanagementsystem.model.Ticket;
import demo.busticketmanagementsystem.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
