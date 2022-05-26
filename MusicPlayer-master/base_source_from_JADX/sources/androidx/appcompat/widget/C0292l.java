package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.p003d.C0524f;
import androidx.core.widget.C0548d;
import java.lang.ref.WeakReference;
import p082e.p083a.C3409j;

/* renamed from: androidx.appcompat.widget.l */
/* compiled from: AppCompatTextHelper */
class C0292l {

    /* renamed from: a */
    private final TextView f1353a;

    /* renamed from: b */
    private C0274e0 f1354b;

    /* renamed from: c */
    private C0274e0 f1355c;

    /* renamed from: d */
    private C0274e0 f1356d;

    /* renamed from: e */
    private C0274e0 f1357e;

    /* renamed from: f */
    private C0274e0 f1358f;

    /* renamed from: g */
    private C0274e0 f1359g;

    /* renamed from: h */
    private C0274e0 f1360h;

    /* renamed from: i */
    private final C0295m f1361i;

    /* renamed from: j */
    private int f1362j = 0;

    /* renamed from: k */
    private int f1363k = -1;

    /* renamed from: l */
    private Typeface f1364l;

    /* renamed from: m */
    private boolean f1365m;

    /* renamed from: androidx.appcompat.widget.l$a */
    /* compiled from: AppCompatTextHelper */
    class C0293a extends C0524f.C0527c {

        /* renamed from: a */
        final /* synthetic */ int f1366a;

        /* renamed from: b */
        final /* synthetic */ int f1367b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1368c;

        C0293a(int i, int i2, WeakReference weakReference) {
            this.f1366a = i;
            this.f1367b = i2;
            this.f1368c = weakReference;
        }

        /* renamed from: d */
        public void mo2084d(int i) {
        }

        /* renamed from: e */
        public void mo2085e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1366a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f1367b & 2) != 0);
            }
            C0292l.this.mo2073n(this.f1368c, typeface);
        }
    }

    C0292l(TextView textView) {
        this.f1353a = textView;
        this.f1361i = new C0295m(textView);
    }

    /* renamed from: A */
    private void m1722A(int i, float f) {
        this.f1361i.mo2101y(i, f);
    }

    /* renamed from: B */
    private void m1723B(Context context, C0279g0 g0Var) {
        String o;
        this.f1362j = g0Var.mo1986k(C3409j.TextAppearance_android_textStyle, this.f1362j);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int k = g0Var.mo1986k(C3409j.TextAppearance_android_textFontWeight, -1);
            this.f1363k = k;
            if (k != -1) {
                this.f1362j = (this.f1362j & 2) | 0;
            }
        }
        int i2 = C3409j.TextAppearance_android_fontFamily;
        if (g0Var.mo1994s(i2) || g0Var.mo1994s(C3409j.TextAppearance_fontFamily)) {
            this.f1364l = null;
            int i3 = C3409j.TextAppearance_fontFamily;
            if (g0Var.mo1994s(i3)) {
                i2 = i3;
            }
            int i4 = this.f1363k;
            int i5 = this.f1362j;
            if (!context.isRestricted()) {
                try {
                    Typeface j = g0Var.mo1985j(i2, this.f1362j, new C0293a(i4, i5, new WeakReference(this.f1353a)));
                    if (j != null) {
                        if (i < 28 || this.f1363k == -1) {
                            this.f1364l = j;
                        } else {
                            this.f1364l = Typeface.create(Typeface.create(j, 0), this.f1363k, (this.f1362j & 2) != 0);
                        }
                    }
                    this.f1365m = this.f1364l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1364l == null && (o = g0Var.mo1990o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1363k == -1) {
                    this.f1364l = Typeface.create(o, this.f1362j);
                    return;
                }
                Typeface create = Typeface.create(o, 0);
                int i6 = this.f1363k;
                if ((this.f1362j & 2) != 0) {
                    z = true;
                }
                this.f1364l = Typeface.create(create, i6, z);
                return;
            }
            return;
        }
        int i7 = C3409j.TextAppearance_android_typeface;
        if (g0Var.mo1994s(i7)) {
            this.f1365m = false;
            int k2 = g0Var.mo1986k(i7, 1);
            if (k2 == 1) {
                this.f1364l = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                this.f1364l = Typeface.SERIF;
            } else if (k2 == 3) {
                this.f1364l = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: a */
    private void m1724a(Drawable drawable, C0274e0 e0Var) {
        if (drawable != null && e0Var != null) {
            C0275f.m1607i(drawable, e0Var, this.f1353a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C0274e0 m1725d(Context context, C0275f fVar, int i) {
        ColorStateList f = fVar.mo1968f(context, i);
        if (f == null) {
            return null;
        }
        C0274e0 e0Var = new C0274e0();
        e0Var.f1282d = true;
        e0Var.f1279a = f;
        return e0Var;
    }

    /* renamed from: x */
    private void m1726x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1353a.getCompoundDrawablesRelative();
            TextView textView = this.f1353a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (i >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1353a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1353a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1353a.getCompoundDrawables();
            TextView textView3 = this.f1353a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: y */
    private void m1727y() {
        C0274e0 e0Var = this.f1360h;
        this.f1354b = e0Var;
        this.f1355c = e0Var;
        this.f1356d = e0Var;
        this.f1357e = e0Var;
        this.f1358f = e0Var;
        this.f1359g = e0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2062b() {
        if (!(this.f1354b == null && this.f1355c == null && this.f1356d == null && this.f1357e == null)) {
            Drawable[] compoundDrawables = this.f1353a.getCompoundDrawables();
            m1724a(compoundDrawables[0], this.f1354b);
            m1724a(compoundDrawables[1], this.f1355c);
            m1724a(compoundDrawables[2], this.f1356d);
            m1724a(compoundDrawables[3], this.f1357e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1358f != null || this.f1359g != null) {
            Drawable[] compoundDrawablesRelative = this.f1353a.getCompoundDrawablesRelative();
            m1724a(compoundDrawablesRelative[0], this.f1358f);
            m1724a(compoundDrawablesRelative[2], this.f1359g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2063c() {
        this.f1361i.mo2088b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo2064e() {
        return this.f1361i.mo2090j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo2065f() {
        return this.f1361i.mo2091k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo2066g() {
        return this.f1361i.mo2092l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo2067h() {
        return this.f1361i.mo2093m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo2068i() {
        return this.f1361i.mo2094n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo2069j() {
        C0274e0 e0Var = this.f1360h;
        if (e0Var != null) {
            return e0Var.f1279a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo2070k() {
        C0274e0 e0Var = this.f1360h;
        if (e0Var != null) {
            return e0Var.f1280b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo2071l() {
        return this.f1361i.mo2096s();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2072m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f1353a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.f r11 = androidx.appcompat.widget.C0275f.m1604b()
            int[] r2 = p082e.p083a.C3409j.AppCompatTextHelper
            r12 = 0
            androidx.appcompat.widget.g0 r13 = androidx.appcompat.widget.C0279g0.m1627v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1353a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo1993r()
            r6 = 0
            r3 = r24
            r5 = r25
            p082e.p109h.p119p.C3774v.m16213m0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = p082e.p083a.C3409j.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r0 = r13.mo1989n(r0, r14)
            int r1 = p082e.p083a.C3409j.AppCompatTextHelper_android_drawableLeft
            boolean r2 = r13.mo1994s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo1989n(r1, r12)
            androidx.appcompat.widget.e0 r1 = m1725d(r10, r11, r1)
            r7.f1354b = r1
        L_0x0042:
            int r1 = p082e.p083a.C3409j.AppCompatTextHelper_android_drawableTop
            boolean r2 = r13.mo1994s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo1989n(r1, r12)
            androidx.appcompat.widget.e0 r1 = m1725d(r10, r11, r1)
            r7.f1355c = r1
        L_0x0054:
            int r1 = p082e.p083a.C3409j.AppCompatTextHelper_android_drawableRight
            boolean r2 = r13.mo1994s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo1989n(r1, r12)
            androidx.appcompat.widget.e0 r1 = m1725d(r10, r11, r1)
            r7.f1356d = r1
        L_0x0066:
            int r1 = p082e.p083a.C3409j.AppCompatTextHelper_android_drawableBottom
            boolean r2 = r13.mo1994s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo1989n(r1, r12)
            androidx.appcompat.widget.e0 r1 = m1725d(r10, r11, r1)
            r7.f1357e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x00a2
            int r2 = p082e.p083a.C3409j.AppCompatTextHelper_android_drawableStart
            boolean r3 = r13.mo1994s(r2)
            if (r3 == 0) goto L_0x0090
            int r2 = r13.mo1989n(r2, r12)
            androidx.appcompat.widget.e0 r2 = m1725d(r10, r11, r2)
            r7.f1358f = r2
        L_0x0090:
            int r2 = p082e.p083a.C3409j.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r13.mo1994s(r2)
            if (r3 == 0) goto L_0x00a2
            int r2 = r13.mo1989n(r2, r12)
            androidx.appcompat.widget.e0 r2 = m1725d(r10, r11, r2)
            r7.f1359g = r2
        L_0x00a2:
            r13.mo1995w()
            android.widget.TextView r2 = r7.f1353a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011e
            int[] r6 = p082e.p083a.C3409j.TextAppearance
            androidx.appcompat.widget.g0 r0 = androidx.appcompat.widget.C0279g0.m1625t(r10, r0, r6)
            if (r2 != 0) goto L_0x00c9
            int r6 = p082e.p083a.C3409j.TextAppearance_textAllCaps
            boolean r15 = r0.mo1994s(r6)
            if (r15 == 0) goto L_0x00c9
            boolean r6 = r0.mo1976a(r6, r12)
            r15 = 1
            goto L_0x00cb
        L_0x00c9:
            r6 = 0
            r15 = 0
        L_0x00cb:
            r7.m1723B(r10, r0)
            if (r1 >= r5) goto L_0x00f9
            int r4 = p082e.p083a.C3409j.TextAppearance_android_textColor
            boolean r17 = r0.mo1994s(r4)
            if (r17 == 0) goto L_0x00dd
            android.content.res.ColorStateList r4 = r0.mo1978c(r4)
            goto L_0x00de
        L_0x00dd:
            r4 = 0
        L_0x00de:
            int r13 = p082e.p083a.C3409j.TextAppearance_android_textColorHint
            boolean r18 = r0.mo1994s(r13)
            if (r18 == 0) goto L_0x00eb
            android.content.res.ColorStateList r13 = r0.mo1978c(r13)
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            int r14 = p082e.p083a.C3409j.TextAppearance_android_textColorLink
            boolean r19 = r0.mo1994s(r14)
            if (r19 == 0) goto L_0x00fb
            android.content.res.ColorStateList r14 = r0.mo1978c(r14)
            goto L_0x00fc
        L_0x00f9:
            r4 = 0
            r13 = 0
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            int r5 = p082e.p083a.C3409j.TextAppearance_textLocale
            boolean r20 = r0.mo1994s(r5)
            if (r20 == 0) goto L_0x0109
            java.lang.String r5 = r0.mo1990o(r5)
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r1 < r3) goto L_0x0119
            int r3 = p082e.p083a.C3409j.TextAppearance_fontVariationSettings
            boolean r21 = r0.mo1994s(r3)
            if (r21 == 0) goto L_0x0119
            java.lang.String r3 = r0.mo1990o(r3)
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            r0.mo1995w()
            goto L_0x0125
        L_0x011e:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0125:
            int[] r0 = p082e.p083a.C3409j.TextAppearance
            androidx.appcompat.widget.g0 r0 = androidx.appcompat.widget.C0279g0.m1627v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0140
            int r12 = p082e.p083a.C3409j.TextAppearance_textAllCaps
            boolean r22 = r0.mo1994s(r12)
            if (r22 == 0) goto L_0x0140
            r22 = r3
            r3 = 0
            boolean r6 = r0.mo1976a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0144
        L_0x0140:
            r22 = r3
            r3 = 23
        L_0x0144:
            if (r1 >= r3) goto L_0x016a
            int r3 = p082e.p083a.C3409j.TextAppearance_android_textColor
            boolean r12 = r0.mo1994s(r3)
            if (r12 == 0) goto L_0x0152
            android.content.res.ColorStateList r4 = r0.mo1978c(r3)
        L_0x0152:
            int r3 = p082e.p083a.C3409j.TextAppearance_android_textColorHint
            boolean r12 = r0.mo1994s(r3)
            if (r12 == 0) goto L_0x015e
            android.content.res.ColorStateList r13 = r0.mo1978c(r3)
        L_0x015e:
            int r3 = p082e.p083a.C3409j.TextAppearance_android_textColorLink
            boolean r12 = r0.mo1994s(r3)
            if (r12 == 0) goto L_0x016a
            android.content.res.ColorStateList r14 = r0.mo1978c(r3)
        L_0x016a:
            int r3 = p082e.p083a.C3409j.TextAppearance_textLocale
            boolean r12 = r0.mo1994s(r3)
            if (r12 == 0) goto L_0x0176
            java.lang.String r5 = r0.mo1990o(r3)
        L_0x0176:
            r3 = 26
            if (r1 < r3) goto L_0x0187
            int r3 = p082e.p083a.C3409j.TextAppearance_fontVariationSettings
            boolean r12 = r0.mo1994s(r3)
            if (r12 == 0) goto L_0x0187
            java.lang.String r3 = r0.mo1990o(r3)
            goto L_0x0189
        L_0x0187:
            r3 = r22
        L_0x0189:
            r12 = 28
            if (r1 < r12) goto L_0x01a6
            int r12 = p082e.p083a.C3409j.TextAppearance_android_textSize
            boolean r16 = r0.mo1994s(r12)
            if (r16 == 0) goto L_0x01a6
            r16 = r11
            r11 = -1
            int r12 = r0.mo1981f(r12, r11)
            if (r12 != 0) goto L_0x01a8
            android.widget.TextView r11 = r7.f1353a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a8
        L_0x01a6:
            r16 = r11
        L_0x01a8:
            r7.m1723B(r10, r0)
            r0.mo1995w()
            if (r4 == 0) goto L_0x01b5
            android.widget.TextView r0 = r7.f1353a
            r0.setTextColor(r4)
        L_0x01b5:
            if (r13 == 0) goto L_0x01bc
            android.widget.TextView r0 = r7.f1353a
            r0.setHintTextColor(r13)
        L_0x01bc:
            if (r14 == 0) goto L_0x01c3
            android.widget.TextView r0 = r7.f1353a
            r0.setLinkTextColor(r14)
        L_0x01c3:
            if (r2 != 0) goto L_0x01ca
            if (r15 == 0) goto L_0x01ca
            r7.mo2077r(r6)
        L_0x01ca:
            android.graphics.Typeface r0 = r7.f1364l
            if (r0 == 0) goto L_0x01e0
            int r2 = r7.f1363k
            r4 = -1
            if (r2 != r4) goto L_0x01db
            android.widget.TextView r2 = r7.f1353a
            int r4 = r7.f1362j
            r2.setTypeface(r0, r4)
            goto L_0x01e0
        L_0x01db:
            android.widget.TextView r2 = r7.f1353a
            r2.setTypeface(r0)
        L_0x01e0:
            if (r3 == 0) goto L_0x01e7
            android.widget.TextView r0 = r7.f1353a
            r0.setFontVariationSettings(r3)
        L_0x01e7:
            if (r5 == 0) goto L_0x020f
            r0 = 24
            if (r1 < r0) goto L_0x01f7
            android.widget.TextView r0 = r7.f1353a
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r5)
            r0.setTextLocales(r1)
            goto L_0x020f
        L_0x01f7:
            r0 = 21
            if (r1 < r0) goto L_0x020f
            r0 = 44
            int r0 = r5.indexOf(r0)
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            android.widget.TextView r1 = r7.f1353a
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r1.setTextLocale(r0)
        L_0x020f:
            androidx.appcompat.widget.m r0 = r7.f1361i
            r1 = r24
            r0.mo2097t(r1, r9)
            boolean r0 = androidx.core.widget.C0548d.f2816a
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.m r0 = r7.f1361i
            int r0 = r0.mo2094n()
            if (r0 == 0) goto L_0x0257
            androidx.appcompat.widget.m r0 = r7.f1361i
            int[] r0 = r0.mo2093m()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0257
            android.widget.TextView r2 = r7.f1353a
            int r2 = r2.getAutoSizeStepGranularity()
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0251
            android.widget.TextView r0 = r7.f1353a
            androidx.appcompat.widget.m r2 = r7.f1361i
            int r2 = r2.mo2091k()
            androidx.appcompat.widget.m r3 = r7.f1361i
            int r3 = r3.mo2090j()
            androidx.appcompat.widget.m r4 = r7.f1361i
            int r4 = r4.mo2092l()
            r5 = 0
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x0257
        L_0x0251:
            r5 = 0
            android.widget.TextView r2 = r7.f1353a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r0, r5)
        L_0x0257:
            int[] r0 = p082e.p083a.C3409j.AppCompatTextView
            androidx.appcompat.widget.g0 r8 = androidx.appcompat.widget.C0279g0.m1626u(r10, r1, r0)
            int r0 = p082e.p083a.C3409j.AppCompatTextView_drawableLeftCompat
            r1 = -1
            int r0 = r8.mo1989n(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x026e
            android.graphics.drawable.Drawable r0 = r2.mo1966c(r10, r0)
            r3 = r0
            goto L_0x026f
        L_0x026e:
            r3 = 0
        L_0x026f:
            int r0 = p082e.p083a.C3409j.AppCompatTextView_drawableTopCompat
            int r0 = r8.mo1989n(r0, r1)
            if (r0 == r1) goto L_0x027d
            android.graphics.drawable.Drawable r0 = r2.mo1966c(r10, r0)
            r4 = r0
            goto L_0x027e
        L_0x027d:
            r4 = 0
        L_0x027e:
            int r0 = p082e.p083a.C3409j.AppCompatTextView_drawableRightCompat
            int r0 = r8.mo1989n(r0, r1)
            if (r0 == r1) goto L_0x028c
            android.graphics.drawable.Drawable r0 = r2.mo1966c(r10, r0)
            r5 = r0
            goto L_0x028d
        L_0x028c:
            r5 = 0
        L_0x028d:
            int r0 = p082e.p083a.C3409j.AppCompatTextView_drawableBottomCompat
            int r0 = r8.mo1989n(r0, r1)
            if (r0 == r1) goto L_0x029b
            android.graphics.drawable.Drawable r0 = r2.mo1966c(r10, r0)
            r6 = r0
            goto L_0x029c
        L_0x029b:
            r6 = 0
        L_0x029c:
            int r0 = p082e.p083a.C3409j.AppCompatTextView_drawableStartCompat
            int r0 = r8.mo1989n(r0, r1)
            if (r0 == r1) goto L_0x02aa
            android.graphics.drawable.Drawable r0 = r2.mo1966c(r10, r0)
            r9 = r0
            goto L_0x02ab
        L_0x02aa:
            r9 = 0
        L_0x02ab:
            int r0 = p082e.p083a.C3409j.AppCompatTextView_drawableEndCompat
            int r0 = r8.mo1989n(r0, r1)
            if (r0 == r1) goto L_0x02b9
            android.graphics.drawable.Drawable r0 = r2.mo1966c(r10, r0)
            r10 = r0
            goto L_0x02ba
        L_0x02b9:
            r10 = 0
        L_0x02ba:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.m1726x(r1, r2, r3, r4, r5, r6)
            int r0 = p082e.p083a.C3409j.AppCompatTextView_drawableTint
            boolean r1 = r8.mo1994s(r0)
            if (r1 == 0) goto L_0x02d6
            android.content.res.ColorStateList r0 = r8.mo1978c(r0)
            android.widget.TextView r1 = r7.f1353a
            androidx.core.widget.C0556l.m3428j(r1, r0)
        L_0x02d6:
            int r0 = p082e.p083a.C3409j.AppCompatTextView_drawableTintMode
            boolean r1 = r8.mo1994s(r0)
            if (r1 == 0) goto L_0x02ee
            r1 = -1
            int r0 = r8.mo1986k(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0303p.m1832e(r0, r2)
            android.widget.TextView r2 = r7.f1353a
            androidx.core.widget.C0556l.m3429k(r2, r0)
            goto L_0x02ef
        L_0x02ee:
            r1 = -1
        L_0x02ef:
            int r0 = p082e.p083a.C3409j.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.mo1981f(r0, r1)
            int r2 = p082e.p083a.C3409j.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r8.mo1981f(r2, r1)
            int r3 = p082e.p083a.C3409j.AppCompatTextView_lineHeight
            int r3 = r8.mo1981f(r3, r1)
            r8.mo1995w()
            if (r0 == r1) goto L_0x030b
            android.widget.TextView r4 = r7.f1353a
            androidx.core.widget.C0556l.m3431m(r4, r0)
        L_0x030b:
            if (r2 == r1) goto L_0x0312
            android.widget.TextView r0 = r7.f1353a
            androidx.core.widget.C0556l.m3432n(r0, r2)
        L_0x0312:
            if (r3 == r1) goto L_0x0319
            android.widget.TextView r0 = r7.f1353a
            androidx.core.widget.C0556l.m3433o(r0, r3)
        L_0x0319:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0292l.mo2072m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2073n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1365m) {
            this.f1364l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1362j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2074o(boolean z, int i, int i2, int i3, int i4) {
        if (!C0548d.f2816a) {
            mo2063c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2075p() {
        mo2062b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2076q(Context context, int i) {
        String o;
        ColorStateList c;
        C0279g0 t = C0279g0.m1625t(context, i, C3409j.TextAppearance);
        int i2 = C3409j.TextAppearance_textAllCaps;
        if (t.mo1994s(i2)) {
            mo2077r(t.mo1976a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C3409j.TextAppearance_android_textColor;
            if (t.mo1994s(i4) && (c = t.mo1978c(i4)) != null) {
                this.f1353a.setTextColor(c);
            }
        }
        int i5 = C3409j.TextAppearance_android_textSize;
        if (t.mo1994s(i5) && t.mo1981f(i5, -1) == 0) {
            this.f1353a.setTextSize(0, 0.0f);
        }
        m1723B(context, t);
        if (i3 >= 26) {
            int i6 = C3409j.TextAppearance_fontVariationSettings;
            if (t.mo1994s(i6) && (o = t.mo1990o(i6)) != null) {
                this.f1353a.setFontVariationSettings(o);
            }
        }
        t.mo1995w();
        Typeface typeface = this.f1364l;
        if (typeface != null) {
            this.f1353a.setTypeface(typeface, this.f1362j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2077r(boolean z) {
        this.f1353a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2078s(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1361i.mo2098u(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2079t(int[] iArr, int i) throws IllegalArgumentException {
        this.f1361i.mo2099v(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2080u(int i) {
        this.f1361i.mo2100w(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2081v(ColorStateList colorStateList) {
        if (this.f1360h == null) {
            this.f1360h = new C0274e0();
        }
        C0274e0 e0Var = this.f1360h;
        e0Var.f1279a = colorStateList;
        e0Var.f1282d = colorStateList != null;
        m1727y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2082w(PorterDuff.Mode mode) {
        if (this.f1360h == null) {
            this.f1360h = new C0274e0();
        }
        C0274e0 e0Var = this.f1360h;
        e0Var.f1280b = mode;
        e0Var.f1281c = mode != null;
        m1727y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo2083z(int i, float f) {
        if (!C0548d.f2816a && !mo2071l()) {
            m1722A(i, f);
        }
    }
}
