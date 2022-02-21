package pl.piotrkwiecien.hotel.remote.rest.dto.response;

import pl.piotrkwiecien.hotel.domain.model.OrderStatusType;
import pl.piotrkwiecien.hotel.remote.rest.dto.request.PersonDto;
import pl.piotrkwiecien.hotel.remote.rest.dto.request.RoomsReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private OrderStatusType status;
    private List<RoomsReservationDto> roomsReservation;
    private PersonDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, OrderStatusType status, List<RoomsReservationDto> roomsReservation, PersonDto person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
