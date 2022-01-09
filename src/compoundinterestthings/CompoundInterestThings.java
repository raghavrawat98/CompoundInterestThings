/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundinterestthings;

/**
 *
 * @author ragha
 */
public class CompoundInterestThings {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void balance(int amount, double rate, int year) {

        double yearlyInterestPaid;
        double totalAmount = amount;

        System.out.println(amount + " :- " + " grows with the interest rate of " + rate);

        for (int i = 0; i <= year; i++) {

            yearlyInterestPaid = totalAmount * rate;
            totalAmount += yearlyInterestPaid;
            System.out.println(i + "   " + totalAmount);
        }
    }
    public static void rate(double beginingValue, double endingAmount, double years){
        double base = endingAmount/beginingValue;
        double exp = 1/years;
        double cagr = Math.pow(base, exp)-1.0;
        System.out.println("CAGR= "+cagr);
        System.out.println("Interest is"+" "+(cagr*100.0)+"%");
    }
    public static void main(String[] args) {
        // 1 is to capital amount 
        // 2 is to rate
        int choice=1;
        if(choice==1){
            System.out.println("TEST OF: balance");
            int amount=1500000;
            double rate=0.05;
            int years =20;
            
        balance(amount, rate, years);
        }
        if(choice==2){
            double beginingValue=1500000;
            double endingAmount=4080000;
            double years=20;
            System.out.println("Begining Value= "+beginingValue+"\nEnding Amount"
            +"\nYears= "+years);
            rate(beginingValue,endingAmount,years);
        }
        
    }
    
}
