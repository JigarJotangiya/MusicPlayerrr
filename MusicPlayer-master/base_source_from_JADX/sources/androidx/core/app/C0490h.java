package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0482g;
import androidx.core.content.C0512b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p082e.p098e.C3467b;

/* renamed from: androidx.core.app.h */
/* compiled from: NotificationCompatBuilder */
class C0490h implements C0481f {

    /* renamed from: a */
    private final Notification.Builder f2641a;

    /* renamed from: b */
    private final C0482g.C0488d f2642b;

    /* renamed from: c */
    private RemoteViews f2643c;

    /* renamed from: d */
    private RemoteViews f2644d;

    /* renamed from: e */
    private final List<Bundle> f2645e = new ArrayList();

    /* renamed from: f */
    private final Bundle f2646f = new Bundle();

    /* renamed from: g */
    private int f2647g;

    /* renamed from: h */
    private RemoteViews f2648h;

    C0490h(C0482g.C0488d dVar) {
        Icon icon;
        List<String> list;
        List<String> e;
        this.f2642b = dVar;
        Context context = dVar.f2611a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f2641a = new Notification.Builder(dVar.f2611a, dVar.f2599L);
        } else {
            this.f2641a = new Notification.Builder(dVar.f2611a);
        }
        Notification notification = dVar.f2607T;
        this.f2641a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f2619i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f2615e).setContentText(dVar.f2616f).setContentInfo(dVar.f2621k).setContentIntent(dVar.f2617g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f2618h, (notification.flags & 128) != 0).setLargeIcon(dVar.f2620j).setNumber(dVar.f2622l).setProgress(dVar.f2631u, dVar.f2632v, dVar.f2633w);
        if (i < 21) {
            this.f2641a.setSound(notification.sound, notification.audioStreamType);
        }
        if (i >= 16) {
            this.f2641a.setSubText(dVar.f2628r).setUsesChronometer(dVar.f2625o).setPriority(dVar.f2623m);
            Iterator<C0482g.C0483a> it = dVar.f2612b.iterator();
            while (it.hasNext()) {
                m3076b(it.next());
            }
            Bundle bundle = dVar.f2592E;
            if (bundle != null) {
                this.f2646f.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.f2588A) {
                    this.f2646f.putBoolean("android.support.localOnly", true);
                }
                String str = dVar.f2634x;
                if (str != null) {
                    this.f2646f.putString("android.support.groupKey", str);
                    if (dVar.f2635y) {
                        this.f2646f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f2646f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = dVar.f2636z;
                if (str2 != null) {
                    this.f2646f.putString("android.support.sortKey", str2);
                }
            }
            this.f2643c = dVar.f2596I;
            this.f2644d = dVar.f2597J;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            this.f2641a.setShowWhen(dVar.f2624n);
        }
        if (i2 >= 19 && i2 < 21 && (e = m3077e(m3078f(dVar.f2613c), dVar.f2610W)) != null && !e.isEmpty()) {
            this.f2646f.putStringArray("android.people", (String[]) e.toArray(new String[e.size()]));
        }
        if (i2 >= 20) {
            this.f2641a.setLocalOnly(dVar.f2588A).setGroup(dVar.f2634x).setGroupSummary(dVar.f2635y).setSortKey(dVar.f2636z);
            this.f2647g = dVar.f2604Q;
        }
        if (i2 >= 21) {
            this.f2641a.setCategory(dVar.f2591D).setColor(dVar.f2593F).setVisibility(dVar.f2594G).setPublicVersion(dVar.f2595H).setSound(notification.sound, notification.audioAttributes);
            if (i2 < 28) {
                list = m3077e(m3078f(dVar.f2613c), dVar.f2610W);
            } else {
                list = dVar.f2610W;
            }
            if (list != null && !list.isEmpty()) {
                for (String addPerson : list) {
                    this.f2641a.addPerson(addPerson);
                }
            }
            this.f2648h = dVar.f2598K;
            if (dVar.f2614d.size() > 0) {
                Bundle bundle2 = dVar.mo3193e().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i3 = 0; i3 < dVar.f2614d.size(); i3++) {
                    bundle4.putBundle(Integer.toString(i3), C0491i.m3084b(dVar.f2614d.get(i3)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                dVar.mo3193e().putBundle("android.car.EXTENSIONS", bundle2);
                this.f2646f.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 && (icon = dVar.f2609V) != null) {
            this.f2641a.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            this.f2641a.setExtras(dVar.f2592E).setRemoteInputHistory(dVar.f2630t);
            RemoteViews remoteViews = dVar.f2596I;
            if (remoteViews != null) {
                this.f2641a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.f2597J;
            if (remoteViews2 != null) {
                this.f2641a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.f2598K;
            if (remoteViews3 != null) {
                this.f2641a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            this.f2641a.setBadgeIconType(dVar.f2600M).setSettingsText(dVar.f2629s).setShortcutId(dVar.f2601N).setTimeoutAfter(dVar.f2603P).setGroupAlertBehavior(dVar.f2604Q);
            if (dVar.f2590C) {
                this.f2641a.setColorized(dVar.f2589B);
            }
            if (!TextUtils.isEmpty(dVar.f2599L)) {
                this.f2641a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i4 >= 28) {
            Iterator<C0499k> it2 = dVar.f2613c.iterator();
            while (it2.hasNext()) {
                this.f2641a.addPerson(it2.next().mo3241h());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.f2641a.setAllowSystemGeneratedContextualActions(dVar.f2605R);
            this.f2641a.setBubbleMetadata(C0482g.C0485c.m3031c(dVar.f2606S));
            C0512b bVar = dVar.f2602O;
            if (bVar != null) {
                bVar.mo3268a();
                throw null;
            }
        }
        if (dVar.f2608U) {
            if (this.f2642b.f2635y) {
                this.f2647g = 2;
            } else {
                this.f2647g = 1;
            }
            this.f2641a.setVibrate((long[]) null);
            this.f2641a.setSound((Uri) null);
            int i6 = notification.defaults & -2;
            notification.defaults = i6;
            int i7 = i6 & -3;
            notification.defaults = i7;
            this.f2641a.setDefaults(i7);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f2642b.f2634x)) {
                    this.f2641a.setGroup("silent");
                }
                this.f2641a.setGroupAlertBehavior(this.f2647g);
            }
        }
    }

    /* renamed from: b */
    private void m3076b(C0482g.C0483a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat f = aVar.mo3175f();
            if (i >= 23) {
                builder = new Notification.Action.Builder(f != null ? f.mo3303u() : null, aVar.mo3179j(), aVar.mo3170a());
            } else {
                builder = new Notification.Action.Builder(f != null ? f.mo3294g() : 0, aVar.mo3179j(), aVar.mo3170a());
            }
            if (aVar.mo3176g() != null) {
                for (RemoteInput addRemoteInput : C0500l.m3122b(aVar.mo3176g())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.mo3173d() != null) {
                bundle = new Bundle(aVar.mo3173d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo3171b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo3171b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo3177h());
            if (i2 >= 28) {
                builder.setSemanticAction(aVar.mo3177h());
            }
            if (i2 >= 29) {
                builder.setContextual(aVar.mo3180k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo3178i());
            builder.addExtras(bundle);
            this.f2641a.addAction(builder.build());
        } else if (i >= 16) {
            this.f2645e.add(C0491i.m3088f(this.f2641a, aVar));
        }
    }

    /* renamed from: e */
    private static List<String> m3077e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C3467b bVar = new C3467b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    /* renamed from: f */
    private static List<String> m3078f(List<C0499k> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C0499k g : list) {
            arrayList.add(g.mo3240g());
        }
        return arrayList;
    }

    /* renamed from: g */
    private void m3079g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    /* renamed from: a */
    public Notification.Builder mo3169a() {
        return this.f2641a;
    }

    /* renamed from: c */
    public Notification mo3218c() {
        Bundle a;
        RemoteViews k;
        RemoteViews i;
        C0482g.C0489e eVar = this.f2642b.f2627q;
        if (eVar != null) {
            eVar.mo3182b(this);
        }
        RemoteViews j = eVar != null ? eVar.mo3215j(this) : null;
        Notification d = mo3219d();
        if (j != null) {
            d.contentView = j;
        } else {
            RemoteViews remoteViews = this.f2642b.f2596I;
            if (remoteViews != null) {
                d.contentView = remoteViews;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!(i2 < 16 || eVar == null || (i = eVar.mo3214i(this)) == null)) {
            d.bigContentView = i;
        }
        if (!(i2 < 21 || eVar == null || (k = this.f2642b.f2627q.mo3216k(this)) == null)) {
            d.headsUpContentView = k;
        }
        if (!(i2 < 16 || eVar == null || (a = C0482g.m3015a(d)) == null)) {
            eVar.mo3181a(a);
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Notification mo3219d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f2641a.build();
        }
        if (i >= 24) {
            Notification build = this.f2641a.build();
            if (this.f2647g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f2647g != 2)) {
                    m3079g(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f2647g == 1) {
                    m3079g(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f2641a.setExtras(this.f2646f);
            Notification build2 = this.f2641a.build();
            RemoteViews remoteViews = this.f2643c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2644d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2648h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2647g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f2647g != 2)) {
                    m3079g(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f2647g == 1) {
                    m3079g(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f2641a.setExtras(this.f2646f);
            Notification build3 = this.f2641a.build();
            RemoteViews remoteViews4 = this.f2643c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2644d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2647g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f2647g != 2)) {
                    m3079g(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f2647g == 1) {
                    m3079g(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C0491i.m3083a(this.f2645e);
            if (a != null) {
                this.f2646f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f2641a.setExtras(this.f2646f);
            Notification build4 = this.f2641a.build();
            RemoteViews remoteViews6 = this.f2643c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f2644d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f2641a.getNotification();
        } else {
            Notification build5 = this.f2641a.build();
            Bundle a2 = C0482g.m3015a(build5);
            Bundle bundle = new Bundle(this.f2646f);
            for (String str : this.f2646f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0491i.m3083a(this.f2645e);
            if (a3 != null) {
                C0482g.m3015a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f2643c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f2644d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
