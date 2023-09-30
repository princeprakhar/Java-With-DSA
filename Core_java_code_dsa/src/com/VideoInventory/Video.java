package com.VideoInventory;
import java.util.Scanner;
public class Video {
    public String title;
    public boolean checked=true;
    int rating;
    public boolean checked()
    {
        return checked;
    }
    public void rent() {
        checked=false;
    }
//    public void returned()
//    {
//        System.out.println("Enter the video name you want to return");
//        checked=true;
//        System.out.println("Video is returned ");
//    }
//    public int getRating()
//    {
//        if(rating>0)
//        {
//            return rating;
//        }else{
//            System.out.println(" Rating is not available");
//            return 0;
//        }
//    }
}
