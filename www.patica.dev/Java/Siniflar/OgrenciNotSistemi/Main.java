package Siniflar.OgrenciNotSistemi;

public class Main {
    
    public static void main(String[] args) {
        
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Gülçin Ergül", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addSozlu(80, 50, 70);
        s1.isPass();

        Student s2 = new Student("Yasemin Yürük", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addSozlu(60, 100, 70);
        s2.isPass();

        Student s3 = new Student("Eren Bakıcı", 4, "2211133", mat, fizik, kimya);
        s3.addBulkExamNote(70,95,68);
        s3.addSozlu(100, 80, 30);
        s3.isPass();

        Student s4 = new Student("Cemre Kemer", 4, "2211133", mat, fizik, kimya);
        s4.addBulkExamNote(40,30,40);
        s4.addSozlu(100, 80, 30);
        s4.isPass();


    }
}
