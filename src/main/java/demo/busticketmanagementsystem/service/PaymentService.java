package demo.busticketmanagementsystem.service;

import demo.busticketmanagementsystem.model.Payment;
import demo.busticketmanagementsystem.model.Schedule;
import demo.busticketmanagementsystem.model.Ticket;
import demo.busticketmanagementsystem.repository.PaymentRepository;
import demo.busticketmanagementsystem.repository.TicketRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;


    public Payment savePayment(Payment payment) {

        return paymentRepository.save(payment);
    }

}
