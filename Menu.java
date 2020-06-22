package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private int menuPrice;

    //Constructor Method
    public Menu(int _menuId, String _menuItem, int _menuPrice){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.menuPrice = _menuPrice;
    }

    public Menu(int menuId, String s) {
    }

    //Setters and Getters
    public int getMenuPrice() { return getMenuPrice(); }
    public void setMenuPrice(int _menuPrice) { this.menuPrice = _menuPrice;}

    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println(menu.getmenuItem());
        }
    }
}
