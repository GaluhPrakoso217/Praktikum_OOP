/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Prakoso
 */
public class Peralatan_dapur extends Peralatan {   
    double diskon,satuan,totaldis;
    
   public Peralatan_dapur(){
       this.diskon = 0;
   }
   @Override
    double Diskon(){
        return(Lusin() - (diskon * 0.1) + Sale());
    }
    public double getsatuan(int harga){
        return satuan = (diskon * 0.01)* harga;
    }
    public void setsatuan(){
        this.satuan = satuan;
    }
    public double gettotaldis(int harga){
        return totaldis = Lusin() - harga  ;
}
    public void settotaldis(){
        this.totaldis = totaldis;
    }
}
