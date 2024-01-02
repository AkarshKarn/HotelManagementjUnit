package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public class HotelManagementSystem {

public boolean validateName(String name) throws Exception {
    if (Pattern.matches("[A-Za-z]{1,}", name))
        return true;
    else
        System.out.println("Please enter a valid name");

    return false;
}

public boolean validateAdhaarId(String adhaarId) throws Exception{
    if (Pattern.matches("[0-9]{16}",adhaarId))
        return true;
    else
        System.out.println("Please enter a valid adhaarId");
    return false;
}

public boolean validateAddress(String address) throws Exception{
    if (Pattern.matches("[A-Za-z0-9][,.@-][A-Za-z0-9]",address))
        return true;
    else
        System.out.println("Please enter a valid address");
    return false;
}

public boolean validateNoOfPeople(String noOfPeople){
    if (Pattern.matches("[1-2]",noOfPeople))
        return true;
    else
        System.out.println("Please enter a valid no of people");
    return false;
}

        public static void main(String[] args) {
            Customer c1 = new Customer("123","1234","axyz",2);
            Customer c2 = new Customer("johny","12345","bxyz",2);
            Customer c3 = new Customer("johnson","12346","cxyz",2);
            Customer c4 = new Customer("johna","12347","dxyz",2);
            Customer c5 = new Customer("johnshu","12348","exyz",2);
            ArrayList<Integer> rooms = new ArrayList<>();
            rooms.add(101);
            rooms.add(102);
            rooms.add(103);
            rooms.add(104);
            rooms.add(105);
            rooms.add(106);
            rooms.add(107);
            rooms.add(108);
            HashMap<Integer,Customer> roomAllotment = new HashMap<>();
            HotelManagementSystem h1 = new HotelManagementSystem();
            h1.putCustomer(101,rooms,roomAllotment);
            System.out.println(roomAllotment);
            h1.putCustomer(101,rooms,roomAllotment);
            System.out.println(roomAllotment);

        }

        public void putCustomer(Integer roomNo, ArrayList r, HashMap<Integer,Customer> h1) {
            if(r.isEmpty()){
                System.out.println("All room are full");
            }

            if(r.contains(roomNo)){
                h1.put(roomNo,new Customer("Akarsh","1234","xyz",1));
                r.remove(roomNo);
            }
            else {
                System.out.println("Room is not empty");
            }


        }
    }
    class Customer{
        String name;
        String aadharId;
        String address;
        int noOfPeople;

        public Customer(String n,String a, String ad, int p){
            this.name = n;
            this.aadharId = a;
            this.address = ad;
            this.noOfPeople = p;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", aadharId='" + aadharId + '\'' +
                    ", address='" + address + '\'' +
                    ", noOfPeople=" + noOfPeople +
                    '}';
        }
    }


