public class Main {
    public static void main(String[] args){
        Guest guest = new Guest(1, "Vyomesh");
        Room standard = new StandardRoom(101);
        Room deluxe = new DeluxeRoom(201);
        PricingStrategy peakSeason = new SeasonalPricing(1.5);
        PricingStrategy normalSeason = new SeasonalPricing(1.0);
        try{
            Reservation r1 = bookRoom(1001, guest, deluxe, 3);
            double bill = r1.room.getPrice(peakSeason) * r1.days;
            System.out.println("Room booked successfully");
            System.out.println("Total Bill: ₹" + bill);
            checkout(r1);
        } catch (RoomNotAvailableException e) {
            System.out.println("⚠️ " + e.getMessage());
        }
    }
    static Reservation bookRoom(int id, Guest guest, Room room, int days) throws RoomNotAvailableException{
        if(!room.isAvailable()){
            throw new RoomNotAvailableException("Room not available");
        }
        room.bookRoom();
        return new Reservation(id, guest, room, days);
    }
    static void checkout(Reservation reservation){
        reservation.room.checkoutRoom();
        System.out.println("🧾 Check-out completed for Room " +
                reservation.room.roomNumber);
    }
}
