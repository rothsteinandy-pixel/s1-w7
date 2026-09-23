public class Weight {
    private int pounds;
    private int ounces;

    public Weight(int pounds, int ounces) {
        if (ounces <= 0 ){
            if(ounces<16){
                this.ounces = ounces;
            }

        }
        if(pounds>0)
            this.pounds= pounds;
            
    }

    public Weight(int ounces){
        this(0,ounces);

    }
    public int totalOunces(){
         return this.ounces + 16 * this.pounds;
        }
    
    public boolean isHeavier( Weight other){
        int totalW = totalOunces();
        int otherW = other.totalOunces();
        return totalW > otherW;

    }
    public Weight multiple(int scale){
        int newweight = totalOunces() *scale;
        int newpounds = newweight / 16;
        int newounces = totalOunces() - newpounds * 16;
        return new Weight(newpounds,newounces);
    }
    public void print(){
        System.out.println(this.pounds + "pounds" + this.ounces + "ounces");
    }

}

