package com.example.spring_sites.site25;


import jakarta.persistence.*;

//«машина»: ID, Вид техники (например, мультиварка), Группа техники (например, бытовые
//приборы), Дата ввоза на склад, Дата вывоза со склада, ФИО водителя, увозящего технику со склада.
//CREATE TABLE Book (
//        ID int (15) NOT NULL AUTO_INCREMENT,
//        name varchar (255) NOT NULL,
//        publish_house varchar (255) NOT NULL,
//        data_input datetime NOT NULL,
//        FIO datetime NOT NULL,
//        data_output varchar (255),
//        PRIMARY KEY (ID)
//        ) ENGINE=InnODB DEFAULT CHARSET=UTF8
// сущность которую нужно сохранять в базе данных

//Параметры объекта «сеанс»: ID, Название фильма, Киностудия, Дата и время сеанса, Количество билетов на сеанс.
@Entity
@Table(name="Conference", schema="WAREHOUSE")
public class Conference {

    @Column(name = "ID")
    private Long ID;

    @Column(name = "name")
    private String name;

    @Column(name = "data_input")
    private String data_input;

    @Column(name = "FIO_moder")
    private String FIO_moder;

    @Column(name = "FIO_speaker")
    private String FIO_speaker;



    protected Conference(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData_input() {
        return data_input;
    }

    public void setData_input(String data_input) {
        this.data_input = data_input;
    }

    public String getFIO_moder() {
        return FIO_moder;
    }

    public void setFIO_moder(String FIO_moder) {
        this.FIO_moder = FIO_moder;
    }

    public String getFIO_speaker() {
        return FIO_speaker;
    }

    public void setFIO_speaker(String FIO_speaker) {
        this.FIO_speaker = FIO_speaker;
    }
}
