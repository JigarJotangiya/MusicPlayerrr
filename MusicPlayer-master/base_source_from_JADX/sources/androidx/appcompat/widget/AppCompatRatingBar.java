package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p082e.p083a.C3400a;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: g */
    private final C0284i f948g;

    public AppCompatRatingBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f948g.mo2043b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0268b0.m1570a(this, getContext());
        C0284i iVar = new C0284i(this);
        this.f948g = iVar;
        iVar.mo2044c(attributeSet, i);
    }
}
