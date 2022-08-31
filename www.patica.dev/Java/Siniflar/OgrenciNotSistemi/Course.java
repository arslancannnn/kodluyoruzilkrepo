package Siniflar.OgrenciNotSistemi;

public class Course {
    
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int sozlu;
    int sinav;

    public Course(String name, String code, String prefix){

        this.name   = name;
        this.code   = code;
        this.prefix = prefix;
        this.sinav  = 0;
        this.sozlu  = 0;

    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("İşlem başarılı" );
        }else{
            System.out.println(t.name+" Akademisyeni bu dersi veremez.");
        }
         
    }
    public void printTeacher(){

        if(this.courseTeacher != null){
            System.out.println(this.name+" dersinin akademisyeni "+this.courseTeacher);
        }else{
            System.out.println(this.name+" Dersinin akademisyeni atanmamış");
        }
        
    }
    public double calcNote(int sinav, int sozlu){
       double note = (sinav*0.8) + (sozlu*0.2);
        return note;
    }
}
