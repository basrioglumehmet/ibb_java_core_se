package com.ibb.bootcamp.week_2.java_8_features;

interface CrudOperation{
    void create();
    void read();
    void update();
    void delete();

     default  String getEntityName(){
        return "Employee";
    }

    static  String getDatabaseConnectionStrings(){
        return "jdbc:mysql://localhost:5454/veritabani";
    }
}

interface EmployeeCrudOperation extends CrudOperation{}

class EmployeeRepository implements EmployeeCrudOperation{

    @Override
    public void create() {
        System.out.println("Entity Oluşturuldu");
    }

    @Override
    public void read() {
        System.out.println("Entity Okundu");
    }

    @Override
    public void update() {
        System.out.println("Entity Güncellendi");
    }

    @Override
    public void delete() {
        System.out.println("Entity Silindi");
    }

    @Override
    public String getEntityName() {
        System.out.println(String.format("Veritabanı Bağlantı Bilgisi (Statik ve Override Edilemez): %s", CrudOperation.getDatabaseConnectionStrings()));
        System.out.println("Entity Adı Alındı");
        return EmployeeCrudOperation.super.getEntityName();
    }
}

public class InterfaceDefaults {
    public static void main(String[] args) {
        EmployeeRepository repo = new EmployeeRepository();
        repo.create();
        repo.read();
        repo.update();
        repo.delete();
        System.out.println(repo.getEntityName());
    }
}
