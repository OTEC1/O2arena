/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui_02arena;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import javax.swing.JTextPane;

/**
 *
 * @author user
 */
public class MyPrintable implements Printable {
    
    JTextPane pane1;
    public MyPrintable(JTextPane pane) {
        pane1 =  pane;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            
          if(pageIndex != 0)
            return  NO_SUCH_PAGE;
          Graphics2D g2 = (Graphics2D) graphics;
          g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
          Rectangle componentBounds = pane1.getBounds(null);
          g2.translate(-componentBounds.x, -componentBounds.y);
          g2.scale(1, 1);
          boolean wasBuff = pane1.isDoubleBuffered();
          pane1.paint(g2);
          pane1.setDoubleBuffered(wasBuff);
          return  PAGE_EXISTS;
          
    }
    
}
