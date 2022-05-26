package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class aj2 implements yr3<vg2<JSONObject>> {
    /* renamed from: b */
    public static vg2<JSONObject> m20771b(tk0 tk0, vk0 vk0, Object obj, oh2 oh2, ni2 ni2, sr3<ih2> sr3, sr3<rh2> sr32, sr3<xh2> sr33, sr3<bi2> sr34, sr3<ji2> sr35, sr3<qi2> sr36, sr3<ij2> sr37, sr3<dj2> sr38, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((fi2) obj);
        hashSet.add(oh2);
        hashSet.add(ni2);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22318E3)).booleanValue()) {
            hashSet.add(sr3.mo10679a());
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22326F3)).booleanValue()) {
            hashSet.add(sr32.mo10679a());
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22334G3)).booleanValue()) {
            hashSet.add(sr33.mo10679a());
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22342H3)).booleanValue()) {
            hashSet.add(sr34.mo10679a());
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22357J3)).booleanValue()) {
            hashSet.add(sr36.mo10679a());
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22364K3)).booleanValue()) {
            hashSet.add(sr37.mo10679a());
        }
        return new vg2<>(executor, hashSet);
    }
}
