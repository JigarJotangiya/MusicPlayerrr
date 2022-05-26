package net.coocent.android.xmlparser;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

/* renamed from: net.coocent.android.xmlparser.k */
/* compiled from: AsyncGiftImageLoader */
public class C9454k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashMap<String, SoftReference<Bitmap>> f36409a = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Handler f36410b = new C9455a(this, Looper.getMainLooper());

    /* renamed from: net.coocent.android.xmlparser.k$a */
    /* compiled from: AsyncGiftImageLoader */
    class C9455a extends Handler {
        C9455a(C9454k kVar, Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 0) {
                try {
                    C9458d dVar = (C9458d) message.obj;
                    if (dVar.f36415c != null) {
                        dVar.f36415c.mo32439a(dVar.f36413a, dVar.f36414b);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.k$b */
    /* compiled from: AsyncGiftImageLoader */
    class C9456b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C9458d f36411g;

        C9456b(C9458d dVar) {
            this.f36411g = dVar;
        }

        public void run() {
            try {
                C9458d dVar = this.f36411g;
                Bitmap unused = dVar.f36414b = C9454k.m49793g(dVar.f36416d);
                if (this.f36411g.f36414b == null) {
                    C9454k.this.m49792f(this.f36411g.f36413a, this.f36411g.f36416d);
                    C9458d dVar2 = this.f36411g;
                    Bitmap unused2 = dVar2.f36414b = C9454k.m49793g(dVar2.f36416d);
                }
                Message obtain = Message.obtain();
                obtain.what = 0;
                obtain.obj = this.f36411g;
                C9454k.this.f36410b.sendMessage(obtain);
                C9454k.this.f36409a.put(this.f36411g.f36413a, new SoftReference(this.f36411g.f36414b));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.k$c */
    /* compiled from: AsyncGiftImageLoader */
    public interface C9457c {
        /* renamed from: a */
        void mo32439a(String str, Bitmap bitmap);
    }

    /* renamed from: net.coocent.android.xmlparser.k$d */
    /* compiled from: AsyncGiftImageLoader */
    public class C9458d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f36413a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Bitmap f36414b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C9457c f36415c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f36416d;

        public C9458d(C9454k kVar) {
        }

        public boolean equals(Object obj) {
            C9458d dVar = (C9458d) obj;
            String str = this.f36413a;
            if (str == null || dVar == null) {
                return false;
            }
            return str.equals(dVar.f36413a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m49792f(String str, String str2) {
        Log.e("PROMOTION", "_urlStr - " + str);
        Log.e("PROMOTION", "DownLoadpath - " + str2);
        File file = new File(str2);
        try {
            URLConnection openConnection = new URL(str).openConnection();
            int contentLength = openConnection.getContentLength();
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (fileInputStream.available() == contentLength) {
                    fileInputStream.close();
                    return;
                }
                fileInputStream.close();
                InputStream inputStream = openConnection.getInputStream();
                byte[] bArr = new byte[1024];
                FileOutputStream fileOutputStream = new FileOutputStream(str2 + ".tmp");
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        inputStream.close();
                        new File(str2 + ".tmp").renameTo(file);
                        return;
                    }
                }
            } else {
                InputStream inputStream2 = openConnection.getInputStream();
                byte[] bArr2 = new byte[1024];
                FileOutputStream fileOutputStream2 = new FileOutputStream(str2 + ".tmp");
                while (true) {
                    int read2 = inputStream2.read(bArr2);
                    if (read2 != -1) {
                        fileOutputStream2.write(bArr2, 0, read2);
                    } else {
                        fileOutputStream2.close();
                        new File(str2 + ".tmp").renameTo(file);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[Catch:{  }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m49793g(java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{  }
            r1.<init>(r5)     // Catch:{  }
            boolean r2 = r1.exists()     // Catch:{  }
            if (r2 == 0) goto L_0x0036
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x002c, IOException -> 0x0023 }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x002c, IOException -> 0x0023 }
            int r3 = r2.available()     // Catch:{ FileNotFoundException -> 0x0021, IOException -> 0x001f }
            r4 = 1
            if (r3 >= r4) goto L_0x0036
            r1.delete()     // Catch:{ FileNotFoundException -> 0x0021, IOException -> 0x001f }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0021, IOException -> 0x001f }
            return r0
        L_0x001f:
            r1 = move-exception
            goto L_0x0025
        L_0x0021:
            r1 = move-exception
            goto L_0x002e
        L_0x0023:
            r1 = move-exception
            r2 = r0
        L_0x0025:
            r1.printStackTrace()     // Catch:{  }
            r2.close()     // Catch:{  }
            goto L_0x0036
        L_0x002c:
            r1 = move-exception
            r2 = r0
        L_0x002e:
            r1.printStackTrace()     // Catch:{  }
            if (r2 == 0) goto L_0x0036
            r2.close()     // Catch:{  }
        L_0x0036:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0047 }
            r1.<init>()     // Catch:{ Exception -> 0x0047 }
            r2 = 2
            r1.inSampleSize = r2     // Catch:{ Exception -> 0x0047 }
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ Exception -> 0x0047 }
            r1.inPreferredConfig = r2     // Catch:{ Exception -> 0x0047 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r5, r1)     // Catch:{ Exception -> 0x0047 }
            return r5
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.C9454k.m49793g(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: i */
    private void m49794i(C9458d dVar) {
        new Thread(new C9456b(dVar)).start();
    }

    /* renamed from: e */
    public void mo32584e(String str, C9483n nVar, C9457c cVar) {
        C9458d dVar = new C9458d(this);
        String unused = dVar.f36413a = nVar.mo32693e();
        String unused2 = dVar.f36416d = str + nVar.mo32695g();
        C9457c unused3 = dVar.f36415c = cVar;
        m49794i(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r4 = r4 + r5.mo32695g();
        r0 = m49793g(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (r5.mo32693e().equals(p453me.zhanghai.android.materialprogressbar.BuildConfig.FLAVOR) != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r0 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r0 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r1 = new net.coocent.android.xmlparser.C9454k.C9458d(r3);
        net.coocent.android.xmlparser.C9454k.C9458d.m49801d(r1, r5.mo32693e());
        net.coocent.android.xmlparser.C9454k.C9458d.m49805h(r1, r4);
        net.coocent.android.xmlparser.C9454k.C9458d.m49799b(r1, r6);
        m49794i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        return r0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo32585h(java.lang.String r4, net.coocent.android.xmlparser.C9483n r5, net.coocent.android.xmlparser.C9454k.C9457c r6) {
        /*
            r3 = this;
            java.util.HashMap<java.lang.String, java.lang.ref.SoftReference<android.graphics.Bitmap>> r0 = r3.f36409a
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.lang.ref.SoftReference<android.graphics.Bitmap>> r1 = r3.f36409a     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = r5.mo32693e()     // Catch:{ all -> 0x0072 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0032
            java.util.HashMap<java.lang.String, java.lang.ref.SoftReference<android.graphics.Bitmap>> r1 = r3.f36409a     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = r5.mo32693e()     // Catch:{ all -> 0x0072 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0072 }
            java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0072 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x0072 }
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            return r1
        L_0x0029:
            java.util.HashMap<java.lang.String, java.lang.ref.SoftReference<android.graphics.Bitmap>> r1 = r3.f36409a     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = r5.mo32693e()     // Catch:{ all -> 0x0072 }
            r1.remove(r2)     // Catch:{ all -> 0x0072 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = r5.mo32695g()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.graphics.Bitmap r0 = m49793g(r4)
            java.lang.String r1 = r5.mo32693e()
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0059
            if (r0 == 0) goto L_0x0059
            return r0
        L_0x0059:
            if (r0 == 0) goto L_0x005c
            return r0
        L_0x005c:
            net.coocent.android.xmlparser.k$d r1 = new net.coocent.android.xmlparser.k$d
            r1.<init>(r3)
            java.lang.String r5 = r5.mo32693e()
            java.lang.String unused = r1.f36413a = r5
            java.lang.String unused = r1.f36416d = r4
            net.coocent.android.xmlparser.C9454k.C9457c unused = r1.f36415c = r6
            r3.m49794i(r1)
            return r0
        L_0x0072:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.C9454k.mo32585h(java.lang.String, net.coocent.android.xmlparser.n, net.coocent.android.xmlparser.k$c):android.graphics.Bitmap");
    }
}
