package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ej */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5042ej {

    /* renamed from: a */
    private final C5447pg[] f15978a;

    /* renamed from: b */
    private final C5484qg f15979b;

    /* renamed from: c */
    private C5447pg f15980c;

    public C5042ej(C5447pg[] pgVarArr, C5484qg qgVar) {
        this.f15978a = pgVarArr;
        this.f15979b = qgVar;
    }

    /* renamed from: a */
    public final void mo17194a() {
        if (this.f15980c != null) {
            this.f15980c = null;
        }
    }

    /* renamed from: b */
    public final C5447pg mo17195b(C5410og ogVar, Uri uri) throws IOException, InterruptedException {
        C5447pg pgVar = this.f15980c;
        if (pgVar != null) {
            return pgVar;
        }
        C5447pg[] pgVarArr = this.f15978a;
        int length = pgVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C5447pg pgVar2 = pgVarArr[i];
            try {
                if (pgVar2.mo17912c(ogVar)) {
                    this.f15980c = pgVar2;
                    ogVar.mo19985e();
                    break;
                }
                ogVar.mo19985e();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                ogVar.mo19985e();
                throw th;
            }
        }
        C5447pg pgVar3 = this.f15980c;
        if (pgVar3 != null) {
            pgVar3.mo17913d(this.f15979b);
            return this.f15980c;
        }
        String k = C4934bm.m21441k(this.f15978a);
        StringBuilder sb = new StringBuilder(k.length() + 58);
        sb.append("None of the available extractors (");
        sb.append(k);
        sb.append(") could read the stream.");
        throw new C5006dk(sb.toString(), uri);
    }
}
