package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Product implements IShop, Comparable<Product> {

    private int productId;
    private String productName;
    private String title;
    private String description;
    Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private Boolean producStatus;

    public Product(){

    }
    public Product(int productId, String productName, String title, String description, Catalog catalog, float importPrice, float exportPrice, Boolean producStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.description = description;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.producStatus = producStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
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

    public Boolean getProducStatus() {
        return producStatus;
    }

    public void setProducStatus(Boolean producStatus) {
        this.producStatus = producStatus;
    }

    @Override
    public void inputData(Scanner scanner, List<Catalog> list) {
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        this.productName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập tiêu đề sản phẩm: ");
        this.title = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm:");
        this.description = scanner.nextLine();
        System.out.println("Nhập giá nhập sản phẩm: ");
        this.importPrice =  Float.parseFloat(scanner.nextLine());
        this.exportPrice=this.importPrice*RATE;
        System.out.println("Giá bán sản phẩm là:"+exportPrice);


        for (Catalog catalog:list) {
            catalog.displayData();
        }
        int iD = Integer.parseInt(scanner.nextLine());
        for (Catalog catalog:list) {
            if (catalog.getCatalogId()==iD){
                this.catalog = catalog;
                break;
            }
        }
    }

    @Override
    public void displayData() {
        System.out.println("......................");
        System.out.printf("Mã sản phẩm: %d\n ",productId);
        System.out.printf("Ten sản phẩm: %s\n ", productName);
        System.out.printf("giá bán: %d\n", exportPrice);
        System.out.printf("Trang thai: %s\n", producStatus?"Còn hàng":"Không còn hàng");
        System.out.println("..........................");
    }
    @Override
    public int compareTo(Product o) {
        return (int) (this.exportPrice- o.exportPrice);
    }
}
