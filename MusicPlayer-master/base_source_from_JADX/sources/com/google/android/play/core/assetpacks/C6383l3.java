package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;

/* renamed from: com.google.android.play.core.assetpacks.l3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6383l3 {

    /* renamed from: b */
    private static final C7577a f29566b = new C7577a("VerifySliceTaskHandler");

    /* renamed from: a */
    private final C6355g0 f29567a;

    C6383l3(C6355g0 g0Var) {
        this.f29567a = g0Var;
    }

    /* renamed from: b */
    private final void m37718b(C6378k3 k3Var, File file) {
        try {
            File B = this.f29567a.mo25241B(k3Var.f29410b, k3Var.f29548c, k3Var.f29549d, k3Var.f29550e);
            if (B.exists()) {
                try {
                    if (C6377k2.m37703a(C6373j3.m37697a(file, B)).equals(k3Var.f29551f)) {
                        f29566b.mo28577d("Verification of slice %s of pack %s successful.", k3Var.f29550e, k3Var.f29410b);
                        return;
                    }
                    throw new C6361h1(String.format("Verification failed for slice %s.", new Object[]{k3Var.f29550e}), k3Var.f29409a);
                } catch (NoSuchAlgorithmException e) {
                    throw new C6361h1("SHA256 algorithm not supported.", e, k3Var.f29409a);
                } catch (IOException e2) {
                    throw new C6361h1(String.format("Could not digest file during verification for slice %s.", new Object[]{k3Var.f29550e}), e2, k3Var.f29409a);
                }
            } else {
                throw new C6361h1(String.format("Cannot find metadata files for slice %s.", new Object[]{k3Var.f29550e}), k3Var.f29409a);
            }
        } catch (IOException e3) {
            throw new C6361h1(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{k3Var.f29550e}), e3, k3Var.f29409a);
        }
    }

    /* renamed from: a */
    public final void mo25313a(C6378k3 k3Var) {
        File C = this.f29567a.mo25242C(k3Var.f29410b, k3Var.f29548c, k3Var.f29549d, k3Var.f29550e);
        if (C.exists()) {
            m37718b(k3Var, C);
            File D = this.f29567a.mo25243D(k3Var.f29410b, k3Var.f29548c, k3Var.f29549d, k3Var.f29550e);
            if (!D.exists()) {
                D.mkdirs();
            }
            if (!C.renameTo(D)) {
                throw new C6361h1(String.format("Failed to move slice %s after verification.", new Object[]{k3Var.f29550e}), k3Var.f29409a);
            }
            return;
        }
        throw new C6361h1(String.format("Cannot find unverified files for slice %s.", new Object[]{k3Var.f29550e}), k3Var.f29409a);
    }
}
