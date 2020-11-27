/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119023.muhammadfarhanr;

/**
 *
 * @author Muhammad Farhan R 
 */
public class ServicePrice implements ServiceItem{
    private float priceService;
    private float discount;
    
    public float getPriceService(){
        return priceService;
    }
    
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }
    
    @Override
    public void displayService(){
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#******Service List*******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash : IDR 55K");
        System.out.println("Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.println("Choose (1/2/3):");
    }
    
    @Override
    public float getPrice(int serviceItem){
        int price = 0;
        switch(serviceItem){
            case 1:
                price = 45_000;
                break;
            case 2:
                price = 55_000;
                break;
            case 3:
                price = 15_000;
                break;
        }
        return price;
    }
    
    @Override
    public boolean checkMemberStatus(String statusMember){
        boolean isMember = false;
        if(statusMember.equalsIgnoreCase("yes")){
            isMember = true;
        } else{
            
        }
        return isMember;
    }
    
    @Override
    public float getSale(boolean isMember, float parServicePrice){
        float sale = 1;
        if(isMember){
            sale = parServicePrice*0.1f;
        }
        return sale;
    }
    
    public float getTotalPay(float priceService, float discount){
        float total = priceService - discount;
        return total;
    }
}
