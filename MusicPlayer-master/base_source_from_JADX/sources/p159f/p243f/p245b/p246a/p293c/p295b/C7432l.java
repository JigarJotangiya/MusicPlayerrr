package p159f.p243f.p245b.p246a.p293c.p295b;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.appset.C3133b;
import com.google.android.gms.appset.C3134c;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.util.C3362g;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p159f.p243f.p245b.p246a.p303f.C7470h;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: f.f.b.a.c.b.l */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C7432l implements C3133b {

    /* renamed from: e */
    private static C3133b f32599e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f32600a;

    /* renamed from: b */
    private boolean f32601b = false;

    /* renamed from: c */
    private final ScheduledExecutorService f32602c;

    /* renamed from: d */
    private final ExecutorService f32603d;

    C7432l(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f32602c = newSingleThreadScheduledExecutor;
        this.f32603d = Executors.newSingleThreadExecutor();
        this.f32600a = context;
        if (!this.f32601b) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new C7430j(this, (C7429i) null), 0, 86400, TimeUnit.SECONDS);
            this.f32601b = true;
        }
    }

    /* renamed from: d */
    static synchronized C3133b m41813d(Context context) {
        C3133b bVar;
        synchronized (C7432l.class) {
            C3292l.m14241i(context, "Context must not be null");
            if (f32599e == null) {
                f32599e = new C7432l(context.getApplicationContext());
            }
            bVar = f32599e;
        }
        return bVar;
    }

    /* renamed from: f */
    protected static final void m41814f(Context context) {
        String str;
        if (!m41815g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to clear app set ID generated for App ".concat(valueOf);
            } else {
                str = new String("Failed to clear app set ID generated for App ");
            }
            Log.e("AppSet", str);
        }
        if (!m41815g(context).edit().remove("app_set_id_last_used_time").commit()) {
            String valueOf2 = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
        }
    }

    /* renamed from: g */
    private static final SharedPreferences m41815g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* renamed from: h */
    private static final void m41816h(Context context) throws C7431k {
        String str;
        SharedPreferences g = m41815g(context);
        if (!g.edit().putLong("app_set_id_last_used_time", C3362g.m14447d().mo11988a()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to store app set ID last used time for App ".concat(valueOf);
            } else {
                str = new String("Failed to store app set ID last used time for App ");
            }
            Log.e("AppSet", str);
            throw new C7431k("Failed to store the app set ID last used time.");
        }
    }

    /* renamed from: a */
    public final C7470h<C3134c> mo11391a() {
        C7471i iVar = new C7471i();
        this.f32603d.execute(new C7428h(this, iVar));
        return iVar.mo28352a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo28293b() {
        long j = m41815g(this.f32600a).getLong("app_set_id_last_used_time", -1);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo28294e(C7471i iVar) {
        String str;
        String str2;
        String string = m41815g(this.f32600a).getString("app_set_id", (String) null);
        long b = mo28293b();
        if (string == null || C3362g.m14447d().mo11988a() > b) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f32600a;
                if (!m41815g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    if (valueOf.length() != 0) {
                        str2 = "Failed to store app set ID generated for App ".concat(valueOf);
                    } else {
                        str2 = new String("Failed to store app set ID generated for App ");
                    }
                    Log.e("AppSet", str2);
                    throw new C7431k("Failed to store the app set ID.");
                }
                m41816h(context);
                Context context2 = this.f32600a;
                SharedPreferences g = m41815g(context2);
                if (!g.edit().putLong("app_set_id_creation_time", C3362g.m14447d().mo11988a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    if (valueOf2.length() != 0) {
                        str = "Failed to store app set ID creation time for App ".concat(valueOf2);
                    } else {
                        str = new String("Failed to store app set ID creation time for App ");
                    }
                    Log.e("AppSet", str);
                    throw new C7431k("Failed to store the app set ID creation time.");
                }
            } catch (C7431k e) {
                iVar.mo28353b(e);
                return;
            }
        } else {
            try {
                m41816h(this.f32600a);
            } catch (C7431k e2) {
                iVar.mo28353b(e2);
                return;
            }
        }
        iVar.mo28354c(new C3134c(string, 1));
    }
}
