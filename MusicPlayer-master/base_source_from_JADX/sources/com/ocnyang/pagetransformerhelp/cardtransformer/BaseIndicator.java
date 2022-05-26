package com.ocnyang.pagetransformerhelp.cardtransformer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class BaseIndicator extends View {
    public BaseIndicator(Context context) {
        super(context);
    }

    public abstract void setState(boolean z);

    public BaseIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
