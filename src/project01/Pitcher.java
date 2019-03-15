package project01;

public class Pitcher {
	private String name;
    private String position;
    private double average;
    
    public Pitcher(String name, String position, double average){
        
        this.name = name;
        this.position = position;
        this.average = average;
        
    }
    /**
     * gets true if he throw a strike, false if he throw ball.
     * @return 
     */
    public boolean pitch(){
        
        boolean pitch = true;
        
        int random = (int)(Math.random() * 100);
        
        if(random <= (average * 100)){
            pitch = true;
        }else{
            pitch = false;
        }
        
        return pitch;
    }
    /**
     * gets a pitcher's name
     * @return 
     */
    public String getName(){
        return name;
    }
}
