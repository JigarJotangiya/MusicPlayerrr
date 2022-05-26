package com.coocent.musiccutter.ringtone;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;

public class MarkerView extends AppCompatImageView {

    /* renamed from: g */
    private int f8468g = 0;

    /* renamed from: h */
    private C2426a f8469h = null;

    /* renamed from: com.coocent.musiccutter.ringtone.MarkerView$a */
    public interface C2426a {
        /* renamed from: G0 */
        void mo9368G0(MarkerView markerView);

        /* renamed from: V */
        void mo9369V(MarkerView markerView);

        /* renamed from: d1 */
        void mo9373d1(MarkerView markerView, int i);

        /* renamed from: o0 */
        void mo9376o0(MarkerView markerView, float f);

        /* renamed from: p */
        void mo9378p();

        /* renamed from: q1 */
        void mo9380q1(MarkerView markerView, float f);

        /* renamed from: r0 */
        void mo9381r0(MarkerView markerView);

        /* renamed from: s0 */
        void mo9383s0(MarkerView markerView, int i);

        /* renamed from: t */
        void mo9388t();
    }

    public MarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(true);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C2426a aVar = this.f8469h;
        if (aVar != null) {
            aVar.mo9378p();
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        C2426a aVar;
        if (z && (aVar = this.f8469h) != null) {
            aVar.mo9381r0(this);
        }
        super.onFocusChanged(z, i, rect);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = this.f8468g + 1;
        this.f8468g = i2;
        int sqrt = (int) Math.sqrt((double) ((i2 / 2) + 1));
        C2426a aVar = this.f8469h;
        if (aVar != null) {
            if (i == 21) {
                aVar.mo9373d1(this, sqrt);
                return true;
            } else if (i == 22) {
                aVar.mo9383s0(this, sqrt);
                return true;
            } else if (i == 23) {
                aVar.mo9368G0(this);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f8468g = 0;
        C2426a aVar = this.f8469h;
        if (aVar != null) {
            aVar.mo9388t();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            requestFocus();
            this.f8469h.mo9376o0(this, motionEvent.getRawX());
        } else if (action == 1) {
            this.f8469h.mo9369V(this);
        } else if (action == 2) {
            this.f8469h.mo9380q1(this, motionEvent.getRawX());
        }
        return true;
    }

    public void setListener(C2426a aVar) {
        this.f8469h = aVar;
    }
}
