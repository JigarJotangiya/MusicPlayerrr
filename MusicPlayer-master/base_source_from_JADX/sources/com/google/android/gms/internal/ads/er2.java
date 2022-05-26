package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.C2971s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class er2 implements dr2 {

    /* renamed from: a */
    private final ConcurrentHashMap<mr2, cr2> f16072a;

    /* renamed from: b */
    private final zzffu f16073b;

    /* renamed from: c */
    private final gr2 f16074c = new gr2();

    public er2(zzffu zzffu) {
        this.f16072a = new ConcurrentHashMap<>(zzffu.f27387l);
        this.f16073b = zzffu;
    }

    /* renamed from: e */
    private final void m23107e() {
        Parcelable.Creator<zzffu> creator = zzffu.CREATOR;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22541i4)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16073b.f27385j);
            sb.append(" PoolCollection");
            sb.append(this.f16074c.mo18008b());
            int i = 0;
            for (Map.Entry next : this.f16072a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(next.getValue());
                sb.append("#");
                sb.append(((mr2) next.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((cr2) next.getValue()).mo16725b(); i2++) {
                    sb.append("[O]");
                }
                for (int b = ((cr2) next.getValue()).mo16725b(); b < this.f16073b.f27387l; b++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((cr2) next.getValue()).mo16730g());
                sb.append("\n");
            }
            while (i < this.f16073b.f27386k) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            ul0.m31857b(sb.toString());
        }
    }

    @Deprecated
    /* renamed from: a */
    public final mr2 mo16993a(zzbfd zzbfd, String str, zzbfo zzbfo) {
        return new nr2(zzbfd, str, new sg0(this.f16073b.f27383h).mo20844a().f23861j, this.f16073b.f27389n, zzbfo);
    }

    /* renamed from: b */
    public final synchronized boolean mo16994b(mr2 mr2) {
        cr2 cr2 = this.f16072a.get(mr2);
        if (cr2 == null) {
            return true;
        }
        if (cr2.mo16725b() < this.f16073b.f27387l) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final synchronized boolean mo16995c(mr2 mr2, lr2<?, ?> lr2) {
        boolean h;
        cr2 cr2 = this.f16072a.get(mr2);
        lr2.f19515d = C2971s.m13198a().mo11988a();
        if (cr2 == null) {
            zzffu zzffu = this.f16073b;
            cr2 = new cr2(zzffu.f27387l, zzffu.f27388m * 1000);
            int size = this.f16072a.size();
            zzffu zzffu2 = this.f16073b;
            if (size == zzffu2.f27386k) {
                int i = zzffu2.f27394s;
                int i2 = i - 1;
                mr2 mr22 = null;
                if (i != 0) {
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry next : this.f16072a.entrySet()) {
                            if (((cr2) next.getValue()).mo16726c() < j) {
                                j = ((cr2) next.getValue()).mo16726c();
                                mr22 = (mr2) next.getKey();
                            }
                        }
                        if (mr22 != null) {
                            this.f16072a.remove(mr22);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry next2 : this.f16072a.entrySet()) {
                            if (((cr2) next2.getValue()).mo16727d() < j) {
                                j = ((cr2) next2.getValue()).mo16727d();
                                mr22 = (mr2) next2.getKey();
                            }
                        }
                        if (mr22 != null) {
                            this.f16072a.remove(mr22);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry next3 : this.f16072a.entrySet()) {
                            if (((cr2) next3.getValue()).mo16724a() < i3) {
                                i3 = ((cr2) next3.getValue()).mo16724a();
                                mr22 = (mr2) next3.getKey();
                            }
                        }
                        if (mr22 != null) {
                            this.f16072a.remove(mr22);
                        }
                    }
                    this.f16074c.mo18013g();
                } else {
                    throw null;
                }
            }
            this.f16072a.put(mr2, cr2);
            this.f16074c.mo18010d();
        }
        h = cr2.mo16731h(lr2);
        this.f16074c.mo18009c();
        fr2 a = this.f16074c.mo18007a();
        as2 f = cr2.mo16729f();
        if (lr2 != null) {
            C5309lq D = C5531rq.m30292D();
            C5235jq D2 = C5272kq.m26345D();
            D2.mo18700u(2);
            C5457pq D3 = C5494qq.m29651D();
            D3.mo20294r(a.f16741g);
            D3.mo20295s(a.f16742h);
            D3.mo20296t(f.f14060h);
            D2.mo18699t(D3);
            D.mo19269r(D2);
            lr2.f19512a.mo16754a().mo18842c().mo16368R((C5531rq) D.mo19761n());
        }
        m23107e();
        return h;
    }

    /* renamed from: d */
    public final synchronized lr2<?, ?> mo16996d(mr2 mr2) {
        lr2<?, ?> lr2;
        cr2 cr2 = this.f16072a.get(mr2);
        if (cr2 != null) {
            lr2 = cr2.mo16728e();
            if (lr2 == null) {
                this.f16074c.mo18011e();
            }
            as2 f = cr2.mo16729f();
            if (lr2 != null) {
                C5309lq D = C5531rq.m30292D();
                C5235jq D2 = C5272kq.m26345D();
                D2.mo18700u(2);
                C5383nq D3 = C5420oq.m28649D();
                D3.mo19802r(f.f14059g);
                D3.mo19803s(f.f14060h);
                D2.mo18697r(D3);
                D.mo19269r(D2);
                lr2.f19512a.mo16754a().mo18842c().mo16367B0((C5531rq) D.mo19761n());
            }
            m23107e();
        } else {
            this.f16074c.mo18012f();
            m23107e();
            lr2 = null;
        }
        return lr2;
    }

    public final zzffu zza() {
        return this.f16073b;
    }
}
