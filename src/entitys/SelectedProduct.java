package entitys;

public class SelectedProduct {
    
    private Integer id;
    private String productCode;
    private String productName;
    private String productBrand;
    private double productPrice;
    private int    productQuantity;
    private double    finalPrice;

    public SelectedProduct() {
    }

    public SelectedProduct(Integer id, String productCode, String productName, String productBrand, double productPrice, int productQuantity, double finalPrice) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.finalPrice = finalPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    @Override
    public String toString() {
        return "SelectedProduct{" + "id=" + id + ", productCode=" + productCode + ", productName=" + productName + ", productBrand=" + productBrand + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + ", finalPrice=" + finalPrice + '}';
    }

   
    
    
}