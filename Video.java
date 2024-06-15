package com.VideoInventory;
import java.util.Scanner;

public class Video {

    public String title;

    public boolean checked=true;

int avgrating;

    public boolean checked()

    {
	   return checked;
    }
    public void rent() {
          checked=false;
    }
    public void returned()
    {
//        System.out.println("Enter the video name you want to return");
//        Scanner s=new Scanner(System.in);
//        for()
          checked=true;
          System.out.println("Video is returned ");
    }
    public int getRating()
    {
          if(avgrating>0)
          {
               return avgrating;
          }else{
               System.out.println(" Rating is not available");
               return 0;
          }
    }
}

 