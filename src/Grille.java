import java.util.Random;


public class Grille {

    public static int tab[][] = new int[4][4];
    private static int score = 0;

   
    public static int getScore(){
    	return score;
    }
   
    public static int generateRandom(){
        Random rand = new Random();
        int result = (rand.nextInt(2) + 1)*2;
       
        return result;
    }
    public static int generateIndices(){
        Random rand = new Random();
        int indices = rand.nextInt(4);
        return indices;
    }
   
    public String toString(){
    int i;
    String affiche = "Score de" + score;
    affiche = affiche + System.getProperty("line.separator");
    for(i=0; i<4; i++){
        for (int j =0; j<4; j++){
            affiche = affiche + tab[i][j] + " ";
        }
        affiche = affiche + System.getProperty("line.separator");
    }
    if(hasWon()== true){
    	affiche = affiche + System.getProperty("line.separator");
    	affiche = affiche + "Congratulation You have won !";
    }
    return affiche;
    
    
    }
    
    public Grille(){
     
    	
              int x = generateIndices();
               int y = generateIndices();
               int w = generateIndices();
               int z = generateIndices();
               if(x != w && y != z){
            	   tab[x][y] = generateRandom();
            	   tab[w][z] = generateRandom();
               }
            	   else{
            		   tab[y][x] =generateRandom();
            		   tab[z][w] = generateRandom();
            	   }
               }
               
   
    
                //tab[generateIndices()][generateIndices()] = generateRandom();
           
       public void aleatoire(){
    	   
    	   int x = generateIndices();
    	   int y = generateIndices();
    	   if(tab[x][y] == 0){
    		   tab[x][y] = generateRandom();
    	   }
    	   else{
    		   x = generateIndices();
    		   y = generateIndices();
    		   if(tab[x][y] == 0){
        		   tab[x][y] = generateRandom();
        	   }
    		   else  x = generateIndices();
    		   y = generateIndices();
    		   if(tab[x][y] == 0){
        		   tab[x][y] = generateRandom();
        	   }
    		   
    	   }
    	   
       }
       
    
    public void fusionhaut(){
    	for(int i=0; i<4; i++){
            for (int j=1; j<4; j++){
                    if (tab[j][i] != 0 && tab[j-1][i] != 0 && tab[j][i] == tab[j-1][i]){
                        tab[j-1][i] = 2 * tab[j][i];
                        score += tab[j-1][i];
                        tab[j][i] = 0;
                        j=0;
                                }
                }
    	}
}

    public void fusionbas(){
        for (int i = 0; i<4; i++)
            for (int j=2; j>=0; j--){
                if (tab[j][i] != 0 && tab[j+1][i] != 0 && tab[j][i] == tab[j+1][i])
                {
                    tab[j+1][i] = 2* tab[j][i];
                    score += tab[j+1][i];
                    tab[j][i] = 0;
                    j = 3;
                }
            }
    }   	
    
    public void fusiongauche(){
        for (int i=0; i<4; i++)
            for (int j=1; j<4; j++){
                if (tab[i][j] != 0 && tab[i][j-1] != 0 && tab[i][j] == tab[i][j-1])
                {
                    tab[i][j-1] = 2 * tab[i][j];
                    score += tab[i][j-1];
                    tab[i][j] = 0;
                    j=0;
                }
                }
                }
    
    
    public void fusiondroite(){
        for (int i=0; i<4; i++)
            for (int j=2; j>=0; j--){
                if (tab[i][j] !=0 && tab[i][j+1] != 0 && tab[i][j] == tab[i][j+1]){
                tab[i][j+1] = 2 * tab[i][j];
                score += tab[i][j+1];
                tab[i][j] = 0;
                j =3;
                }
            }
   
    }
   
    
   
    public void decalehaut(){
                for(int i=0; i<4; i++)
                        for (int j=1; j<4; j++)
                                if (tab[j][i] != 0 &&  tab[j-1][i] == 0){
                                    tab[j-1][i] = tab[j][i];
                                    tab[j][i] = 0;
                                    j=0;
                                            }
                            }
    public void decalebas(){
        for (int i = 0; i<4; i++)
            for (int j=2; j>=0; j--){
                if (tab[j][i] != 0 && tab[j+1][i] == 0)
                {
                    tab[j+1][i] = tab[j][i];
                    tab[j][i] = 0;
                    j = 3;
                }
            }
    }
    public boolean hasWon(){
        for (int i=0; i<4; i++){
        	for (int j = 1 ; j<4; j++)
            if(tab[i][i] == 2048 || tab[i][j] == 2048){
                return true;
                    }
        }
		return false;
       }
    
    public boolean hasLost(){
    	int x = 0;
    	for(int i=0 ; i<4; i++){
    		for(int j = 0; j<4; j++){
    			if(tab[i][j] != 0 || tab[i][j] != 0){
    				x++;
    			}
    		}
    	}
    	if (x== 16){
    		return true;
    	}
    	return false;
    }

    
    public void decalegauche(){
        for (int i=0; i<4; i++)
            for (int j=1; j<4; j++){
                if (tab[i][j] != 0 && tab[i][j-1] == 0)
                {
                    tab[i][j-1] = tab[i][j];
                    tab[i][j] = 0;
                    j=0;
                }
                }
                }
           
           
           
            public void decaledroite(){
                for (int i=0; i<4; i++)
                    for (int j=2; j>=0; j--){
                        if (tab[i][j] !=0 && tab[i][j+1] == 0){
                        tab[i][j+1] = tab[i][j];
                        tab[i][j] = 0;
                        j =3;
                        }
                    }
           
            }
            
                 }