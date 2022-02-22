public class DeskPhone implements Telephone {

    private String myNumber;
    private boolean isRinging;


    public DeskPhone(String myNumber){
        this.myNumber = myNumber;
    }
    @Override
    public void powerOn() {
        System.out.println("Desk Phone is always powered");
    }
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing"+phoneNumber+"on the deskphone");
        
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answer the call on DeskPhone");
            isRinging=false;
        }
        else{
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber==myNumber)
        {
            isRinging=true;
            System.out.println("Phone is ringing");
        }
        else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        
        return isRinging;
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    
}
