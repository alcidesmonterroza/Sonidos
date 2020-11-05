package ud.example.sonidos;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.widget.ProgressBar;

import ud.example.sonidos.MainActivity;

public class Hilo extends Thread {


    private boolean continuar = true;
    //private ProgressBar mibarra;
    public MediaPlayer player;
    private AudioManager audioManager;



    public void detenElHilo()
    {
        continuar=false;
    }

    // Metodo del hilo
    public void run(MediaPlayer m, ProgressBar mibarra)
    {

        int jumpTime = 0;

        int totalProgressTime= m.getDuration();

        while (continuar)
        {
            while (jumpTime < totalProgressTime) {
                try {
                    jumpTime += 5;
                    // duracion.setText(String.valueOf(jumpTime));
                    mibarra.setProgress(m.getCurrentPosition());
                    sleep(200);
                } catch (InterruptedException e) {
                    //   Log.e(TAG, e.getMessage());

                }
            }
        }
    }


}
