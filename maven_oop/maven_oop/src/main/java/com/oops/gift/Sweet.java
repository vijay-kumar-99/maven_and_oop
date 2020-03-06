package com.oops.gift;
import java.util.*;
public class Sweet { 
    String name;
    String type;
    int cost;
    int weight;
    Sweet(String name,String type,int cost,int weight)
    {
        this.name=name;
        this.type=type;
        this.cost=cost;
        this.weight=weight;
    }
}
class Sortbyweigth implements Comparator<Sweet>
{ 
    public int compare(Sweet a, Sweet b){ 
        return a.weight - b.weight; 
    } 
}
class Sortbycost implements Comparator<Sweet>
{ 
    public int compare(Sweet a, Sweet b){ 
        return a.cost - b.cost; 
    } 
}
class Sortbytype implements Comparator<Sweet> 
{ 
    public int compare(Sweet a, Sweet b){ 
        return a.type.compareTo(b.type); 
    } 
}