package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0186m;
import p082e.p109h.p119p.C3733e;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.appcompat.view.menu.l */
/* compiled from: MenuPopupHelper */
public class C0184l {

    /* renamed from: a */
    private final Context f750a;

    /* renamed from: b */
    private final C0171g f751b;

    /* renamed from: c */
    private final boolean f752c;

    /* renamed from: d */
    private final int f753d;

    /* renamed from: e */
    private final int f754e;

    /* renamed from: f */
    private View f755f;

    /* renamed from: g */
    private int f756g;

    /* renamed from: h */
    private boolean f757h;

    /* renamed from: i */
    private C0186m.C0187a f758i;

    /* renamed from: j */
    private C0183k f759j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f760k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f761l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* compiled from: MenuPopupHelper */
    class C0185a implements PopupWindow.OnDismissListener {
        C0185a() {
        }

        public void onDismiss() {
            C0184l.this.mo1098e();
        }
    }

    public C0184l(Context context, C0171g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0183k m1115a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f750a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f750a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p082e.p083a.C3403d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f750a
            android.view.View r3 = r14.f755f
            int r4 = r14.f753d
            int r5 = r14.f754e
            boolean r6 = r14.f752c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f750a
            androidx.appcompat.view.menu.g r9 = r14.f751b
            android.view.View r10 = r14.f755f
            int r11 = r14.f753d
            int r12 = r14.f754e
            boolean r13 = r14.f752c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f751b
            r0.mo841d(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f761l
            r0.mo849n(r1)
            android.view.View r1 = r14.f755f
            r0.mo844h(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f758i
            r0.mo818I(r1)
            boolean r1 = r14.f757h
            r0.mo846k(r1)
            int r1 = r14.f756g
            r0.mo847l(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0184l.m1115a():androidx.appcompat.view.menu.k");
    }

    /* renamed from: l */
    private void m1116l(int i, int i2, boolean z, boolean z2) {
        C0183k c = mo1096c();
        c.mo850o(z2);
        if (z) {
            if ((C3733e.m15972b(this.f756g, C3774v.m16151B(this.f755f)) & 7) == 5) {
                i -= this.f755f.getWidth();
            }
            c.mo848m(i);
            c.mo853p(i2);
            int i3 = (int) ((this.f750a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo1093i(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo840b();
    }

    /* renamed from: b */
    public void mo1095b() {
        if (mo1097d()) {
            this.f759j.dismiss();
        }
    }

    /* renamed from: c */
    public C0183k mo1096c() {
        if (this.f759j == null) {
            this.f759j = m1115a();
        }
        return this.f759j;
    }

    /* renamed from: d */
    public boolean mo1097d() {
        C0183k kVar = this.f759j;
        return kVar != null && kVar.mo839a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1098e() {
        this.f759j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f760k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo1099f(View view) {
        this.f755f = view;
    }

    /* renamed from: g */
    public void mo1100g(boolean z) {
        this.f757h = z;
        C0183k kVar = this.f759j;
        if (kVar != null) {
            kVar.mo846k(z);
        }
    }

    /* renamed from: h */
    public void mo1101h(int i) {
        this.f756g = i;
    }

    /* renamed from: i */
    public void mo1102i(PopupWindow.OnDismissListener onDismissListener) {
        this.f760k = onDismissListener;
    }

    /* renamed from: j */
    public void mo1103j(C0186m.C0187a aVar) {
        this.f758i = aVar;
        C0183k kVar = this.f759j;
        if (kVar != null) {
            kVar.mo818I(aVar);
        }
    }

    /* renamed from: k */
    public void mo1104k() {
        if (!mo1105m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean mo1105m() {
        if (mo1097d()) {
            return true;
        }
        if (this.f755f == null) {
            return false;
        }
        m1116l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo1106n(int i, int i2) {
        if (mo1097d()) {
            return true;
        }
        if (this.f755f == null) {
            return false;
        }
        m1116l(i, i2, true, true);
        return true;
    }

    public C0184l(Context context, C0171g gVar, View view, boolean z, int i, int i2) {
        this.f756g = 8388611;
        this.f761l = new C0185a();
        this.f750a = context;
        this.f751b = gVar;
        this.f755f = view;
        this.f752c = z;
        this.f753d = i;
        this.f754e = i2;
    }
}
