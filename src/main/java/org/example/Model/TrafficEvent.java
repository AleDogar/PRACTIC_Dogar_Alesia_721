package org.example.Model;

public class TrafficEvent implements HasId<Integer>{
    private Integer id;
    private Integer vehicleId;
    private EventType type;
    private Integer severity;
    private Integer timeSlot;

    public TrafficEvent() {

    }

    public TrafficEvent(Integer id, Integer vehicleId, EventType type, Integer severity, Integer timeSlot) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.type = type;
        this.severity = severity;
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

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public Integer getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(Integer timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "TrafficEvent{" +
                "id=" + id +
                ", vehicleId=" + vehicleId +
                ", type=" + type +
                ", severity=" + severity +
                ", timeSlot=" + timeSlot +
                '}';
    }
}
