package coocent.music.player.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p082e.p109h.p119p.C3706a0;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3790z;
import p082e.p137o.p138a.p139a.C4098c;

public class FloatingActionButtonBehavior extends FloatingActionButton.Behavior {

    /* renamed from: g */
    private static final Interpolator f31585g = new C4098c();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f31586d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public FloatingActionButton f31587e;

    /* renamed from: f */
    private Handler f31588f = new C7140b();

    /* renamed from: coocent.music.player.widget.FloatingActionButtonBehavior$a */
    class C7139a implements C3706a0 {
        C7139a() {
        }

        /* renamed from: a */
        public void mo1916a(View view) {
            boolean unused = FloatingActionButtonBehavior.this.f31586d = false;
        }

        /* renamed from: b */
        public void mo585b(View view) {
            boolean unused = FloatingActionButtonBehavior.this.f31586d = true;
        }

        /* renamed from: c */
        public void mo586c(View view) {
            boolean unused = FloatingActionButtonBehavior.this.f31586d = true;
        }
    }

    /* renamed from: coocent.music.player.widget.FloatingActionButtonBehavior$b */
    class C7140b extends Handler {
        C7140b() {
        }

        public void handleMessage(Message message) {
            if (message.what == 10021 && FloatingActionButtonBehavior.this.f31587e != null && FloatingActionButtonBehavior.this.f31587e.getVisibility() == 0) {
                FloatingActionButtonBehavior floatingActionButtonBehavior = FloatingActionButtonBehavior.this;
                floatingActionButtonBehavior.mo27500O(floatingActionButtonBehavior.f31587e);
            }
        }
    }

    public FloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
    }

    /* renamed from: P */
    private void m40671P(FloatingActionButton floatingActionButton) {
        C3790z d = C3774v.m16194d(floatingActionButton);
        d.mo13226d(0.0f);
        d.mo13227e(0.0f);
        d.mo13234m((float) (floatingActionButton.getHeight() + m40672Q(floatingActionButton)));
        d.mo13223a(0.0f);
        d.mo13229g(f31585g);
        d.mo13235n();
        d.mo13230h(new C7139a());
        d.mo13233l();
        mo27504U();
    }

    /* renamed from: Q */
    private int m40672Q(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    /* renamed from: O */
    public void mo27500O(FloatingActionButton floatingActionButton) {
        C3790z d = C3774v.m16194d(floatingActionButton);
        d.mo13226d(1.0f);
        d.mo13227e(1.0f);
        d.mo13234m(0.0f);
        d.mo13223a(1.0f);
        d.mo13229g(f31585g);
        d.mo13235n();
        d.mo13230h((C3706a0) null);
        d.mo13233l();
        this.f31586d = false;
        mo27503T();
    }

    /* renamed from: R */
    public void mo3068r(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view, int i, int i2, int i3, int i4) {
        super.mo3068r(coordinatorLayout, floatingActionButton, view, i, i2, i3, i4);
        if (i2 > 0 && !this.f31586d) {
            m40671P(floatingActionButton);
        } else if (i2 < 0 && this.f31586d) {
            mo27500O(floatingActionButton);
        }
    }

    /* renamed from: S */
    public boolean mo3076z(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view, View view2, int i) {
        this.f31587e = floatingActionButton;
        return i == 2 || super.mo3076z(coordinatorLayout, floatingActionButton, view, view2, i);
    }

    /* renamed from: T */
    public void mo27503T() {
        this.f31588f.removeMessages(10021);
    }

    /* renamed from: U */
    public void mo27504U() {
        mo27503T();
        this.f31588f.sendEmptyMessageDelayed(10021, 2000);
    }
}
