package Siniflar.Box;

public class Ring {
    
    Fighter f1;
    Fighter f2;
    Fighter first;
    Fighter second;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            first();
            while (first.health > 0 && second.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                second.health = first.hit(second);
                if (isWin()){
                    break;
                }
                first.health = second.hit(first);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (first.health == 0) {
            System.out.println("Maçı Kazanan : " + second.name);
            return true;
        } else if (second.health == 0){
            System.out.println("Maçı Kazanan : " + first.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(first.name + " Kalan Can \t:" + first.health);
        System.out.println(second.name + " Kalan Can \t:" + second.health);
    }
     
    public void first(){
        if(Math.random() * 100 < 50){
            this.first  = this.f1;
            this.second = this.f2;
            System.out.println("Maça "+this.f1.name+" başladı.");
        }else{
            this.first  = this.f2;
            this.second = this.f1;
            System.out.println("Maça "+this.f2.name+" başladı");
        }
    }
}


