package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: g */
    private final C0292l f982g;

    public AppCompatToggleButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0268b0.m1570a(this, getContext());
        C0292l lVar = new C0292l(this);
        this.f982g = lVar;
        lVar.mo2072m(attributeSet, i);
    }
}
