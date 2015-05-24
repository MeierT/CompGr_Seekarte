package de.hochschuleTrier.seekarte.swingComponents;

import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class SeeKartePanel extends JLabel
{
    Image img;
    
    public SeeKartePanel()  
    {
        ImageIcon back = new ImageIcon("src/res/lotse1.jpg");
    }
}
