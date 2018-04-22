



import java.util.ArrayList;


import java.util.Collections;


import java.util.List;


import java.util.Scanner;




class Student implements Comparable<Student> {


    private int id;


    private String fname;



    private double cgpa;






    public Student(int id, String fname, double cgpa) {



        super();



        this.id = id;



        this.fname = fname;



        this.cgpa = cgpa;



    }






    public int getId() {



        return id;



    }






    public String getFname() {



        return fname;



    }






    public double getCgpa() {



        return cgpa;



    }






    @Override



    public int compareTo(Student b) {



        double epsilon = 
.


;



        if (Math.abs(this.getCgpa() - b.getCgpa()) > epsilon) {



            return this.getCgpa() < b.getCgpa() ? 
 : -
; 



        } else if (!this.getFname().equals(b.getFname())) {



            return this.getFname().compareTo(b.getFname());



        } else {



            return this.getId() - b.getId();



        }



    }



}






public class Solution {



    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);



        int testCases = Integer.parseInt(in.nextLine());






        List<Student> studentList = new ArrayList<Student>();



        while (testCases > 
) {



            int id = in.nextInt();



            String fname = in.next();



            double cgpa = in.nextDouble();






            Student st = new Student(id, fname, cgpa);



            studentList.add(st);






            testCases--;



        }



        in.close();



        Collections.sort(studentList);






        for (Student st : studentList) {



            System.out.println(st.getFname());



        }



    }



}

