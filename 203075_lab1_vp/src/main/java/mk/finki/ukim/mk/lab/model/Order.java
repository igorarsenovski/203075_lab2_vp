package mk.finki.ukim.mk.lab.model;

public class Order {
    public String balloonColor;
    public String balloonSize;
    public String clientName;
    public String clientAddress;
    public Long orderId;

    public String getBalloonColor() {
        return balloonColor;
    }
    public String getBalloonSize() {
        return balloonSize;
    }
    public String getClientName() {
        return clientName;
    }
    public String getClientAddress() {
        return clientAddress;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setBalloonColor(String balloonColor) {
        this.balloonColor = balloonColor;
    }
    public void setBalloonSize(String balloonSize) {
        this.balloonSize = balloonSize;
    }
    public void setClientName(String clientName) { this.clientName = clientName;}
    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
