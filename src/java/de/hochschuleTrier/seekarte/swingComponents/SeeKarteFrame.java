package de.hochschuleTrier.seekarte.swingComponents;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

@SuppressWarnings("serial")
public class SeeKarteFrame extends JFrame
{
    public SeeKarteFrame()
    {
        /* SIZE */
        this.setSize(300, 300);
        
        SeeKartePanel p = new SeeKartePanel();
        
        JScrollPane scrollPane = new JScrollPane (p, 
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        
        this.add(scrollPane);
        
        this.setVisible(true);
    }
}
