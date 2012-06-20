package net.indiecoder.DTMFdroid;

import android.media.AudioManager;
import android.media.ToneGenerator;

public class DTMFGenerator {
	final static String APP_TAG = "DTMFdroid";
	final static int DTMF_LENGTH = 300;
	final static int DTMF_PAUSE_LENGTH = 300;
	
	ToneGenerator toneGenerator = new ToneGenerator(AudioManager.STREAM_DTMF, ToneGenerator.MAX_VOLUME);
	
    public boolean playDtmfSequence(String sequence) throws InterruptedException {
    	char aChar[] = sequence.toCharArray(); // convert the String object to array of char
    	
    	for(char cTone: aChar) {
    		if(cTone == '0') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_0, DTMF_LENGTH);
    		}
    		else if(cTone == '0') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_0, DTMF_LENGTH);
    		}
    		else if(cTone == '1') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_1, DTMF_LENGTH);
    		}
    		else if(cTone == '2') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_2, DTMF_LENGTH);
    		}
    		else if(cTone == '3') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_3, DTMF_LENGTH);
    		}
    		else if(cTone == '4') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_4, DTMF_LENGTH);
    		}
    		else if(cTone == '5') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_5, DTMF_LENGTH);
    		}
    		else if(cTone == '6') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_6, DTMF_LENGTH);
    		}
    		else if(cTone == '7') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_7, DTMF_LENGTH);
    		}
    		else if(cTone == '8') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_8, DTMF_LENGTH);
    		}
    		else if(cTone == '9') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_9, DTMF_LENGTH);
    		}
    		else if(cTone == '+') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_0, DTMF_LENGTH);
    		}
    		else if(cTone == '*') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_S, DTMF_LENGTH);
    		}
    		else if(cTone == '#') {
    			toneGenerator.startTone(ToneGenerator.TONE_DTMF_D, DTMF_LENGTH);
    		}
    		
    		Thread.sleep(DTMF_PAUSE_LENGTH);
    	}
    	return true;
    }
}