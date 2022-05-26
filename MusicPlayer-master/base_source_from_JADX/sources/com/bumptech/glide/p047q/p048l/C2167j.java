package com.bumptech.glide.p047q.p048l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.C1731h;
import com.bumptech.glide.p047q.C2147d;
import com.bumptech.glide.p051s.C2193j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.q.l.j */
/* compiled from: ViewTarget */
public abstract class C2167j<T extends View, Z> extends C2158a<Z> {

    /* renamed from: m */
    private static int f7396m = C1731h.glide_custom_view_target_tag;

    /* renamed from: h */
    protected final T f7397h;

    /* renamed from: i */
    private final C2168a f7398i;

    /* renamed from: j */
    private View.OnAttachStateChangeListener f7399j;

    /* renamed from: k */
    private boolean f7400k;

    /* renamed from: l */
    private boolean f7401l;

    /* renamed from: com.bumptech.glide.q.l.j$a */
    /* compiled from: ViewTarget */
    static final class C2168a {

        /* renamed from: e */
        static Integer f7402e;

        /* renamed from: a */
        private final View f7403a;

        /* renamed from: b */
        private final List<C2165h> f7404b = new ArrayList();

        /* renamed from: c */
        boolean f7405c;

        /* renamed from: d */
        private C2169a f7406d;

        /* renamed from: com.bumptech.glide.q.l.j$a$a */
        /* compiled from: ViewTarget */
        private static final class C2169a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: g */
            private final WeakReference<C2168a> f7407g;

            C2169a(C2168a aVar) {
                this.f7407g = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C2168a aVar = (C2168a) this.f7407g.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo8453a();
                return true;
            }
        }

        C2168a(View view) {
            this.f7403a = view;
        }

        /* renamed from: c */
        private static int m10210c(Context context) {
            if (f7402e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C2193j.m10269d(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f7402e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f7402e.intValue();
        }

        /* renamed from: e */
        private int m10211e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f7405c && this.f7403a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f7403a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m10210c(this.f7403a.getContext());
        }

        /* renamed from: f */
        private int m10212f() {
            int paddingTop = this.f7403a.getPaddingTop() + this.f7403a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f7403a.getLayoutParams();
            return m10211e(this.f7403a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        private int m10213g() {
            int paddingLeft = this.f7403a.getPaddingLeft() + this.f7403a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f7403a.getLayoutParams();
            return m10211e(this.f7403a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        private boolean m10214h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m10215i(int i, int i2) {
            return m10214h(i) && m10214h(i2);
        }

        /* renamed from: j */
        private void m10216j(int i, int i2) {
            Iterator it = new ArrayList(this.f7404b).iterator();
            while (it.hasNext()) {
                ((C2165h) it.next()).mo8445e(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8453a() {
            if (!this.f7404b.isEmpty()) {
                int g = m10213g();
                int f = m10212f();
                if (m10215i(g, f)) {
                    m10216j(g, f);
                    mo8454b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8454b() {
            ViewTreeObserver viewTreeObserver = this.f7403a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f7406d);
            }
            this.f7406d = null;
            this.f7404b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo8455d(C2165h hVar) {
            int g = m10213g();
            int f = m10212f();
            if (m10215i(g, f)) {
                hVar.mo8445e(g, f);
                return;
            }
            if (!this.f7404b.contains(hVar)) {
                this.f7404b.add(hVar);
            }
            if (this.f7406d == null) {
                ViewTreeObserver viewTreeObserver = this.f7403a.getViewTreeObserver();
                C2169a aVar = new C2169a(this);
                this.f7406d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo8456k(C2165h hVar) {
            this.f7404b.remove(hVar);
        }
    }

    public C2167j(T t) {
        C2193j.m10269d(t);
        this.f7397h = (View) t;
        this.f7398i = new C2168a(t);
    }

    /* renamed from: d */
    private Object m10200d() {
        return this.f7397h.getTag(f7396m);
    }

    /* renamed from: h */
    private void m10201h() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f7399j;
        if (onAttachStateChangeListener != null && !this.f7401l) {
            this.f7397h.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f7401l = true;
        }
    }

    /* renamed from: m */
    private void m10202m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f7399j;
        if (onAttachStateChangeListener != null && this.f7401l) {
            this.f7397h.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f7401l = false;
        }
    }

    /* renamed from: n */
    private void m10203n(Object obj) {
        this.f7397h.setTag(f7396m, obj);
    }

    /* renamed from: b */
    public void mo8427b(C2165h hVar) {
        this.f7398i.mo8456k(hVar);
    }

    /* renamed from: e */
    public void mo8429e(C2147d dVar) {
        m10203n(dVar);
    }

    /* renamed from: i */
    public void mo8433i(Drawable drawable) {
        super.mo8433i(drawable);
        m10201h();
    }

    /* renamed from: j */
    public C2147d mo8436j() {
        Object d = m10200d();
        if (d == null) {
            return null;
        }
        if (d instanceof C2147d) {
            return (C2147d) d;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: k */
    public void mo8225k(Drawable drawable) {
        super.mo8225k(drawable);
        this.f7398i.mo8454b();
        if (!this.f7400k) {
            m10202m();
        }
    }

    /* renamed from: l */
    public void mo8437l(C2165h hVar) {
        this.f7398i.mo8455d(hVar);
    }

    public String toString() {
        return "Target for: " + this.f7397h;
    }
}
