package com.company;

/** MIT License

 Copyright (c) 2018 Baglay Alexander

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Клас покупця
 * @author Baglay Alexander
 * @version 1.0
 */
public class Client {

    private String _surname; ///Прізвище
    private String _name; /// Ім'я
    private String _lastName; ///  По батькові
    private String _address; /// Адрес
    private int _creditCardNumber; /// Номер кредитної картки
    private int _bankAccountNumber; /// Номер банківського рахунку

    /**
     * Точка входу до програми.
     * @param args Додаткові аргументи для виконання програми.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int max = 10;

        List<Client> apartments = new ArrayList<Client>();

        for (int i = 0; i < max; i++) {

            apartments.add(new Client("Ivanov","Ivan"+i,"User"+i+"ch","Kiev",random.nextInt(500),random.nextInt(200)));
        }

        System.out.println("Surname\t| Name\t| lastName\t| Address\t| Credit card number\t| Bank account number");

        for (var a : apartments){

            System.out.println(a._surname +"\t"+a._name+"\t"+a._lastName+"\t"+a._address+"\t"+a._creditCardNumber+"\t"+a._bankAccountNumber);
        }
    }

    /**
     * Конструктор за замовчуванням. Ініціалізує порожні поля класу.
     */
    public  Client(){
        _surname="Ivanov";
        _name="Ivan";
        _lastName="Ivanovich";
        _address="Kiev";
        _creditCardNumber=0;
        _bankAccountNumber=1;
    }
    /**
     * Конструктор з атрибутами. Ініціалізує поля зі значеннями з атрибутів.
     * @param surname Прізвище
     * @param name  Ім'я
     * @param lastName По батькові
     * @param address Адрес
     * @param creditCardNumber Номер кредитної картки
     * @param bankAccountNumber Номер банківського рахунку
     */
    public Client(String surname,String name,String lastName,String address,int creditCardNumber,int bankAccountNumber){

        _surname=surname;
        _name=name;
        _lastName=lastName;
        _address=address;
        _creditCardNumber=creditCardNumber;
        _bankAccountNumber=bankAccountNumber;
    }


    /**
     * Повертає номер кредитної картки
     * @return Номер кредитної картки
     */
    public int get_creditCardNumber() {
        return _creditCardNumber;
    }
    /**
     * Встановлює номер кредитної картки
     * @param creditCardNumber Номер кредитної картки
     */
    public void set_creditCardNumber(int creditCardNumber) {
        _creditCardNumber = creditCardNumber;
    }
    /**
     * Повертає номер банківського рахунку
     * @return Номер банківського рахунку
     */
    public int get_bankAccountNumber() {
        return _bankAccountNumber;
    }
    /**
     * Встановлює номер банківського рахунку
     * @param bankAccountNumber Номер банківського рахунку
     */
    public void set_bankAccountNumber(int bankAccountNumber) {
        _bankAccountNumber = bankAccountNumber;
    }
    /**
     * Повертає адресу покупця
     * @return Адреса покупця
     */
    public String get_address() {
        return _address;
    }
    /**
     *Встановлює адресу покупця
     * @param address Адреса покупця
     */
    public void set_address(String address) {
        this._address = address;
    }
    /**
     * Повертає ім'я користувача
     * @return Ім'я користувача
     */
    public String get_name() {
        return _name;
    }
    /**
     * Встановлює ім'я користувача
     * @param name Ім'я користувача
     */
    public void set_name(String name) {
        this._name = name;
    }
    /**
     * Повертає по батькові
     * @return По батькові
     */
    public String get_lastName() {
        return _lastName;
    }
    /**
     * Встановлює по батькові
     * @param lastName По батькові
     */
    public void set_lastName(String lastName) {
        this._lastName = lastName;
    }
    /**
     * Повертає прізвище
     * @return Прізвище
     */
    public String get_surname() {
        return _surname;
    }
    /**
     * Встановлює прізвище
     * @param surname Прізвище
     */
    public void set_surname(String surname) {
        this._surname = surname;
    }
}
