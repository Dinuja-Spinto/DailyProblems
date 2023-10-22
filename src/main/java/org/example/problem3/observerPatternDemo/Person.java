package org.example.problem3.observerPatternDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Subscriber {
    private String fname;
    private String middleName;
    private String lname;
    private Date dOfBirth;
    private String email;
    private String address;

    private Person(PersonBuilder personBuilder) {
        this.fname = personBuilder.fname;
        this.lname = personBuilder.lname;
        this.middleName = personBuilder.middleName;
        this.dOfBirth = personBuilder.dOfBirth;
        this.email = personBuilder.email;
        this.address = personBuilder.address;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getdOfBirth() {
        return dOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getName(){
        return fname + " " + lname;
    }

    @Override
    public void subscribe(Observer observer) {
        observer.addSubscriber(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observer.removeSubscriber(this);
    }

    private String formatDate(Date date)  {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/MM/yyyy hh:mm:ss");
        return dateFormat.format(date);
    }

    @Override
    public void sendMessage(Observer observer, String message) {
        System.out.println(this.getName() + " : " + observer.getName() + " : " + formatDate(new Date()) + " : " + message);
    }

    //use builder Pattern
    public static class PersonBuilder{
        private String fname;
        private String middleName;
        private String lname;
        private Date dOfBirth;
        private String email;
        private String address;

        public PersonBuilder(String fname, String lname) {
            this.fname = fname;
            this.lname = lname;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setdOfBirth(Date dOfBirth) {
            this.dOfBirth = dOfBirth;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

        @Override
        public String toString() {
            return "PersonBuilder{" +
                    "fname='" + fname + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lname='" + lname + '\'' +
                    ", dOfBirth=" + dOfBirth +
                    ", email='" + email + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}
