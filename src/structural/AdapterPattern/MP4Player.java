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
public class MP4Player implements AdvancedMediaPlayer{

    @Override
    public void playVLC(String fileName) {
        System.out.println("I dont play Mp4");    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("I am gonna play Mp4 for u called" + fileName);    }
    
}
