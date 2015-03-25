import javax.swing.*;

public class joeisbored
{
    public static void main(String[] args)
    {
	int i = JOptionPane.showConfirmDialog(null, "Jordie sucks?");
	if(i == 0)
	{
	    JOptionPane.showMessageDialog(null, "Yes.");
	}
	else if(i > 0)
	{
	    JOptionPane.showMessageDialog(null, "F*** you.");
	}
    }
}