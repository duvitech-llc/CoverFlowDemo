package com.duvitech.coverflowdemo;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

/**
 * Created by George on 4/20/2016.
 */
public class XmlInflateExample extends SimpleExample {

    // =============================================================================
    // Supertype overrides
    // =============================================================================
    FancyCoverFlow fancyCoverFlow = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.layout_inflate_example);

        fancyCoverFlow = (FancyCoverFlow) findViewById(R.id.fancyCoverFlow);
        fancyCoverFlow.setAdapter(new FancyCoverFlowSampleAdapter());
    }


    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        int currentPosition = 0;
        switch (keyCode) {
            case KeyEvent.KEYCODE_D:
                Toast.makeText(this,"Key D Pressed!", Toast.LENGTH_SHORT).show();
                return true;
            case KeyEvent.KEYCODE_VOLUME_UP:
                Toast.makeText(this,"Vol UP Pressed!", Toast.LENGTH_SHORT).show();
                currentPosition = fancyCoverFlow.getSelectedItemPosition();
                currentPosition++;
                if(currentPosition>= fancyCoverFlow.getCount())  currentPosition = fancyCoverFlow.getCount() -1;
                fancyCoverFlow.setSelection(currentPosition);
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                Toast.makeText(this,"Vol DN Pressed!", Toast.LENGTH_SHORT).show();
                currentPosition = fancyCoverFlow.getSelectedItemPosition();
                currentPosition--;
                if(currentPosition<0) currentPosition = 0;
                fancyCoverFlow.setSelection(currentPosition);
                return true;
            case KeyEvent.KEYCODE_MENU:
                Toast.makeText(this,"Launch", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onKeyUp(keyCode, event);
        }
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_D:
                return true;
            case KeyEvent.KEYCODE_VOLUME_UP:
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                return true;
            case KeyEvent.KEYCODE_MENU:
                return true;
            default:
                return super.onKeyUp(keyCode, event);
        }
    }
}