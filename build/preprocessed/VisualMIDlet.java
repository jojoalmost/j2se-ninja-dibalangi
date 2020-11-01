/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SplashScreen;

/**
 * @author Etsha
 */
public class VisualMIDlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private SplashScreen splashScreen;
    private List list;
    private Alert alert1;
    private Alert alert;
    private NinjaGame ninjaGame;
    private Image image1;
    private Image image4;
    private Image image2;
    private Image image3;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The VisualMIDlet constructor.
     */
    public VisualMIDlet() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == list) {//GEN-BEGIN:|7-commandAction|1|19-preAction
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|1|19-preAction
                // write pre-action user code here
                listAction();//GEN-LINE:|7-commandAction|2|19-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|16-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|3|16-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|4|16-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|7-postCommandAction
        }//GEN-END:|7-commandAction|5|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|6|
    //</editor-fold>//GEN-END:|7-commandAction|6|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of splashScreen component.
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|14-getter|1|14-postInit
            splashScreen.setTitle("splashScreen");
            splashScreen.setCommandListener(this);
            splashScreen.setFullScreenMode(true);
            splashScreen.setImage(getImage1());
            splashScreen.setTimeout(2000);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return splashScreen;
    }
    //</editor-fold>//GEN-END:|14-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: list ">//GEN-BEGIN:|17-getter|0|17-preInit
    /**
     * Returns an initiliazed instance of list component.
     * @return the initialized component instance
     */
    public List getList() {
        if (list == null) {//GEN-END:|17-getter|0|17-preInit
            // write pre-init user code here
            list = new List("list", Choice.IMPLICIT);//GEN-BEGIN:|17-getter|1|17-postInit
            list.append("BUDAL", getImage2());
            list.append("PETUNJUKE", getImage2());
            list.append("SENG NGGAWE", getImage2());
            list.append("METU", getImage2());
            list.setCommandListener(this);
            list.setSelectedFlags(new boolean[] { false, false, false, false });//GEN-END:|17-getter|1|17-postInit
            // write post-init user code here
        }//GEN-BEGIN:|17-getter|2|
        return list;
    }
    //</editor-fold>//GEN-END:|17-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: listAction ">//GEN-BEGIN:|17-action|0|17-preAction
    /**
     * Performs an action assigned to the selected list element in the list component.
     */
    public void listAction() {//GEN-END:|17-action|0|17-preAction
        // enter pre-action user code here
        String __selectedString = getList().getString(getList().getSelectedIndex());//GEN-BEGIN:|17-action|1|23-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("BUDAL")) {//GEN-END:|17-action|1|23-preAction
                // write pre-action user code here
                switchDisplayable(null, getNinjaGame());//GEN-LINE:|17-action|2|23-postAction
                // write post-action user code here
            } else if (__selectedString.equals("PETUNJUKE")) {//GEN-LINE:|17-action|3|24-preAction
                // write pre-action user code here
                switchDisplayable(getAlert(), getList());//GEN-LINE:|17-action|4|24-postAction
                // write post-action user code here
            } else if (__selectedString.equals("SENG NGGAWE")) {//GEN-LINE:|17-action|5|25-preAction
                // write pre-action user code here
                switchDisplayable(getAlert1(), getList());//GEN-LINE:|17-action|6|25-postAction
                // write post-action user code here
            } else if (__selectedString.equals("METU")) {//GEN-LINE:|17-action|7|26-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|17-action|8|26-postAction
                // write post-action user code here
            }//GEN-BEGIN:|17-action|9|17-postAction
        }//GEN-END:|17-action|9|17-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|17-action|10|
    //</editor-fold>//GEN-END:|17-action|10|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: alert ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of alert component.
     * @return the initialized component instance
     */
    public Alert getAlert() {
        if (alert == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            alert = new Alert("alert", "gunakan tombol Kiri dan Kanan untuk mengendalikan sang ninja. Hindari pedang dan kotoran yang akan membunuh sang ninja dan mengurangi score. Ambilah koin sebanyak-banyaknya yang kamu mampu. Selamat mencoba!! :D", getImage4(), null);//GEN-BEGIN:|28-getter|1|28-postInit
            alert.setTimeout(Alert.FOREVER);//GEN-END:|28-getter|1|28-postInit
            // write post-init user code here
        }//GEN-BEGIN:|28-getter|2|
        return alert;
    }
    //</editor-fold>//GEN-END:|28-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: alert1 ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initiliazed instance of alert1 component.
     * @return the initialized component instance
     */
    public Alert getAlert1() {
        if (alert1 == null) {//GEN-END:|29-getter|0|29-preInit
            // write pre-init user code here
            alert1 = new Alert("alert1", "Game ini adalah game jtme yang saya buat pertama kali. Harap maklum klo ada yang eror. hahahaha..tertulis Yosua ", getImage3(), null);//GEN-BEGIN:|29-getter|1|29-postInit
            alert1.setTimeout(Alert.FOREVER);//GEN-END:|29-getter|1|29-postInit
            // write post-init user code here
        }//GEN-BEGIN:|29-getter|2|
        return alert1;
    }
    //</editor-fold>//GEN-END:|29-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initiliazed instance of image1 component.
     * @return the initialized component instance
     */
    public Image getImage1() {
        if (image1 == null) {//GEN-END:|33-getter|0|33-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|33-getter|1|33-@java.io.IOException
                image1 = Image.createImage("/gambar/splash.png");
            } catch (java.io.IOException e) {//GEN-END:|33-getter|1|33-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|33-getter|2|33-postInit
            // write post-init user code here
        }//GEN-BEGIN:|33-getter|3|
        return image1;
    }
    //</editor-fold>//GEN-END:|33-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ninjaGame ">//GEN-BEGIN:|34-getter|0|34-preInit
    /**
     * Returns an initiliazed instance of ninjaGame component.
     * @return the initialized component instance
     */
    public NinjaGame getNinjaGame() {
        if (ninjaGame == null) {//GEN-END:|34-getter|0|34-preInit
            // write pre-init user code here
            ninjaGame = new NinjaGame(null);//GEN-BEGIN:|34-getter|1|34-postInit
            ninjaGame.setTitle("ninjaGame");//GEN-END:|34-getter|1|34-postInit
            // write post-init user code here
        }//GEN-BEGIN:|34-getter|2|
        return ninjaGame;
    }
    //</editor-fold>//GEN-END:|34-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image2 ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initiliazed instance of image2 component.
     * @return the initialized component instance
     */
    public Image getImage2() {
        if (image2 == null) {//GEN-END:|36-getter|0|36-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|36-getter|1|36-@java.io.IOException
                image2 = Image.createImage("/gambar/coin.png");
            } catch (java.io.IOException e) {//GEN-END:|36-getter|1|36-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|36-getter|2|36-postInit
            // write post-init user code here
        }//GEN-BEGIN:|36-getter|3|
        return image2;
    }
    //</editor-fold>//GEN-END:|36-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image3 ">//GEN-BEGIN:|37-getter|0|37-preInit
    /**
     * Returns an initiliazed instance of image3 component.
     * @return the initialized component instance
     */
    public Image getImage3() {
        if (image3 == null) {//GEN-END:|37-getter|0|37-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|37-getter|1|37-@java.io.IOException
                image3 = Image.createImage("/gambar/ninja.png");
            } catch (java.io.IOException e) {//GEN-END:|37-getter|1|37-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|37-getter|2|37-postInit
            // write post-init user code here
        }//GEN-BEGIN:|37-getter|3|
        return image3;
    }
    //</editor-fold>//GEN-END:|37-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image4 ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initiliazed instance of image4 component.
     * @return the initialized component instance
     */
    public Image getImage4() {
        if (image4 == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|38-getter|1|38-@java.io.IOException
                image4 = Image.createImage("/gambar/suriken.png");
            } catch (java.io.IOException e) {//GEN-END:|38-getter|1|38-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|38-getter|2|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|3|
        return image4;
    }
    //</editor-fold>//GEN-END:|38-getter|3|

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

    class display {

        public display() {
        }
    }

}
