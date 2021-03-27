package max.edu;

public class Table extends Rectangle{
    private String color;
    private String material;
    private String tableType;
    private boolean isDecoration;
    private boolean isLacquered;
    private final int pricePerSquareMetr = 100;

    public Table() {
    }

    public Table(int a, int b) {
        super(a, b);
    }

    public Table(String color, String material, String tableType, boolean isDecoration, boolean isLacquered) {
        this.color = color;
        this.material = material;
        this.tableType = tableType;
        this.isDecoration = isDecoration;
        this.isLacquered = isLacquered;
    }

    public Table(int a, int b, String color, String material, String tableType, boolean isDecoration, boolean isLacquered) {
        super(a, b);
        this.color = color;
        this.material = material;
        this.tableType = tableType;
        this.isDecoration = isDecoration;
        this.isLacquered = isLacquered;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public boolean isDecoration() {
        return isDecoration;
    }

    public void setDecoration(boolean decoration) {
        isDecoration = decoration;
    }

    public boolean isLacquered() {
        return isLacquered;
    }

    public void setLacquered(boolean lacquered) {
        isLacquered = lacquered;
    }

    @Override
    public String toString() {
        return "Table{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", tableType='" + tableType + '\'' +
                ", isDecoration=" + isDecoration +
                ", isLacquered=" + isLacquered +
                '}';
    }

    public int getPrice(){
        int price = super.getArea() * pricePerSquareMetr;
        if(this.getMaterial().equals("wood")){
            price = price * 2;
        }
        if (this.getTableType().equals("white")){}
        price = price * 4;
        if (this.getColor().equals("white")){
            price = price * 2;
        }

        return price;
    }
}
