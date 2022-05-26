package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.s5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C5547s5<T> implements Comparable<C5547s5<T>> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5029e6 f23333g;

    /* renamed from: h */
    private final int f23334h;

    /* renamed from: i */
    private final String f23335i;

    /* renamed from: j */
    private final int f23336j;

    /* renamed from: k */
    private final Object f23337k;

    /* renamed from: l */
    private final C5695w5 f23338l;

    /* renamed from: m */
    private Integer f23339m;

    /* renamed from: n */
    private C5658v5 f23340n;

    /* renamed from: o */
    private boolean f23341o;

    /* renamed from: p */
    private C4917b5 f23342p;

    /* renamed from: q */
    private C5510r5 f23343q;

    /* renamed from: r */
    private final C5103g5 f23344r;

    public C5547s5(int i, String str, C5695w5 w5Var) {
        Uri parse;
        String host;
        this.f23333g = C5029e6.f15873c ? new C5029e6() : null;
        this.f23337k = new Object();
        int i2 = 0;
        this.f23341o = false;
        this.f23342p = null;
        this.f23334h = i;
        this.f23335i = str;
        this.f23338l = w5Var;
        this.f23344r = new C5103g5();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.f23336j = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo20772A(int i) {
        C5658v5 v5Var = this.f23340n;
        if (v5Var != null) {
            v5Var.mo21429c(this, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo20773B(C5510r5 r5Var) {
        synchronized (this.f23337k) {
            this.f23343q = r5Var;
        }
    }

    /* renamed from: C */
    public final boolean mo20774C() {
        boolean z;
        synchronized (this.f23337k) {
            z = this.f23341o;
        }
        return z;
    }

    /* renamed from: D */
    public final boolean mo20775D() {
        synchronized (this.f23337k) {
        }
        return false;
    }

    /* renamed from: E */
    public byte[] mo11056E() throws C4880a5 {
        return null;
    }

    /* renamed from: F */
    public final C5103g5 mo20776F() {
        return this.f23344r;
    }

    /* renamed from: c */
    public final int mo20777c() {
        return this.f23344r.mo17859b();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f23339m.intValue() - ((C5547s5) obj).f23339m.intValue();
    }

    /* renamed from: d */
    public final int mo20779d() {
        return this.f23336j;
    }

    /* renamed from: h */
    public final C4917b5 mo20780h() {
        return this.f23342p;
    }

    /* renamed from: j */
    public final C5547s5<?> mo20781j(C4917b5 b5Var) {
        this.f23342p = b5Var;
        return this;
    }

    /* renamed from: k */
    public final C5547s5<?> mo20782k(C5658v5 v5Var) {
        this.f23340n = v5Var;
        return this;
    }

    /* renamed from: l */
    public final C5547s5<?> mo20783l(int i) {
        this.f23339m = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract C5769y5<T> mo11106o(C5399o5 o5Var);

    /* renamed from: q */
    public final String mo20784q() {
        String str = this.f23335i;
        if (this.f23334h == 0) {
            return str;
        }
        String num = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: r */
    public final String mo20785r() {
        return this.f23335i;
    }

    /* renamed from: s */
    public Map<String, String> mo11058s() throws C4880a5 {
        return Collections.emptyMap();
    }

    /* renamed from: t */
    public final void mo20786t(String str) {
        if (C5029e6.f15873c) {
            this.f23333g.mo17125a(str, Thread.currentThread().getId());
        }
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(Integer.toHexString(this.f23336j));
        if (valueOf.length() != 0) {
            str = "0x".concat(valueOf);
        } else {
            str = new String("0x");
        }
        mo20775D();
        String str2 = this.f23335i;
        String valueOf2 = String.valueOf(this.f23339m);
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 7 + String.valueOf(str).length() + 6 + String.valueOf(valueOf2).length());
        sb.append("[ ] ");
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        sb.append(" NORMAL ");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo20788u(C4955c6 c6Var) {
        C5695w5 w5Var;
        synchronized (this.f23337k) {
            w5Var = this.f23338l;
        }
        if (w5Var != null) {
            w5Var.mo11054a(c6Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo11059v(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo20789w(String str) {
        C5658v5 v5Var = this.f23340n;
        if (v5Var != null) {
            v5Var.mo21428b(this);
        }
        if (C5029e6.f15873c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C5473q5(this, str, id));
                return;
            }
            this.f23333g.mo17125a(str, id);
            this.f23333g.mo17126b(toString());
        }
    }

    /* renamed from: x */
    public final void mo20790x() {
        synchronized (this.f23337k) {
            this.f23341o = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo20791y() {
        C5510r5 r5Var;
        synchronized (this.f23337k) {
            r5Var = this.f23343q;
        }
        if (r5Var != null) {
            r5Var.mo17864a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo20792z(C5769y5<?> y5Var) {
        C5510r5 r5Var;
        synchronized (this.f23337k) {
            r5Var = this.f23343q;
        }
        if (r5Var != null) {
            r5Var.mo17865b(this, y5Var);
        }
    }

    public final int zza() {
        return this.f23334h;
    }
}
