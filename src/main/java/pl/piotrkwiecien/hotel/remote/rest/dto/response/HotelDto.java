package pl.piotrkwiecien.hotel.remote.rest.dto.response;

import java.util.List;

public class HotelDto {
    private Integer id;
    private String name;
    private List<RoomDto> rooms;

    public HotelDto(Integer id, String name, List<RoomDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public HotelDto() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<RoomDto> getRooms() {
        return rooms;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRooms(List<RoomDto> rooms) {
        this.rooms = rooms;
    }
}
