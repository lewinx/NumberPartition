import java.util.*;
import java.io.*;

public static int kk(PriorityQueue h)
{
    if(h.size() < 1)
        return -1;
        
    while(h.size() > 1)
    {
        int num_1 = h.poll();
        int num_2 = h.poll();
        int difference = Math.abs(num_1 - num_2);
        h.add(difference);
    }
    return h.poll();
}

public static void main(String[] args)
{

}
