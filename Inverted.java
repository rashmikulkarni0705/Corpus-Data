import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class Inverted implements ActionListener
{
	Frame f1;
	Label l1;
	TextField t1;
	Button b1;

	Inverted()
	{
	      f1=new Frame("Inverted index");
	      f1.setLayout(new FlowLayout());

	      l1=new Label();
	      t1=new TextField(20);
	      b1=new Button("Generate");

   	    b1.addActionListener(this);
	     
	      f1.add(t1);
	      f1.add(b1);
	      f1.add(l1);
	  
	      f1.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	     if(ae.getSource()==b1)
	       {
		try
                                          {
		        Query obj1=new Query();
		        obj1.Query1(t1.getText());	
		        l1.setText("Matching done");
		        l1.setVisible(true);
		    }
                                          catch(Exception e)
		  {
		  }	
	       }
	}

	public static void main(String []args)
	{
	    Inverted obj=new Inverted();
	}
}