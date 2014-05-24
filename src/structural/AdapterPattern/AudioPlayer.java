/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.AdapterPattern;

/**
 *
 * @author marc
 */
public class AudioPlayer implements MediaPlayer{
 MediaAdapter mediaAdapter;
    @Override
    public void play(String audioFile, String fileName) {
        if(audioFile.equalsIgnoreCase("Mp3")){
            System.out.println("I can Handle this by default so lets play"+ fileName);
        }
        else if(audioFile.equalsIgnoreCase("VLC")||audioFile.equalsIgnoreCase("MP4")){
            mediaAdapter = new MediaAdapter(audioFile);
            mediaAdapter.play(audioFile, fileName);
        }
        else
            System.out.println("I cant play this format");
    }
    
}
