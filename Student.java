class Student{

        String name;
        int reg_no;

        Student(){
            name = "ABC";
            reg_no = 1234;
        }
        Student(String n, int r){
            name = n;
            reg_no = r;
        }
        Student(Student s){
            name = s.name;
            reg_no = s.reg_no;
        }
        void display(){
            System.out.println("Name : "+ name + "\nReg no : " + reg_no);
        }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("DEF", 5678);
        Student s3 = new Student(s1);

        s1.display();
        s2.display();
        s3.display();
    }
}