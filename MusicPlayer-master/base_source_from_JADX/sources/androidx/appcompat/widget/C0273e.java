package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.widget.C0549e;

/* renamed from: androidx.appcompat.widget.e */
/* compiled from: AppCompatCompoundButtonHelper */
class C0273e {

    /* renamed from: a */
    private final CompoundButton f1273a;

    /* renamed from: b */
    private ColorStateList f1274b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1275c = null;

    /* renamed from: d */
    private boolean f1276d = false;

    /* renamed from: e */
    private boolean f1277e = false;

    /* renamed from: f */
    private boolean f1278f;

    C0273e(CompoundButton compoundButton) {
        this.f1273a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1957a() {
        Drawable a = C0549e.m3393a(this.f1273a);
        if (a == null) {
            return;
        }
        if (this.f1276d || this.f1277e) {
            Drawable mutate = C0534a.m3292r(a).mutate();
            if (this.f1276d) {
                C0534a.m3289o(mutate, this.f1274b);
            }
            if (this.f1277e) {
                C0534a.m3290p(mutate, this.f1275c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1273a.getDrawableState());
            }
            this.f1273a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.C0549e.m3393a(r2.f1273a);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo1958b(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f1273a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C0549e.m3393a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0273e.mo1958b(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1959c() {
        return this.f1274b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1960d() {
        return this.f1275c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1961e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1273a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p082e.p083a.C3409j.CompoundButton
            r8 = 0
            androidx.appcompat.widget.g0 r0 = androidx.appcompat.widget.C0279g0.m1627v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1273a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo1993r()
            r7 = 0
            r4 = r10
            r6 = r11
            p082e.p109h.p119p.C3774v.m16213m0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p082e.p083a.C3409j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1994s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo1989n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f1273a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p082e.p083a.p084k.p085a.C3410a.m14543d(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p082e.p083a.C3409j.CompoundButton_android_button     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1994s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo1989n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f1273a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p082e.p083a.p084k.p085a.C3410a.m14543d(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p082e.p083a.C3409j.CompoundButton_buttonTint     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1994s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f1273a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo1978c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0549e.m3395c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p082e.p083a.C3409j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1994s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f1273a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo1986k(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0303p.m1832e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0549e.m3396d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo1995w()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo1995w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0273e.mo1961e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1962f() {
        if (this.f1278f) {
            this.f1278f = false;
            return;
        }
        this.f1278f = true;
        mo1957a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1963g(ColorStateList colorStateList) {
        this.f1274b = colorStateList;
        this.f1276d = true;
        mo1957a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1964h(PorterDuff.Mode mode) {
        this.f1275c = mode;
        this.f1277e = true;
        mo1957a();
    }
}
