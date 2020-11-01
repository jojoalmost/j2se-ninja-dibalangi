
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.Sprite;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Etsha
 */
public class NinjaGame extends GameCanvas implements Runnable, CommandListener {

    private VisualMIDlet midletnya;
    private Image bg, ninja, gambarCoinScore, gameOver, menang;
    private int red = 0, green = 255, scorenya = 0, waktu = 60;
    private Sprite sninja, spedang, spedang2, scoin, staek, snyawa, ssuriken;
    private int posNinX = 100, posNinY = 245;
    private int posH1X = getWidth() / 2 + 30, posH1Y = 10;
//    private int posH2X = getWidth() / 2 + 55, posH2Y = 10;
//    private int posH3X = getWidth() / 2 + 80, posH3Y = 10;
    private Random r;
    private Image heart1, heart2, heart3;
    private int nyawaBar = 60;
    private Timer t;
    Graphics g = getGraphics();

    private Command kembali = new Command("Metu", Command.OK, 1);
    private Command pause = new Command("pause", Command.OK, 1);
    private Command ulangi = new Command("Mbaleni", Command.OK, 1);

    public NinjaGame(VisualMIDlet m) {
        super(true);
        this.midletnya = m;
        setFullScreenMode(true);
        try {
            init();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        new Thread(this).start();
    }

    private void tabrak() {
        g.setColor(red, green, 0);
        g.fillRect(posH1X + 25, 13, nyawaBar, 13);
        if (sninja.collidesWith(spedang, true)) {
            spedang.setPosition(r.nextInt(getWidth() - spedang.getWidth()), 0);
            nyawaBar -= 20;
        } else if (sninja.collidesWith(spedang2, true)) {
            spedang2.setPosition(r.nextInt(getWidth() - spedang2.getWidth()), 0);
            nyawaBar -= 20;
        } else if (sninja.collidesWith(ssuriken, true)) {
            ssuriken.setPosition(r.nextInt(getWidth() - ssuriken.getWidth()), 0);
            nyawaBar -= 20;
        }

        if (sninja.collidesWith(scoin, true)) {
            scoin.setPosition(r.nextInt(getWidth() - scoin.getWidth()), 0);
            scorenya += 100;
        }
        if (sninja.collidesWith(staek, true)) {
            staek.setPosition(r.nextInt(getWidth() - staek.getWidth()), 0);
            scorenya -= 50;
        }
        if (sninja.collidesWith(snyawa, true)) {
            snyawa.setPosition(r.nextInt(getWidth() - snyawa.getWidth()), 0);
            nyawaBar += 20;
        }
        if (nyawaBar == 20) {
            red = 255;
            green = 0;
        } else {
            red = 0;
            green = 255;
        }
        if (nyawaBar <= 0) {
            nyawaBar = 0;
        }
        if (nyawaBar >= 60) {
            nyawaBar = 60;
        }
        if (scorenya <= 0) {
            scorenya = 0;
        }

    }

//    private void tabrakBenda() {
//        if (spedang.collidesWith(spedang2, true) || spedang.collidesWith(staek, true) || spedang.collidesWith(scoin, true) || spedang.collidesWith(snyawa, true)) {
//            spedang.setPosition(r.nextInt(getWidth() - spedang.getWidth()), 0);
//        } else if (spedang2.collidesWith(spedang, true) || spedang2.collidesWith(staek, true) || spedang2.collidesWith(scoin, true) || spedang2.collidesWith(snyawa, true)) {
//            spedang2.setPosition(r.nextInt(getWidth() - spedang2.getWidth()), 0);
//        } else if (staek.collidesWith(spedang, true) || staek.collidesWith(spedang2, true) || staek.collidesWith(scoin, true) || staek.collidesWith(snyawa, true)) {
//            staek.setPosition(r.nextInt(getWidth() - staek.getWidth()), 0);
//        } else if (snyawa.collidesWith(spedang, true) || snyawa.collidesWith(spedang2, true) || snyawa.collidesWith(scoin, true) || snyawa.collidesWith(staek, true)) {
//            snyawa.setPosition(r.nextInt(getWidth() - snyawa.getWidth()), 0);
//        }
//    }
    private void init() throws Exception {
        r = new Random();
        t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                waktu--;
            }
        }, 1000, 1000);



        r = new Random();
        bg = Image.createImage("/gambar/bg.png");
        gambarCoinScore = Image.createImage("/gambar/Coins.png");
        ninja = Image.createImage("/gambar/ninja.png");
        sninja = new Sprite(ninja);
        heart1 = Image.createImage("/gambar/Heart.png");
//        heart2 = Image.createImage("/gambar/Heart.png");
//        heart3 = Image.createImage("/gambar/Heart.png");

        spedang = new Sprite(Image.createImage("/gambar/pedang.png"));
        spedang2 = new Sprite(Image.createImage("/gambar/pedang2.png"));
        scoin = new Sprite(Image.createImage("/gambar/coin.png"));
        staek = new Sprite(Image.createImage("/gambar/telek.png"));
        snyawa = new Sprite(Image.createImage("/gambar/Heart.png"));
        gameOver = Image.createImage("/gambar/tamat.png");
        menang = Image.createImage("/gambar/menang.png");
        ssuriken = new Sprite(Image.createImage("/gambar/suriken.png"));

        addCommand(kembali);//komen back
        addCommand(pause);//komen pause
        addCommand(ulangi);//ulangi
        setCommandListener(this);
    }

    private void heart() {
        g.drawImage(heart1, posH1X, posH1Y, 0);
//        g.drawImage(heart2, posH2X, posH2Y, 0);
//        g.drawImage(heart3, posH3X, posH3Y, 0);
    }

    private void pedang() {
        spedang.paint(g);
        spedang.move(0, 8);
        if (spedang.getY() > getHeight()) {
            spedang.setPosition(r.nextInt(getWidth() - spedang.getWidth()), 0);
        }
    }

    private void pedang2() {
        spedang2.paint(g);
        spedang2.move(0, 9);
        if (spedang2.getY() > getHeight()) {
            spedang2.setPosition(r.nextInt(getWidth() - spedang2.getWidth()), 0);
        }
    }

    private void telek() {
        staek.paint(g);
        staek.move(0, 7);
        if (staek.getY() > getHeight()) {
            staek.setPosition(r.nextInt(getWidth() - staek.getWidth()), 0);
        }
    }

    private void suriken() {
        ssuriken.paint(g);
        ssuriken.move(0, 6);
        if (ssuriken.getY() > getHeight()) {
            ssuriken.setPosition(r.nextInt(getWidth() - ssuriken.getWidth()), 0);
        }
    }

    private void gameOver() {
        if (nyawaBar == 0) {
            sninja.setVisible(false);
            spedang.setVisible(false);
            spedang2.setVisible(false);
            staek.setVisible(false);
            snyawa.setVisible(false);
            scoin.setVisible(false);
            ssuriken.setVisible(false);
            g.drawImage(gameOver, getWidth() / 2, getHeight() / 2, Graphics.VCENTER | Graphics.HCENTER);

            t.cancel();
        }
    }

    private void Menang() {
        if (waktu == 0) {
            sninja.setVisible(false);
            spedang.setVisible(false);
            spedang2.setVisible(false);
            staek.setVisible(false);
            snyawa.setVisible(false);
            scoin.setVisible(false);
            ssuriken.setVisible(false);
            g.drawImage(menang, getWidth() / 2, getHeight() / 2, Graphics.VCENTER | Graphics.HCENTER);
            t.cancel();
        }
    }

    private void score() {
        scoin.paint(g);
        scoin.move(0, 3);
        if (scoin.getY() > getHeight()) {
            scoin.setPosition(r.nextInt(getWidth() - scoin.getWidth()), 0);
        }
    }

    private void tambahNyawa() {
        snyawa.paint(g);
        snyawa.move(0, 2);
        if (snyawa.getY() > getHeight()) {
            snyawa.setPosition(r.nextInt(getWidth() - snyawa.getWidth()), 0);
        }
    }

    private void ninja() {
        sninja.paint(g);
        sninja.setPosition(posNinX, posNinY);
    }

    private void kontrolNinja() {
        int kontrol = getKeyStates();

        if (kontrol == RIGHT_PRESSED) {
            posNinX += 8;
            if (posNinX > 209) {
                posNinX = 209;
            }
        } else if (kontrol == LEFT_PRESSED) {
            posNinX -= 8;
            if (posNinX < 0) {
                posNinX = 0;
            }

        }

    }

    public void run() {
        while (true) {
            flushGraphics();
            g.drawImage(bg, 0, 0, 0);
            g.drawImage(gambarCoinScore, 10, 10, 0);
            g.setColor(255, 255, 0);
            g.drawString("" + scorenya, 70, 20, 0);
            g.drawString("Waktumu: " + waktu, 80, 10, 0);
            g.drawString("design by jojo", 170, 280, 0);
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            ninja();
            pedang();
            pedang2();
            kontrolNinja();
            heart();
            tambahNyawa();
            score();
            telek();
            suriken();
            tabrak();
//            tabrakBenda();
            gameOver();
            Menang();
        }
    }

    public void commandAction(Command c, Displayable d) {
//         if (c == kembali) {
//            midletnya.display.setCurrent(midletnya.menu);
//        }
    }
}
