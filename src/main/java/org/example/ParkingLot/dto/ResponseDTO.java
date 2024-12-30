package org.example.ParkingLot.dto;

public class ResponseDTO {
    private String message;
    private int code;
    public ResponseDTO() {}
    public ResponseDTO(String message, int code) {
        this.message = message;
        this.code = code;
    }
}
