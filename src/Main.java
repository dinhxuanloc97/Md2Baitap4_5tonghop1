import ra.Product;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] ListProduct = new Product[1000];
        Scanner sc = new Scanner(System.in);
        int index = 0;
        do{
            System.out.println("**********Menu**********");
            System.out.println("1.Nhap vao thong tin cho n san pham ");
            System.out.println("2.Tinh gia ban cho tat ca san pham ");
            System.out.println("3.Hien thi thong tin cua san pham ");
            System.out.println("4.Sap xep san pham theo gia tang dan ");
            System.out.println("5.tim kiem san pham theo ten san pham ");
            System.out.println("6.Thong ke so luong va in thong tin cac san pham ");
            System.out.println("7.Cap nhap trang thai cua san pham theo ma");
            System.out.println("8.thoat");
            System.out.println("Lua chon cua ban la :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhap so san pham can cap nhap :");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Product pro = new Product();
                        pro.inputData();
                        ListProduct[index] = pro;
                        index++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < index; i++) {
                        ListProduct[i].calExportPrice();
                    }
                    System.out.println("Da tinh xong gia ban cua san pham:");
                    break;
                case 3:
                    System.out.println("Thong tin san pham la :");
                    System.out.printf("%-15s%-30s%-30s%-15s%-15s%-10s%-50s%-10s\n", "Product ID", "Product Name",
                            "Title", "Import Price", "Export Price", "Quantity", "Descriptions", "Status");
                    for (int i = 0; i < index; i++) {
                        ListProduct[i].displayData();
                    }
                    break;
                case 4:
                    System.out.println("sap xep san pham theo gia tang dan la:");
                    for (int i = 0; i < index; i++) {
                        for (int j = i+1; j< index; j++ ){
                           if (ListProduct[i].getExportPrice()>ListProduct[j].getExportPrice()){
                               Product temp = ListProduct[i];
                               ListProduct[i] = ListProduct[j];
                               ListProduct[j] = temp ;
                           }
                        }
                    }
                    break;
                case 5:
                    System.out.println("San pham hien thi theo ten la :");
                    String strSeach = sc.nextLine();
                    System.out.printf("%-15s%-30s%-30s%-15s%-15s%-10s%-50s%-10s\n", "Product ID", "Product Name",
                            "Title", "Import Price", "Export Price", "Quantity", "Descriptions", "Status");
                    for (int i= 0; i< index; i++){
                        if (ListProduct[i].getProductName().startsWith(strSeach)){
                            ListProduct[i].displayData();
                        }
                    }
                    break;
                case 6:
                    int cnt = 0;
                    System.out.printf("%-15s%-30s%-30s%-15s%-15s%-10s%-50s%-10s\n", "Product ID", "Product Name",
                            "Title", "Import Price", "Export Price", "Quantity", "Descriptions", "Status");
                    for (int i = 0; i < index; i++) {
                        if(ListProduct[i].getQuantity()<=5){
                            cnt++;
                            ListProduct[i].displayData();
                        }
                    }
                    System.out.printf("Co %d san pham sap het hang\n",cnt);
                    break;
                case 7:
                    String strUpdate = "";
                    System.out.println("Nhap vao ma san pham can cap nhat trang thai: ");
                    strUpdate = sc.nextLine();
                    for (int i = 0; i < index; i++) {
                        if (ListProduct[i].getProductId().equals(strUpdate)){
                            //Cap nhat trang thai cua san pham arrProduct[i]
                            ListProduct[i].setProductStatus(!ListProduct[i].isProductStatus());
                        }
                    }
                    System.out.println("Da cap nhat thanh cong trang thai cua san pham");
                    break;
                case  8:
                    System.exit(0);
                default:
                    System.err.printf("vui long nhap tu 1 den 8");
            }
        }while (true);
    }
}