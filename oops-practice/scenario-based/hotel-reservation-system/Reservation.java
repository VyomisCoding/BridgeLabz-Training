public class Reservation{
    int reservationId;
    Guest guest;
    Room room;
    int days;
    Reservation(int reservationId, Guest guest, Room room, int days){
        this.reservationId = reservationId;
        this.guest = guest;
        this.room = room;
        this.days = days;
    }
}
