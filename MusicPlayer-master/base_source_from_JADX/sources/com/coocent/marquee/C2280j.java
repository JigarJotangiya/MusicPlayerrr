package com.coocent.marquee;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.util.Log;
import com.coocent.marquee.C2265a;
import com.coocent.marquee.view.MarqueeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p159f.p166c.p176c.C4326a;

/* renamed from: com.coocent.marquee.j */
/* compiled from: MarqueeMainUtil */
public class C2280j {

    /* renamed from: com.coocent.marquee.j$a */
    /* compiled from: MarqueeMainUtil */
    class C2281a implements C2265a.C2266a {

        /* renamed from: a */
        final /* synthetic */ Application f7832a;

        C2281a(Application application) {
            this.f7832a = application;
        }

        /* renamed from: a */
        public void mo8990a() {
            Log.d("ForegroundCallbacks", "======前台======");
            C2278h.m10608b(this.f7832a);
        }

        /* renamed from: b */
        public void mo8991b() {
            Log.d("ForegroundCallbacks", "======后台======");
            C2278h.m10610d(this.f7832a);
            C2280j.m10626l(this.f7832a);
        }
    }

    /* renamed from: com.coocent.marquee.j$b */
    /* compiled from: MarqueeMainUtil */
    class C2282b implements DialogInterface.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ WeakReference f7833g;

        /* renamed from: h */
        final /* synthetic */ C2284d f7834h;

        C2282b(WeakReference weakReference, C2284d dVar) {
            this.f7833g = weakReference;
            this.f7834h = dVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C4326a.m18907f().mo14749c((Context) this.f7833g.get())) {
                C2296m.m10662f((Context) this.f7833g.get(), true);
                C2284d dVar = this.f7834h;
                if (dVar != null) {
                    dVar.mo9011a();
                }
            } else {
                C4326a.m18907f().mo14748b((Activity) this.f7833g.get(), C2326v.Theme_AppCompat_Light_Dialog_Alert);
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.coocent.marquee.j$c */
    /* compiled from: MarqueeMainUtil */
    class C2283c implements DialogInterface.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ C2284d f7835g;

        C2283c(C2284d dVar) {
            this.f7835g = dVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2284d dVar = this.f7835g;
            if (dVar != null) {
                dVar.mo9011a();
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.coocent.marquee.j$d */
    /* compiled from: MarqueeMainUtil */
    public interface C2284d {
        /* renamed from: a */
        void mo9011a();
    }

    /* renamed from: b */
    public static void m10616b(Application application) {
        C2265a.m10573b(application).mo8982a(new C2281a(application));
    }

    /* renamed from: c */
    public static void m10617c() {
        C2279i.m10612c();
    }

    /* renamed from: d */
    public static void m10618d(Context context, MarqueeSweepGradientView marqueeSweepGradientView, boolean z) {
        if (context != null) {
            try {
                WeakReference weakReference = new WeakReference(context);
                SharedPreferences sharedPreferences = ((Context) weakReference.get()).getSharedPreferences("setting_preference", 0);
                int i = sharedPreferences.getInt("marquee_radian", 0);
                int i2 = sharedPreferences.getInt("marquee_radian_top_out", 0);
                int i3 = sharedPreferences.getInt("marquee_radian_bottom_in", 0);
                int i4 = sharedPreferences.getInt("marquee_radian_bottom_out", 0);
                int i5 = sharedPreferences.getInt("marquee_width", 2);
                int i6 = sharedPreferences.getInt("marquee_speed", 5);
                ArrayList<C2277g> a = C2279i.m10611b((Context) weakReference.get()).mo9007a();
                int size = a.size() + 1;
                int[] iArr = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    if (i7 == size - 1) {
                        iArr[i7] = iArr[0];
                    } else {
                        iArr[i7] = Color.parseColor(a.get(i7).mo9003a());
                    }
                }
                if (marqueeSweepGradientView != null) {
                    marqueeSweepGradientView.mo8946f(i, i3, i2, i4, i5, i6, iArr);
                    m10622h((Context) weakReference.get(), marqueeSweepGradientView, z);
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public static void m10619e(Context context, MarqueeSmallCircleView marqueeSmallCircleView) {
        if (context != null) {
            ArrayList<C2277g> a = C2279i.m10611b((Context) new WeakReference(context).get()).mo9007a();
            int size = a.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = Color.parseColor(a.get(i).mo9003a());
            }
            if (marqueeSmallCircleView != null) {
                marqueeSmallCircleView.setColors(iArr);
            }
        }
    }

    /* renamed from: f */
    public static void m10620f(Context context, MarqueeSweepGradientView marqueeSweepGradientView, boolean z) {
        if (context != null) {
            WeakReference weakReference = new WeakReference(context);
            SharedPreferences sharedPreferences = ((Context) weakReference.get()).getSharedPreferences("setting_preference", 0);
            int i = sharedPreferences.getInt("marquee_radian", 0);
            int i2 = sharedPreferences.getInt("marquee_radian_top_out", 0);
            int i3 = sharedPreferences.getInt("marquee_radian_bottom_in", 0);
            int i4 = sharedPreferences.getInt("marquee_radian_bottom_out", 0);
            int i5 = sharedPreferences.getInt("marquee_width", 2);
            int i6 = sharedPreferences.getInt("marquee_speed", 5);
            ArrayList<C2277g> a = C2279i.m10611b((Context) weakReference.get()).mo9007a();
            int size = a.size() + 1;
            int[] iArr = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 == size - 1) {
                    iArr[i7] = iArr[0];
                } else {
                    iArr[i7] = Color.parseColor(a.get(i7).mo9003a());
                }
            }
            if (marqueeSweepGradientView != null) {
                marqueeSweepGradientView.mo8946f(i, i3, i2, i4, i5, i6, iArr);
                m10623i((Context) weakReference.get(), marqueeSweepGradientView, z);
            }
        }
    }

    /* renamed from: g */
    public static void m10621g(Context context, MarqueeView marqueeView, boolean z) {
        if (context != null) {
            WeakReference weakReference = new WeakReference(context);
            SharedPreferences sharedPreferences = ((Context) weakReference.get()).getSharedPreferences("setting_preference", 0);
            int i = sharedPreferences.getInt("marquee_radian", 0);
            int i2 = sharedPreferences.getInt("marquee_radian_top_out", 0);
            int i3 = sharedPreferences.getInt("marquee_radian_bottom_in", 0);
            int i4 = sharedPreferences.getInt("marquee_radian_bottom_out", 0);
            int i5 = sharedPreferences.getInt("marquee_width", 2);
            int i6 = sharedPreferences.getInt("marquee_speed", 5);
            ArrayList<C2277g> a = C2279i.m10611b((Context) weakReference.get()).mo9007a();
            int size = a.size() + 1;
            int[] iArr = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 == size - 1) {
                    iArr[i7] = iArr[0];
                } else {
                    iArr[i7] = Color.parseColor(a.get(i7).mo9003a());
                }
            }
            if (marqueeView != null) {
                marqueeView.mo9104k(i, i3, i2, i4, i5, i6, iArr);
                m10624j((Context) weakReference.get(), marqueeView, z);
            }
        }
    }

    /* renamed from: h */
    public static void m10622h(Context context, MarqueeSweepGradientView marqueeSweepGradientView, boolean z) {
        if (context != null && marqueeSweepGradientView != null) {
            WeakReference weakReference = new WeakReference(context);
            marqueeSweepGradientView.setVisibility((!C2296m.m10658b((Context) weakReference.get()) || !C2296m.m10659c((Context) weakReference.get()) || !z) ? 4 : 0);
        }
    }

    /* renamed from: i */
    public static void m10623i(Context context, MarqueeSweepGradientView marqueeSweepGradientView, boolean z) {
        if (context != null && marqueeSweepGradientView != null) {
            marqueeSweepGradientView.setVisibility((!C2296m.m10658b((Context) new WeakReference(context).get()) || !z) ? 8 : 0);
        }
    }

    /* renamed from: j */
    public static void m10624j(Context context, MarqueeView marqueeView, boolean z) {
        if (context != null && marqueeView != null) {
            marqueeView.setVisibility((!C2296m.m10658b((Context) new WeakReference(context).get()) || !z) ? 8 : 0);
        }
    }

    /* renamed from: k */
    public static void m10625k(Activity activity, C2284d dVar) {
        WeakReference weakReference = new WeakReference(activity);
        if (C2296m.m10658b((Context) weakReference.get()) && !C2296m.m10659c((Context) weakReference.get()) && C2296m.m10657a((Context) weakReference.get()) < 1) {
            C2296m.m10661e((Context) weakReference.get(), C2296m.m10657a((Context) weakReference.get()) + 1);
            AlertDialog.Builder builder = new AlertDialog.Builder((Context) weakReference.get(), 0);
            builder.setTitle(C2311u.marquee_tip);
            builder.setMessage(C2311u.marquee_allowed_marquee_appear);
            builder.setPositiveButton(C2311u.marquee_ok, new C2282b(weakReference, dVar));
            builder.setNegativeButton(C2311u.marquee_cancel, new C2283c(dVar));
            builder.setCancelable(false);
            builder.show();
        } else if (dVar != null) {
            dVar.mo9011a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m10626l(Context context) {
        WeakReference weakReference = new WeakReference(context);
        ((Context) weakReference.get()).sendBroadcast(new Intent(C2276f.m10602c((Context) weakReference.get())));
    }
}
