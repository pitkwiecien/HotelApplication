package pl.piotrkwiecien.hotel.remote.rest.dto.response;

public class RoomDto {
    private Integer id;
    private Integer beds;
    private Float price;

    public RoomDto(Integer id, Integer beds, Float price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public RoomDto() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getBeds() {
        return beds;
    }

    public Float getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
