package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: androidx.media.b */
/* compiled from: MediaSessionManager */
public final class C0766b {

    /* renamed from: a */
    C0767c f3458a;

    public C0766b(String str, int i, int i2) {
        Objects.requireNonNull(str, "package shouldn't be null");
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f3458a = new C0768d(str, i, i2);
        } else {
            this.f3458a = new C0769e(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0766b)) {
            return false;
        }
        return this.f3458a.equals(((C0766b) obj).f3458a);
    }

    public int hashCode() {
        return this.f3458a.hashCode();
    }

    public C0766b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String a = C0768d.m4426a(remoteUserInfo);
        Objects.requireNonNull(a, "package shouldn't be null");
        if (!TextUtils.isEmpty(a)) {
            this.f3458a = new C0768d(remoteUserInfo);
            return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
}
