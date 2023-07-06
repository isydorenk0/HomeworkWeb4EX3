package Entity;

public class Order {
    private long id;
    private long carId;
    private long clientId;

    public Order(long id, long carId, long clientId) {
        this.id = id;
        this.carId = carId;
        this.clientId = clientId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
}
