package net.coocent.android.xmlparser.feedback;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import androidx.lifecycle.C0670e0;
import androidx.lifecycle.LiveData;
import com.google.gson.p253b.C6488a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import net.coocent.android.xmlparser.feedback.C9416k;
import p082e.p109h.p118o.C3699e;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: net.coocent.android.xmlparser.feedback.j */
/* compiled from: FeedbackRepository */
class C9412j {

    /* renamed from: a */
    private final Application f36309a;

    /* renamed from: b */
    private final C9415c f36310b = new C9415c();

    /* renamed from: c */
    private final AtomicBoolean f36311c = new AtomicBoolean(false);

    /* renamed from: net.coocent.android.xmlparser.feedback.j$a */
    /* compiled from: FeedbackRepository */
    class C9413a extends C6488a<C9416k> {
        C9413a(C9412j jVar) {
        }
    }

    /* renamed from: net.coocent.android.xmlparser.feedback.j$b */
    /* compiled from: FeedbackRepository */
    class C9414b extends C6488a<C9416k.C9418b> {
        C9414b(C9412j jVar) {
        }
    }

    /* renamed from: net.coocent.android.xmlparser.feedback.j$c */
    /* compiled from: FeedbackRepository */
    private static class C9415c {

        /* renamed from: a */
        private final ExecutorService f36312a = Executors.newSingleThreadExecutor();

        /* renamed from: b */
        private final ExecutorService f36313b = Executors.newFixedThreadPool(3);

        C9415c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public ExecutorService mo32532a() {
            return this.f36313b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public ExecutorService mo32533b() {
            return this.f36312a;
        }
    }

    C9412j(Application application) {
        this.f36309a = application;
    }

    /* renamed from: a */
    private int m49687a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = i2 * i;
        int i6 = 1;
        if (i3 * i4 > i5) {
            while (((i3 / 2) / i6) * ((i4 / 2) / i6) >= i5) {
                i6 *= 2;
            }
        }
        return i6;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C3699e<String, String> m49690e(String str) {
        int d;
        File file = new File(this.f36309a.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "coocent_feedback");
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            ParcelFileDescriptor openFileDescriptor = this.f36309a.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), (Rect) null, options);
            options.inSampleSize = m49687a(options, 800, 450);
            options.inJustDecodeBounds = false;
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), (Rect) null, options);
            if (Build.VERSION.SDK_INT >= 24 && (d = m49689d(openFileDescriptor.getFileDescriptor())) != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) d);
                decodeFileDescriptor = Bitmap.createBitmap(decodeFileDescriptor, 0, 0, decodeFileDescriptor.getWidth(), decodeFileDescriptor.getHeight(), matrix, true);
            }
            File file2 = new File(file.getPath() + File.separator + "IMG_FEEDBACK_" + System.currentTimeMillis() + ".webp");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            decodeFileDescriptor.compress(Bitmap.CompressFormat.WEBP, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            openFileDescriptor.close();
            decodeFileDescriptor.recycle();
            C3699e<String, String> eVar = new C3699e<>(str, m49692j(file2));
            if (file2.exists()) {
                file2.delete();
            }
            return eVar;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return new C3699e<>(str, BuildConfig.FLAVOR);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new C3699e<>(str, BuildConfig.FLAVOR);
        }
    }

    /* renamed from: d */
    private int m49689d(FileDescriptor fileDescriptor) {
        try {
            int attributeInt = new ExifInterface(fileDescriptor).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r11 = new java.lang.StringBuilder();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r5 >= r10.size()) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r6 = (java.lang.String) r2.get(r10.get(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r6 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        r11.append(r6.substring(r6.lastIndexOf("/") + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (r5 == (r10.size() - 1)) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r11.append(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        r10 = (java.net.HttpURLConnection) new java.net.URL("https://feedback.coocent.net/feedback/add").openConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r10.setRequestMethod("POST");
        r10.setConnectTimeout(5000);
        r10.setReadTimeout(5000);
        r10.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        r10.addRequestProperty("Accept", "application/json");
        r10.setDoInput(true);
        r10.setDoOutput(true);
        r1 = new java.util.HashMap();
        r1.put("app_name", net.coocent.android.xmlparser.feedback.C9424o.m49705a(r9.f36309a));
        r1.put("app_ver", net.coocent.android.xmlparser.p461z.C9566f.m50194e(r9.f36309a));
        r2 = "unknown";
        r5 = android.os.Build.BRAND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dd, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00df, code lost:
        r6 = android.os.Build.MODEL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e7, code lost:
        r2 = r5 + " " + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fb, code lost:
        r1.put("device", r2);
        r1.put("os_ver", android.os.Build.VERSION.SDK_INT + p453me.zhanghai.android.materialprogressbar.BuildConfig.FLAVOR);
        r1.put("description", r13);
        r1.put("pic_urls", r11.toString());
        r11 = r10.getOutputStream();
        r13 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(r11, "UTF-8"));
        r13.write(net.coocent.android.xmlparser.feedback.C9424o.m49706b(r1));
        r13.flush();
        r13.close();
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x014c, code lost:
        if (r10.getResponseCode() == 200) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x014e, code lost:
        r10.getInputStream().close();
        r10.disconnect();
        r12.mo4153l(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x015f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0160, code lost:
        r11 = r10.getInputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0164, code lost:
        if (r11 == null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0166, code lost:
        r1 = new java.io.InputStreamReader(r11, "UTF-8");
        r2 = new java.io.BufferedReader(r1);
        r5 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0177, code lost:
        r6 = r2.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017b, code lost:
        if (r6 == null) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0183, code lost:
        if (r9.f36311c.get() == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0185, code lost:
        r2.close();
        r1.close();
        r11.close();
        r10.disconnect();
        r12.mo4153l(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0198, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0199, code lost:
        r5.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019d, code lost:
        r2.close();
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ab, code lost:
        if (android.text.TextUtils.isEmpty(r5.toString()) == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ad, code lost:
        r10.getInputStream().close();
        r10.disconnect();
        r12.mo4153l(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01bf, code lost:
        r1 = (net.coocent.android.xmlparser.feedback.C9416k) new com.google.gson.GsonBuilder().serializeNulls().registerTypeAdapter(java.lang.String.class, new net.coocent.android.xmlparser.widget.StringAdapter()).registerTypeAdapter(java.lang.Integer.class, new net.coocent.android.xmlparser.widget.IntegerAdapter()).create().fromJson(r5.toString(), new net.coocent.android.xmlparser.feedback.C9412j.C9413a(r9).getType());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f5, code lost:
        if (r1 == null) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01f7, code lost:
        r1 = r1.f36314a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01f9, code lost:
        if (r1 == null) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01fd, code lost:
        if (r1.f36329a != 200) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ff, code lost:
        r12.mo4153l(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0207, code lost:
        r12.mo4153l(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x020e, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0211, code lost:
        r10.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0215, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0216, code lost:
        r1 = r10;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021d, code lost:
        r12.mo4153l(-1);
        r10.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0227, code lost:
        if (r1 != null) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0229, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo32530h(java.util.List r10, java.util.concurrent.CompletionService r11, androidx.lifecycle.C0670e0 r12, java.lang.String r13) {
        /*
            r9 = this;
            r0 = -1
            r1 = 0
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x021c }
            r2.<init>()     // Catch:{ Exception -> 0x021c }
            r3 = 0
            r4 = 0
        L_0x0009:
            int r5 = r10.size()     // Catch:{ Exception -> 0x021c }
            if (r4 >= r5) goto L_0x003d
            java.util.concurrent.Future r5 = r11.take()     // Catch:{ Exception -> 0x021c }
            r6 = 10
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x021c }
            java.lang.Object r5 = r5.get(r6, r8)     // Catch:{ Exception -> 0x021c }
            e.h.o.e r5 = (p082e.p109h.p118o.C3699e) r5     // Catch:{ Exception -> 0x021c }
            S r6 = r5.f11714b     // Catch:{ Exception -> 0x021c }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x021c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x021c }
            if (r6 == 0) goto L_0x002f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x021c }
            r12.mo4153l(r10)     // Catch:{ Exception -> 0x021c }
            return
        L_0x002f:
            F r6 = r5.f11713a     // Catch:{ Exception -> 0x021c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x021c }
            S r5 = r5.f11714b     // Catch:{ Exception -> 0x021c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x021c }
            r2.put(r6, r5)     // Catch:{ Exception -> 0x021c }
            int r4 = r4 + 1
            goto L_0x0009
        L_0x003d:
            monitor-enter(r9)     // Catch:{ Exception -> 0x021c }
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.f36311c     // Catch:{ all -> 0x0219 }
            boolean r11 = r11.get()     // Catch:{ all -> 0x0219 }
            r4 = 1
            if (r11 == 0) goto L_0x0050
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0219 }
            r12.mo4153l(r10)     // Catch:{ all -> 0x0219 }
            monitor-exit(r9)     // Catch:{ all -> 0x0219 }
            return
        L_0x0050:
            monitor-exit(r9)     // Catch:{ all -> 0x0219 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x021c }
            r11.<init>()     // Catch:{ Exception -> 0x021c }
            r5 = 0
        L_0x0057:
            int r6 = r10.size()     // Catch:{ Exception -> 0x021c }
            if (r5 >= r6) goto L_0x008c
            java.lang.Object r6 = r10.get(r5)     // Catch:{ Exception -> 0x021c }
            java.lang.Object r6 = r2.get(r6)     // Catch:{ Exception -> 0x021c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x021c }
            if (r6 == 0) goto L_0x0089
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x021c }
            if (r7 != 0) goto L_0x0089
            java.lang.String r7 = "/"
            int r7 = r6.lastIndexOf(r7)     // Catch:{ Exception -> 0x021c }
            int r7 = r7 + r4
            java.lang.String r6 = r6.substring(r7)     // Catch:{ Exception -> 0x021c }
            r11.append(r6)     // Catch:{ Exception -> 0x021c }
            int r6 = r10.size()     // Catch:{ Exception -> 0x021c }
            int r6 = r6 - r4
            if (r5 == r6) goto L_0x0089
            java.lang.String r6 = ","
            r11.append(r6)     // Catch:{ Exception -> 0x021c }
        L_0x0089:
            int r5 = r5 + 1
            goto L_0x0057
        L_0x008c:
            java.lang.String r10 = "https://feedback.coocent.net/feedback/add"
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x021c }
            r2.<init>(r10)     // Catch:{ Exception -> 0x021c }
            java.net.URLConnection r10 = r2.openConnection()     // Catch:{ Exception -> 0x021c }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ Exception -> 0x021c }
            java.lang.String r1 = "POST"
            r10.setRequestMethod(r1)     // Catch:{ Exception -> 0x0215 }
            r1 = 5000(0x1388, float:7.006E-42)
            r10.setConnectTimeout(r1)     // Catch:{ Exception -> 0x0215 }
            r10.setReadTimeout(r1)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r10.addRequestProperty(r1, r2)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r1 = "Accept"
            java.lang.String r2 = "application/json"
            r10.addRequestProperty(r1, r2)     // Catch:{ Exception -> 0x0215 }
            r10.setDoInput(r4)     // Catch:{ Exception -> 0x0215 }
            r10.setDoOutput(r4)     // Catch:{ Exception -> 0x0215 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x0215 }
            r1.<init>()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r2 = "app_name"
            android.app.Application r5 = r9.f36309a     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = net.coocent.android.xmlparser.feedback.C9424o.m49705a(r5)     // Catch:{ Exception -> 0x0215 }
            r1.put(r2, r5)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r2 = "app_ver"
            android.app.Application r5 = r9.f36309a     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = net.coocent.android.xmlparser.p461z.C9566f.m50194e(r5)     // Catch:{ Exception -> 0x0215 }
            r1.put(r2, r5)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r2 = "unknown"
            java.lang.String r5 = android.os.Build.BRAND     // Catch:{ Exception -> 0x0215 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0215 }
            if (r6 != 0) goto L_0x00fb
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0215 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0215 }
            if (r7 != 0) goto L_0x00fb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0215 }
            r2.<init>()     // Catch:{ Exception -> 0x0215 }
            r2.append(r5)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = " "
            r2.append(r5)     // Catch:{ Exception -> 0x0215 }
            r2.append(r6)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0215 }
        L_0x00fb:
            java.lang.String r5 = "device"
            r1.put(r5, r2)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r2 = "os_ver"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0215 }
            r5.<init>()     // Catch:{ Exception -> 0x0215 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0215 }
            r5.append(r6)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r6 = ""
            r5.append(r6)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0215 }
            r1.put(r2, r5)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r2 = "description"
            r1.put(r2, r13)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r13 = "pic_urls"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0215 }
            r1.put(r13, r11)     // Catch:{ Exception -> 0x0215 }
            java.io.OutputStream r11 = r10.getOutputStream()     // Catch:{ Exception -> 0x0215 }
            java.io.BufferedWriter r13 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0215 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = "UTF-8"
            r2.<init>(r11, r5)     // Catch:{ Exception -> 0x0215 }
            r13.<init>(r2)     // Catch:{ Exception -> 0x0215 }
            java.lang.String r1 = net.coocent.android.xmlparser.feedback.C9424o.m49706b(r1)     // Catch:{ Exception -> 0x0215 }
            r13.write(r1)     // Catch:{ Exception -> 0x0215 }
            r13.flush()     // Catch:{ Exception -> 0x0215 }
            r13.close()     // Catch:{ Exception -> 0x0215 }
            r11.close()     // Catch:{ Exception -> 0x0215 }
            int r11 = r10.getResponseCode()     // Catch:{ Exception -> 0x0215 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r11 == r13) goto L_0x0160
            java.io.InputStream r11 = r10.getInputStream()     // Catch:{ Exception -> 0x0215 }
            r11.close()     // Catch:{ Exception -> 0x0215 }
            r10.disconnect()     // Catch:{ Exception -> 0x0215 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0215 }
            r12.mo4153l(r11)     // Catch:{ Exception -> 0x0215 }
            return
        L_0x0160:
            java.io.InputStream r11 = r10.getInputStream()     // Catch:{ Exception -> 0x0215 }
            if (r11 == 0) goto L_0x0211
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0215 }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r11, r2)     // Catch:{ Exception -> 0x0215 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0215 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0215 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0215 }
            r5.<init>()     // Catch:{ Exception -> 0x0215 }
        L_0x0177:
            java.lang.String r6 = r2.readLine()     // Catch:{ Exception -> 0x0215 }
            if (r6 == 0) goto L_0x019d
            java.util.concurrent.atomic.AtomicBoolean r7 = r9.f36311c     // Catch:{ Exception -> 0x0215 }
            boolean r7 = r7.get()     // Catch:{ Exception -> 0x0215 }
            if (r7 == 0) goto L_0x0199
            r2.close()     // Catch:{ Exception -> 0x0215 }
            r1.close()     // Catch:{ Exception -> 0x0215 }
            r11.close()     // Catch:{ Exception -> 0x0215 }
            r10.disconnect()     // Catch:{ Exception -> 0x0215 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0215 }
            r12.mo4153l(r11)     // Catch:{ Exception -> 0x0215 }
            return
        L_0x0199:
            r5.append(r6)     // Catch:{ Exception -> 0x0215 }
            goto L_0x0177
        L_0x019d:
            r2.close()     // Catch:{ Exception -> 0x0215 }
            r1.close()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x0215 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0215 }
            if (r1 == 0) goto L_0x01bf
            java.io.InputStream r11 = r10.getInputStream()     // Catch:{ Exception -> 0x0215 }
            r11.close()     // Catch:{ Exception -> 0x0215 }
            r10.disconnect()     // Catch:{ Exception -> 0x0215 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0215 }
            r12.mo4153l(r11)     // Catch:{ Exception -> 0x0215 }
            return
        L_0x01bf:
            com.google.gson.GsonBuilder r1 = new com.google.gson.GsonBuilder     // Catch:{ Exception -> 0x0215 }
            r1.<init>()     // Catch:{ Exception -> 0x0215 }
            com.google.gson.GsonBuilder r1 = r1.serializeNulls()     // Catch:{ Exception -> 0x0215 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            net.coocent.android.xmlparser.widget.StringAdapter r4 = new net.coocent.android.xmlparser.widget.StringAdapter     // Catch:{ Exception -> 0x0215 }
            r4.<init>()     // Catch:{ Exception -> 0x0215 }
            com.google.gson.GsonBuilder r1 = r1.registerTypeAdapter(r2, r4)     // Catch:{ Exception -> 0x0215 }
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            net.coocent.android.xmlparser.widget.IntegerAdapter r4 = new net.coocent.android.xmlparser.widget.IntegerAdapter     // Catch:{ Exception -> 0x0215 }
            r4.<init>()     // Catch:{ Exception -> 0x0215 }
            com.google.gson.GsonBuilder r1 = r1.registerTypeAdapter(r2, r4)     // Catch:{ Exception -> 0x0215 }
            com.google.gson.Gson r1 = r1.create()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0215 }
            net.coocent.android.xmlparser.feedback.j$a r4 = new net.coocent.android.xmlparser.feedback.j$a     // Catch:{ Exception -> 0x0215 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x0215 }
            java.lang.reflect.Type r4 = r4.getType()     // Catch:{ Exception -> 0x0215 }
            java.lang.Object r1 = r1.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r4)     // Catch:{ Exception -> 0x0215 }
            net.coocent.android.xmlparser.feedback.k r1 = (net.coocent.android.xmlparser.feedback.C9416k) r1     // Catch:{ Exception -> 0x0215 }
            if (r1 == 0) goto L_0x0207
            net.coocent.android.xmlparser.feedback.m r1 = r1.f36314a     // Catch:{ Exception -> 0x0215 }
            if (r1 == 0) goto L_0x0207
            int r1 = r1.f36329a     // Catch:{ Exception -> 0x0215 }
            if (r1 != r13) goto L_0x0207
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0215 }
            r12.mo4153l(r13)     // Catch:{ Exception -> 0x0215 }
            goto L_0x020e
        L_0x0207:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0215 }
            r12.mo4153l(r13)     // Catch:{ Exception -> 0x0215 }
        L_0x020e:
            r11.close()     // Catch:{ Exception -> 0x0215 }
        L_0x0211:
            r10.disconnect()     // Catch:{ Exception -> 0x0215 }
            goto L_0x022c
        L_0x0215:
            r11 = move-exception
            r1 = r10
            r10 = r11
            goto L_0x021d
        L_0x0219:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0219 }
            throw r10     // Catch:{ Exception -> 0x021c }
        L_0x021c:
            r10 = move-exception
        L_0x021d:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r12.mo4153l(r11)
            r10.printStackTrace()
            if (r1 == 0) goto L_0x022c
            r1.disconnect()
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.feedback.C9412j.mo32530h(java.util.List, java.util.concurrent.CompletionService, androidx.lifecycle.e0, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x017c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m49692j(java.io.File r12) {
        /*
            r11 = this;
            java.lang.String r0 = "UTF-8"
            boolean r1 = r12.exists()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            r1 = 0
            android.app.Application r3 = r11.f36309a     // Catch:{ Exception -> 0x0176 }
            android.content.SharedPreferences r3 = android.preference.PreferenceManager.getDefaultSharedPreferences(r3)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r4 = "\r\n"
            java.lang.String r5 = "--"
            java.lang.String r6 = "uu"
            java.lang.String r7 = "coocent_upload"
            java.lang.String r3 = r3.getString(r6, r7)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r6 = "https://feedback.coocent.net/feedback/upload"
            java.net.URL r7 = new java.net.URL     // Catch:{ Exception -> 0x0176 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0176 }
            java.net.URLConnection r6 = r7.openConnection()     // Catch:{ Exception -> 0x0176 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x0176 }
            java.lang.String r1 = "POST"
            r6.setRequestMethod(r1)     // Catch:{ Exception -> 0x0173 }
            r1 = 5000(0x1388, float:7.006E-42)
            r6.setConnectTimeout(r1)     // Catch:{ Exception -> 0x0173 }
            r6.setReadTimeout(r1)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r1 = "Content-Type"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0173 }
            r7.<init>()     // Catch:{ Exception -> 0x0173 }
            java.lang.String r8 = "multipart/form-data;boundary="
            r7.append(r8)     // Catch:{ Exception -> 0x0173 }
            r7.append(r3)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0173 }
            r6.addRequestProperty(r1, r7)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r1 = "Accept"
            java.lang.String r7 = "application/json"
            r6.addRequestProperty(r1, r7)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r1 = "connection"
            java.lang.String r7 = "keep-alive"
            r6.addRequestProperty(r1, r7)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r1 = "Charset"
            r6.addRequestProperty(r1, r0)     // Catch:{ Exception -> 0x0173 }
            r1 = 1
            r6.setDoInput(r1)     // Catch:{ Exception -> 0x0173 }
            r6.setDoOutput(r1)     // Catch:{ Exception -> 0x0173 }
            java.io.OutputStream r1 = r6.getOutputStream()     // Catch:{ Exception -> 0x0173 }
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0173 }
            r7.<init>(r1)     // Catch:{ Exception -> 0x0173 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0173 }
            r8.<init>()     // Catch:{ Exception -> 0x0173 }
            r8.append(r5)     // Catch:{ Exception -> 0x0173 }
            r8.append(r3)     // Catch:{ Exception -> 0x0173 }
            r8.append(r4)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0173 }
            r7.writeBytes(r8)     // Catch:{ Exception -> 0x0173 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0173 }
            r8.<init>()     // Catch:{ Exception -> 0x0173 }
            java.lang.String r9 = "Content-Disposition: form-data; name=\"file\";filename=\""
            r8.append(r9)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r9 = r12.getName()     // Catch:{ Exception -> 0x0173 }
            r8.append(r9)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r9 = "\""
            r8.append(r9)     // Catch:{ Exception -> 0x0173 }
            r8.append(r4)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0173 }
            r7.writeBytes(r8)     // Catch:{ Exception -> 0x0173 }
            r7.writeBytes(r4)     // Catch:{ Exception -> 0x0173 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0173 }
            r8.<init>(r12)     // Catch:{ Exception -> 0x0173 }
            r12 = 1024(0x400, float:1.435E-42)
            byte[] r12 = new byte[r12]     // Catch:{ Exception -> 0x0173 }
        L_0x00b2:
            int r9 = r8.read(r12)     // Catch:{ Exception -> 0x0173 }
            r10 = -1
            if (r9 == r10) goto L_0x00be
            r10 = 0
            r7.write(r12, r10, r9)     // Catch:{ Exception -> 0x0173 }
            goto L_0x00b2
        L_0x00be:
            r7.writeBytes(r4)     // Catch:{ Exception -> 0x0173 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0173 }
            r12.<init>()     // Catch:{ Exception -> 0x0173 }
            r12.append(r5)     // Catch:{ Exception -> 0x0173 }
            r12.append(r3)     // Catch:{ Exception -> 0x0173 }
            r12.append(r5)     // Catch:{ Exception -> 0x0173 }
            r12.append(r4)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0173 }
            r7.writeBytes(r12)     // Catch:{ Exception -> 0x0173 }
            r8.close()     // Catch:{ Exception -> 0x0173 }
            r1.flush()     // Catch:{ Exception -> 0x0173 }
            r1.close()     // Catch:{ Exception -> 0x0173 }
            int r12 = r6.getResponseCode()     // Catch:{ Exception -> 0x0173 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r12 == r1) goto L_0x00f5
            java.io.InputStream r12 = r6.getInputStream()     // Catch:{ Exception -> 0x0173 }
            r12.close()     // Catch:{ Exception -> 0x0173 }
            r6.disconnect()     // Catch:{ Exception -> 0x0173 }
            return r2
        L_0x00f5:
            java.io.InputStream r12 = r6.getInputStream()     // Catch:{ Exception -> 0x0173 }
            if (r12 == 0) goto L_0x016f
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0173 }
            r3.<init>(r12, r0)     // Catch:{ Exception -> 0x0173 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0173 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0173 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0173 }
            r3.<init>()     // Catch:{ Exception -> 0x0173 }
        L_0x010a:
            java.lang.String r4 = r0.readLine()     // Catch:{ Exception -> 0x0173 }
            if (r4 == 0) goto L_0x0114
            r3.append(r4)     // Catch:{ Exception -> 0x0173 }
            goto L_0x010a
        L_0x0114:
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0173 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0173 }
            if (r0 == 0) goto L_0x0129
            java.io.InputStream r12 = r6.getInputStream()     // Catch:{ Exception -> 0x0173 }
            r12.close()     // Catch:{ Exception -> 0x0173 }
            r6.disconnect()     // Catch:{ Exception -> 0x0173 }
            return r2
        L_0x0129:
            com.google.gson.GsonBuilder r0 = new com.google.gson.GsonBuilder     // Catch:{ Exception -> 0x0173 }
            r0.<init>()     // Catch:{ Exception -> 0x0173 }
            com.google.gson.GsonBuilder r0 = r0.serializeNulls()     // Catch:{ Exception -> 0x0173 }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            net.coocent.android.xmlparser.widget.StringAdapter r5 = new net.coocent.android.xmlparser.widget.StringAdapter     // Catch:{ Exception -> 0x0173 }
            r5.<init>()     // Catch:{ Exception -> 0x0173 }
            com.google.gson.GsonBuilder r0 = r0.registerTypeAdapter(r4, r5)     // Catch:{ Exception -> 0x0173 }
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            net.coocent.android.xmlparser.widget.IntegerAdapter r5 = new net.coocent.android.xmlparser.widget.IntegerAdapter     // Catch:{ Exception -> 0x0173 }
            r5.<init>()     // Catch:{ Exception -> 0x0173 }
            com.google.gson.GsonBuilder r0 = r0.registerTypeAdapter(r4, r5)     // Catch:{ Exception -> 0x0173 }
            com.google.gson.Gson r0 = r0.create()     // Catch:{ Exception -> 0x0173 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0173 }
            net.coocent.android.xmlparser.feedback.j$b r4 = new net.coocent.android.xmlparser.feedback.j$b     // Catch:{ Exception -> 0x0173 }
            r4.<init>(r11)     // Catch:{ Exception -> 0x0173 }
            java.lang.reflect.Type r4 = r4.getType()     // Catch:{ Exception -> 0x0173 }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r3, (java.lang.reflect.Type) r4)     // Catch:{ Exception -> 0x0173 }
            net.coocent.android.xmlparser.feedback.k$b r0 = (net.coocent.android.xmlparser.feedback.C9416k.C9418b) r0     // Catch:{ Exception -> 0x0173 }
            if (r0 == 0) goto L_0x016c
            net.coocent.android.xmlparser.feedback.m r3 = r0.f36322a     // Catch:{ Exception -> 0x0173 }
            if (r3 == 0) goto L_0x016c
            int r3 = r3.f36329a     // Catch:{ Exception -> 0x0173 }
            if (r3 != r1) goto L_0x016c
            java.lang.String r12 = r0.f36323b     // Catch:{ Exception -> 0x0173 }
            return r12
        L_0x016c:
            r12.close()     // Catch:{ Exception -> 0x0173 }
        L_0x016f:
            r6.disconnect()     // Catch:{ Exception -> 0x0173 }
            goto L_0x017f
        L_0x0173:
            r12 = move-exception
            r1 = r6
            goto L_0x0177
        L_0x0176:
            r12 = move-exception
        L_0x0177:
            r12.printStackTrace()
            if (r1 == 0) goto L_0x017f
            r1.disconnect()
        L_0x017f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.feedback.C9412j.m49692j(java.io.File):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo32528b() {
        this.f36311c.set(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public LiveData<Integer> mo32531i(List<String> list, String str) {
        C0670e0 e0Var = new C0670e0();
        synchronized (this) {
            if (this.f36311c.get()) {
                this.f36311c.set(false);
            }
        }
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(this.f36310b.mo32532a());
        for (String dVar : list) {
            executorCompletionService.submit(new C9404d(this, dVar));
        }
        this.f36310b.mo32533b().execute(new C9405e(this, list, executorCompletionService, e0Var, str));
        return e0Var;
    }
}
