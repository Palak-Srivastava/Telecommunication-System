public class MobilePhone implements Telephone {
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }
    @Override
    public void powerOn() {
        isPowerOn=true;
        System.out.println("Phone is powered on");
    }
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing"+phoneNumber+"on the Mobile Phone");
        
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn){
            System.out.println("Answer the call on MobilePhone");
            isRinging=false;
        }
        else{
            // System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber==myNumber && isPowerOn)
        {
            isRinging=true;
            System.out.println("Phone is ringing");
        }
        else{
            System.out.println("Wrong no or Phone is off");
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        
        return isRinging;
    }
    
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
    }
    
    
}
