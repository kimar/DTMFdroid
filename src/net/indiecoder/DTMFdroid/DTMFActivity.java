package net.indiecoder.DTMFdroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class DTMFActivity extends Activity implements View.OnClickListener,
        View.OnLongClickListener {

    private EditText mPhoneNumberField;
    private ImageButton mOneButton;
    private ImageButton mTwoButton;
    private ImageButton mThreeButton;
    private ImageButton mFourButton;
    private ImageButton mFiveButton;
    private ImageButton mSixButton;
    private ImageButton mSevenButton;
    private ImageButton mEightButton;
    private ImageButton mNineButton;
    private ImageButton mZeroButton;
    private ImageButton mStarButton;
    private ImageButton mPoundButton;
    private ImageButton mDialButton;
    private ImageButton mDeleteButton;
    private ImageButton mContactsButton;

    private static final int DURATION = 50; // Vibrate duration

    private Vibrator mVibrator; // Vibration (haptic feedback) for dialer key presses.
    private DTMFGenerator mDtmfGenerator;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dtmf);

        mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        mDtmfGenerator = new DTMFGenerator();
        initUI();
    }

    private void initUI() {
        initializeViews();
        addNumberFormatting();
        setClickListeners();
    }

    private void initializeViews() {
        mPhoneNumberField = (EditText) findViewById(R.id.phone_number);
        mPhoneNumberField.setInputType(android.text.InputType.TYPE_NULL);

        mOneButton = (ImageButton) findViewById(R.id.one);
        mTwoButton = (ImageButton) findViewById(R.id.two);
        mThreeButton = (ImageButton) findViewById(R.id.three);
        mFourButton = (ImageButton) findViewById(R.id.four);
        mFiveButton = (ImageButton) findViewById(R.id.five);
        mSixButton = (ImageButton) findViewById(R.id.six);
        mSevenButton = (ImageButton) findViewById(R.id.seven);
        mEightButton = (ImageButton) findViewById(R.id.eight);
        mNineButton = (ImageButton) findViewById(R.id.nine);
        mZeroButton = (ImageButton) findViewById(R.id.zero);
        mStarButton = (ImageButton) findViewById(R.id.asterisk);
        mPoundButton = (ImageButton) findViewById(R.id.hash);
        mDialButton = (ImageButton) findViewById(R.id.dialButton);
        mDeleteButton = (ImageButton) findViewById(R.id.deleteButton);
        mContactsButton = (ImageButton) findViewById(R.id.contactsButton);
    }

    /**
     * Adds number formatting to the field
     */
    private void addNumberFormatting() {
        mPhoneNumberField.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
    }

    /**
     * Sets click listeners for the views
     */
    private void setClickListeners() {
        mZeroButton.setOnClickListener(this);
        mZeroButton.setOnLongClickListener(this);

        mOneButton.setOnClickListener(this);
        mTwoButton.setOnClickListener(this);
        mThreeButton.setOnClickListener(this);
        mFourButton.setOnClickListener(this);
        mFiveButton.setOnClickListener(this);
        mSixButton.setOnClickListener(this);
        mSevenButton.setOnClickListener(this);
        mEightButton.setOnClickListener(this);
        mNineButton.setOnClickListener(this);
        mStarButton.setOnClickListener(this);
        mPoundButton.setOnClickListener(this);
        mDialButton.setOnClickListener(this);
        mDeleteButton.setOnClickListener(this);
        mDeleteButton.setOnLongClickListener(this);
        mContactsButton.setOnClickListener(this);
    }

    private void keyPressed(int keyCode) {
        mVibrator.vibrate(DURATION);
        KeyEvent event = new KeyEvent(KeyEvent.ACTION_DOWN, keyCode);
        mPhoneNumberField.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.one: {
                keyPressed(KeyEvent.KEYCODE_1);
                return;
            }
            case R.id.two: {
                keyPressed(KeyEvent.KEYCODE_2);
                return;
            }
            case R.id.three: {
                keyPressed(KeyEvent.KEYCODE_3);
                return;
            }
            case R.id.four: {
                keyPressed(KeyEvent.KEYCODE_4);
                return;
            }
            case R.id.five: {
                keyPressed(KeyEvent.KEYCODE_5);
                return;
            }
            case R.id.six: {
                keyPressed(KeyEvent.KEYCODE_6);
                return;
            }
            case R.id.seven: {
                keyPressed(KeyEvent.KEYCODE_7);
                return;
            }
            case R.id.eight: {
                keyPressed(KeyEvent.KEYCODE_8);
                return;
            }
            case R.id.nine: {
                keyPressed(KeyEvent.KEYCODE_9);
                return;
            }
            case R.id.zero: {
                keyPressed(KeyEvent.KEYCODE_0);
                return;
            }
            case R.id.hash: {
                keyPressed(KeyEvent.KEYCODE_POUND);
                return;
            }
            case R.id.asterisk: {
                keyPressed(KeyEvent.KEYCODE_STAR);
                return;
            }
            case R.id.deleteButton: {
                keyPressed(KeyEvent.KEYCODE_DEL);
                return;
            }
            case R.id.dialButton: {
                dialNumber();
                return;
            }
            case R.id.contactsButton: {
            	choseContact();
            }

        }

    }
    
    private void choseContact () {
    	Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE);
        startActivityForResult(intent, 1);   
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data != null) {
            Uri uri = data.getData();

            if (uri != null) {
                Cursor c = null;
                try {
                    c = getContentResolver().query(uri, new String[]{ 
                                ContactsContract.CommonDataKinds.Phone.NUMBER,  
                                ContactsContract.CommonDataKinds.Phone.TYPE },
                            null, null, null);

                    if (c != null && c.moveToFirst()) {
                        String number = c.getString(0);
                        int type = c.getInt(1);
                        showSelectedNumber(type, number);
                    }
                } finally {
                    if (c != null) {
                        c.close();
                    }
                }
            }
        }
    }

    public void showSelectedNumber(int type, String number) {
        //Toast.makeText(this, type + ": " + number, Toast.LENGTH_LONG).show();   
    	mPhoneNumberField.setText(number);
    	mPhoneNumberField.setSelection(mPhoneNumberField.getText().length());
    }
    
    @Override
    public boolean onLongClick(View view) {
        switch (view.getId()) {
            case R.id.deleteButton: {
                Editable digits = mPhoneNumberField.getText();
                digits.clear();
                return true;
            }
            case R.id.zero: {
                keyPressed(KeyEvent.KEYCODE_PLUS);
                return true;
            }
        }
        return false;
    }

    private void dialNumber() {
        String number = mPhoneNumberField.getText().toString();
        if (number.length() > 0) {
        	try {
				mDtmfGenerator.playDtmfSequence(number);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            /*artActivity(new Intent(Intent.ACTION_CALL,
                    Uri.parse("tel:" + number)));*/
        }

    }
}
