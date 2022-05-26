package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.p250d.C6336b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.play.core.assetpacks.a2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6320a2 {

    /* renamed from: g */
    private static final C7577a f29364g = new C7577a("ExtractorSessionStoreView");

    /* renamed from: a */
    private final C6355g0 f29365a;

    /* renamed from: b */
    private final C7620y<C6347e4> f29366b;

    /* renamed from: c */
    private final C6381l1 f29367c;

    /* renamed from: d */
    private final C7620y<Executor> f29368d;

    /* renamed from: e */
    private final Map<Integer, C6441x1> f29369e = new HashMap();

    /* renamed from: f */
    private final ReentrantLock f29370f = new ReentrantLock();

    C6320a2(C6355g0 g0Var, C7620y<C6347e4> yVar, C6381l1 l1Var, C7620y<Executor> yVar2) {
        this.f29365a = g0Var;
        this.f29366b = yVar;
        this.f29367c = l1Var;
        this.f29368d = yVar2;
    }

    /* renamed from: o */
    private final C6441x1 m37557o(int i) {
        Map<Integer, C6441x1> map = this.f29369e;
        Integer valueOf = Integer.valueOf(i);
        C6441x1 x1Var = map.get(valueOf);
        if (x1Var != null) {
            return x1Var;
        }
        throw new C6361h1(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    /* renamed from: p */
    private final <T> T m37558p(C6451z1<T> z1Var) {
        try {
            this.f29370f.lock();
            return z1Var.zza();
        } finally {
            this.f29370f.unlock();
        }
    }

    /* renamed from: q */
    private static String m37559q(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new C6361h1("Session without pack received.");
    }

    /* renamed from: r */
    private static <T> List<T> m37560r(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: s */
    private final Map<String, C6441x1> m37561s(List<String> list) {
        return (Map) m37558p(new C6421t1(this, list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo25199a(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, C6441x1> map = this.f29369e;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        C6441x1 x1Var = this.f29369e.get(valueOf);
        if (x1Var.f29708c.f29696d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!C6349f0.m37612c(x1Var.f29708c.f29696d, bundle.getInt(C6336b.m37592a("status", m37559q(bundle)))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Boolean mo25200b(Bundle bundle) {
        C6446y1 y1Var;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, C6441x1> map = this.f29369e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        if (map.containsKey(valueOf)) {
            C6441x1 o = m37557o(i);
            int i2 = bundle2.getInt(C6336b.m37592a("status", o.f29708c.f29693a));
            if (C6349f0.m37612c(o.f29708c.f29696d, i2)) {
                f29364g.mo28574a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(o.f29708c.f29696d));
                C6436w1 w1Var = o.f29708c;
                String str = w1Var.f29693a;
                int i3 = w1Var.f29696d;
                if (i3 == 4) {
                    this.f29366b.zza().mo25228a(i, str);
                } else if (i3 == 5) {
                    this.f29366b.zza().mo25227H(i);
                } else if (i3 == 6) {
                    this.f29366b.zza().mo25233f(Arrays.asList(new String[]{str}));
                }
            } else {
                o.f29708c.f29696d = i2;
                if (C6349f0.m37613d(i2)) {
                    mo25210l(i);
                    this.f29367c.mo25308c(o.f29708c.f29693a);
                } else {
                    for (C6446y1 next : o.f29708c.f29698f) {
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(C6336b.m37593b("chunk_intents", o.f29708c.f29693a, next.f29719a));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (!(parcelableArrayList.get(i4) == null || ((Intent) parcelableArrayList.get(i4)).getData() == null)) {
                                    next.f29722d.get(i4).f29669a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String q = m37559q(bundle);
            long j = bundle2.getLong(C6336b.m37592a("pack_version", q));
            String string = bundle2.getString(C6336b.m37592a("pack_version_tag", q), BuildConfig.FLAVOR);
            int i5 = bundle2.getInt(C6336b.m37592a("status", q));
            long j2 = bundle2.getLong(C6336b.m37592a("total_bytes_to_download", q));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(C6336b.m37592a("slice_ids", q));
            ArrayList arrayList = new ArrayList();
            for (T t : m37560r(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(C6336b.m37593b("chunk_intents", q, t));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m37560r(parcelableArrayList2)) {
                    if (intent == null) {
                        z = false;
                    }
                    arrayList2.add(new C6426u1(z));
                    z = true;
                }
                String string2 = bundle2.getString(C6336b.m37593b("uncompressed_hash_sha256", q, t));
                long j3 = bundle2.getLong(C6336b.m37593b("uncompressed_size", q, t));
                int i6 = bundle2.getInt(C6336b.m37593b("patch_format", q, t), 0);
                if (i6 != 0) {
                    y1Var = new C6446y1(t, string2, j3, arrayList2, 0, i6);
                } else {
                    y1Var = new C6446y1(t, string2, j3, arrayList2, bundle2.getInt(C6336b.m37593b("compression_format", q, t), 0), 0);
                }
                arrayList.add(y1Var);
                z = true;
            }
            this.f29369e.put(Integer.valueOf(i), new C6441x1(i, bundle2.getInt("app_version_code"), new C6436w1(q, j, i5, j2, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo25201c(String str, int i, long j) {
        C6441x1 x1Var = m37561s(Arrays.asList(new String[]{str})).get(str);
        if (x1Var == null || C6349f0.m37613d(x1Var.f29708c.f29696d)) {
            f29364g.mo28575b(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.f29365a.mo25253d(str, i, j);
        x1Var.f29708c.f29696d = 4;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Object mo25202d(int i, int i2) {
        m37557o(i).f29708c.f29696d = 5;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Object mo25203e(int i) {
        C6441x1 o = m37557o(i);
        if (C6349f0.m37613d(o.f29708c.f29696d)) {
            C6355g0 g0Var = this.f29365a;
            C6436w1 w1Var = o.f29708c;
            g0Var.mo25253d(w1Var.f29693a, o.f29707b, w1Var.f29694b);
            C6436w1 w1Var2 = o.f29708c;
            int i2 = w1Var2.f29696d;
            if (i2 != 5 && i2 != 6) {
                return null;
            }
            this.f29365a.mo25254e(w1Var2.f29693a, o.f29707b, w1Var2.f29694b);
            return null;
        }
        throw new C6361h1(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Map<Integer, C6441x1> mo25204f() {
        return this.f29369e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ Map mo25205g(List list) {
        int i;
        HashMap hashMap = new HashMap();
        for (C6441x1 next : this.f29369e.values()) {
            String str = next.f29708c.f29693a;
            if (list.contains(str)) {
                C6441x1 x1Var = (C6441x1) hashMap.get(str);
                if (x1Var == null) {
                    i = -1;
                } else {
                    i = x1Var.f29706a;
                }
                if (i < next.f29706a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo25206h() {
        this.f29370f.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo25207i(String str, int i, long j) {
        m37558p(new C6416s1(this, str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo25208j() {
        this.f29370f.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo25209k(int i, int i2) {
        m37558p(new C6401p1(this, i, 5));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo25210l(int i) {
        m37558p(new C6396o1(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo25211m(Bundle bundle) {
        return ((Boolean) m37558p(new C6406q1(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo25212n(Bundle bundle) {
        return ((Boolean) m37558p(new C6411r1(this, bundle))).booleanValue();
    }
}
