package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.g9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C5107g9<K, V> {

    /* renamed from: a */
    private static final String f16993a = "g9";

    /* renamed from: a */
    protected static <K, V> HashMap<K, V> m24213a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
            }
            return null;
        } catch (IOException | ClassNotFoundException unused) {
            Log.d(f16993a, "decode object failure");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract HashMap<K, V> mo15748b();

    public final String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(mo15748b());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException unused) {
            return null;
        }
    }
}
