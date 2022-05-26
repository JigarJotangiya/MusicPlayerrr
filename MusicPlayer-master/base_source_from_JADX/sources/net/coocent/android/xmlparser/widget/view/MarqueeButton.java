package net.coocent.android.xmlparser.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;

public class MarqueeButton extends AppCompatButton {
    public MarqueeButton(Context context) {
        super(context);
    }

    public boolean isFocused() {
        return true;
    }

    public MarqueeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarqueeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
