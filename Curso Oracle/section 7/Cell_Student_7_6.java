//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Cell_Student_7_6 {
    private String name;
    private boolean isOpen;
    private int securityCode;
    
    public Cell_Student_7_6(String name, boolean isOpen, int securityCode){
        this.name = name;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }
    
    public String getName(){
        return name;
    }
    public boolean getIsOpen(){
        return isOpen;
    }
    
    public void setIsOpen(int code){
        if(code != securityCode){
            System.out.println("Incorrect code");
        }
        else{
            if(isOpen == true){
                isOpen = false;
                System.out.println("Cell " +name +" Closed");
            }
            else{
                isOpen = true;
                System.out.println("Cell " +name +" Open");
            }
        }
    }
}
