package net.indiecoder.DTMFdroid;

import android.app.Activity;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.view.*;
import android.view.View.*;
import android.widget.Button;

public class DTMFActivity extends Activity {
	final static String APP_TAG = "DTMFdroid";
	ToneGenerator toneGenerator = new ToneGenerator(AudioManager.STREAM_DTMF, ToneGenerator.MAX_VOLUME);
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dtmf);

        /* DTMF Button 1 */
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnTouchListener(new OnTouchListener() {
        	//toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_1, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_1);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });

        /* DTMF Button 2 */
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_2, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_2);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
        
        /* DTMF Button 3 */
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_3, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_3);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
        
        /* DTMF Button 4 */
        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_4, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_4);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
        
        /* DTMF Button 5 */
        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_5, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_5);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
        
        /* DTMF Button 6 */
        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_6, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_6);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
        
        /* DTMF Button 7 */
        final Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_7, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_7);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
        
        /* DTMF Button 8 */
        final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_8, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_8);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
        
        /* DTMF Button 9 */
        final Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_9, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_9);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
        
        /* DTMF Button 0 */
        final Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_0, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_0);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
        
        /* DTMF Button dash */
        final Button button_dash = (Button) findViewById(R.id.button_dash);
        button_dash.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_P, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_P);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
        
        /* DTMF Button star */
        final Button button_star = (Button) findViewById(R.id.button_star);
        button_star.setOnTouchListener(new OnTouchListener() {
        	//ToneGenerator toneGenerator = new ToneGenerator(ToneGenerator.TONE_DTMF_S, ToneGenerator.MAX_VOLUME);
            
        	@Override
            public boolean onTouch(View v, MotionEvent event) {
            	if (event.getAction() == MotionEvent.ACTION_DOWN) {
                	toneGenerator.startTone(ToneGenerator.TONE_DTMF_S);
                    return true;
                }
            	else if (event.getAction() == MotionEvent.ACTION_UP) {
            		toneGenerator.stopTone();
            		return true;
            	}
                return false;
            }
        });
    }
}