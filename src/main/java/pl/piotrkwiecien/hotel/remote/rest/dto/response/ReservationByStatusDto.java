package pl.piotrkwiecien.hotel.remote.rest.dto.response;

import java.util.List;

public class ReservationByStatusDto {
    private List<ReservationDto> reservations;

    public ReservationByStatusDto(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }

    public ReservationByStatusDto() {
    }

    public List<ReservationDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }
}
