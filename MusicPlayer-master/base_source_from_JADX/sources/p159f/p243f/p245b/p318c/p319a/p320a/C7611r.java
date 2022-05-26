package p159f.p243f.p245b.p318c.p319a.p320a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import java.util.Arrays;

/* renamed from: f.f.b.c.a.a.r */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7611r {

    /* renamed from: a */
    private static final C7577a f32976a = new C7577a("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m42411a(Context context) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        return packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending");
    }

    /* renamed from: b */
    public static boolean m42412b(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (r0 = signatureArr.length) == 0) {
                    f32976a.mo28578e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                } else {
                    for (Signature byteArray : signatureArr) {
                        String a = C7609q.m42409a(byteArray.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a)) {
                            return true;
                        }
                        if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
