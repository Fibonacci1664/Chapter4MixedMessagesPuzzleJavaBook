package com.company;

/**
 * Created by Dave on 18/07/2017.
 */
public class Mix4
{
    int counter = 0;
    
    public static void main()
    {
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x =0;
        
        while(x < 9)
        {
            System.out.println("###############################");
            System.out.println("This is loop number " + x);
            m4a[x] = new Mix4();
            System.out.println("This is a new Mix4 object at element position " + x);
            m4a[x].counter = m4a[x].counter + 1;
            System.out.println("Element position " + x +"'s counter is at " + m4a[x].counter);
            count = count + 1;
            System.out.println("Local variable count = " + count);
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
            System.out.println("Local variable count is now at " + count);
            System.out.println("x count is now at " + x);
        }
    
        System.out.println(count + " " + m4a[1].counter);
    }
    
    public int maybeNew(int index)
    {
        System.out.println("You are now in the maybeNew method");
        if(index < 5)
        {
            System.out.println("******************************");
            System.out.println("You are now in the maybeNew methods if statement");
            Mix4 m4b = new Mix4();
            System.out.println("This is a new Mix4 object with no array");
            m4b.counter = m4b.counter + 1;
            System.out.println("maybeNew methods Mix4 object field counter = " + m4b.counter);
            return 1;
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("You are now returning zero");
        return 0;
    }
}
