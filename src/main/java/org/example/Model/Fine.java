package org.example.Model;

public class Fine implements HasId<Integer>{

    private Integer id;
    private Integer vehicleId;
    private FineReason reason;
    private Integer amount;
    private  Integer timeSlot;

    public Fine() { }

    public Fine(Integer id, Integer vehicleId, FineReason reason, Integer amount, Integer timeSlot) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.reason = reason;
        this.amount = amount;
        this.timeSlot = timeSlot;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public FineReason getReason() {
        return reason;
    }

    public void setReason(FineReason reason) {
        this.reason = reason;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(Integer timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "id=" + id +
                ", vehicleId=" + vehicleId +
                ", reason=" + reason +
                ", amount=" + amount +
                ", timeSlot=" + timeSlot +
                '}';
    }
}
