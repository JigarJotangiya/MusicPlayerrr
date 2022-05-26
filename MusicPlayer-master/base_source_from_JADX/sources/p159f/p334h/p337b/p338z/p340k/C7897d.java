package p159f.p334h.p337b.p338z.p340k;

import p394k.C8638h;

/* renamed from: f.h.b.z.k.d */
/* compiled from: Header */
public final class C7897d {

    /* renamed from: d */
    public static final C8638h f33501d = C8638h.encodeUtf8(":status");

    /* renamed from: e */
    public static final C8638h f33502e = C8638h.encodeUtf8(":method");

    /* renamed from: f */
    public static final C8638h f33503f = C8638h.encodeUtf8(":path");

    /* renamed from: g */
    public static final C8638h f33504g = C8638h.encodeUtf8(":scheme");

    /* renamed from: h */
    public static final C8638h f33505h = C8638h.encodeUtf8(":authority");

    /* renamed from: i */
    public static final C8638h f33506i = C8638h.encodeUtf8(":host");

    /* renamed from: j */
    public static final C8638h f33507j = C8638h.encodeUtf8(":version");

    /* renamed from: a */
    public final C8638h f33508a;

    /* renamed from: b */
    public final C8638h f33509b;

    /* renamed from: c */
    final int f33510c;

    public C7897d(String str, String str2) {
        this(C8638h.encodeUtf8(str), C8638h.encodeUtf8(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7897d)) {
            return false;
        }
        C7897d dVar = (C7897d) obj;
        if (!this.f33508a.equals(dVar.f33508a) || !this.f33509b.equals(dVar.f33509b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f33508a.hashCode()) * 31) + this.f33509b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f33508a.utf8(), this.f33509b.utf8()});
    }

    public C7897d(C8638h hVar, String str) {
        this(hVar, C8638h.encodeUtf8(str));
    }

    public C7897d(C8638h hVar, C8638h hVar2) {
        this.f33508a = hVar;
        this.f33509b = hVar2;
        this.f33510c = hVar.size() + 32 + hVar2.size();
    }
}
