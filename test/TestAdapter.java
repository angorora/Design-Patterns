/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import structural.AdapterPattern.AudioPlayer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author marc
 */
public class TestAdapter {
    
    public TestAdapter() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testAdapter() {
         AudioPlayer audio = new AudioPlayer();
         audio.play("MP4", "Beautiful");
         audio.play("MP3", "Yes");
         audio.play("Vlc", "Beautiful");
         audio.play("avi", "Beautiful");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
