package sudoku;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class GUI
{	
	private Logic logic;
        private final JFrame frame;
        private final JMenuBar menuBar;
        private final JMenu menu;
        private final JMenuItem menuItem1;
        private final JMenuItem menuItem2;
        private final JMenuItem menuItem3;
        private final JPanel panel;
	
	public GUI() {
            frame = new JFrame("Sudoku");
            frame.setSize(700, 700);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     
            
            menuBar = new JMenuBar();
            frame.setJMenuBar(menuBar);
                        
            menu = new JMenu("Play");
            menuBar.add(menu);
            
            menuItem1 = new JMenuItem("Sudoku");
            menuItem2 = new JMenuItem("HyperSudoku");
            menuItem3 = new JMenuItem("Duidoku");
            
            menu.add(menuItem1);
            menu.add(menuItem2);
            menu.add(menuItem3);
            
            panel = new JPanel();
            
            frame.add(panel);
            
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
	}
	
}