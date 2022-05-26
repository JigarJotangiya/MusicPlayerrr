package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0554j;
import p082e.p083a.C3409j;

class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b */
    private static final boolean f943b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f944a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1307a(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    private void m1307a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0279g0 v = C0279g0.m1627v(context, attributeSet, C3409j.PopupWindow, i, i2);
        int i3 = C3409j.PopupWindow_overlapAnchor;
        if (v.mo1994s(i3)) {
            m1308b(v.mo1976a(i3, false));
        }
        setBackgroundDrawable(v.mo1982g(C3409j.PopupWindow_android_popupBackground));
        v.mo1995w();
    }

    /* renamed from: b */
    private void m1308b(boolean z) {
        if (f943b) {
            this.f944a = z;
        } else {
            C0554j.m3407a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f943b && this.f944a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f943b && this.f944a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1307a(context, attributeSet, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f943b && this.f944a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
