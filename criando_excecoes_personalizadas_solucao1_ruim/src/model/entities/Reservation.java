package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {}
	
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
	
	public long duration() {
		// Implementando a diferen�a entre duas datas
		// 1� - Calculando a diferen�a entre as duas datas em milissegundos
		long diff = checkOut.getTime() - checkIn.getTime();
		
		// 2� - Convertendo os milissegundos para dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			return "Reservation dates for update must be future dates";
		}
		if (!checkOut.after(checkIn)) {
			return "Check-out date must be after check-in date";
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		return null; // Para indicar que a opera��o n�o teve nenhum erro
	}
	
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
	}

}
 