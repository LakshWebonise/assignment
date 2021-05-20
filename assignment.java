import java.util.*;

class CommonInAll
{
    String sim = "";
    boolean headphoneJack = false;
    
    CommonInAll(String sim, boolean headphoneJack)
    {
        this.sim=sim;
        this.headphoneJack=headphoneJack;
    }
    
    public void call()
    {
        System.out.println("CALLING");
    }
    
    public void text()
    {
        System.out.println("TEXT SENT !");
    }
    
}

class iphone12 extends CommonInAll
{
    iphone12(){
    super("micro",false);
    }
    
    void browser()
    {
        System.out.println("Open safari");
    }
    
    void openCam()
    {
        System.out.println("camera on");
    }
    
}

class s21 extends CommonInAll
{
    s21(){
    super("nano",true);
    }
    
    void browser()
    {
        System.out.println("Open galaxy");
    }
    
    void openCam()
    {
        System.out.println("camera on");
    }
}

class nokia3310 extends CommonInAll
{
    nokia3310(){
    super("regular",true);
    }
}

class cellPhone{
public static void main(String args[])
{
    
    Scanner s = new Scanner(System.in);
    System.out.println("1. s21\n2. iphone12\n3. nokia3310");
    int n = s.nextInt();
    
    switch(n) {
        
        case 1:
            s21 samsung = new s21();
            System.out.println("task? ");
            System.out.println("1. Call\n  2.Send text\n 3. Open browser\n 4.open cam");
                  int x = s.nextInt();
                    switch(x) {
                        case 1:
                            System.out.print("Enter number to dial ");
                            String number = s.next();
                            System.out.println();
                            samsung.call();
                            break;
                        case 2:
                         System.out.print("Enter number ");
                            String number1 = s.next();
                            System.out.println();
                            samsung.text();
                            break;
                        case 3:
                               samsung.browser();
                               
                            break;
                        case 4:
                            samsung.openCam();
                            break;
                       
                    }
                    break;
        
        case 2 :
               iphone12 iphone = new iphone12();
            System.out.println("task? ");
            System.out.println("1. Call\n  2.Send text\n 3. Open browser\n 4.open cam  Enter 0 to exit");
                  x = s.nextInt();
                    switch(x) {
                        case 1:
                            System.out.print("Enter number to dial ");
                            String number = s.next();
                            System.out.println();
                            iphone.call();
                            break;
                        case 2:
                         System.out.print("Enter number ");
                            String number2 = s.next();
                            System.out.println();
                            iphone.text();
                            break;
                        case 3:
                               iphone.browser();
                               
                            break;
                        case 4:
                            iphone.openCam();
                            break;
                       
                    }
                   break; 
    
    case 3:
           nokia3310 nokia = new nokia3310();
            System.out.println("task? ");
            System.out.println("1. Call\n  2.Send text\n  Enter 0 to exit");
                  x = s.nextInt();

                    switch(x) {
                        case 1:
                            System.out.print("Enter number to dial ");
                            String number5 = s.next();
                            System.out.println();
                            nokia.call();
                            break;
                        case 2:
                         System.out.print("Enter number ");
                            String number4 = s.next();
                            System.out.println();
                            nokia.text();
                            break;
                    }
					break;
}
}
}