package ra;

import java.util.Scanner;

public class Product {
    public  String productId;
    public String productName;
    public String title ;
    public  float importPrice;
    public float exportPrice;
    public int quantity;
    public String descriptions;
    public  boolean productStatus;
    public Product(){

    }

    public Product(String productId, String productName, String title, float importPrice, float exportPrice, int quantity, String descriptions, boolean productStatus) {

        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }
    public  void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma san pham");
        this.productId = sc.nextLine();
        System.out.println("Nhap vao ten san pham");
        this.productName =  sc.nextLine();
        System.out.println("Nhap vao tieu de san pham ");
        this.title =sc.nextLine();
        System.out.println("nhap vao gia ban cua san pham");
        this.exportPrice = Float.parseFloat(sc.nextLine());
        System.out.println("nhap vao so luong cua san pham:");
        this.quantity = Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao mo ta san pham:");
        this.descriptions = sc.nextLine();
        System.out.println("nhap vao trang thai cua san pham :");
        this.productStatus = Boolean.parseBoolean(sc.nextLine());
    }
    public  void displayData(){
        System.out.printf("%-15s%-30s%-30s%-15f%-15f%-10d%-50s%-10b\n", this.productId, this.productName, this.title,
                this.importPrice, this.exportPrice, this.quantity, this.descriptions, this.productStatus);
    }
    public  void calExportPrice(){
        this.exportPrice=this.importPrice*1.2f;
    }

}
