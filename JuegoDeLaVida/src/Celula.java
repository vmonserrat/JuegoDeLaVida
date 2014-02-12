
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monse
 */
public class Celula extends JPanel{
    
   public static int[][]arreglo=new int[23][22];
    
   public void pintarTablero(Graphics g)
    {
        int x=75;
        int y=10;
        for(int a=0; a<23; a++)
        {
            for(int b=0; b<22; b++)
            {
                
                g.setColor(Color.MAGENTA);
                g.fillRect(x, y, 9, 9);
                arreglo[a][b]=0; 
                y+=10;
                
            }
            x+=10;
            y=10;
        }
    }
   
   public void pintarcelulaviva(Graphics g, int xx, int yy)
   {
       int x=75;
       int y=10;
      
       for(int a=0;a<23;a++)
            {
                for(int b=0;b<22;b++)
                {
                    if((((int)((xx/5)*5))==x) && ((((int)((yy/10)*10))==y)))
                    {
                        g.setColor(Color.WHITE);
                        g.fillRect(x, y, 9, 9);
                        arreglo[a][b]=1;
                    }
                  y+=10;
                }
                x+=10;
                y=10;
            }
            
   }
    
    public void pintarJuegoInicio(Graphics g)
    {
        int x=75;
        int y=10;
        for(int a=0; a<23; a++)
        {
            for(int b=0; b<22; b++)
            {
                
                if(a==10 && b==10)
                {
                   g.setColor(Color.WHITE);
                   g.fillRect(x, y, 9, 9);
                   arreglo[a][b]=1; 
                }
                else if(a==10 && b==11)
                {
                   g.setColor(Color.WHITE);
                   g.fillRect(x, y, 9, 9);
                   arreglo[a][b]=1; 
                }
                else if(a==11 && b==10)
                {
                   g.setColor(Color.WHITE);
                   g.fillRect(x, y, 9, 9);
                   arreglo[a][b]=1; 
                }
                else if(a==12 && b==10)
                {
                   g.setColor(Color.WHITE);
                   g.fillRect(x, y, 9, 9);
                   arreglo[a][b]=1; 
                }
                else if(a==12 && b==11)
                {
                   g.setColor(Color.WHITE);
                   g.fillRect(x, y, 9, 9);
                   arreglo[a][b]=1; 
                }
                else if(a==10 && b==12)
                {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, 9, 9);
                    arreglo[a][b]=1; 
                }
                else if(a==11 && b==12)
                {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, 9, 9);
                    arreglo[a][b]=1; 
                }
                else if(a==12 && b==12)
                {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, 9, 9);
                    arreglo[a][b]=1; 
                }
                else{
                g.setColor(Color.MAGENTA);
                g.fillRect(x, y, 9, 9);
                arreglo[a][b]=0;
                }
                
                y+=10;
                
            }
            x+=10;
            y=10;
        }
    }
    
    public void pintarSecuenciaJuego(Graphics g)
    {
        int x=75;
        int y=10;
        Celula cel=new Celula();
        
        
        for(int a=0; a<23; a++)
        {
            for(int b=0; b<22; b++)
            {
                
                if(arreglo[a][b]==0)
                {
                    if(cel.cuentaVecinas(a, b)==3)
                    {  
                        arreglo[a][b]=1;
                        g.setColor(Color.WHITE);
                        g.fillRect(x, y, 9, 9);
                    }
                }
                else if(arreglo[a][b]==1 && cel.cuentaVecinas(a, b)==3)
                {    
                    arreglo[a][b]=1;
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, 9, 9);
                }
                else if(arreglo[a][b]==1 && cel.cuentaVecinas(a, b)==2 )
                {
                    arreglo[a][b]=1;
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, 9, 9);
                }
               else if(arreglo[a][b]==1 && cel.cuentaVecinas(a, b)==3)
               {
                    arreglo[a][b]=1;
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, 9, 9);
               }
               else if(arreglo[a][b]==1 && cel.cuentaVecinas(a, b)<2)
               {
                   arreglo[a][b]=0;
                   g.setColor(Color.MAGENTA);
                   g.fillRect(x, y, 9, 9);
               }
               else if(arreglo[a][b]==1 && cel.cuentaVecinas(a, b)>3)
               {
                   arreglo[a][b]=0;
                   g.setColor(Color.MAGENTA);
                   g.fillRect(x, y, 9, 9);
               }
               else
               {
                   arreglo[a][b]=0;
                   g.setColor(Color.MAGENTA);
                   g.fillRect(x, y, 9, 9);
               }
                
                y+=10;
                
            }
            x+=10;
            y=10;
        }
    }
    
    public int cuentaVecinas(int aa, int bb)
    {
        int numvecinas=0;
        
         if(aa-1>0 && bb-1>0 && aa+1<23 && bb+1<22)
         {
           
             if(arreglo[aa-1][bb-1]==1)
             {   
                numvecinas+=1;
             } 
             if(arreglo[aa][bb-1]==1)
             { 
                numvecinas+=1;
             }
             if(arreglo[aa+1][bb-1]==1)
             { 
                numvecinas+=1;
             }
             if(arreglo[aa-1][bb]==1)
             { 
                 numvecinas+=1;
             }
             if(arreglo[aa+1][bb]==1)
             { 
                 numvecinas+=1; 
             }
             if(arreglo[aa-1][bb+1]==1)
             { 
                 numvecinas+=1; 
             }
             if(arreglo[aa][bb+1]==1)
             { 
                 numvecinas+=1;  
             }
             if(arreglo[aa+1][bb+1]==1)
             {
                 numvecinas+=1; 
             }
             
         }
         
         return numvecinas;
    }
    
    
    public void muestrareultado()
    {
        for(int c=0; c<23;c++)
        {    //filas
            for(int b=0; b<22; b++)
            {   //columnas
                 System.out.print(arreglo[c][b]+" ");
            }
            System.out.println();
        }
    }
    
}
