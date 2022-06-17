package OOPS;

import java.util.Scanner;

public class Mini_project {

    public static void main(String[] args) {
        //Hard coded Testing
        test();
        //application code for user end

       /* int input=0;
        Scanner s=new Scanner(System.in);
        videostore vs=new videostore();
        while(input!=6) {
            System.out.println("\n1. Add Videos :  \n 2. Check Out Video : \n3. Return Video : \n4. Receive Rating :\n5. List Inventory : \n6. Exit : ");
            System.out.print("Enter Your Choice (1..6) : ");
            String name;
            input = s.nextInt();
            s.nextLine();
            switch (input) {
                case 1:
                    System.out.print("Enter the name of video you want to add: ");
                    name = s.nextLine();
                    vs.addvideo(name);
                    System.out.print("video " + name + " added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the name of video you want to check out: ");
                    name = s.nextLine();
                    if (vs.checkvideo(name) == 0) {
                        System.out.print("Video does not exist");
                    } else {
                        vs.checkout(name);
                        System.out.print("video " + name + " checked out .");
                    }
                    break;

                case 3:
                    System.out.print("Enter the name of video you want to return: ");
                    name = s.nextLine();
                    if (vs.checkvideo(name) == 0) {
                        System.out.print("Video does not exist");
                    } else {
                        vs.returnvideo(name);
                        System.out.print("video " + name + " returned.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the name of video you want to rate: ");
                    name = s.nextLine();
                    if (vs.checkvideo(name) == 0) {
                        System.out.print("Video does not exist");
                    } else {
                        System.out.print("Enter the rating for this video: ");
                        int rating = s.nextInt();
                        vs.recieveratint(name, rating);
                        System.out.print("Rating " + rating + " has been given " + name + ".");
                    }
                    break;

                case 5:
                    vs.listinventory();
                    break;

                default:
                    System.out.println("Thanks for using the application.");
                    break;
            }
        }*/
            }
    public static void  test()
    {
        videostore vs=new videostore();
        //adding video The Matrix,The Godfather,The star wars
        vs.addvideo("The Matrix");
        vs.addvideo("The Godfather");
        vs.addvideo("The Star Wars");
        vs.listinventory();
        System.out.println("Adding rating");
        vs.recieveratint("The Matrix",5);
        vs.recieveratint("The Godfather",3);
        vs.recieveratint("The Star Wars",4);
        vs.listinventory();
        //Renting godfather
        System.out.println("Renting godfather");
        vs.checkout("The Godfather");
        vs.listinventory();
    }

     static class video
     {
        String title;
        int flag;
        int rating;
        video(String t) { title = t;  }
        void rating(int rr) { this.rating = rr;    }
        String getname() {  return title;        }
        int getrating() {  return rating;         }
        int getcheckout() {   return flag;        }
        void beingchecked() {     flag = 1;        }
        void returned() {   flag = 0;   }
    }
    static class videostore {
        video[] store=new video[10];
        int size=0;
        int checkvideo(String s)
        {
            int flag=0;
            for (int i = 0; i <size; i++) {
                video v = store[i];
                if (v.getname().equals(s)) {
                    flag = 1;
                }
            }
            return flag;
        }
        void addvideo(String s) {
            video v=new video(s);
              store[size]=v;
              size++;
        }
        void checkout(String s) {
            for (int i = 0; i < size; i++) {
                video v = store[i];
                if (v.getname().equals(s)) {
                    v.beingchecked();
                }
            }
        }
        void returnvideo(String s)
        {
            for (int i = 0; i < size; i++) {
                video v = store[i];
                if (v.getname().equals(s)) {
                    v.returned();
                }
            }
        }
        void recieveratint(String s, int r)
        {
            if(store==null || size==0) {
                System.out.println("Inventory is empty");
                return;
            }
            for (int i = 0; i < size; i++) {
                video v = store[i];
                if (v.getname().equals(s)) {
                    v.rating(r);
                }

            }
        }
        void listinventory()
        {
            if (store == null || size == 0) {
                System.out.println("No movies in inventory");
                return;
            }
            for (int i = 0; i < store.length; i++) {
                video v = store[i];
                try
                {
                    System.out.println("Title: "+ v.getname() +"  Rating: "+ v.getrating()+"  Checkout Status: "+ v.getcheckout());

                }
                catch (Exception e)
                {
                    break;
                }



            }
        }

    }

}