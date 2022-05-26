package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0191p;

/* renamed from: androidx.appcompat.widget.s */
/* compiled from: ForwardingListener */
public abstract class C0309s implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: g */
    private final float f1407g;

    /* renamed from: h */
    private final int f1408h;

    /* renamed from: i */
    private final int f1409i;

    /* renamed from: j */
    final View f1410j;

    /* renamed from: k */
    private Runnable f1411k;

    /* renamed from: l */
    private Runnable f1412l;

    /* renamed from: m */
    private boolean f1413m;

    /* renamed from: n */
    private int f1414n;

    /* renamed from: o */
    private final int[] f1415o = new int[2];

    /* renamed from: androidx.appcompat.widget.s$a */
    /* compiled from: ForwardingListener */
    private class C0310a implements Runnable {
        C0310a() {
        }

        public void run() {
            ViewParent parent = C0309s.this.f1410j.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.s$b */
    /* compiled from: ForwardingListener */
    private class C0311b implements Runnable {
        C0311b() {
        }

        public void run() {
            C0309s.this.mo2127n();
        }
    }

    public C0309s(View view) {
        this.f1410j = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1407g = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1408h = tapTimeout;
        this.f1409i = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m1848a() {
        Runnable runnable = this.f1412l;
        if (runnable != null) {
            this.f1410j.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1411k;
        if (runnable2 != null) {
            this.f1410j.removeCallbacks(runnable2);
        }
    }

    /* renamed from: o */
    private boolean m1849o(MotionEvent motionEvent) {
        C0304q qVar;
        View view = this.f1410j;
        C0191p b = mo737b();
        if (b == null || !b.mo839a() || (qVar = (C0304q) b.mo845j()) == null || !qVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1852r(view, obtainNoHistory);
        m1853s(qVar, obtainNoHistory);
        boolean e = qVar.mo2108e(obtainNoHistory, this.f1414n);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!e || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1850p(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1410j
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1414n
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1407g
            boolean r6 = m1851q(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m1848a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m1848a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1414n = r6
            java.lang.Runnable r6 = r5.f1411k
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.s$a r6 = new androidx.appcompat.widget.s$a
            r6.<init>()
            r5.f1411k = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1411k
            int r1 = r5.f1408h
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1412l
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.s$b r6 = new androidx.appcompat.widget.s$b
            r6.<init>()
            r5.f1412l = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1412l
            int r1 = r5.f1409i
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0309s.m1850p(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    private static boolean m1851q(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: r */
    private boolean m1852r(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1415o;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: s */
    private boolean m1853s(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1415o;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    public abstract C0191p mo737b();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo738d();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo1278f() {
        C0191p b = mo737b();
        if (b == null || !b.mo839a()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2127n() {
        m1848a();
        View view = this.f1410j;
        if (view.isEnabled() && !view.isLongClickable() && mo738d()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1413m = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1413m;
        if (z2) {
            z = m1849o(motionEvent) || !mo1278f();
        } else {
            z = m1850p(motionEvent) && mo738d();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1410j.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1413m = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1413m = false;
        this.f1414n = -1;
        Runnable runnable = this.f1411k;
        if (runnable != null) {
            this.f1410j.removeCallbacks(runnable);
        }
    }
}
