package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p082e.p083a.C3400a;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: g */
    private final C0286j f949g;

    public AppCompatSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f949g.mo2046h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f949g.mo2047i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f949g.mo2045g(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0268b0.m1570a(this, getContext());
        C0286j jVar = new C0286j(this);
        this.f949g = jVar;
        jVar.mo2044c(attributeSet, i);
    }
}
