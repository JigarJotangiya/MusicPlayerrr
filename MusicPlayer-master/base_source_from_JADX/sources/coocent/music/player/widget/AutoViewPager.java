package coocent.music.player.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

public class AutoViewPager extends ViewPager {

    /* renamed from: p0 */
    private Handler f31467p0;

    /* renamed from: coocent.music.player.widget.AutoViewPager$a */
    class C7127a extends Handler {
        C7127a() {
        }

        public void handleMessage(Message message) {
            AutoViewPager.this.setCurrentItem(AutoViewPager.this.getCurrentItem() + 1);
            AutoViewPager.this.mo27386Z();
        }
    }

    /* renamed from: coocent.music.player.widget.AutoViewPager$b */
    class C7128b implements View.OnTouchListener {
        C7128b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            AutoViewPager.this.mo27385W();
            return false;
        }
    }

    public AutoViewPager(Context context) {
        super(context);
        m40552X();
        m40553Y();
    }

    /* renamed from: X */
    private void m40552X() {
        setOnTouchListener(new C7128b());
    }

    /* renamed from: Y */
    private void m40553Y() {
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: V */
    public void mo27384V() {
        if (this.f31467p0 == null) {
            this.f31467p0 = new C7127a();
            mo27386Z();
        }
    }

    /* renamed from: W */
    public void mo27385W() {
        Handler handler = this.f31467p0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: Z */
    public void mo27386Z() {
        Handler handler = this.f31467p0;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(0, 3000);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException | Exception | IllegalArgumentException | IllegalStateException unused) {
            return false;
        }
    }

    public int getCurrentRealItem() {
        return getCurrentItem() % 6;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception unused) {
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return true;
        }
    }

    public AutoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40552X();
        m40553Y();
    }
}
