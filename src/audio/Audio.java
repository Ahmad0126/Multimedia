/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audio;
import java.io.*;
import sun.audio.*;
/**
 *
 * @author user 1
 */
public class Audio {
    
    private boolean isPlaying = false;
    private AudioStream audioStream;
    //ubah SOURCE berikut menjadi path untuk mengakses file wav anda
    //contoh: "D:\\audio\\file.wav"
    File i = new File("SOURCE");
    public String namaFile = i.getName();
    
    public void play(){
        if(!isPlaying){
            InputStream in;
            try{
                in = new FileInputStream(i);
                audioStream = new AudioStream(in);
                isPlaying = true;
                AudioPlayer.player.start(audioStream);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public void stop(){
        if(isPlaying){
            AudioPlayer.player.stop(audioStream);
            isPlaying = false;
        }
    }
}
