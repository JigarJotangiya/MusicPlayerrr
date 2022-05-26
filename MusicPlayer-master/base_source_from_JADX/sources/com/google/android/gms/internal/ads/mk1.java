package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p082e.p098e.C3478g;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mk1 {

    /* renamed from: h */
    public static final mk1 f20062h = new mk1(new kk1());

    /* renamed from: a */
    private final q30 f20063a;

    /* renamed from: b */
    private final n30 f20064b;

    /* renamed from: c */
    private final d40 f20065c;

    /* renamed from: d */
    private final a40 f20066d;

    /* renamed from: e */
    private final b80 f20067e;

    /* renamed from: f */
    private final C3478g<String, w30> f20068f;

    /* renamed from: g */
    private final C3478g<String, t30> f20069g;

    private mk1(kk1 kk1) {
        this.f20063a = kk1.f18898a;
        this.f20064b = kk1.f18899b;
        this.f20065c = kk1.f18900c;
        this.f20068f = new C3478g<>(kk1.f18903f);
        this.f20069g = new C3478g<>(kk1.f18904g);
        this.f20066d = kk1.f18901d;
        this.f20067e = kk1.f18902e;
    }

    /* renamed from: a */
    public final n30 mo19401a() {
        return this.f20064b;
    }

    /* renamed from: b */
    public final q30 mo19402b() {
        return this.f20063a;
    }

    /* renamed from: c */
    public final t30 mo19403c(String str) {
        return this.f20069g.get(str);
    }

    /* renamed from: d */
    public final w30 mo19404d(String str) {
        return this.f20068f.get(str);
    }

    /* renamed from: e */
    public final a40 mo19405e() {
        return this.f20066d;
    }

    /* renamed from: f */
    public final d40 mo19406f() {
        return this.f20065c;
    }

    /* renamed from: g */
    public final b80 mo19407g() {
        return this.f20067e;
    }

    /* renamed from: h */
    public final ArrayList<String> mo19408h() {
        ArrayList<String> arrayList = new ArrayList<>(this.f20068f.size());
        for (int i = 0; i < this.f20068f.size(); i++) {
            arrayList.add(this.f20068f.mo12395i(i));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final ArrayList<String> mo19409i() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f20065c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f20063a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f20064b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f20068f.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f20067e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
