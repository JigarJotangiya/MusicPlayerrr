package com.airbnb.lottie.p023w;

import android.util.Pair;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.C1465e;
import com.airbnb.lottie.C1494l;
import com.airbnb.lottie.p026y.C1679d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.w.h */
/* compiled from: NetworkFetcher */
public class C1627h {

    /* renamed from: a */
    private final C1626g f6223a;

    /* renamed from: b */
    private final C1625f f6224b;

    public C1627h(C1626g gVar, C1625f fVar) {
        this.f6223a = gVar;
        this.f6224b = fVar;
    }

    /* renamed from: a */
    private C1464d m8252a(String str, String str2) {
        Pair<C1622c, InputStream> a;
        C1494l<C1464d> lVar;
        if (str2 == null || (a = this.f6223a.mo7407a(str)) == null) {
            return null;
        }
        C1622c cVar = (C1622c) a.first;
        InputStream inputStream = (InputStream) a.second;
        if (cVar == C1622c.ZIP) {
            lVar = C1465e.m7648s(new ZipInputStream(inputStream), str);
        } else {
            lVar = C1465e.m7638i(inputStream, str);
        }
        if (lVar.mo7118b() != null) {
            return lVar.mo7118b();
        }
        return null;
    }

    /* renamed from: b */
    private C1494l<C1464d> m8253b(String str, String str2) {
        C1679d.m8414a("Fetching " + str);
        C1623d dVar = null;
        try {
            dVar = this.f6224b.mo7404a(str);
            if (dVar.mo7403q0()) {
                C1494l<C1464d> d = m8254d(str, dVar.mo7400c0(), dVar.contentType(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(d.mo7118b() != null);
                C1679d.m8414a(sb.toString());
                if (dVar != null) {
                    try {
                        dVar.close();
                    } catch (IOException e) {
                        C1679d.m8417d("LottieFetchResult close failed ", e);
                    }
                }
                return d;
            }
            C1494l<C1464d> lVar = new C1494l<>((Throwable) new IllegalArgumentException(dVar.mo7399W()));
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e2) {
                    C1679d.m8417d("LottieFetchResult close failed ", e2);
                }
            }
            return lVar;
        } catch (Exception e3) {
            C1494l<C1464d> lVar2 = new C1494l<>((Throwable) e3);
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e4) {
                    C1679d.m8417d("LottieFetchResult close failed ", e4);
                }
            }
            return lVar2;
        } catch (Throwable th) {
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e5) {
                    C1679d.m8417d("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    private C1494l<C1464d> m8254d(String str, InputStream inputStream, String str2, String str3) throws IOException {
        C1622c cVar;
        C1494l<C1464d> lVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            C1679d.m8414a("Handling zip response.");
            cVar = C1622c.ZIP;
            lVar = m8256f(str, inputStream, str3);
        } else {
            C1679d.m8414a("Received json response.");
            cVar = C1622c.JSON;
            lVar = m8255e(str, inputStream, str3);
        }
        if (!(str3 == null || lVar.mo7118b() == null)) {
            this.f6223a.mo7408e(str, cVar);
        }
        return lVar;
    }

    /* renamed from: e */
    private C1494l<C1464d> m8255e(String str, InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return C1465e.m7638i(inputStream, (String) null);
        }
        return C1465e.m7638i(new FileInputStream(new File(this.f6223a.mo7409f(str, inputStream, C1622c.JSON).getAbsolutePath())), str);
    }

    /* renamed from: f */
    private C1494l<C1464d> m8256f(String str, InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return C1465e.m7648s(new ZipInputStream(inputStream), (String) null);
        }
        return C1465e.m7648s(new ZipInputStream(new FileInputStream(this.f6223a.mo7409f(str, inputStream, C1622c.ZIP))), str);
    }

    /* renamed from: c */
    public C1494l<C1464d> mo7410c(String str, String str2) {
        C1464d a = m8252a(str, str2);
        if (a != null) {
            return new C1494l<>(a);
        }
        C1679d.m8414a("Animation for " + str + " not found in cache. Fetching from network.");
        return m8253b(str, str2);
    }
}
