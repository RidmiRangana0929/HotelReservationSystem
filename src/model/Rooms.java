package model;

public class Rooms {
     private String roomType;
     private String roomNo;

     public Rooms() {
     }

     public Rooms(String roomType, String roomNo) {
          this.roomType = roomType;
          this.roomNo = roomNo;
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
}
