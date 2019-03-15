package project01;

public class project01 {
	public static void main(String[] args) {
	       
        int ball = 0;
        int strike = 0;
        boolean pitch, hit;
        
        Pitcher pitcher = new Pitcher("Phil Hughes", "pitcher", 0.8);
        String pitcherName = pitcher.getName();
        
        Batter batter1 = new Batter("Alex Rodriguez", "batter", 0.25);
        String batter1Name = batter1.getName();
        
        System.out.println(pitcherName + " is pitching to " + batter1Name);
        
        while(ball < 5){
            
            pitch = pitcher.pitch();
            
            if(pitch){
                
                strike++;
                hit = batter1.hit();
                
                if(!hit){
                    
                    System.out.println(batter1Name + " swung and missed");
                    System.out.println("The count is " + ball + " balls and "
                    + strike + " strikes");
                    
                    if(strike == 3){
                        
                        System.out.println(batter1Name + " struck out.");
                        break;
                        
                    }
                    
                }else{
                    
                    System.out.println(batter1Name + " got a hit");
                    break;
                    
                }
                
            }else{
                
                ball++;
                System.out.println(pitcherName + " threw a ball");
                System.out.println("The count is " + ball + " balls and "
                    + strike + " strikes");
                
                if(ball == 4){
                    System.out.println(batter1Name + " walked");
                    break;
                }
            }
            
        }
    }
}
