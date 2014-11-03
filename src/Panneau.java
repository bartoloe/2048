import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void paintComponent(Graphics g){
	Font font = new Font("Comic Sans MS", Font.BOLD, 30);
    g.setFont(font);
    g.setColor(Color.white);          
    g.drawString("Score = " + Grille.getScore(), 145, 470); 
    g.setColor(Color.DARK_GRAY);     
    g.fillRoundRect(10, 10 , 100, 100, 10, 10);
    g.setColor(Color.white);
    if(Grille.tab[0][0] == 0){
    
    }
    else{
    g.drawString(String.valueOf(Grille.tab[0][0]), 55/*x*/, 60/*y*/);
    }
    g.setColor(Color.GRAY);
    
    g.fillRoundRect(120, 10 , 100, 100, 10, 10);
    g.setColor(Color.white);
    if(Grille.tab[0][1] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[0][1]), 160/*x*/, 60/*y*/);
    }
    g.setColor(Color.DARK_GRAY);
    g.fillRoundRect(230, 10 , 100, 100,10 ,10);
    g.setColor(Color.white);
    if(Grille.tab[0][2] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[0][2]), 270/*x*/, 60/*y*/);
    }
    g.setColor(Color.GRAY);
    g.fillRoundRect(340, 10 , 100, 100,10 ,10);
    g.setColor(Color.white);
    if(Grille.tab[0][3] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[0][3]), 380/*x*/, 60/*y*/);
    }
    g.setColor(Color.GRAY);
    g.fillRoundRect(10, 120 , 100, 100,10 ,10);
    g.setColor(Color.white);
    if(Grille.tab[1][0] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[1][0]), 55/*x*/, 170/*y*/);
    }
    g.setColor(Color.DARK_GRAY);
    g.fillRoundRect(120, 120 , 100, 100,10 ,10);
    g.setColor(Color.white);
    if(Grille.tab[1][1] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[1][1]), 160/*x*/, 170/*y*/);
    }
    g.setColor(Color.GRAY);
    g.fillRoundRect(230, 120 , 100, 100,10 ,10);
    g.setColor(Color.white);
    if(Grille.tab[1][2] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[1][2]), 270/*x*/, 170/*y*/);
    }
    g.setColor(Color.DARK_GRAY);
    g.fillRoundRect(340, 120 , 100, 100,10 ,10);
    g.setColor(Color.white);
    if(Grille.tab[1][3] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[1][3]), 380/*x*/, 170/*y*/);
    }
    g.setColor(Color.DARK_GRAY);
    g.fillRoundRect(10, 230 , 100, 100,10, 10);
    g.setColor(Color.white);
    if(Grille.tab[2][0] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[2][0]), 55/*x*/, 280/*y*/);
    }
    g.setColor(Color.GRAY);
    g.fillRoundRect(120, 230 , 100, 100,10, 10);
    g.setColor(Color.white);
    if(Grille.tab[2][1] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[2][1]), 160/*x*/, 280/*y*/);
    }
    g.setColor(Color.DARK_GRAY);
    g.fillRoundRect(230, 230 , 100, 100,10 ,10);
    g.setColor(Color.white);
    if(Grille.tab[2][2] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[2][2]), 270/*x*/, 280/*y*/);
    }
    g.setColor(Color.GRAY);
    g.fillRoundRect(340, 230 , 100, 100,10 ,10);
    g.setColor(Color.white);
    if(Grille.tab[2][3] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[2][3]), 380/*x*/, 280/*y*/);
    }
    g.setColor(Color.GRAY);
    g.fillRoundRect(10, 340 , 100, 100,10, 10);
    g.setColor(Color.white);
    if(Grille.tab[3][0] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[3][0]), 55/*x*/, 390/*y*/);
    }
    g.setColor(Color.DARK_GRAY);
    g.fillRoundRect(120, 340 , 100, 100, 10, 10);
    g.setColor(Color.white);
    if(Grille.tab[3][1] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[3][1]), 160/*x*/, 390/*y*/);
    }
    g.setColor(Color.GRAY);
    g.fillRoundRect(230, 340 , 100, 100,10 ,10);
    g.setColor(Color.white);
    if(Grille.tab[3][2] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[3][2]), 270/*x*/, 390/*y*/);
    }
    g.setColor(Color.DARK_GRAY);
    g.fillRoundRect(340, 340 , 100, 100,10 ,10);
    g.setColor(Color.white);
    if(Grille.tab[3][3] == 0){
        
    }
    else{
    g.drawString(String.valueOf(Grille.tab[3][3]), 380/*x*/, 390/*y*/);
    }






  }               
}