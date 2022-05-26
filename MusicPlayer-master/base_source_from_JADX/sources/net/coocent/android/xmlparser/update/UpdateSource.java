package net.coocent.android.xmlparser.update;

import android.content.Context;
import androidx.lifecycle.C0670e0;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executors;

class UpdateSource {
    UpdateSource(Context context) {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo32737b(java.lang.String r6, androidx.lifecycle.C0670e0 r7) {
        /*
            r5 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f4 }
            r1.<init>()     // Catch:{ IOException -> 0x00f4 }
            java.lang.String r2 = "https://coocentpromotion.oss-us-west-1.aliyuncs.com/updatelistV2/"
            r1.append(r2)     // Catch:{ IOException -> 0x00f4 }
            r1.append(r6)     // Catch:{ IOException -> 0x00f4 }
            java.lang.String r6 = ".json"
            r1.append(r6)     // Catch:{ IOException -> 0x00f4 }
            java.lang.String r6 = r1.toString()     // Catch:{ IOException -> 0x00f4 }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x00f4 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x00f4 }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ IOException -> 0x00f4 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x00f4 }
            java.lang.String r1 = "GET"
            r6.setRequestMethod(r1)     // Catch:{ IOException -> 0x00f2 }
            r1 = 5000(0x1388, float:7.006E-42)
            r6.setConnectTimeout(r1)     // Catch:{ IOException -> 0x00f2 }
            r6.setReadTimeout(r1)     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json; utf-8"
            r6.addRequestProperty(r1, r2)     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r1 = "Cache-Control"
            java.lang.String r2 = "max-stale=0"
            r6.addRequestProperty(r1, r2)     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r1 = "Accept"
            java.lang.String r2 = "application/json"
            r6.addRequestProperty(r1, r2)     // Catch:{ IOException -> 0x00f2 }
            r1 = 1
            r6.setDoInput(r1)     // Catch:{ IOException -> 0x00f2 }
            int r1 = r6.getResponseCode()     // Catch:{ IOException -> 0x00f2 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x005e
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ IOException -> 0x00f2 }
            r1.close()     // Catch:{ IOException -> 0x00f2 }
            r6.disconnect()     // Catch:{ IOException -> 0x00f2 }
            r7.mo4153l(r0)     // Catch:{ IOException -> 0x00f2 }
            return
        L_0x005e:
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ IOException -> 0x00f2 }
            if (r1 == 0) goto L_0x00dd
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x00f2 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00f2 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00f2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f2 }
            r2.<init>()     // Catch:{ IOException -> 0x00f2 }
        L_0x0075:
            java.lang.String r3 = r1.readLine()     // Catch:{ IOException -> 0x00f2 }
            if (r3 == 0) goto L_0x007f
            r2.append(r3)     // Catch:{ IOException -> 0x00f2 }
            goto L_0x0075
        L_0x007f:
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x00f2 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x00f2 }
            if (r1 == 0) goto L_0x0097
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ IOException -> 0x00f2 }
            r1.close()     // Catch:{ IOException -> 0x00f2 }
            r6.disconnect()     // Catch:{ IOException -> 0x00f2 }
            r7.mo4153l(r0)     // Catch:{ IOException -> 0x00f2 }
            return
        L_0x0097:
            com.google.gson.GsonBuilder r1 = new com.google.gson.GsonBuilder     // Catch:{ IOException -> 0x00f2 }
            r1.<init>()     // Catch:{ IOException -> 0x00f2 }
            com.google.gson.GsonBuilder r1 = r1.serializeNulls()     // Catch:{ IOException -> 0x00f2 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            net.coocent.android.xmlparser.widget.StringAdapter r4 = new net.coocent.android.xmlparser.widget.StringAdapter     // Catch:{ IOException -> 0x00f2 }
            r4.<init>()     // Catch:{ IOException -> 0x00f2 }
            com.google.gson.GsonBuilder r1 = r1.registerTypeAdapter(r3, r4)     // Catch:{ IOException -> 0x00f2 }
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            net.coocent.android.xmlparser.widget.IntegerAdapter r4 = new net.coocent.android.xmlparser.widget.IntegerAdapter     // Catch:{ IOException -> 0x00f2 }
            r4.<init>()     // Catch:{ IOException -> 0x00f2 }
            com.google.gson.GsonBuilder r1 = r1.registerTypeAdapter(r3, r4)     // Catch:{ IOException -> 0x00f2 }
            com.google.gson.Gson r1 = r1.create()     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x00f2 }
            net.coocent.android.xmlparser.update.UpdateSource$1 r3 = new net.coocent.android.xmlparser.update.UpdateSource$1     // Catch:{ IOException -> 0x00f2 }
            r3.<init>()     // Catch:{ IOException -> 0x00f2 }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ IOException -> 0x00f2 }
            java.lang.Object r1 = r1.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r3)     // Catch:{ IOException -> 0x00f2 }
            net.coocent.android.xmlparser.update.UpdateResult r1 = (net.coocent.android.xmlparser.update.UpdateResult) r1     // Catch:{ IOException -> 0x00f2 }
            if (r1 != 0) goto L_0x00de
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ IOException -> 0x00f2 }
            r1.close()     // Catch:{ IOException -> 0x00f2 }
            r6.disconnect()     // Catch:{ IOException -> 0x00f2 }
            r7.mo4153l(r0)     // Catch:{ IOException -> 0x00f2 }
            return
        L_0x00dd:
            r1 = r0
        L_0x00de:
            java.io.InputStream r2 = r6.getInputStream()     // Catch:{ IOException -> 0x00f2 }
            if (r2 == 0) goto L_0x00eb
            java.io.InputStream r2 = r6.getInputStream()     // Catch:{ IOException -> 0x00f2 }
            r2.close()     // Catch:{ IOException -> 0x00f2 }
        L_0x00eb:
            r6.disconnect()     // Catch:{ IOException -> 0x00f2 }
            r7.mo4153l(r1)     // Catch:{ IOException -> 0x00f2 }
            goto L_0x0101
        L_0x00f2:
            r1 = move-exception
            goto L_0x00f6
        L_0x00f4:
            r1 = move-exception
            r6 = r0
        L_0x00f6:
            if (r6 == 0) goto L_0x00fb
            r6.disconnect()
        L_0x00fb:
            r1.printStackTrace()
            r7.mo4153l(r0)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.update.UpdateSource.mo32737b(java.lang.String, androidx.lifecycle.e0):void");
    }

    /* access modifiers changed from: package-private */
    public LiveData<UpdateResult> getUpdateResult(String str) {
        C0670e0 e0Var = new C0670e0();
        Executors.newCachedThreadPool().execute(new C9501e(this, str, e0Var));
        return e0Var;
    }
}
