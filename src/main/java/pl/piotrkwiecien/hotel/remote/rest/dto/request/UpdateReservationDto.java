package pl.piotrkwiecien.hotel.remote.rest.dto.request;

import pl.piotrkwiecien.hotel.domain.model.OrderStatusType;

import java.util.List;

public class UpdateReservationDto {
    private OrderStatusType status;
    private List<RoomsReservationDto> roomsReservation;
    private PersonDto person;

    public UpdateReservationDto(OrderStatusType status, List<RoomsReservationDto> roomsReservation, PersonDto person) {
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public UpdateReservationDto() {
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<RoomsReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<RoomsReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
