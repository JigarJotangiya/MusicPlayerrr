package p159f.p166c.p181e.p182a.p190b.p192i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import java.lang.ref.WeakReference;
import p159f.p166c.p181e.p182a.p190b.p192i.C4462b;
import p159f.p166c.p215k.p216a.p217a.C4593a;
import p159f.p166c.p215k.p216a.p217a.C4595b;
import p159f.p166c.p215k.p216a.p217a.C4597c;
import p159f.p166c.p215k.p216a.p217a.C4599d;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.i.a */
/* compiled from: FloatWindowUtils.kt */
public final class C4461a {

    /* renamed from: a */
    public static final C4461a f13041a = new C4461a();

    private C4461a() {
    }

    /* renamed from: a */
    public static final void m19524a(Activity activity) {
        C8594l.m46771e(activity, "activity");
        Activity activity2 = (Activity) new WeakReference(activity).get();
        if (activity2 != null) {
            if (Build.VERSION.SDK_INT < 23) {
                C4462b.C4463a aVar = C4462b.f13042a;
                if (aVar.mo15155d()) {
                    f13041a.m19533j(activity2);
                } else if (aVar.mo15154c()) {
                    f13041a.m19531h(activity2);
                } else if (aVar.mo15153b()) {
                    f13041a.m19529f(activity2);
                } else if (aVar.mo15152a()) {
                    f13041a.m19535l(activity2);
                }
            }
            f13041a.m19526c(activity2);
        }
    }

    /* renamed from: b */
    public static final boolean m19525b(Context context) {
        C8594l.m46771e(context, "context");
        if (Build.VERSION.SDK_INT < 23) {
            C4462b.C4463a aVar = C4462b.f13042a;
            if (aVar.mo15155d()) {
                return f13041a.m19532i(context);
            }
            if (aVar.mo15154c()) {
                return f13041a.m19530g(context);
            }
            if (aVar.mo15153b()) {
                return f13041a.m19528e(context);
            }
            if (aVar.mo15152a()) {
                return f13041a.m19534k(context);
            }
        }
        return f13041a.m19527d(context);
    }

    /* renamed from: c */
    private final void m19526c(Activity activity) {
        if (C4462b.f13042a.mo15154c()) {
            m19531h(activity);
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                Object obj = Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION").get((Object) null);
                C8594l.m46769c(obj);
                Intent intent = new Intent(obj.toString());
                intent.setData(Uri.parse(C8594l.m46777k("package:", activity.getPackageName())));
                activity.startActivityForResult(intent, 1);
            } catch (Exception e) {
                Log.e("FloatWindowUtils", Log.getStackTraceString(e));
            }
        }
    }

    /* renamed from: d */
    private final boolean m19527d(Context context) {
        if (C4462b.f13042a.mo15154c()) {
            return m19530g(context);
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Object invoke = Settings.class.getDeclaredMethod("canDrawOverlays", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception e) {
            Log.e("FloatWindowUtils", Log.getStackTraceString(e));
            return true;
        }
    }

    /* renamed from: e */
    private final boolean m19528e(Context context) {
        return C4593a.f13300a.mo15340b(context);
    }

    /* renamed from: f */
    private final void m19529f(Activity activity) {
        C4593a.f13300a.mo15339a(activity);
    }

    /* renamed from: g */
    private final boolean m19530g(Context context) {
        return C4595b.f13301a.mo15342b(context);
    }

    /* renamed from: h */
    private final void m19531h(Activity activity) {
        C4595b.f13301a.mo15341a(activity);
    }

    /* renamed from: i */
    private final boolean m19532i(Context context) {
        return C4597c.f13302a.mo15344b(context);
    }

    /* renamed from: j */
    private final void m19533j(Activity activity) {
        C4597c.f13302a.mo15343a(activity);
    }

    /* renamed from: k */
    private final boolean m19534k(Context context) {
        return C4599d.f13303a.mo15346b(context);
    }

    /* renamed from: l */
    private final void m19535l(Activity activity) {
        C4599d.f13303a.mo15345a(activity);
    }
}
