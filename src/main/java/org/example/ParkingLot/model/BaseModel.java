package org.example.ParkingLot.model;

import java.util.Date;

public abstract class BaseModel {
    private long id;
    private Date createdOn;
    private String createdBy;
    private Date modifiedOn;
    private String modifiedBy;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
