
package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    } 
    
    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public String updateDates(Date checkin, Date checkout) {
        
        Date now = new Date();
            
            if(checkin.before(now) || checkout.before(now)) {
                return "Error in reservation: Reservation dates for update must be future dates";
            }
            if(!checkout.after(checkin)) {
                return "Erron in reservation: Check-out date must be after check-in date";
            }
            this.checkIn = checkin;
            this.checkOut = checkout;
            
            return null;
    }
    
    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        
        sb.append("Room ").append(roomNumber).append(", ");
        sb.append("check-in: ").append(sdf.format(checkIn));
        sb.append(", ");
        sb.append("check-out: ").append(sdf.format(checkOut));
        sb.append(", ");
        sb.append(duration()).append(" nights");
        
        return sb.toString();
    }
}
