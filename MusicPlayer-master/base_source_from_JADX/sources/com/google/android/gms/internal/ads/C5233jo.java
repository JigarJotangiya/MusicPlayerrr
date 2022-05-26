package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.jo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5233jo {
    /* renamed from: a */
    static long m25801a(long j, int i) {
        if (i == 1) {
            return j;
        }
        return ((i & 1) == 0 ? m25801a((j * j) % 1073807359, i >> 1) : j * (m25801a((j * j) % 1073807359, i >> 1) % 1073807359)) % 1073807359;
    }

    /* renamed from: b */
    static String m25802b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            ul0.m31859d("Unable to construct shingle");
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: c */
    public static void m25803c(String[] strArr, int i, int i2, PriorityQueue<C5196io> priorityQueue) {
        String[] strArr2 = strArr;
        int length = strArr2.length;
        if (length < 6) {
            m25804d(i, m25805e(strArr2, 0, length), m25802b(strArr2, 0, length), length, priorityQueue);
            return;
        }
        long e = m25805e(strArr2, 0, 6);
        m25804d(i, e, m25802b(strArr2, 0, 6), 6, priorityQueue);
        long a = m25801a(16785407, 5);
        int i3 = 1;
        while (true) {
            int length2 = strArr2.length;
            if (i3 < length2 - 5) {
                e = ((((((e + 1073807359) - ((((((long) C5085fo.m23737a(strArr2[i3 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) C5085fo.m23737a(strArr2[i3 + 5])) + 2147483647L) % 1073807359)) % 1073807359;
                m25804d(i, e, m25802b(strArr2, i3, 6), length2, priorityQueue);
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    static void m25804d(int i, long j, String str, int i2, PriorityQueue<C5196io> priorityQueue) {
        C5196io ioVar = new C5196io(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f18124c <= ioVar.f18124c && priorityQueue.peek().f18122a <= ioVar.f18122a)) && !priorityQueue.contains(ioVar)) {
            priorityQueue.add(ioVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: e */
    private static long m25805e(String[] strArr, int i, int i2) {
        long a = (((long) C5085fo.m23737a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) C5085fo.m23737a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
