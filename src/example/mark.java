/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class mark {
    private String Name;
    private String className;
    private float C;
    private float PHP;
    private float avg;
    
    public mark () {
        Name = "Nguyen Minh Hieu";
        className = "BKD02";
        C = 9.8f;
        PHP = 10;
        avg = (C+PHP)/2; 
    }
    public void show (){
        System.out.print(Name +"-"+ className+ " "+ "dat loai" + " ");
    }
    public static void main(String[] args) {
        mark student1 = new mark();
        student1.show();
        if(student1.avg >= 8 ){
            System.out.println("Gioi");
        } else if(student1.avg >=6) {
            System.out.println("Kha");
        } else if(student1.avg >=5 ) {
            System.out.println("Trung Binh");
        } else if(student1.avg < 5 ) {
            System.out.println("Khong dat");
        }
    }
}