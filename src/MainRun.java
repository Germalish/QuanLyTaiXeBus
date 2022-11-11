import entity.Driver;
import entity.DriverBoard;
import entity.DriverBoardDetail;
import entity.Line;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static Driver[] drivers =  new Driver[1000];
    public static Line[] lines =  new Line[1000];
    public static DriverBoard[] driverBoards =  new DriverBoard[1000];
    public static void main(String[] args) {
        Menu();

    }

    private static void Menu() {
       while (true){
           showMenu();
           int choice;
           do {
               System.out.println("Chọn chức năng trong Menu: ");
               choice = new Scanner(System.in).nextInt();
               if(choice >= 1 && choice <= 10){
                   break;
               }
               System.out.println("Không hợp lê, vui lòng nhập lại");
           }
           while (true);
           switch (choice){
               case 1:
                   creatDSLaiXe();
                   break;
               case 2:
                   showDSLaiXe();
                   break;
               case 3:
                   creatTuyenLai();
                   break;
               case 4:
                   showTuyenLai();
                   break;
               case 5:
                   driverBoard();
                   break;
               case 6:
                   showdriverBoard();
                   break;
               case 7:
                   sapxepBangPhancong();
                   break;
               case 8:
                   break;
               case 9:
                   break;
               case 10:
                   System.out.println("Bạn đã thoát chương trình");
                   return;
           }
       }
    }

    private static void sapxepBangPhancong() {
        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 0; i < driverBoards.length; i++) {
        }
    }


    private static void showdriverBoard() {
        for (int i = 0; i < driverBoards.length; i++) {
            if (driverBoards[i] != null){
                System.out.println(driverBoards[i]);
            }

        }
    }

    private static void driverBoard() {
        if (drivers.length == 0 || lines.length == 0) {
            System.out.println("Bạn cần có thông tin về lái xe và tuyến ");
            return;
        }

        System.out.println("Bạn muốn phân công cho mấy lái xe ");
        int driverNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverNum; i++) {
            System.out.println("Phân công giảng dạy cho lái xe thứ " + (i + 1));
            System.out.print("Nhập mã lái xe muốn phân công: ");
            int driverId;
            Driver driver = null;
            do {
                driverId = new Scanner(System.in).nextInt();
                for (int j = 0; j < drivers.length; j++) {
                    if (drivers[j].getId() == driverId) {
                        driver = drivers[j];
                        break;
                    }
                }
                if (driver != null) {
                    break;
                }
                System.out.println("Không tìm thấy giảng viên mang mã " + driver + ", vui lòng nhập lại");
            } while (true);

            System.out.print("Lái xe này muốn chạy bao nhiêu tuyến: ");
            int lineNum = new Scanner(System.in).nextInt();
            DriverBoardDetail[] detail = new DriverBoardDetail[lineNum];
            int count = 0;
            int tongTuyen = 0;
            for (int j = 0; j < lineNum; j++) {
                System.out.println("Nhập thông tin tuyến thứ " + (j + 1) + " mà lái xe " + driver.getName() + " muốn chạy: ");
                System.out.println("Nhập mã tuyến mà lái xe muốn chạy: ");
                int lineID;
                Line line = null;
                do {
                    lineID = new Scanner(System.in).nextInt();
                    for (int k = 0; k < lines.length; k++) {
                        if (lines[k].getId() == lineID) {
                            line = lines[k];
                            break;
                        }
                    }
                    if (line != null) {
                        break;
                    }
                    System.out.println("Không tìm thấy tuyến mang mã " + lineID + ", vui lòng nhập lại");
                } while (true);

                System.out.print("Nhập số lần muốn chạy tuyến này: ");
                int numofTurn;
                do {
                    numofTurn = new Scanner(System.in).nextInt();
                    if (numofTurn > 0 ) {
                        break;
                    }
                    System.out.print("Số lần  không được âm, nhập lại: ");
                } while (true);

                // lưu môn học muốn dạy vào trong mảng
                detail[count] = new DriverBoardDetail(line, numofTurn);
                int kout = 0;
                for (int k = 0; k < lines.length; k++) {
                    if (lines[k] != null){
                        kout++;
                    }
                }
                tongTuyen += kout * numofTurn;

                if (tongTuyen > 15) {
                    System.out.println("Bạn đã chạy quá 15 tuyến trong ngày hôm nay, hãy gọi tổng đài để điều chỉnh");
                    break;
                }
                count++;
            }

            DriverBoard driverBoard = new DriverBoard(driver, detail);
            saveDriverBoard(driverBoard);
        }
    }

    private static void saveDriverBoard(DriverBoard driverBoard) {
        for (int i = 0; i < driverBoards.length; i++) {
            if(driverBoards[i] == null){
                driverBoards[i] = driverBoard;
                break;
            }
        }
    }

    private static void showTuyenLai() {
        for (int i = 0; i < lines.length; i++) {
            if (lines[i] != null){
                System.out.println(lines[i]);
            }

        }
    }

    public static void creatTuyenLai() {
        System.out.println("Nhập số lượng tuyến lái xe mới: ");
        int numTuyen = new Scanner(System.in).nextInt();
        for (int i = 0; i < numTuyen; i++) {
            Line line = new Line();
            line.nhapThongtin();
            saveTuyen(line);
        }

    }


    private static void saveTuyen(Line line) {
        for (int i = 0; i < lines.length; i++) {
            if (lines[i] == null){
                lines[i] = line;
                break;
            }
        }

    }

    private static void showDSLaiXe() {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] != null){
                System.out.println(drivers[i]);
            }

        }
    }

    private static void creatDSLaiXe() {
        System.out.println("Nhập số lượng lái xe mới: ");
        int numDriver = new Scanner(System.in).nextInt();
        for (int i = 0; i < numDriver; i++) {
            Driver driver = new Driver();
            driver.nhapThongtin();
            saveDriver(driver);
        }


    }

    private static void saveDriver(Driver driver) {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] == null){
                drivers[i] = driver;
                break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("-----Hệ thống phân công lái xe-----");
        System.out.println("1.Nhập danh sách lái xe mới");
        System.out.println("2.In danh sách lái xe");
        System.out.println("3.Nhập danh sách tuyến mới");
        System.out.println("4.In danh sách tuyến mới");
        System.out.println("5.Nhập danh sách phân công cho lái xe");
        System.out.println("6.In danh sách phân công");
        System.out.println("7.Sắp xếp danh sách phân công theo Họ và Tên");
        System.out.println("8.Sắp xếp danh sách phân công theo số lượng tuyến đảm nhận trong ngày");
        System.out.println("9.Bảng thống kê khoảng cách chạy xe trong ngày");
        System.out.println("10.Thoát chương trình");
    }
}
