import java.util.*;
import java.io.*;
import java.lang.*;

public class Student {
    int rollNo;
    String name, address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.rollNo + " " + this.name + " " + this.address;
    }

}