package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;
import p159f.p243f.p245b.p318c.p319a.p323d.C7634g;

/* renamed from: com.google.android.play.core.assetpacks.q0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6405q0 {

    /* renamed from: a */
    private final C7620y<C6347e4> f29608a;

    C6405q0(C7620y<C6347e4> yVar) {
        this.f29608a = yVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final InputStream mo25352a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C7634g.m42448a(this.f29608a.zza().mo25229b(i, str, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new C6361h1(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new C6361h1(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new C6361h1("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
