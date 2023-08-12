import java.util.*;
import java.io.*;
import java.lang.*;

public class SortByRollNo implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollNo - b.rollNo;
    }
}