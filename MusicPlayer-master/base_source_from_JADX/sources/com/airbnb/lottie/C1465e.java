package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.p019v.C1562g;
import com.airbnb.lottie.p024x.C1672w;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p026y.C1679d;
import com.airbnb.lottie.p026y.C1683h;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p394k.C8637g;
import p394k.C8645n;

/* renamed from: com.airbnb.lottie.e */
/* compiled from: LottieCompositionFactory */
public class C1465e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Map<String, C1495m<C1464d>> f5638a = new HashMap();

    /* renamed from: b */
    private static final byte[] f5639b = {80, 75, 3, 4};

    /* renamed from: com.airbnb.lottie.e$a */
    /* compiled from: LottieCompositionFactory */
    class C1466a implements C1490h<C1464d> {

        /* renamed from: a */
        final /* synthetic */ String f5640a;

        C1466a(String str) {
            this.f5640a = str;
        }

        /* renamed from: b */
        public void mo6989a(C1464d dVar) {
            C1465e.f5638a.remove(this.f5640a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$b */
    /* compiled from: LottieCompositionFactory */
    class C1467b implements C1490h<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f5641a;

        C1467b(String str) {
            this.f5641a = str;
        }

        /* renamed from: b */
        public void mo6989a(Throwable th) {
            C1465e.f5638a.remove(this.f5641a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$c */
    /* compiled from: LottieCompositionFactory */
    class C1468c implements Callable<C1494l<C1464d>> {

        /* renamed from: a */
        final /* synthetic */ Context f5642a;

        /* renamed from: b */
        final /* synthetic */ String f5643b;

        /* renamed from: c */
        final /* synthetic */ String f5644c;

        C1468c(Context context, String str, String str2) {
            this.f5642a = context;
            this.f5643b = str;
            this.f5644c = str2;
        }

        /* renamed from: a */
        public C1494l<C1464d> call() {
            C1494l<C1464d> c = C1462c.m7606d(this.f5642a).mo7410c(this.f5643b, this.f5644c);
            if (!(this.f5644c == null || c.mo7118b() == null)) {
                C1562g.m7993b().mo7239c(this.f5644c, c.mo7118b());
            }
            return c;
        }
    }

    /* renamed from: com.airbnb.lottie.e$d */
    /* compiled from: LottieCompositionFactory */
    class C1469d implements Callable<C1494l<C1464d>> {

        /* renamed from: a */
        final /* synthetic */ Context f5645a;

        /* renamed from: b */
        final /* synthetic */ String f5646b;

        /* renamed from: c */
        final /* synthetic */ String f5647c;

        C1469d(Context context, String str, String str2) {
            this.f5645a = context;
            this.f5646b = str;
            this.f5647c = str2;
        }

        /* renamed from: a */
        public C1494l<C1464d> call() {
            return C1465e.m7636g(this.f5645a, this.f5646b, this.f5647c);
        }
    }

    /* renamed from: com.airbnb.lottie.e$e */
    /* compiled from: LottieCompositionFactory */
    class C1470e implements Callable<C1494l<C1464d>> {

        /* renamed from: a */
        final /* synthetic */ WeakReference f5648a;

        /* renamed from: b */
        final /* synthetic */ Context f5649b;

        /* renamed from: c */
        final /* synthetic */ int f5650c;

        /* renamed from: d */
        final /* synthetic */ String f5651d;

        C1470e(WeakReference weakReference, Context context, int i, String str) {
            this.f5648a = weakReference;
            this.f5649b = context;
            this.f5650c = i;
            this.f5651d = str;
        }

        /* renamed from: a */
        public C1494l<C1464d> call() {
            Context context = (Context) this.f5648a.get();
            if (context == null) {
                context = this.f5649b;
            }
            return C1465e.m7645p(context, this.f5650c, this.f5651d);
        }
    }

    /* renamed from: com.airbnb.lottie.e$f */
    /* compiled from: LottieCompositionFactory */
    class C1471f implements Callable<C1494l<C1464d>> {

        /* renamed from: a */
        final /* synthetic */ InputStream f5652a;

        /* renamed from: b */
        final /* synthetic */ String f5653b;

        C1471f(InputStream inputStream, String str) {
            this.f5652a = inputStream;
            this.f5653b = str;
        }

        /* renamed from: a */
        public C1494l<C1464d> call() {
            return C1465e.m7638i(this.f5652a, this.f5653b);
        }
    }

    /* renamed from: com.airbnb.lottie.e$g */
    /* compiled from: LottieCompositionFactory */
    class C1472g implements Callable<C1494l<C1464d>> {

        /* renamed from: a */
        final /* synthetic */ C1464d f5654a;

        C1472g(C1464d dVar) {
            this.f5654a = dVar;
        }

        /* renamed from: a */
        public C1494l<C1464d> call() {
            return new C1494l<>(this.f5654a);
        }
    }

    /* renamed from: b */
    private static C1495m<C1464d> m7631b(String str, Callable<C1494l<C1464d>> callable) {
        C1464d a = str == null ? null : C1562g.m7993b().mo7238a(str);
        if (a != null) {
            return new C1495m<>(new C1472g(a));
        }
        if (str != null) {
            Map<String, C1495m<C1464d>> map = f5638a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C1495m<C1464d> mVar = new C1495m<>(callable);
        if (str != null) {
            mVar.mo7122f(new C1466a(str));
            mVar.mo7121e(new C1467b(str));
            f5638a.put(str, mVar);
        }
        return mVar;
    }

    /* renamed from: c */
    private static C1489g m7632c(C1464d dVar, String str) {
        for (C1489g next : dVar.mo7011j().values()) {
            if (next.mo7107b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C1495m<C1464d> m7633d(Context context, String str) {
        return m7634e(context, str, "asset_" + str);
    }

    /* renamed from: e */
    public static C1495m<C1464d> m7634e(Context context, String str, String str2) {
        return m7631b(str2, new C1469d(context.getApplicationContext(), str, str2));
    }

    /* renamed from: f */
    public static C1494l<C1464d> m7635f(Context context, String str) {
        return m7636g(context, str, "asset_" + str);
    }

    /* renamed from: g */
    public static C1494l<C1464d> m7636g(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return m7638i(context.getAssets().open(str), str2);
                }
            }
            return m7648s(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C1494l<>((Throwable) e);
        }
    }

    /* renamed from: h */
    public static C1495m<C1464d> m7637h(InputStream inputStream, String str) {
        return m7631b(str, new C1471f(inputStream, str));
    }

    /* renamed from: i */
    public static C1494l<C1464d> m7638i(InputStream inputStream, String str) {
        return m7639j(inputStream, str, true);
    }

    /* renamed from: j */
    private static C1494l<C1464d> m7639j(InputStream inputStream, String str, boolean z) {
        try {
            return m7640k(C1657c.m8318m0(C8645n.m46985b(C8645n.m46989f(inputStream))), str);
        } finally {
            if (z) {
                C1683h.m8457c(inputStream);
            }
        }
    }

    /* renamed from: k */
    public static C1494l<C1464d> m7640k(C1657c cVar, String str) {
        return m7641l(cVar, str, true);
    }

    /* renamed from: l */
    private static C1494l<C1464d> m7641l(C1657c cVar, String str, boolean z) {
        try {
            C1464d a = C1672w.m8392a(cVar);
            if (str != null) {
                C1562g.m7993b().mo7239c(str, a);
            }
            C1494l<C1464d> lVar = new C1494l<>(a);
            if (z) {
                C1683h.m8457c(cVar);
            }
            return lVar;
        } catch (Exception e) {
            C1494l<C1464d> lVar2 = new C1494l<>((Throwable) e);
            if (z) {
                C1683h.m8457c(cVar);
            }
            return lVar2;
        } catch (Throwable th) {
            if (z) {
                C1683h.m8457c(cVar);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static C1495m<C1464d> m7642m(Context context, int i) {
        return m7643n(context, i, m7652w(context, i));
    }

    /* renamed from: n */
    public static C1495m<C1464d> m7643n(Context context, int i, String str) {
        return m7631b(str, new C1470e(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    /* renamed from: o */
    public static C1494l<C1464d> m7644o(Context context, int i) {
        return m7645p(context, i, m7652w(context, i));
    }

    /* renamed from: p */
    public static C1494l<C1464d> m7645p(Context context, int i, String str) {
        try {
            C8637g b = C8645n.m46985b(C8645n.m46989f(context.getResources().openRawResource(i)));
            if (m7651v(b).booleanValue()) {
                return m7648s(new ZipInputStream(b.inputStream()), str);
            }
            return m7638i(b.inputStream(), str);
        } catch (Resources.NotFoundException e) {
            return new C1494l<>((Throwable) e);
        }
    }

    /* renamed from: q */
    public static C1495m<C1464d> m7646q(Context context, String str) {
        return m7647r(context, str, "url_" + str);
    }

    /* renamed from: r */
    public static C1495m<C1464d> m7647r(Context context, String str, String str2) {
        return m7631b(str2, new C1468c(context, str, str2));
    }

    /* renamed from: s */
    public static C1494l<C1464d> m7648s(ZipInputStream zipInputStream, String str) {
        try {
            return m7649t(zipInputStream, str);
        } finally {
            C1683h.m8457c(zipInputStream);
        }
    }

    /* renamed from: t */
    private static C1494l<C1464d> m7649t(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C1464d dVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    dVar = m7641l(C1657c.m8318m0(C8645n.m46985b(C8645n.m46989f(zipInputStream))), (String) null, false).mo7118b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg")) {
                        if (!name.contains(".jpeg")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVar == null) {
                return new C1494l<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C1489g c = m7632c(dVar, (String) entry.getKey());
                if (c != null) {
                    c.mo7111f(C1683h.m8466l((Bitmap) entry.getValue(), c.mo7110e(), c.mo7108c()));
                }
            }
            for (Map.Entry next : dVar.mo7011j().entrySet()) {
                if (((C1489g) next.getValue()).mo7106a() == null) {
                    return new C1494l<>((Throwable) new IllegalStateException("There is no image for " + ((C1489g) next.getValue()).mo7107b()));
                }
            }
            if (str != null) {
                C1562g.m7993b().mo7239c(str, dVar);
            }
            return new C1494l<>(dVar);
        } catch (IOException e) {
            return new C1494l<>((Throwable) e);
        }
    }

    /* renamed from: u */
    private static boolean m7650u(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: v */
    private static Boolean m7651v(C8637g gVar) {
        try {
            C8637g peek = gVar.peek();
            for (byte b : f5639b) {
                if (peek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            C1679d.m8415b("Failed to check zip file header", e);
            return Boolean.FALSE;
        }
    }

    /* renamed from: w */
    private static String m7652w(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m7650u(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
