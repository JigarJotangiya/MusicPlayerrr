package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nr2 implements mr2 {

    /* renamed from: a */
    private final Object[] f20711a;

    public nr2(zzbfd zzbfd, String str, int i, String str2, zzbfo zzbfo) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzbfd.f27196h));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m28054a(zzbfd.f27197i));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzbfd.f27197i.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzbfd.f27198j));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = zzbfd.f27199k;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzbfd.f27200l));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzbfd.f27201m));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzbfd.f27202n));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzbfd.f27203o);
        }
        if (hashSet.contains("location")) {
            Location location = zzbfd.f27205q;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzbfd.f27206r);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m28054a(zzbfd.f27207s));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m28054a(zzbfd.f27208t));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = zzbfd.f27209u;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzbfd.f27210v);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzbfd.f27211w);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzbfd.f27212x));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzbfd.f27214z));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzbfd.f27191A);
        }
        if (hashSet.contains("orientation")) {
            if (zzbfo != null) {
                arrayList.add(Integer.valueOf(zzbfo.f27238g));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.f20711a = arrayList.toArray();
    }

    /* renamed from: a */
    private static String m28054a(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = m28054a((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nr2)) {
            return false;
        }
        return Arrays.equals(this.f20711a, ((nr2) obj).f20711a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20711a);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.f20711a);
        String arrays = Arrays.toString(this.f20711a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
