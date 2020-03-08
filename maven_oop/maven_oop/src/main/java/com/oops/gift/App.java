package com.oops.gift;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class App
{
    public static void main( String[] args )
    {
        List<Sweet> gift = new ArrayList<Sweet>();
        Sweet c1=new Chocolates("five-star","100%", 1,10);
        gift.add(c1);
        Sweet c2=new Chocolates("dairy-milk","100%", 1,15);
        gift.add(c2);
        Sweet c3=new Candys("lollipop","60%", 2,10);
        gift.add(c3);
        Sweet c4=new Candys("chewing-gum","50%", 8,10);
        gift.add(c4);
        Sweet c5=new Jellybeans("blueberry","30%",5,2);
        gift.add(c5);
        Sweet c6=new Candys("jelly","40%",6,2);
        gift.add(c6);
        Sweet c7=new Candys("blackberry","65%",2,7);
        gift.add(c7);
        Sweet c8=new Candys("silk","85%",6,4);
        gift.add(c8);
        List<Sweet> chocolate=new ArrayList<Sweet>();
        for(int i=0;i<gift.size();i++)
        {
            if(gift.get(i) instanceof Chocolates)
            {
                chocolate.add(gift.get(i));
            }
        }
        System.out.println("Chocolates sorted weight base:");
        Collections.sort(chocolate,new Sortbyweigth());
        for(int i=0;i<chocolate.size();i++)
        {
            System.out.println(chocolate.get(i).name+" chocolate% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weight+"gms");
        }
        System.out.println();
        System.out.println("Chocolates sorted cost base:");
        Collections.sort(chocolate,new Sortbycost());
        for(int i=0;i<chocolate.size();i++)
        {
        	System.out.println(chocolate.get(i).name+" chocolate% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weight of chocolate is "+chocolate.get(i).weight+"gms");
        }
        System.out.println();
        Collections.sort(chocolate,new Sortbytype());
        System.out.println("Chocolates sorted by quantity %");
        for(int i=0;i<chocolate.size();i++)
        {
        	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weight of chocolate is "+chocolate.get(i).weight+"gms");
        }
        int net=0;
        for(int i=0;i<gift.size();i++)
        {
            net=net+gift.get(i).weight;
        }
        System.out.println();
        System.out.println("Total weight of gift "+net+"gm");
        int count=0;
        for(int i=0;i<gift.size();i++)
        {
            if(gift.get(i) instanceof Candys)
            {
                count++;
            }
        }
        System.out.println();
        System.out.println("No of Candies is "+count);
        System.out.println("");
        System.out.println("candies between range of the cost in between 2 to 5\n");
        for(int i=0;i<gift.size();i++)
        {
            if(gift.get(i) instanceof Candys)
            {
                if(gift.get(i).cost<=5 && gift.get(i).cost>=2)
                {
                	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weight of Candy is "+gift.get(i).weight+"gms");
                }
            }
        }
        System.out.println("");
        System.out.println("candies between range of the weigth in between 2 to 9\n");
        for(int i=0;i<gift.size();i++)
        {
            if(gift.get(i) instanceof Candys)
            {
                if(gift.get(i).weight<=5 && gift.get(i).weight>=2)
                {
                	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weight of Candy is "+gift.get(i).weight+"gms");
                }
            }
        }
        
    }
}

