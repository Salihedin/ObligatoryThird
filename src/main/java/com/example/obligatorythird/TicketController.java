package com.example.obligatorythird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private TicketRepository rep;

    @PostMapping("/saveTicket")
    public void saveTicket(Ticket innTicket){
        rep.saveTicket(innTicket);
    }

    @GetMapping("/getAllTicket")
    public List<Ticket> getAllTicket(){
        return rep.getAllTickets();
    }

    @GetMapping("/deleteAllTicket")
    public void DeleteAllTicket(){
        rep.deleteAllTickets();
    }
}
