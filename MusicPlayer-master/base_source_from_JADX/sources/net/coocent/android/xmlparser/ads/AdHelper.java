package net.coocent.android.xmlparser.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C0885l;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.C3059k;
import com.google.android.gms.ads.C3060l;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.p071c0.C2895a;
import com.google.android.gms.ads.p071c0.C2896b;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import net.coocent.android.xmlparser.C9490s;
import net.coocent.android.xmlparser.C9491t;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.C9508w;
import net.coocent.android.xmlparser.ads.C9389k;
import net.coocent.android.xmlparser.p460y.C9560a;
import net.coocent.android.xmlparser.p461z.C9566f;
import net.coocent.android.xmlparser.widget.dialog.CommonDialog;
import net.coocent.android.xmlparser.widget.dialog.DialogHelper;
import p159f.p166c.p213j.p214a.C4591b;
import p391j.p392a.p393a.C8612e;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8616i;

public class AdHelper {

    /* renamed from: e */
    private static AdHelper f36173e;

    /* renamed from: a */
    private C9382g f36174a = new C9382g();

    /* renamed from: b */
    private FrameLayout f36175b;

    /* renamed from: c */
    private int f36176c;

    /* renamed from: d */
    private int f36177d = 4;

    /* renamed from: net.coocent.android.xmlparser.ads.AdHelper$a */
    class C9368a extends C9490s {
        C9368a() {
        }

        /* renamed from: c */
        public void mo29984c(C3060l lVar) {
            super.mo29984c(lVar);
            AdHelper.this.mo32453n();
        }
    }

    /* renamed from: net.coocent.android.xmlparser.ads.AdHelper$b */
    class C9369b implements C9389k.C9391b {

        /* renamed from: a */
        final /* synthetic */ WeakReference f36180a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f36181b;

        /* renamed from: c */
        final /* synthetic */ AtomicBoolean f36182c;

        /* renamed from: d */
        final /* synthetic */ C4591b f36183d;

        /* renamed from: e */
        final /* synthetic */ C9560a f36184e;

        /* renamed from: f */
        final /* synthetic */ boolean f36185f;

        /* renamed from: g */
        final /* synthetic */ int f36186g;

        /* renamed from: h */
        final /* synthetic */ Context f36187h;

        /* renamed from: net.coocent.android.xmlparser.ads.AdHelper$b$a */
        class C9370a extends C3059k {
            C9370a() {
            }

            /* renamed from: b */
            public void mo10635b() {
                super.mo10635b();
                C4591b bVar = C9369b.this.f36183d;
                if (bVar != null) {
                    bVar.mo15337c();
                }
                if (C9369b.this.f36181b.get() != null) {
                    C9369b bVar2 = C9369b.this;
                    C9369b bVar3 = C9369b.this;
                    AdHelper.this.m49538x((FragmentActivity) bVar2.f36181b.get(), bVar3.f36184e, bVar3.f36185f, bVar3.f36183d);
                }
            }
        }

        C9369b(WeakReference weakReference, WeakReference weakReference2, AtomicBoolean atomicBoolean, C4591b bVar, C9560a aVar, boolean z, int i, Context context) {
            this.f36180a = weakReference;
            this.f36181b = weakReference2;
            this.f36182c = atomicBoolean;
            this.f36183d = bVar;
            this.f36185f = z;
            this.f36186g = i;
            this.f36187h = context;
        }

        /* renamed from: c */
        static /* synthetic */ void m49561c(int i, Context context, C4591b bVar, C2895a aVar) {
            C9508w.m49959b(context, "ads_coins", Integer.valueOf(i + 10));
            if (bVar != null) {
                bVar.mo15336b();
            }
        }

        /* renamed from: a */
        public void mo32462a(C3060l lVar) {
            if (this.f36180a.get() != null) {
                ((CommonDialog) this.f36180a.get()).mo3832Y2();
            }
            if (this.f36181b.get() != null && !this.f36182c.get()) {
                Toast.makeText((Context) this.f36181b.get(), ((FragmentActivity) this.f36181b.get()).getString(C8616i.coocent_fail_to_load), 0).show();
                AdHelper.this.m49538x((FragmentActivity) this.f36181b.get(), this.f36184e, this.f36185f, this.f36183d);
            }
        }

        /* renamed from: b */
        public void mo32463b(C2896b bVar) {
            if (this.f36180a.get() != null) {
                ((CommonDialog) this.f36180a.get()).mo3832Y2();
            }
            if (this.f36181b.get() != null && !this.f36182c.get()) {
                bVar.mo10721b(new C9370a());
                bVar.mo10722c((Activity) this.f36181b.get(), new C9375a(this.f36186g, this.f36187h, this.f36183d));
            }
        }
    }

    private AdHelper() {
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: p */
    public static synchronized net.coocent.android.xmlparser.ads.AdHelper m49536p() {
        /*
            java.lang.Class<net.coocent.android.xmlparser.ads.AdHelper> r0 = net.coocent.android.xmlparser.ads.AdHelper.class
            monitor-enter(r0)
            net.coocent.android.xmlparser.ads.AdHelper r1 = f36173e     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            net.coocent.android.xmlparser.ads.AdHelper r1 = f36173e     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013
            net.coocent.android.xmlparser.ads.AdHelper r1 = new net.coocent.android.xmlparser.ads.AdHelper     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            f36173e = r1     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0018:
            net.coocent.android.xmlparser.ads.AdHelper r1 = f36173e     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r1
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.ads.AdHelper.m49536p():net.coocent.android.xmlparser.ads.AdHelper");
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo32456s(WeakReference weakReference, C4591b bVar, C9560a aVar, boolean z, int i, Context context, Integer num) {
        Context context2 = context;
        if (num.intValue() == C8614g.layout_get_coins) {
            if (weakReference.get() != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                CommonDialog b = DialogHelper.m50001b(new CommonDialog.DialogCancelCallback(this) {
                    /* renamed from: a */
                    public void mo32461a() {
                        atomicBoolean.set(true);
                    }
                });
                C0602j H1 = ((FragmentActivity) weakReference.get()).mo3730H1();
                b.mo3841h3(H1, C9389k.class.getCanonicalName() + "_Loading");
                mo32451l(((FragmentActivity) weakReference.get()).getApplicationContext(), new C9369b(new WeakReference(b), weakReference, atomicBoolean, bVar, aVar, z, i, context));
            }
        } else if (num.intValue() != C8614g.layout_coins_enough) {
        } else {
            if (aVar == null) {
                C9508w.m49959b(context2, "ads_coins", Integer.valueOf(i - 50));
                C9508w.m49959b(context2, "is_remove_ads", Boolean.TRUE);
                if (bVar != null) {
                    bVar.mo15335a();
                    return;
                }
                return;
            }
            aVar.mo32947b();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m49538x(FragmentActivity fragmentActivity, C9560a aVar, boolean z, C4591b bVar) {
        if ((!C9502v.m49954y(fragmentActivity) || !z) && !C9502v.m49952w(fragmentActivity)) {
            Context applicationContext = fragmentActivity.getApplicationContext();
            WeakReference weakReference = new WeakReference(fragmentActivity);
            if (aVar == null) {
                int intValue = ((Integer) C9508w.m49958a(fragmentActivity, "ads_coins", 5)).intValue();
                DialogHelper.m50000a(fragmentActivity, aVar, intValue, new C9376b(this, weakReference, bVar, aVar, z, intValue, applicationContext)).mo3841h3(((FragmentActivity) weakReference.get()).mo3730H1(), C9389k.class.getCanonicalName());
                return;
            }
            aVar.mo32946a();
            throw null;
        }
    }

    /* renamed from: b */
    public AdView mo32441b(Context context, ViewGroup viewGroup) {
        return mo32442c(context, viewGroup, (C9490s) null);
    }

    /* renamed from: c */
    public AdView mo32442c(Context context, ViewGroup viewGroup, C9490s sVar) {
        if (C9502v.m49954y(context.getApplicationContext()) || C9502v.m49952w(context.getApplicationContext())) {
            return null;
        }
        return C9380f.m49596c(context.getApplicationContext(), viewGroup, -1, 0, C9380f.m49600g(context), false, sVar);
    }

    /* renamed from: d */
    public AdView mo32443d(Context context, ViewGroup viewGroup) {
        return mo32445f(context, viewGroup, (C9490s) null);
    }

    /* renamed from: e */
    public AdView mo32444e(Context context, ViewGroup viewGroup, C2921g gVar, C9490s sVar) {
        return C9380f.m49596c(context, viewGroup, 0, 3, gVar, false, sVar);
    }

    /* renamed from: f */
    public AdView mo32445f(Context context, ViewGroup viewGroup, C9490s sVar) {
        return mo32444e(context, viewGroup, new C2921g(-1, C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION), sVar);
    }

    /* renamed from: g */
    public void mo32446g(Activity activity) {
        mo32448i(activity, new C9368a());
    }

    /* renamed from: h */
    public void mo32447h(Activity activity, C2921g gVar, C9490s sVar) {
        if (!C9502v.m49952w(activity)) {
            if (this.f36175b != null) {
                mo32453n();
            }
            Resources resources = activity.getResources();
            this.f36175b = new FrameLayout(activity);
            if ((resources.getDisplayMetrics().heightPixels - C9566f.m50197h(activity)) - resources.getDimensionPixelSize(C8612e.exit_rate_dialog_rate_height) < gVar.mo10795c(activity)) {
                m49536p().mo32444e(activity, this.f36175b, new C2921g(-1, 100), sVar);
            } else {
                m49536p().mo32444e(activity, this.f36175b, gVar, sVar);
            }
        }
    }

    /* renamed from: i */
    public void mo32448i(Activity activity, C9490s sVar) {
        mo32447h(activity, new C2921g(-1, C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION), sVar);
    }

    /* renamed from: j */
    public void mo32449j(Context context, int i) {
        this.f36177d = i;
        if (!C9502v.m49954y(context.getApplicationContext()) || C9502v.m49952w(context.getApplicationContext())) {
            this.f36174a.mo32487c(context, 2, 0);
        }
    }

    /* renamed from: k */
    public NativeAdView mo32450k(Context context, ViewGroup viewGroup, int i, C9491t tVar) {
        if (context == null || viewGroup == null || C9502v.m49954y(context.getApplicationContext()) || C9502v.m49952w(context.getApplicationContext())) {
            return null;
        }
        return C9385h.m49624c(context, viewGroup, i, 2, tVar);
    }

    /* renamed from: l */
    public void mo32451l(Context context, C9389k.C9391b bVar) {
        new C9389k(context, false, bVar).mo32491f();
    }

    /* renamed from: m */
    public void mo32452m() {
        this.f36174a = null;
        mo32453n();
        f36173e = null;
    }

    /* renamed from: n */
    public void mo32453n() {
        FrameLayout frameLayout = this.f36175b;
        if (frameLayout != null) {
            if (frameLayout.getChildCount() > 0) {
                for (int i = 0; i < this.f36175b.getChildCount(); i++) {
                    View childAt = this.f36175b.getChildAt(i);
                    if (childAt instanceof AdView) {
                        ((AdView) childAt).mo11151a();
                    }
                }
                this.f36175b.removeAllViews();
            }
            this.f36175b = null;
        }
    }

    /* renamed from: o */
    public FrameLayout mo32454o() {
        return this.f36175b;
    }

    /* renamed from: q */
    public boolean mo32455q() {
        return this.f36174a.mo32488e(0);
    }

    /* renamed from: t */
    public void mo32457t() {
        int i = this.f36177d;
        if (i != 0) {
            int i2 = this.f36176c;
            if (i - (i2 % i) < 2 || i2 % i == 0) {
                this.f36176c = i - 2;
            }
        }
    }

    /* renamed from: u */
    public boolean mo32458u(Activity activity) {
        return mo32459v(activity, (C9387i) null);
    }

    /* renamed from: v */
    public boolean mo32459v(Activity activity, C9387i iVar) {
        if (C9502v.m49954y(activity) || C9502v.m49952w(activity.getApplicationContext())) {
            return false;
        }
        if (mo32455q()) {
            int i = this.f36176c;
            if (i % this.f36177d == 0) {
                this.f36174a.mo32489g(activity, 0, iVar);
                int i2 = this.f36177d + 1;
                this.f36177d = i2;
                this.f36176c = i2 + 1;
                return true;
            }
            this.f36176c = i + 1;
            return false;
        }
        int i3 = this.f36176c;
        int i4 = this.f36177d;
        if (i3 % i4 >= i4 - 1 || i3 % i4 == 0) {
            this.f36176c = i4;
            return false;
        }
        this.f36176c = i3 + 1;
        return false;
    }

    /* renamed from: w */
    public void mo32460w(FragmentActivity fragmentActivity, C4591b bVar) {
        m49538x(fragmentActivity, (C9560a) null, true, bVar);
    }
}
