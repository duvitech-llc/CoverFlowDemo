package com.duvitech.coverflowdemo;

import android.os.Bundle;

/**
 * Created by George on 4/20/2016.
 */
public class XmlInflateExample extends SimpleExample {

    // =============================================================================
    // Supertype overrides
    // =============================================================================

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.layout_inflate_example);

        FancyCoverFlow fancyCoverFlow = (FancyCoverFlow) findViewById(R.id.fancyCoverFlow);
        fancyCoverFlow.setAdapter(new FancyCoverFlowSampleAdapter());
    }

}