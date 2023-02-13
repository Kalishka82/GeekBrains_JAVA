package web_06_hometask;

public class Notebooks {
    private String manufacturer;
    private String model;
    private String color;
    private Double screenDiagonal;
    private String screenType;
    private String procLine;
    private Double procSpeed;
    private Integer coreAmount;
    private Integer ram;
    private String graphicsCard;
    private Integer ssdVolume;
    private String operatingSystem;
    private Integer price;

    public Notebooks(String manufacturer, String model, String color, Double screenDiagonal
            , String screenType, String procLine, Double procSpeed, Integer coreAmount
            , Integer ram, String graphicsCard, Integer ssdVolume, String operatingSystem
            , Integer price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.screenDiagonal = screenDiagonal;
        this.screenType = screenType;
        this.procLine = procLine;
        this.procSpeed = procSpeed;
        this.coreAmount = coreAmount;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.ssdVolume = ssdVolume;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(Double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getProcLine() {
        return procLine;
    }

    public void setProcLine(String procLine) {
        this.procLine = procLine;
    }

    public Double getProcSpeed() {
        return procSpeed;
    }

    public void setProcSpeed(Double procSpeed) {
        this.procSpeed = procSpeed;
    }

    public Integer getCoreAmount() {
        return coreAmount;
    }

    public void setCoreAmount(Integer coreAmount) {
        this.coreAmount = coreAmount;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Integer getSsdVolume() {
        return ssdVolume;
    }

    public void setSsdVolume(Integer ssdVolume) {
        this.ssdVolume = ssdVolume;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("[%s %s %s, %s %.1f\", %s, %dx%.2fГГц, RAM %dГб" +
                        ", %s, SSD %dГб, %s, %d руб]", manufacturer, model, color, screenType
                , screenDiagonal, procLine, coreAmount, procSpeed, ram, graphicsCard
                , ssdVolume, operatingSystem, price);
    }
}
