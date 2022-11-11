package entity;

import java.util.Scanner;

public class Line implements Inputable{
    private int id;
    private double distance;
    private int numOfStops;
    public static int Auto_Idd = 100;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getNumOfStops() {
        return numOfStops;
    }

    public void setNumOfStops(int numOfStops) {
        this.numOfStops = numOfStops;
    }

    @Override
    public String toString() {
        return "Line{" +
                "id=" + id +
                ", distance=" + distance +
                ", numOfStops=" + numOfStops +
                '}';
    }
    public void nhapThongtin(){
        this.id = Auto_Idd;
        Auto_Idd++;
        System.out.println("Nhập khoảng cách: ");
        this.distance = new Scanner(System.in).nextDouble();
        System.out.println("Nhập điểm dừng: ");
        this.numOfStops = new Scanner(System.in).nextInt();
    }
}
