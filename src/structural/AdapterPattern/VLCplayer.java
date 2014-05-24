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
public class VLCplayer implements AdvancedMediaPlayer{

    @Override
    public void playVLC(String fileName) {
        System.out.println("I am gonna play VLC files for u called " + fileName);   
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Cant play Mp4" );    }
    
}
