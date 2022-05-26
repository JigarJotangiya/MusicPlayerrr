package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5790yp {

    /* renamed from: a */
    private final C5012dq f26462a;

    /* renamed from: b */
    private final C5273kr f26463b;

    /* renamed from: c */
    private final boolean f26464c;

    private C5790yp() {
        this.f26463b = C5310lr.m26909F();
        this.f26464c = false;
        this.f26462a = new C5012dq();
    }

    /* renamed from: a */
    public static C5790yp m34259a() {
        return new C5790yp();
    }

    /* renamed from: d */
    private final synchronized String m34260d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.f26463b.mo18991C(), Long.valueOf(C2971s.m13198a().mo11989b()), Integer.valueOf(i - 1), Base64.encodeToString(((C5310lr) this.f26463b.mo19761n()).mo21561e(), 3)});
    }

    /* renamed from: e */
    private final synchronized void m34261e(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m34260d(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        C3018m1.m13388k("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    C3018m1.m13388k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        C3018m1.m13388k("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                C3018m1.m13388k("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    C3018m1.m13388k("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: f */
    private final synchronized void m34262f(int i) {
        C5273kr krVar = this.f26463b;
        krVar.mo18995u();
        List<String> b = C5503qz.m29789b();
        ArrayList arrayList = new ArrayList();
        for (String split : b) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    C3018m1.m13388k("Experiment ID is not a number");
                }
            }
        }
        krVar.mo18994t(arrayList);
        C4975cq cqVar = new C4975cq(this.f26462a, ((C5310lr) this.f26463b.mo19761n()).mo21561e(), (C4938bq) null);
        int i2 = i - 1;
        cqVar.mo16721a(i2);
        cqVar.mo16722b();
        String valueOf2 = String.valueOf(Integer.toString(i2, 10));
        C3018m1.m13388k(valueOf2.length() != 0 ? "Logging Event with event code : ".concat(valueOf2) : new String("Logging Event with event code : "));
    }

    /* renamed from: b */
    public final synchronized void mo22272b(C5752xp xpVar) {
        if (this.f26464c) {
            try {
                xpVar.mo15935a(this.f26463b);
            } catch (NullPointerException e) {
                C2971s.m13213p().mo17571s(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo22273c(int i) {
        if (this.f26464c) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22484b3)).booleanValue()) {
                m34261e(i);
            } else {
                m34262f(i);
            }
        }
    }

    public C5790yp(C5012dq dqVar) {
        this.f26463b = C5310lr.m26909F();
        this.f26462a = dqVar;
        this.f26464c = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22476a3)).booleanValue();
    }
}
