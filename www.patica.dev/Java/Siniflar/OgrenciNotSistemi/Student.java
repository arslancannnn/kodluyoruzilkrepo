package Siniflar.OgrenciNotSistemi;

public class Student {
    
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya){
        this.name    = name;
        this.classes = classes;
        this.stuNo   = stuNo;
        this.mat     = mat;
        this.fizik   = fizik;
        this.kimya   = kimya;
        calcAvarage();
        this.isPass  = false;
    }

   

    public void addBulkExamNote(int mat, int fizik, int kimya){
        
        if(mat >= 0 && mat <= 100){
            this.mat.sinav = mat;
        }
        if(fizik >= 0 && fizik <= 100){
            this.fizik.sinav = fizik;
        }
        if(kimya >= 0 && kimya <= 100){
            this.kimya.sinav = kimya;
        }
    }
    public void addSozlu(int mat, int fizik, int kimya){

        if(mat >= 0 && mat <= 100){
            this.mat.sozlu = mat;
        }
        if(fizik >= 0 && fizik <= 100){
            this.fizik.sozlu = fizik;
        }
        if(kimya >= 0 && kimya <= 100){
            this.kimya.sozlu = kimya;
        }
    }

    public void isPass(){

        if (this.mat.calcNote(this.mat.sinav, this.mat.sozlu) == 0 || this.fizik.calcNote(this.fizik.sinav, this.fizik.sozlu) == 0 || this.kimya.calcNote(this.kimya.sinav, this.kimya.sozlu) == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    private void calcAvarage() {

        double mat = this.mat.calcNote(this.mat.sinav, this.mat.sozlu);
        double fizik= this.fizik.calcNote(this.fizik.sinav, this.fizik.sozlu);
        double kimya= this.kimya.calcNote(this.kimya.sinav, this.kimya.sozlu);
        this.avarage= (mat+fizik+kimya)/3;
        
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
}

public void printNote(){
    System.out.println("=========================");
    System.out.println("Öğrenci : " + this.name);
    System.out.println("Matematik Notu : " + this.mat.calcNote(this.mat.sinav, this.mat.sozlu));
    System.out.println("Fizik Notu : " + this.fizik.calcNote(this.fizik.sinav, this.fizik.sozlu));
    System.out.println("Kimya Notu : " + this.kimya.calcNote(this.kimya.sinav, this.kimya.sozlu));
}
}
  
