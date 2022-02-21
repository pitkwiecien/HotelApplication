package pl.piotrkwiecien.hotel.remote.rest.dto.request;

import java.util.List;

public class AddReservationDto {
    private List<RoomsReservationDto> roomsReservation;
    private PersonDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<RoomsReservationDto> roomsReservation, PersonDto person) {
        this.roomsReservation = roomsReservation;
        this.person = person;
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
