import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author user
 */
public class NewApplet extends Applet {

   Label l1,l2,l3;
TextField t1,t2,t3;
Button b;

int x,y,z;

public void init()
{
l1 = new Label("mark-1");
t1 = new TextField(10);

l2 = new Label("mark-2");
t2 = new TextField(10);

l3 = new Label("total");
t3 = new TextField(10);

b = new Button("add");
b.addActionListener(new yy());

add(l1); add(t1);
add(l2); add(t2);
add(l3); add(t3);
add(b);
}

class yy implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == b)
{
x = Integer.parseInt(t1.getText());
y = Integer.parseInt(t2.getText());
z = x+y;
t3.setText(String.valueOf(z));
}
} 
}

}