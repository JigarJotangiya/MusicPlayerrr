package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C3292l;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C3143b {

    /* renamed from: c */
    private static final Lock f10291c = new ReentrantLock();

    /* renamed from: d */
    private static C3143b f10292d;

    /* renamed from: a */
    private final Lock f10293a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f10294b;

    C3143b(Context context) {
        this.f10294b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C3143b m13749a(@RecentlyNonNull Context context) {
        C3292l.m14240h(context);
        Lock lock = f10291c;
        lock.lock();
        try {
            if (f10292d == null) {
                f10292d = new C3143b(context.getApplicationContext());
            }
            C3143b bVar = f10292d;
            lock.unlock();
            return bVar;
        } catch (Throwable th) {
            f10291c.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    private static final String m13750d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @RecentlyNullable
    /* renamed from: b */
    public GoogleSignInAccount mo11439b() {
        String c;
        String c2 = mo11440c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c2) || (c = mo11440c(m13750d("googleSignInAccount", c2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m13720L0(c);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: c */
    public final String mo11440c(@RecentlyNonNull String str) {
        this.f10293a.lock();
        try {
            return this.f10294b.getString(str, (String) null);
        } finally {
            this.f10293a.unlock();
        }
    }
}
