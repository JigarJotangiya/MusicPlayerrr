package com.bumptech.glide.p050r;

import android.content.Context;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.p051s.C2194k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.r.a */
/* compiled from: AndroidResourceSignature */
public final class C2175a implements C1786g {

    /* renamed from: b */
    private final int f7410b;

    /* renamed from: c */
    private final C1786g f7411c;

    private C2175a(int i, C1786g gVar) {
        this.f7410b = i;
        this.f7411c = gVar;
    }

    /* renamed from: c */
    public static C1786g m10226c(Context context) {
        return new C2175a(context.getResources().getConfiguration().uiMode & 48, C2176b.m10230c(context));
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        this.f7411c.mo7735a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7410b).array());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2175a)) {
            return false;
        }
        C2175a aVar = (C2175a) obj;
        if (this.f7410b != aVar.f7410b || !this.f7411c.equals(aVar.f7411c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2194k.m10285o(this.f7411c, this.f7410b);
    }
}
