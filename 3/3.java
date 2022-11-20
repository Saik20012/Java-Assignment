import java.util.Scanner;
class Shelf{
    int length,breadth,capacity;
    boolean occupied=false;

    public Shelf(){

    }

    public Shelf(int x,int y,int z,boolean w){
        length=x;
        breadth=y;
        capacity=z;
        occupied=w;
    }

    public void setLength(int x){
        length=x;
    }
    
    public void setBreadth(int y){
        breadth=y;
    }
    
    public void setCapacity(int z){
        capacity=z;
    }
    
    public void setOccupied(boolean w){
        occupied=w;
    }

    public int getLength(){
        return this.length;
    }
    
    public int getBreadth(){
        return this.breadth;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public boolean getOccupied(){
        return this.occupied;
    }
    
   public String toString(){
        return "Length is : "+this.length+"\tBreadth is : "+this.breadth+"\tCapacity is : "+this.capacity+"\tOccupied status : "+this.occupied+"\n";
   }

}

class test3{
    public static void main(String args[]){
        int x,y,z;
        boolean w;
        Scanner sc = new Scanner(System.in);
        
        // object 1
        Shelf s1 = new Shelf();
            // use setters
            System.out.println("Enter length(int) : ");
            x=sc.nextInt();
            s1.setLength(x);
            
            System.out.println("Enter breadth(int) : ");
            y=sc.nextInt();
            s1.setBreadth(y);
            
            System.out.println("Enter Capacity(int) : ");
            z=sc.nextInt();
            s1.setCapacity(z);
            
            System.out.println("Enter Occupied (true/false): ");
            w=sc.nextBoolean();
            s1.setOccupied(w);
            
            // use toString to display everything collectively
            System.out.println("Object s1 : \n"+s1.toString());
        // object 2    
        Shelf s2 = new Shelf(20,60,200,false);
          System.out.println("Object s2 : \n"+s2.toString());
            
        
        Shelf s3 = new Shelf(30,30,40,true);
            // use some getters to know specific information 
            // e.g. : know if the shell is already occupied or not
            System.out.println("Object s3 occupancy status : \n"+s3.getOccupied());


    }
}