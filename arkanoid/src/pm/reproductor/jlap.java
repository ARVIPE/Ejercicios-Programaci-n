/*
 * 11/19/04		1.0 moved to LGPL. 
 *-----------------------------------------------------------------------
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU Library General Public License as published
 *   by the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Library General Public License for more details.
 *
 *   You should have received a copy of the GNU Library General Public
 *   License along with this program; if not, write to the Free Software
 *   Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *----------------------------------------------------------------------
 */

package pm.reproductor;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

/**
 * This class implements a sample player using Playback listener.
 */
public class jlap
{
	private String filename = "";
	private boolean repetir = false;
	private static Thread hilo; 
	public static boolean iniciar = false;
	public AdvancedPlayer player = null;

	public jlap(String file) throws JavaLayerException, IOException{
		this.filename = file;
		play(false);
	}

	public void play(boolean inicial) throws JavaLayerException, IOException
	{
		jlap.iniciar = false;
		InfoListener lst = new InfoListener();
		player = playMp3(new File(filename), lst);
	}
	
	public void play() throws JavaLayerException, IOException
	{
		jlap.iniciar = true;
		InfoListener lst = new InfoListener();
		player = playMp3(new File(filename), lst);
	}

  public static AdvancedPlayer playMp3(File mp3, PlaybackListener listener) throws IOException, JavaLayerException
  {
    return playMp3(mp3, 0, Integer.MAX_VALUE, listener);
  }

  public static AdvancedPlayer playMp3(File mp3, int start, int end, PlaybackListener listener) throws IOException, JavaLayerException
  {
    return playMp3(new BufferedInputStream(new FileInputStream(mp3)), start, end, listener);
  }

  public static AdvancedPlayer playMp3(final InputStream is, final int start, final int end, PlaybackListener listener) throws JavaLayerException
  {
    final AdvancedPlayer player = new AdvancedPlayer(is);
    player.setPlayBackListener(listener);
    // run in new thread
    if(jlap.iniciar){
	    hilo = new Thread()
	    {
	      public void run()
	      {
	        try
	        {
	          player.play(start, end);
	        }
	        catch (Exception e)
	        {
	          throw new RuntimeException(e.getMessage());
	        }
	      }
	    };
	    hilo.start();
    }
    return player;
  }

  public class InfoListener extends PlaybackListener
  {
    public void playbackStarted(PlaybackEvent evt)
    {
      //System.out.println("Play started from frame " + evt.getFrame());
    }

    public void playbackFinished(PlaybackEvent evt)
    {
    	if(repetir){
    		hilo.start();
    	}
      //System.out.println("Play completed at frame " + evt.getFrame());
    }
  }
}