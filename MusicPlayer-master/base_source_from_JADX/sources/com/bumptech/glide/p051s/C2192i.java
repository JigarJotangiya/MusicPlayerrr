package com.bumptech.glide.p051s;

/* renamed from: com.bumptech.glide.s.i */
/* compiled from: MultiClassKey */
public class C2192i {

    /* renamed from: a */
    private Class<?> f7436a;

    /* renamed from: b */
    private Class<?> f7437b;

    /* renamed from: c */
    private Class<?> f7438c;

    public C2192i() {
    }

    /* renamed from: a */
    public void mo8505a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f7436a = cls;
        this.f7437b = cls2;
        this.f7438c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2192i.class != obj.getClass()) {
            return false;
        }
        C2192i iVar = (C2192i) obj;
        return this.f7436a.equals(iVar.f7436a) && this.f7437b.equals(iVar.f7437b) && C2194k.m10274d(this.f7438c, iVar.f7438c);
    }

    public int hashCode() {
        int hashCode = ((this.f7436a.hashCode() * 31) + this.f7437b.hashCode()) * 31;
        Class<?> cls = this.f7438c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f7436a + ", second=" + this.f7437b + '}';
    }

    public C2192i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo8505a(cls, cls2, cls3);
    }
}
