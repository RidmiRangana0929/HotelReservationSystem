package model;

public class BookedRooms {
    private String roomType;
    private String roomNo;
    private String price;

    public BookedRooms() {
    }

    public BookedRooms(String roomType, String roomNo, String price) {
        this.roomType = roomType;
        this.roomNo = roomNo;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookedRooms{" +
                "roomType='" + roomType + '\'' +
                ", roomNo='" + roomNo + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
