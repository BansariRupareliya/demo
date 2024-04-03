import javax.swing.*;

public class form
{
    public static void main(String[]args)
    {
        
        Jmenu menu,submenu;
        jmenuItem i1,i2,i3,i4;

        jframe f = new Jframe("registration form"); 
        jmenubar mb = new jmenubar();
        menu = new jmenu(menu);
        submenu = new jmenu("sub Menu");

        i1 = new jmenuItem(Item 1);
        i2 = new jmenuItem(Item 2);
        i3 = new jmenuItem(Item 3);
        i4 = new jmenuItem(Item 4);

        menu.add(i1); menu.add(i2); menu.add(i3);
        submenu.add(i4);

        menu.add(submenu);
        mb.add(menu);
        f.setjmenubar(mb);

        f.setsize(400,500);
        f.setLayout(null);
        f.setvisible(true);

    }
}
