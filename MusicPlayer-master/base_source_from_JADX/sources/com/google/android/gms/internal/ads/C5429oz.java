package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.C3245g;
import com.google.android.gms.common.p078l.C3334c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5429oz implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g */
    private final Object f21241g = new Object();

    /* renamed from: h */
    private final ConditionVariable f21242h = new ConditionVariable();

    /* renamed from: i */
    private volatile boolean f21243i = false;

    /* renamed from: j */
    volatile boolean f21244j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public SharedPreferences f21245k = null;

    /* renamed from: l */
    private Bundle f21246l = new Bundle();

    /* renamed from: m */
    private Context f21247m;

    /* renamed from: n */
    private JSONObject f21248n = new JSONObject();

    /* renamed from: f */
    private final void m28789f() {
        if (this.f21245k != null) {
            try {
                this.f21248n = new JSONObject((String) C5577sz.m31001a(new C5318lz(this)));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public final <T> T mo20153b(C5207iz<T> izVar) {
        if (!this.f21242h.block(5000)) {
            synchronized (this.f21241g) {
                if (!this.f21244j) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f21243i || this.f21245k == null) {
            synchronized (this.f21241g) {
                if (this.f21243i) {
                    if (this.f21245k == null) {
                    }
                }
                T l = izVar.mo18523l();
                return l;
            }
        }
        if (izVar.mo18522e() == 2) {
            Bundle bundle = this.f21246l;
            if (bundle == null) {
                return izVar.mo18523l();
            }
            return izVar.mo16429b(bundle);
        } else if (izVar.mo18522e() != 1 || !this.f21248n.has(izVar.mo18524m())) {
            return C5577sz.m31001a(new C5355mz(this, izVar));
        } else {
            return izVar.mo16428a(this.f21248n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo20154c(C5207iz izVar) {
        return izVar.mo16430c(this.f21245k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String mo20155d() {
        return this.f21245k.getString("flag_configuration", "{}");
    }

    /* renamed from: e */
    public final void mo20156e(Context context) {
        if (!this.f21243i) {
            synchronized (this.f21241g) {
                if (!this.f21243i) {
                    if (!this.f21244j) {
                        this.f21244j = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.f21247m = applicationContext;
                    try {
                        this.f21246l = C3334c.m14368a(applicationContext).mo11910c(this.f21247m.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context c = C3245g.m14047c(context);
                        if (!(c == null && context != null && (c = context.getApplicationContext()) == null)) {
                            context = c;
                        }
                        if (context != null) {
                            C5054ev.m23224b();
                            SharedPreferences a = C5281kz.m26484a(context);
                            this.f21245k = a;
                            if (a != null) {
                                a.registerOnSharedPreferenceChangeListener(this);
                            }
                            w10.m32860c(new C5392nz(this));
                            m28789f();
                            this.f21243i = true;
                            this.f21244j = false;
                            this.f21242h.open();
                        }
                    } finally {
                        this.f21244j = false;
                        this.f21242h.open();
                    }
                }
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m28789f();
        }
    }
}
