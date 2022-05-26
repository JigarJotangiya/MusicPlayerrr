package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.ic */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5184ic extends C5111gd {

    /* renamed from: i */
    private static final C5148hd<C5181i9> f17944i = new C5148hd<>();

    /* renamed from: h */
    private final Context f17945h;

    public C5184ic(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2, Context context, C5623u7 u7Var) {
        super(wbVar, "iH08ecr5p8p5eQT3/BFJ6jAaJm3eLNoIe2oA7hLZl5P0jAtinrUdPK16lrJGpxBz", "Gvy6wet11FtrNaAWhnvYSI1hOQnkPBTAgqoI9PXuwaM=", b8Var, i, 27);
        this.f17945h = context;
    }

    /* renamed from: d */
    private final String m25150d() {
        try {
            if (this.f17016a.mo21787l() != null) {
                this.f17016a.mo21787l().get();
            }
            C5513r8 c = this.f17016a.mo21779c();
            if (c == null || !c.mo20602k0()) {
                return null;
            }
            return c.mo20607y0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        C5181i9 i9Var;
        int i;
        Boolean bool;
        AtomicReference<C5181i9> a = f17944i.mo18123a(this.f17945h.getPackageName());
        synchronized (a) {
            C5181i9 i9Var2 = a.get();
            if (i9Var2 == null || C5813zb.m34504g(i9Var2.f17918b) || i9Var2.f17918b.equals("E") || i9Var2.f17918b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!C5813zb.m34504g((String) null)) {
                    i = 5;
                } else {
                    if (!C5813zb.m34504g((String) null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    i = (!bool.booleanValue() || !this.f17016a.mo21789p()) ? 3 : 4;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool2 = (Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22658x1);
                String c = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22650w1)).booleanValue() ? mo18314c() : null;
                if (bool2.booleanValue() && this.f17016a.mo21789p() && C5813zb.m34504g(c)) {
                    c = m25150d();
                }
                C5181i9 i9Var3 = new C5181i9((String) this.f17020e.invoke((Object) null, new Object[]{this.f17945h, valueOf, c}));
                if (C5813zb.m34504g(i9Var3.f17918b) || i9Var3.f17918b.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String d = m25150d();
                        if (!C5813zb.m34504g(d)) {
                            i9Var3.f17918b = d;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                a.set(i9Var3);
            }
            i9Var = a.get();
        }
        synchronized (this.f17019d) {
            if (i9Var != null) {
                this.f17019d.mo16130o0(i9Var.f17918b);
                this.f17019d.mo16102K(i9Var.f17919c);
                this.f17019d.mo16104M(i9Var.f17920d);
                this.f17019d.mo16117b0(i9Var.f17921e);
                this.f17019d.mo16129n0(i9Var.f17922f);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo18314c() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] i = C5813zb.m34506i((String) C5054ev.m23225c().mo20153b(C5503qz.f22666y1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(C5813zb.m34506i((String) C5054ev.m23225c().mo20153b(C5503qz.f22674z1)))));
            }
            Context context = this.f17945h;
            String packageName = context.getPackageName();
            this.f17016a.mo21786k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            l93 E = l93.m26601E();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new C5185id(E));
            return (String) E.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
