package pl.piotrkwiecien.hotel.remote.rest.dto.request;

public class PersonDto {
    private String name;
    private String phone;
    private String address;
    private Integer floor;

    public PersonDto(String name, String phone, String address, Integer floor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.floor = floor;
    }

    public PersonDto() {
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
