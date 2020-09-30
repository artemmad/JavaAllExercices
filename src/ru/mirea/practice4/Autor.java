package ru.mirea.practice4;

public class Autor {
                protected String name;
                protected String email;
                protected char gender;
                public Autor(String name, String email,char gender) {
                        this.name = name;
                        this.email = email;
                        this.gender = gender;
                }

    public String getEmail() {
                                return email;
                }
                public String getName() {
                        return name;
                }
                public char getGender() {
                        return gender;
                }

                public void setEmail(String email){
                       this.email = email;
                }

                @java.lang.Override
                public java.lang.String toString() {
                        return "Автор{" +
                                "имя='" + name + '\'' +
                                ", почта='" + email + '\'' +
                                ", пол=" + gender +
                                '}';
                }
        }