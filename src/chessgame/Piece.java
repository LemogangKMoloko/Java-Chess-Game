/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;
import java.util.LinkedList;
/**
 *
 * @author Lemogang Moloko
 */
public class Piece {
    int xp;
    int yp;
    int x;
    int y;
    
    boolean isWhite;
    LinkedList<Piece> ps;
    String name;
    
    public Piece( int xp,int yp, boolean isWhite,String n,LinkedList<Piece> ps){
    this.xp= xp;
    this.yp = yp;
    x = xp*64;
    y = yp*64;
    this.isWhite = isWhite;
    this.ps = ps;
    name = n;
    ps.add(this);
            
    
    }
    
    //moving a piece
    public void move(int xp,int yp){
        //only kill a piece when its color is not the same
        if(ChessGame.getPiece(xp*64,yp*64)!=null){
            if(ChessGame.getPiece(xp*64,yp*64).isWhite!=isWhite){
             ChessGame.getPiece(xp*64,yp*64).Kill();
            }
            //if it is the same color then return to last position
            else{
            x=this.xp*64;
            y=this.yp*64;
            return;
            }
       
        }
        
    this.xp=xp;
    this.yp=yp;
    x = xp*64;
    y = yp*64;
    
    }
    
    //method to kill a piece
    public void Kill(){
    ps.remove(this);
    
    }
    
}
//Lemogang Moloko