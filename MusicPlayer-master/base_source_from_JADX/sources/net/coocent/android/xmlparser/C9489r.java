package net.coocent.android.xmlparser;

import android.app.Application;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import net.coocent.android.xmlparser.C9454k;
import org.apache.http.message.BasicNameValuePair;
import p159f.p166c.p213j.p214a.C4592c;

/* renamed from: net.coocent.android.xmlparser.r */
/* compiled from: NetMusicXmlParseTask */
public class C9489r extends AsyncTask<String, String, ArrayList<C9483n>> {

    /* renamed from: a */
    private final WeakReference<C9488q> f36473a;

    /* renamed from: b */
    private WeakReference<C4592c> f36474b;

    /* renamed from: c */
    private Application f36475c;

    /* renamed from: d */
    private String f36476d;

    /* renamed from: e */
    private C9454k f36477e;

    /* renamed from: f */
    private String f36478f;

    public C9489r(Application application, String str, C9488q qVar, C4592c cVar) {
        this(application, application.getFilesDir().getPath(), str, qVar, cVar);
    }

    /* renamed from: c */
    private void m49881c(String str, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        Exception e;
        File file = new File(this.f36478f);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            while (true) {
                try {
                    int read = inputStream.read();
                    if (read != -1) {
                        fileOutputStream.write(read);
                    } else {
                        fileOutputStream.flush();
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    try {
                        e.printStackTrace();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                        throw th;
                    }
                }
            }
        } catch (Exception e5) {
            fileOutputStream = null;
            e = e5;
            e.printStackTrace();
            fileOutputStream.close();
        } catch (Throwable th2) {
            fileOutputStream = null;
            th = th2;
            fileOutputStream.close();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<C9483n> doInBackground(String... strArr) {
        int i = 0;
        try {
            InputStream b = C9487p.m49879b(strArr[0], (ArrayList<BasicNameValuePair>) null, 1);
            if (b == null) {
                return null;
            }
            m49881c(this.f36476d + "/gift.xml", b);
            b.close();
            FileInputStream fileInputStream = new FileInputStream(new File(this.f36476d + "/gift.xml"));
            if (strArr.length <= 1 || TextUtils.isEmpty(strArr[1]) || !TextUtils.equals(strArr[1], String.valueOf(0))) {
                i = 1;
            }
            ArrayList<C9483n> c = new C9484o(this.f36475c.getApplicationContext(), i).mo32706c(fileInputStream);
            fileInputStream.close();
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
            C9488q qVar = (C9488q) this.f36473a.get();
            if (qVar == null || !qVar.mo26665f0(arrayList)) {
                C9502v.m49931b(arrayList);
            }
            C4592c cVar = (C4592c) this.f36474b.get();
            if (cVar != null) {
                cVar.mo15338a();
            }
            if (this.f36478f.equals(C9502v.f36502f)) {
                C9502v.m49932c(arrayList);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f36477e.mo32585h(this.f36478f, arrayList.get(i), (C9454k.C9457c) null);
                this.f36477e.mo32584e(this.f36478f, arrayList.get(i), (C9454k.C9457c) null);
            }
        } else if (!C9502v.f36504h) {
            C9502v.f36504h = true;
            C9502v.f36497a = C9502v.f36498b;
            C9502v.m49928W(this.f36475c, this.f36476d, (C9488q) this.f36473a.get(), (C4592c) this.f36474b.get());
        }
    }

    public C9489r(Application application, String str, String str2, C9488q qVar, C4592c cVar) {
        this.f36475c = application;
        this.f36476d = str;
        this.f36478f = str2;
        this.f36473a = new WeakReference<>(qVar);
        this.f36477e = new C9454k();
        this.f36474b = new WeakReference<>(cVar);
    }
}
