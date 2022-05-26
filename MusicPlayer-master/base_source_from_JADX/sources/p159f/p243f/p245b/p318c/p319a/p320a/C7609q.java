package p159f.p243f.p245b.p318c.p319a.p320a;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.f.b.c.a.a.q */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7609q {
    /* renamed from: a */
    public static String m42409a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
