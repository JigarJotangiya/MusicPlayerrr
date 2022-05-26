package net.coocent.android.xmlparser;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import net.coocent.android.xmlparser.p461z.C9565e;
import org.apache.http.message.BasicNameValuePair;
import p159f.p166c.p213j.p214a.C4592c;

/* renamed from: net.coocent.android.xmlparser.m */
/* compiled from: DialogXmlParseTask */
public class C9482m extends AsyncTask<String, String, ArrayList<C9483n>> {

    /* renamed from: a */
    private SoftReference<C9488q> f36453a;

    /* renamed from: b */
    private Application f36454b;

    /* renamed from: c */
    private String f36455c;

    /* renamed from: d */
    private String f36456d;

    /* renamed from: e */
    private String f36457e;

    /* renamed from: f */
    private int f36458f;

    public C9482m(Application application, String str, String str2, String str3, int i, C9488q qVar) {
        this.f36454b = application;
        this.f36455c = str;
        this.f36456d = str2;
        this.f36457e = str3;
        this.f36458f = i;
        this.f36453a = new SoftReference<>(qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC, Splitter:B:23:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051 A[SYNTHETIC, Splitter:B:29:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m49854c(java.lang.String r3, java.io.InputStream r4) {
        /*
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.f36456d
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x001a
            boolean r0 = r0.mkdirs()
            if (r0 != 0) goto L_0x001a
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Unable to create external cache directory"
            r0.println(r1)
        L_0x001a:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x003d, all -> 0x0039 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x003d, all -> 0x0039 }
        L_0x0025:
            int r3 = r4.read()     // Catch:{ Exception -> 0x0037 }
            r0 = -1
            if (r3 == r0) goto L_0x0030
            r1.write(r3)     // Catch:{ Exception -> 0x0037 }
            goto L_0x0025
        L_0x0030:
            r1.flush()     // Catch:{ Exception -> 0x0037 }
            r1.close()     // Catch:{ Exception -> 0x0049 }
            goto L_0x004d
        L_0x0037:
            r3 = move-exception
            goto L_0x0040
        L_0x0039:
            r4 = move-exception
            r1 = r3
            r3 = r4
            goto L_0x004f
        L_0x003d:
            r4 = move-exception
            r1 = r3
            r3 = r4
        L_0x0040:
            r3.printStackTrace()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x004d
            r1.close()     // Catch:{ Exception -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r3 = move-exception
            r3.printStackTrace()
        L_0x004d:
            return
        L_0x004e:
            r3 = move-exception
        L_0x004f:
            if (r1 == 0) goto L_0x0059
            r1.close()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0059:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.C9482m.m49854c(java.lang.String, java.io.InputStream):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<C9483n> doInBackground(String... strArr) {
        ArrayList<C9483n> c;
        try {
            File file = new File(this.f36455c + this.f36457e);
            if (C9565e.m50189a(this.f36454b.getApplicationContext())) {
                InputStream b = C9487p.m49879b(strArr[0], (ArrayList<BasicNameValuePair>) null, 1);
                if (b != null) {
                    m49854c(this.f36455c + this.f36457e, b);
                    b.close();
                    FileInputStream fileInputStream = new FileInputStream(file);
                    c = new C9484o(this.f36454b.getApplicationContext(), this.f36458f).mo32706c(fileInputStream);
                    fileInputStream.close();
                } else if (!file.exists()) {
                    return null;
                } else {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    c = new C9484o(this.f36454b.getApplicationContext(), this.f36458f).mo32706c(fileInputStream2);
                    fileInputStream2.close();
                }
            } else if (!file.exists()) {
                return null;
            } else {
                FileInputStream fileInputStream3 = new FileInputStream(file);
                c = new C9484o(this.f36454b.getApplicationContext(), this.f36458f).mo32706c(fileInputStream3);
                fileInputStream3.close();
            }
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(ArrayList<C9483n> arrayList) {
        if (arrayList != null) {
            if (this.f36453a.get() != null) {
                this.f36453a.get().mo26665f0(arrayList);
                this.f36453a.clear();
            }
        } else if (!C9502v.f36504h) {
            C9502v.f36504h = true;
            C9502v.f36497a = C9502v.f36498b;
            C9502v.m49928W(this.f36454b, this.f36455c, this.f36453a.get(), (C4592c) null);
            Log.e("heooooolll", "IS_AMAZON");
        }
    }
}
