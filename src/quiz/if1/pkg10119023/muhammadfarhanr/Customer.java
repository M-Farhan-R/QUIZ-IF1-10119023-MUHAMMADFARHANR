/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119023.muhammadfarhanr;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
/**
 *
 * @author Muhammad Farhan R 
 */
public class Customer extends ServicePrice implements CustomerInvoice{
    private String name;
    private String email;
    private boolean member;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public boolean isMember(){
        return member;
    }
    
    public void setMemeber(boolean member){
        this.member = member;
    }
    
    @Override
    public String currentTime(){
        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss",new Locale("id"));
        Date now = new Date();
        String currentTime = format.format(now);
        return currentTime;
    }
}
