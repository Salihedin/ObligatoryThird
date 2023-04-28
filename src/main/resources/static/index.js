function PurchaseTicket () {
    const ticket = {
        movies: $("#movies").val(),
        firstName: $("#firstName").val(),
        lastName: $("#lastName").val(),
        phoneNumber: $("#phoneNumber").val(),
        email: $("#email").val(),
        amount: $("#amount").val()
    };

    $.post("/saveTicket", ticket, function () {
        getAlt();
        console.log("Ticket fra post: "+ticket);
    });

    $("#movies").val(""); //tømer input-feltene
    $("#firstName").val("");
    $("#lastName").val("");
    $("#phoneNumber").val("");
    $("#email").val("");
    $("#amount").val("");
}
function getAlt() {
    $.get( "/getAllTicket", function(data ) {
        formatData(data);
    });
}

function formatData(allTickets){
    let out = "<table><tr>" +
        "<th>Movie</th><th>First name</th><th>Last name</th>" +
        "<th>Phone number</th><th>Email</th><th>Amount</th>" + "</tr>";

    for (const ticket of allTickets){
        out += "<td>" + ticket.movies + "</td> +" + " <td>" + ticket.firstName + "</td><td>" + ticket.lastName + "</td>" +
            "<td>" + ticket.phoneNumber + "</td><td>" + ticket.email + "</td><td>" + ticket.amount + "</td>";
    }

    out+="</table>";
    $("#TicketReceipt").html(out);
    }

    function deleteTickets (){
    $.get("/deleteAllTicket", function (){
        getAlt();
    });
    }

