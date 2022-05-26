package coocent.music.player.widget.ringtone;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MarkerView extends ImageView {

    /* renamed from: g */
    private int f32123g = 0;

    /* renamed from: h */
    private C7275a f32124h = null;

    /* renamed from: coocent.music.player.widget.ringtone.MarkerView$a */
    public interface C7275a {
        /* renamed from: O0 */
        void mo26524O0(MarkerView markerView);

        /* renamed from: P */
        void mo26525P(MarkerView markerView, int i);

        /* renamed from: a0 */
        void mo26528a0(MarkerView markerView, float f);

        /* renamed from: g0 */
        void mo26531g0(MarkerView markerView);

        /* renamed from: h0 */
        void mo26532h0(MarkerView markerView);

        /* renamed from: h1 */
        void mo26533h1(MarkerView markerView, int i);

        /* renamed from: p */
        void mo26538p();

        /* renamed from: t */
        void mo26546t();

        /* renamed from: v1 */
        void mo26547v1(MarkerView markerView, float f);
    }

    public MarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(true);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C7275a aVar = this.f32124h;
        if (aVar != null) {
            aVar.mo26538p();
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        C7275a aVar;
        if (z && (aVar = this.f32124h) != null) {
            aVar.mo26524O0(this);
        }
        super.onFocusChanged(z, i, rect);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = this.f32123g + 1;
        this.f32123g = i2;
        int sqrt = (int) Math.sqrt((double) ((i2 / 2) + 1));
        C7275a aVar = this.f32124h;
        if (aVar != null) {
            if (i == 21) {
                aVar.mo26533h1(this, sqrt);
                return true;
            } else if (i == 22) {
                aVar.mo26525P(this, sqrt);
                return true;
            } else if (i == 23) {
                aVar.mo26532h0(this);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f32123g = 0;
        C7275a aVar = this.f32124h;
        if (aVar != null) {
            aVar.mo26546t();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            requestFocus();
            this.f32124h.mo26547v1(this, motionEvent.getRawX());
        } else if (action == 1) {
            this.f32124h.mo26531g0(this);
        } else if (action == 2) {
            this.f32124h.mo26528a0(this, motionEvent.getRawX());
        }
        return true;
    }

    public void setListener(C7275a aVar) {
        this.f32124h = aVar;
    }
}
