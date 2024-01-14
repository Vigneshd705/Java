class Student
{
    String name;
    double cgpa;
    String dept;
}

class arrayofobjets
{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(); 
        Student s3=new Student();
        s1.name="Vignesh";
        s1.cgpa=8.53;
        s1.dept="CSE";
        s2.name="Sibaath";
        s2.cgpa=8.9;
        s2.dept="CSE";
        s3.name="Durgesh";
        s3.cgpa=8.47;
        s3.dept="CSE";
        Student student[]=new Student[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;
        for (int i=0;i<3;i++)
        {
            System.out.println(student[i].name+":"+student[i].cgpa);
        }
    }
}