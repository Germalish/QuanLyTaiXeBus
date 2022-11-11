package entity;

import contract.DriverLevel;

import java.util.Scanner;

public class Driver extends Person {
    private int id;
    private String level;
    public static int Auto_Id = 10000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public static int getAuto_Id() {
        return Auto_Id;
    }

    public static void setAuto_Id(int auto_Id) {
        Auto_Id = auto_Id;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }




    @Override
    public void nhapThongtin() {
        this.id = Auto_Id;
        Auto_Id++;
        super.nhapThongtin();
        System.out.println("Trình độ tài xế: ");
        System.out.println("1. Loại A");
        System.out.println("2. Loại B");
        System.out.println("3. Loại C");
        System.out.println("4. Loại D");
        System.out.println("5. Loại E");
        System.out.println("6. Loại F");
        int choice = 0;
        do {
            System.out.print("Nhập: ");
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 6) {
                break;
            }
            System.out.println("Không hợp lệ, hãy nhập lại");
        }
        while (true);
        switch (choice){
            case 1:
                this.level = DriverLevel.LOAI_A.value;
                break;
            case 2:
                this.level = DriverLevel.LOAI_B.value;
                break;
            case 3:
                this.level = DriverLevel.LOAI_C.value;
                break;
            case 4:
                this.level = DriverLevel.LOAI_D.value;
                break;
            case 5:
                this.level = DriverLevel.LOAI_E.value;
                break;
            case 6:
                this.level = DriverLevel.LOAI_F.value;
                break;
        }
    }
}
