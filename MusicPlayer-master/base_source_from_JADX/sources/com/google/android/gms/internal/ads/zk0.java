package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.C3359d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zk0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3359d f26799a;

    /* renamed from: b */
    private final jl0 f26800b;

    /* renamed from: c */
    private final LinkedList<yk0> f26801c;

    /* renamed from: d */
    private final Object f26802d = new Object();

    /* renamed from: e */
    private final String f26803e;

    /* renamed from: f */
    private final String f26804f;

    /* renamed from: g */
    private long f26805g = -1;

    /* renamed from: h */
    private long f26806h = -1;

    /* renamed from: i */
    private long f26807i = 0;

    /* renamed from: j */
    private long f26808j = -1;

    /* renamed from: k */
    private long f26809k = -1;

    zk0(C3359d dVar, jl0 jl0, String str, String str2) {
        this.f26799a = dVar;
        this.f26800b = jl0;
        this.f26803e = str;
        this.f26804f = str2;
        this.f26801c = new LinkedList<>();
    }

    /* renamed from: a */
    public final Bundle mo22372a() {
        Bundle bundle;
        synchronized (this.f26802d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f26803e);
            bundle.putString("slotid", this.f26804f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f26808j);
            bundle.putLong("tresponse", this.f26809k);
            bundle.putLong("timp", this.f26805g);
            bundle.putLong("tload", this.f26806h);
            bundle.putLong("pcc", this.f26807i);
            bundle.putLong("tfetch", -1);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f26801c.iterator();
            while (it.hasNext()) {
                arrayList.add(((yk0) it.next()).mo22213b());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    public final String mo22373c() {
        return this.f26803e;
    }

    /* renamed from: d */
    public final void mo22374d() {
        synchronized (this.f26802d) {
            if (this.f26809k != -1) {
                yk0 yk0 = new yk0(this);
                yk0.mo22215d();
                this.f26801c.add(yk0);
                this.f26807i++;
                this.f26800b.mo18654c();
                this.f26800b.mo18653b(this);
            }
        }
    }

    /* renamed from: e */
    public final void mo22375e() {
        synchronized (this.f26802d) {
            if (this.f26809k != -1 && !this.f26801c.isEmpty()) {
                yk0 last = this.f26801c.getLast();
                if (last.mo22212a() == -1) {
                    last.mo22214c();
                    this.f26800b.mo18653b(this);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo22376f() {
        synchronized (this.f26802d) {
            if (this.f26809k != -1 && this.f26805g == -1) {
                this.f26805g = this.f26799a.mo11989b();
                this.f26800b.mo18653b(this);
            }
            this.f26800b.mo18655d();
        }
    }

    /* renamed from: g */
    public final void mo22377g() {
        synchronized (this.f26802d) {
            this.f26800b.mo18656e();
        }
    }

    /* renamed from: h */
    public final void mo22378h(boolean z) {
        synchronized (this.f26802d) {
            if (this.f26809k != -1) {
                this.f26806h = this.f26799a.mo11989b();
            }
        }
    }

    /* renamed from: i */
    public final void mo22379i() {
        synchronized (this.f26802d) {
            this.f26800b.mo18657f();
        }
    }

    /* renamed from: j */
    public final void mo22380j(zzbfd zzbfd) {
        synchronized (this.f26802d) {
            long b = this.f26799a.mo11989b();
            this.f26808j = b;
            this.f26800b.mo18658g(zzbfd, b);
        }
    }

    /* renamed from: k */
    public final void mo22381k(long j) {
        synchronized (this.f26802d) {
            this.f26809k = j;
            if (j != -1) {
                this.f26800b.mo18653b(this);
            }
        }
    }
}
