package view.tm;

import javafx.scene.control.Button;

public class RoomsTM {
    private String roomType;
    private String roomNo;
    private Button btn;

    public RoomsTM() {
    }

    public RoomsTM(String roomType, String roomNo, Button btn) {
        this.roomType = roomType;
        this.roomNo = roomNo;
        this.btn = btn;
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "RoomsTM{" +
                "roomType='" + roomType + '\'' +
                ", roomNo='" + roomNo + '\'' +
                ", btn=" + btn +
                '}';
    }
}
