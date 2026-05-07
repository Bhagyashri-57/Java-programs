public class Students {

    String name;
    int marks;
    int rollnumber;

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "Bhuvi";
        s1.marks = 98;
        s1.rollnumber = 65;

        Students s2 = new Students();
        s2.name = "Navin";
        s2.marks = 89;
        s2.rollnumber = 45;

        Students s3 = new Students();
        s3.name = "Sonu";
        s3.marks = 76;
        s3.rollnumber = 23;

        Students[] student = new Students[3];

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (int i = 0; i < student.length; i++) {
            System.out.println("Name: " + student[i].name +  "\n Marks : " + student[i].marks);
        }
    }
}