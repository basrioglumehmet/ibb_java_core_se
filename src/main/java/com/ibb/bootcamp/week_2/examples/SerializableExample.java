package com.ibb.bootcamp.week_2.examples;
import java.io.*;

public class SerializableExample {
    public static void main(String[] args) {
        //Emplooye objesini .dat dosyası olarak kayıt edeceğim
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.dat"))){
            Employee employee = new Employee();
            employee.setFullName("Mehmet Basrioğlu");
            outputStream.writeObject(employee);
            System.out.println("Nesne başarıyla data dosyası olarak yazıldı");
        }
        catch (IOException ex){ //Dosya ile ilgili istisnai durumlardır.
            ex.printStackTrace();
        }
    }
    //Serializable Arayüzünü uygulayan sınıftır serialize ve deserialize işleminde kullanılacak
    static class Employee implements Serializable{
        private static final long serialVersionUID = 1L; //Versiyon Kontrolü için kullanılır
        private String fullName;

        //Java Bean Requirement
        Employee(){

        }

        public String getFullName(){
            return this.fullName;
        }
        public void setFullName(String fullName){
            this.fullName = fullName;
        }
    }
}
