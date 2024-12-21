public class TicketFactory {

    
    private static TicketFactory instance;

 
    private TicketFactory() {
    }

   
    public static TicketFactory getInstance() {
        if (instance == null) {
            instance = new TicketFactory();
        }
        return instance;  
    }

    
    public Ticket createTicket(String type) {
        switch (type.toLowerCase()) {
            case "odc":
                return new ConcreteTicket("ODC", 300);
            case "balcony":
                return new ConcreteTicket("Balcony", 350);
            case "box":
                return new ConcreteTicket("Box", 350);
            case "super balcony":
                return new ConcreteTicket("Super Balcony", 500);
            default:
                return null; 
        }
    }
}
