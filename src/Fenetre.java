import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
public class Fenetre extends JFrame implements KeyListener {
 
	private static final long serialVersionUID = 1L;
	static Grille gr = new Grille();

public Fenetre(){
    this.setTitle("2048");
    this.setSize(470, 530);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
    this.setBackground(Color.black);        
    this.setContentPane(new Panneau());
    this.setResizable(false);
    addKeyListener(this);
  }

@Override
public void keyPressed(KeyEvent arg0) {
	if(arg0.getKeyCode() == KeyEvent.VK_UP){
		gr.decalehaut();
		gr.fusionhaut();
		gr.aleatoire();
		repaint();
		 if(gr.hasWon() == true){
		    	JOptionPane.showMessageDialog(null, "Félicitation vous avez gagné");
			}		
		 if(gr.hasLost() == true){
		    	JOptionPane.showMessageDialog(null, "Dommage, vous avez perdu");
			}
	}
	  if(arg0.getKeyCode() == KeyEvent.VK_RIGHT){
		  gr.decaledroite();
		 gr.fusiondroite();
		 gr.aleatoire();
		 repaint();
		 if(gr.hasWon() == true){
		    	JOptionPane.showMessageDialog(null, "Félicitation vous avez gagné");
			}
		 if(gr.hasLost() == true){
		    	JOptionPane.showMessageDialog(null, "Dommage, vous avez perdu");
			}
	 }
	  	      
	    if (arg0.getKeyCode() == KeyEvent.VK_DOWN){
	    	
	    	gr.decalebas();
	    	gr.fusionbas();
	    	gr.aleatoire();
	    	repaint();
	    	 if(gr.hasWon() == true){
	 	    	JOptionPane.showMessageDialog(null, "Félicitation vous avez gagné");
	 		}
	    	 if(gr.hasLost() == true){
	 	    	JOptionPane.showMessageDialog(null, "Dommage, vous avez perdu");
	 		}
	    }
	    if (arg0.getKeyCode() == KeyEvent.VK_LEFT){
	    	
	    	gr.decalegauche();
	    	gr.fusiongauche();
	    	gr.aleatoire();
	    repaint();
	    if(gr.hasWon() == true){
	    	JOptionPane.showMessageDialog(null, "Félicitation vous avez gagné");
		}
	    if(gr.hasLost() == true){
	    	JOptionPane.showMessageDialog(null, "Dommage, vous avez perdu");
		}
	    
	    }
	     
	
}

@Override
public void keyReleased(KeyEvent arg0) {
	
	
}

@Override
public void keyTyped(KeyEvent arg0) {
	
	
}

public static void main(String[] args) {
	
	new Fenetre();
	
	
	
	
	
	
}
}

