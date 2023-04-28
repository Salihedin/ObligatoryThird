package com.example.obligatorythird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Repository
public class TicketRepository {
    @Autowired
    private JdbcTemplate db;

    @PostMapping
    public void saveTicket (Ticket innTicket){
        String sql = "INSERT INTO Ticket (movies, firstName, lastName, phoneNumber, email, amount) VALUES (?,?,?,?,?,?)";
        db.update(sql, innTicket.getMovies(), innTicket.getFirstName(), innTicket.getLastName(), innTicket.getPhoneNumber(), innTicket.getEmail(), innTicket.getAmount());
    }

    public List<Ticket> getAllTickets(){
        String sql = "SELECT * FROM Ticket";
        List<Ticket> allTicket = db.query(sql, new BeanPropertyRowMapper<>(Ticket.class));
        return allTicket;
    }

    public void deleteAllTickets(){
        String sql = "DELETE FROM Ticket";
        db.update(sql);
    }
}
