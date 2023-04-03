package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.List;
import java.util.Scanner;

public class Catalog implements IShop {

    private int catalogId;
    private String catalogName;
    private int priority;
    private String descriptions;
    private Boolean catalogStatus;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, int priority, String descriptions, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData(Scanner scanner, List<Catalog> list) {
        scanner.nextLine();
        System.out.println("Nhập vào tên danh mục sản phẩm: ");
        this.catalogName = scanner.nextLine();
        System.out.println("Độ ưu tiên:");
        this.priority = scanner.nextInt();
        System.out.println("Mô tả danh mục: ");
        scanner.nextLine();
        this.descriptions = scanner.nextLine();
        System.out.println("Trạng thái danh mục: ");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("......................");
        System.out.printf("Mã danh mục sản phẩm: %d\n ", catalogId);
        System.out.printf("Ten danh mục sản phẩm: %s\n ", catalogName);
        System.out.printf("Độ ưu tiên: %d\n", priority);
        System.out.printf("Mô tả danh mục: %s\n", descriptions);
        System.out.printf("Trang thai: %s\n", catalogStatus ? "Còn hàng" : "Không còn hàng");
        System.out.println("..........................");
    }
}
