package db;

import model.*;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Guest> guestTable =new ArrayList<Guest>();
    static {
        guestTable.add(new Guest());
    }
    public static ArrayList<BookedRooms> bookedRoomsTable = new ArrayList<BookedRooms>();
    static {
        bookedRoomsTable.add(new BookedRooms());
    }
    public static ArrayList<SelectedMealPlans> selectedMealPlans = new ArrayList<SelectedMealPlans>();
    static {
        selectedMealPlans.add(new SelectedMealPlans());
    }
    public static ArrayList<Rooms> roomsTable = new ArrayList<Rooms>();
    static {
        roomsTable.add(new Rooms());
    }
    public static ArrayList<MealPlans> mealPlansTable=new ArrayList<MealPlans>();
    static {
        mealPlansTable.add(new MealPlans());
    }
}
