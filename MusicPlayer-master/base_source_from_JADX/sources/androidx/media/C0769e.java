package androidx.media;

import android.text.TextUtils;
import p082e.p109h.p118o.C3698d;

/* renamed from: androidx.media.e */
/* compiled from: MediaSessionManagerImplBase */
class C0769e implements C0767c {

    /* renamed from: a */
    private String f3459a;

    /* renamed from: b */
    private int f3460b;

    /* renamed from: c */
    private int f3461c;

    C0769e(String str, int i, int i2) {
        this.f3459a = str;
        this.f3460b = i;
        this.f3461c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0769e)) {
            return false;
        }
        C0769e eVar = (C0769e) obj;
        if (this.f3460b < 0 || eVar.f3460b < 0) {
            if (!TextUtils.equals(this.f3459a, eVar.f3459a) || this.f3461c != eVar.f3461c) {
                return false;
            }
            return true;
        } else if (TextUtils.equals(this.f3459a, eVar.f3459a) && this.f3460b == eVar.f3460b && this.f3461c == eVar.f3461c) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return C3698d.m15815b(this.f3459a, Integer.valueOf(this.f3461c));
    }
}
